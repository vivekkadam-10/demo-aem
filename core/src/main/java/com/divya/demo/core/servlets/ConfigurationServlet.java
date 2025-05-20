package com.divya.demo.core.servlets;

import com.adobe.cq.dam.cfm.ContentFragmentException;
import com.divya.demo.core.service.ContentFragmentService;
import com.drew.lang.annotations.NotNull;
import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.SlingHttpServletResponse;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.api.resource.ResourceResolver;
import org.apache.sling.api.servlets.SlingSafeMethodsServlet;
import org.apache.sling.servlets.annotations.SlingServletPaths;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import javax.servlet.Servlet;
import javax.servlet.ServletException;
import java.io.IOException;

@Component(service = { Servlet.class },immediate = true)
@SlingServletPaths(value = "/bin/myConfigs")
public class ConfigurationServlet extends SlingSafeMethodsServlet {

    /*@Reference
    ContentFragmentService contentFragmentService;*/

    protected void doGet(@NotNull SlingHttpServletRequest request, @NotNull SlingHttpServletResponse response) throws ServletException, IOException {
        ResourceResolver resourceResolver = request.getResourceResolver();
        Resource parent = resourceResolver.getResource("/content/dam/we-retail");
        Resource template = resourceResolver.getResource("/conf/we-retail/settings/dam/cfm/models/sample-cf-model");
        /*try {
            contentFragmentService.createContentFragment(parent,template);
        } catch (ContentFragmentException e) {
            e.printStackTrace();
        }*/
    }

}
