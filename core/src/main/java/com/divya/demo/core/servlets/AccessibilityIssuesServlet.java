package com.divya.demo.core.servlets;

import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.SlingHttpServletResponse;
import org.apache.sling.api.servlets.SlingSafeMethodsServlet;
import org.osgi.service.component.annotations.Component;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.Servlet;
import java.io.IOException;

@Component(
        service = Servlet.class, immediate = true,
        property = {
                "sling.servlet.methods=GET",
                "sling.servlet.paths=/bin/accessibility-issues-render"
        }
)
public class AccessibilityIssuesServlet extends SlingSafeMethodsServlet {

    private static final Logger LOG =
            LoggerFactory.getLogger(AccessibilityIssuesServlet.class);

    @Override
    protected void doGet(SlingHttpServletRequest request, SlingHttpServletResponse response) throws IOException {
        LOG.info("AccessibilityIssuesServlet recieved GET: {}", request);
        response.getWriter().write("Servlet is working");

    }
}
