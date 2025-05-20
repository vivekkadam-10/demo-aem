package com.divya.demo.core.servlets;

import com.divya.demo.core.service.CustomWorkflowService;
import com.divya.demo.core.service.HttpService;
import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.SlingHttpServletResponse;
import org.apache.sling.api.servlets.HttpConstants;
import org.apache.sling.api.servlets.SlingSafeMethodsServlet;
import org.osgi.framework.Constants;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.Servlet;

@Component(service = Servlet.class, property = { Constants.SERVICE_DESCRIPTION + "=HTTP servlet",
        "sling.servlet.methods=" + HttpConstants.METHOD_GET, "sling.servlet.paths=" + "/bin/demo/httpcall" })
public class HttpServlet extends SlingSafeMethodsServlet {

    /**
     * Generated serialVersionUid
     */
    private static final long serialVersionUID = -2014397651676211439L;

    /**
     * Logger
     */
    private static final Logger log = LoggerFactory.getLogger(HttpServlet.class);

    @Reference
    private CustomWorkflowService customWorkflowService;

    @Reference
    private HttpService httpService;


    /**
     * Overridden doGet() method
     */
    @Override
    protected void doGet(SlingHttpServletRequest request, SlingHttpServletResponse response) {

        try {

            System.out.println("In simple servlet");
            /*ResourceResolver resourceResolver = request.getResourceResolver();
            WorkflowSession session = resourceResolver.adaptTo(WorkflowSession.class);
            WorkflowModel model = session.getModel("/var/workflow/models/request_for_activation");
            WorkflowData data = session.newWorkflowData("JCR_PATH","/content/we-retail/us/en/men");
            session.startWorkflow(model,data);

            if(customWorkflowService!=null) {
                System.out.println("customWorkflowService not null");
                    customWorkflowService.triggerWorkflow();
            }*/
            String jsonResponse = httpService.makeHttpCall();

            /**
             * Printing the json response on the browser
             */
            response.getWriter().println(jsonResponse);

        } catch (Exception e) {

            log.error(e.getMessage(), e);
        }
    }

}
