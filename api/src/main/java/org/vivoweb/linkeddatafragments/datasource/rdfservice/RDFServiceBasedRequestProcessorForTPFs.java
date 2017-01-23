package org.vivoweb.linkeddatafragments.datasource.rdfservice;

import edu.cornell.mannlib.vitro.webapp.controller.VitroRequest;
import edu.cornell.mannlib.vitro.webapp.dao.jena.QueryUtils;
import edu.cornell.mannlib.vitro.webapp.rdfservice.RDFService;
import edu.cornell.mannlib.vitro.webapp.rdfservice.RDFServiceException;
import edu.cornell.mannlib.vitro.webapp.rdfservice.ResultSetConsumer;
import org.apache.jena.atlas.io.StringWriterI;
import com.hp.hpl.jena.query.Dataset;
import com.hp.hpl.jena.query.Query;
import com.hp.hpl.jena.query.QueryExecution;
import com.hp.hpl.jena.query.QueryExecutionFactory;
import com.hp.hpl.jena.query.QueryFactory;
import com.hp.hpl.jena.query.QuerySolution;
import com.hp.hpl.jena.query.QuerySolutionMap;
import com.hp.hpl.jena.query.ResultSet;
import com.hp.hpl.jena.query.Syntax;
import com.hp.hpl.jena.rdf.model.Literal;
import com.hp.hpl.jena.rdf.model.Model;
import com.hp.hpl.jena.rdf.model.ModelFactory;
import com.hp.hpl.jena.rdf.model.RDFNode;
import org.apache.jena.riot.out.NodeFormatter;
import org.apache.jena.riot.out.NodeFormatterTTL;
import com.hp.hpl.jena.tdb.TDBFactory;
import org.linkeddatafragments.datasource.AbstractRequestProcessorForTriplePatterns;
import org.linkeddatafragments.datasource.IFragmentRequestProcessor;
import org.linkeddatafragments.fragments.ILinkedDataFragment;
import org.linkeddatafragments.fragments.tpf.ITriplePatternElement;
import org.linkeddatafragments.fragments.tpf.ITriplePatternFragmentRequest;

import java.io.File;

public class RDFServiceBasedRequestProcessorForTPFs
    extends AbstractRequestProcessorForTriplePatterns<RDFNode,String,String>
{
    private static RDFService rdfService;

    public static void setRDFService(RDFService pRDFService) {
        rdfService = pRDFService;
    }

    @Override
    protected Worker getTPFSpecificWorker(
            final ITriplePatternFragmentRequest<RDFNode,String,String> request )
                                                throws IllegalArgumentException
    {
        return new Worker( request );
    }

    /**
     *
     */
    protected class Worker
       extends AbstractRequestProcessorForTriplePatterns.Worker<RDFNode,String,String>
    {
        public Worker(
                final ITriplePatternFragmentRequest<RDFNode,String,String> req )
        {
            super( req );
        }

        private void appendNode(StringBuilder builder, RDFNode node) {
            if (node.isLiteral()) {
                builder.append(literalToString(node.asLiteral()));
            } else if (node.isURIResource()) {
                builder.append('<' + node.asResource().getURI() + '>');
            }
        }

        private String literalToString(Literal l) {
            StringWriterI sw = new StringWriterI();
            NodeFormatter fmt = new NodeFormatterTTL(null, null);
            fmt.formatLiteral(sw, l.asNode());
            return sw.toString();
        }

        @Override
        protected ILinkedDataFragment createFragment(
                   final ITriplePatternElement<RDFNode,String,String> subject,
                   final ITriplePatternElement<RDFNode,String,String> predicate,
                   final ITriplePatternElement<RDFNode,String,String> object,
                   final long offset,
                   final long limit )
        {
            try {
                RDFNode nSubject = subject.isVariable() ? null : subject.asConstantTerm();
                RDFNode nPredicate = predicate.isVariable() ? null : predicate.asConstantTerm();
                RDFNode nObject = object.isVariable() ? null : object.asConstantTerm();

                Model triples = rdfService.getTriples(nSubject, nPredicate, nObject, limit, offset);
                if (triples == null || triples.isEmpty()) {
                    return createEmptyTriplePatternFragment();
                }

                long size = triples.size();
                long estimate = -1;
                estimate = rdfService.countTriples(nSubject, nPredicate, nObject);

                // No estimate or incorrect
                if (estimate < offset + size) {
                    estimate = (size == limit) ? offset + size + 1 : offset + size;
                }

                // create the fragment
                final boolean isLastPage = ( estimate < offset + limit );
                return createTriplePatternFragment( triples, estimate, isLastPage );
            } catch (RDFServiceException e) {
                return createEmptyTriplePatternFragment();
            }
        }

    } // end of class Worker


    /**
     * Constructor
     */
    public RDFServiceBasedRequestProcessorForTPFs() {
    }
}
