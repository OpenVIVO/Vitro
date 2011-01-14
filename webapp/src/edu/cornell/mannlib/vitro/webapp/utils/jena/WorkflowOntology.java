/* $This file is distributed under the terms of the license in /doc/license.txt$ */

package edu.cornell.mannlib.vitro.webapp.utils.jena;

import com.hp.hpl.jena.rdf.model.*;
import com.hp.hpl.jena.ontology.*; 
/**
 * Vocabulary definitions from workflowOntology.rdf 
 * @author Auto-generated by schemagen on 12 Aug 2008 11:27 
 */
public class WorkflowOntology {
    /** <p>The ontology model that holds the vocabulary terms</p> */
    private static OntModel m_model = ModelFactory.createOntologyModel( OntModelSpec.OWL_MEM, null );
    
    /** <p>The namespace of the vocabulary as a string</p> */
    public static final String NS = "http://vitro.mannlib.cornell.edu/ns/vitro/rdfIngestWorkflow#";
    
    /** <p>The namespace of the vocabulary as a string</p>
     *  @see #NS */
    public static String getURI() {return NS;}
    
    /** <p>The namespace of the vocabulary as a resource</p> */
    public static final Resource NAMESPACE = m_model.createResource( NS );
    
    public static final ObjectProperty retractionsModel = m_model.createObjectProperty( "http://vitro.mannlib.cornell.edu/ns/vitro/rdfIngestWorkflow#retractionsModel" );
    
    public static final ObjectProperty processorMethod = m_model.createObjectProperty( "http://vitro.mannlib.cornell.edu/ns/vitro/rdfIngestWorkflow#processorMethod" );
    
    public static final ObjectProperty originalPropertyOf = m_model.createObjectProperty( "http://vitro.mannlib.cornell.edu/ns/vitro/rdfIngestWorkflow#originalPropertyOf" );
    
    public static final ObjectProperty firstStepOf = m_model.createObjectProperty( "http://vitro.mannlib.cornell.edu/ns/vitro/rdfIngestWorkflow#firstStepOf" );
    
    public static final ObjectProperty additionsModel = m_model.createObjectProperty( "http://vitro.mannlib.cornell.edu/ns/vitro/rdfIngestWorkflow#additionsModel" );
    
    public static final ObjectProperty originalProperty = m_model.createObjectProperty( "http://vitro.mannlib.cornell.edu/ns/vitro/rdfIngestWorkflow#originalProperty" );
    
    public static final ObjectProperty newPropertyOf = m_model.createObjectProperty( "http://vitro.mannlib.cornell.edu/ns/vitro/rdfIngestWorkflow#newPropertyOf" );
    
    public static final ObjectProperty processorClassOf = m_model.createObjectProperty( "http://vitro.mannlib.cornell.edu/ns/vitro/rdfIngestWorkflow#processorClassOf" );
    
    public static final ObjectProperty retractionsModelOf = m_model.createObjectProperty( "http://vitro.mannlib.cornell.edu/ns/vitro/rdfIngestWorkflow#retractionsModelOf" );
    
    public static final ObjectProperty firstStep = m_model.createObjectProperty( "http://vitro.mannlib.cornell.edu/ns/vitro/rdfIngestWorkflow#firstStep" );
    
    public static final ObjectProperty modelToAdd = m_model.createObjectProperty( "http://vitro.mannlib.cornell.edu/ns/vitro/rdfIngestWorkflow#modelToAdd" );
    
    public static final ObjectProperty modelToSubtract = m_model.createObjectProperty( "http://vitro.mannlib.cornell.edu/ns/vitro/rdfIngestWorkflow#modelToSubtract" );
    
    public static final ObjectProperty smushedOnInAction = m_model.createObjectProperty( "http://vitro.mannlib.cornell.edu/ns/vitro/rdfIngestWorkflow#smushedOnInAction" );
    
    public static final ObjectProperty actionOf = m_model.createObjectProperty( "http://vitro.mannlib.cornell.edu/ns/vitro/rdfIngestWorkflow#actionOf" );
    
    public static final ObjectProperty newProperty = m_model.createObjectProperty( "http://vitro.mannlib.cornell.edu/ns/vitro/rdfIngestWorkflow#newProperty" );
    
    public static final ObjectProperty splitRegex = m_model.createObjectProperty( "http://vitro.mannlib.cornell.edu/ns/vitro/rdfIngestWorkflow#splitRegex" );
    
    public static final ObjectProperty processorClass = m_model.createObjectProperty( "http://vitro.mannlib.cornell.edu/ns/vitro/rdfIngestWorkflow#processorClass" );
    
    public static final ObjectProperty sourceModelFor = m_model.createObjectProperty( "http://vitro.mannlib.cornell.edu/ns/vitro/rdfIngestWorkflow#sourceModelFor" );
    
    public static final ObjectProperty destinationModelFor = m_model.createObjectProperty( "http://vitro.mannlib.cornell.edu/ns/vitro/rdfIngestWorkflow#destinationModelFor" );
    
    public static final ObjectProperty splitRegexOf = m_model.createObjectProperty( "http://vitro.mannlib.cornell.edu/ns/vitro/rdfIngestWorkflow#splitRegexOf" );
    
    public static final ObjectProperty trimValueFor = m_model.createObjectProperty( "http://vitro.mannlib.cornell.edu/ns/vitro/rdfIngestWorkflow#trimValueFor" );
    
    public static final ObjectProperty uriPrefix = m_model.createObjectProperty( "http://vitro.mannlib.cornell.edu/ns/vitro/rdfIngestWorkflow#uriPrefix" );
    
    public static final ObjectProperty action = m_model.createObjectProperty( "http://vitro.mannlib.cornell.edu/ns/vitro/rdfIngestWorkflow#action" );
    
    public static final ObjectProperty destinationModel = m_model.createObjectProperty( "http://vitro.mannlib.cornell.edu/ns/vitro/rdfIngestWorkflow#destinationModel" );
    
    public static final ObjectProperty processorMethodOf = m_model.createObjectProperty( "http://vitro.mannlib.cornell.edu/ns/vitro/rdfIngestWorkflow#processorMethodOf" );
    
    public static final ObjectProperty sourceModel = m_model.createObjectProperty( "http://vitro.mannlib.cornell.edu/ns/vitro/rdfIngestWorkflow#sourceModel" );
    
    public static final ObjectProperty uriPrefixForAction = m_model.createObjectProperty( "http://vitro.mannlib.cornell.edu/ns/vitro/rdfIngestWorkflow#uriPrefixForAction" );
    
    public static final ObjectProperty smushOnProperty = m_model.createObjectProperty( "http://vitro.mannlib.cornell.edu/ns/vitro/rdfIngestWorkflow#smushOnProperty" );

    public static final ObjectProperty sparqlQuery = m_model.createObjectProperty( "http://vitro.mannlib.cornell.edu/ns/vitro/rdfIngestWorkflow#sparqlQuery" );
    
    public static final ObjectProperty previousStep = m_model.createObjectProperty( "http://vitro.mannlib.cornell.edu/ns/vitro/rdfIngestWorkflow#previousStep" );
    
    public static final ObjectProperty addedInAction = m_model.createObjectProperty( "http://vitro.mannlib.cornell.edu/ns/vitro/rdfIngestWorkflow#addedInAction" );
    
    public static final ObjectProperty subtractedInAction = m_model.createObjectProperty( "http://vitro.mannlib.cornell.edu/ns/vitro/rdfIngestWorkflow#subtractedInAction" );
    
    public static final ObjectProperty nextStep = m_model.createObjectProperty( "http://vitro.mannlib.cornell.edu/ns/vitro/rdfIngestWorkflow#nextStep" );
    
    public static final ObjectProperty trim = m_model.createObjectProperty( "http://vitro.mannlib.cornell.edu/ns/vitro/rdfIngestWorkflow#trim" );
    
    public static final ObjectProperty additionsModelOf = m_model.createObjectProperty( "http://vitro.mannlib.cornell.edu/ns/vitro/rdfIngestWorkflow#additionsModelOf" );
    
    public static final DatatypeProperty applyChangesDirectlyToSource = m_model.createDatatypeProperty( "http://vitro.mannlib.cornell.edu/ns/vitro/rdfIngestWorkflow#applyChangesDirectlyToSource" );
    
    public static final DatatypeProperty modelName = m_model.createDatatypeProperty( "http://vitro.mannlib.cornell.edu/ns/vitro/rdfIngestWorkflow#modelName" );
    
    public static final DatatypeProperty literalValue = m_model.createDatatypeProperty( "http://vitro.mannlib.cornell.edu/ns/vitro/rdfIngestWorkflow#literalValue" );

    public static final DatatypeProperty variableName = m_model.createDatatypeProperty( "http://vitro.mannlib.cornell.edu/ns/vitro/rdfIngestWorkflow#variableName" ); 
    
    public static final OntClass Action = m_model.createClass( "http://vitro.mannlib.cornell.edu/ns/vitro/rdfIngestWorkflow#Action" );
    
    public static final OntClass ProcessPropertyValueStringsAction = m_model.createClass( "http://vitro.mannlib.cornell.edu/ns/vitro/rdfIngestWorkflow#ProcessPropertyValueStringsAction" );
    
    public static final OntClass Workflow = m_model.createClass( "http://vitro.mannlib.cornell.edu/ns/vitro/rdfIngestWorkflow#Workflow" );
    
    public static final OntClass WorkflowStep = m_model.createClass( "http://vitro.mannlib.cornell.edu/ns/vitro/rdfIngestWorkflow#WorkflowStep" );
    
    public static final OntClass Value = m_model.createClass( "http://vitro.mannlib.cornell.edu/ns/vitro/rdfIngestWorkflow#Value" );
    
    public static final OntClass SPARQLCONSTRUCTAction = m_model.createClass( "http://vitro.mannlib.cornell.edu/ns/vitro/rdfIngestWorkflow#SPARQLCONSTRUCTAction" );
    
    public static final OntClass Model = m_model.createClass( "http://vitro.mannlib.cornell.edu/ns/vitro/rdfIngestWorkflow#Model" );
    
    public static final OntClass Literal = m_model.createClass( "http://vitro.mannlib.cornell.edu/ns/vitro/rdfIngestWorkflow#Literal" );
    
    public static final OntClass CreateModelAction = m_model.createClass( "http://vitro.mannlib.cornell.edu/ns/vitro/rdfIngestWorkflow#CreateModelAction" );
    
    public static final OntClass AddModelAction = m_model.createClass( "http://vitro.mannlib.cornell.edu/ns/vitro/rdfIngestWorkflow#AddModelAction" );
    
    public static final OntClass SubtractModelAction = m_model.createClass( "http://vitro.mannlib.cornell.edu/ns/vitro/rdfIngestWorkflow#SubtractModelAction" );
    
    public static final OntClass SplitPropertyValuesAction = m_model.createClass( "http://vitro.mannlib.cornell.edu/ns/vitro/rdfIngestWorkflow#SplitPropertyValuesAction" );
    
    public static final OntClass NameBlankNodesAction = m_model.createClass( "http://vitro.mannlib.cornell.edu/ns/vitro/rdfIngestWorkflow#NameBlankNodesAction" );
    
    public static final OntClass Variable = m_model.createClass( "http://vitro.mannlib.cornell.edu/ns/vitro/rdfIngestWorkflow#Variable" );
    
    public static final OntClass ClearModelAction = m_model.createClass( "http://vitro.mannlib.cornell.edu/ns/vitro/rdfIngestWorkflow#ClearModelAction" );
    
    public static final OntClass PropertyValueProcessingAction = m_model.createClass( "http://vitro.mannlib.cornell.edu/ns/vitro/rdfIngestWorkflow#PropertyValueProcessingAction" );
    
    public static final OntClass SmushResourcesAction = m_model.createClass( "http://vitro.mannlib.cornell.edu/ns/vitro/rdfIngestWorkflow#SmushResourcesAction" );
    
}