/* $This file is distributed under the terms of the license in /doc/license.txt$ */

package edu.cornell.mannlib.vitro.webapp.web.functions;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import edu.cornell.mannlib.vitro.webapp.controller.VitroRequest;
import edu.cornell.mannlib.vitro.webapp.controller.freemarker.UrlBuilder;
import freemarker.core.Environment;
import freemarker.template.TemplateMethodModel;
import freemarker.template.TemplateModelException;

public class IndividualProfileUrlMethod implements TemplateMethodModel {

    @Override
    public String exec(List args) throws TemplateModelException {
        if (args.size() != 1) {
            throw new TemplateModelException("Wrong number of arguments");
        }

        String uri = (String) args.get(0);      
        uri = UrlBuilder.urlDecode(uri); // decode in case it's encoded
        Environment env = Environment.getCurrentEnvironment();
        HttpServletRequest request = (HttpServletRequest) env.getCustomAttribute("request");
        VitroRequest vreq = new VitroRequest(request);
        String url = UrlBuilder.getIndividualProfileUrl(uri, vreq.getWebappDaoFactory());
        return (url == null) ? "" : url; // don't return a null to the template
    }

}
