package com.divya.demo.core.servlets;

import com.adobe.cq.dam.cfm.ContentElement;
import com.adobe.cq.dam.cfm.ContentFragment;
import com.adobe.cq.dam.cfm.ContentFragmentException;
import com.adobe.cq.dam.cfm.FragmentTemplate;
import com.drew.lang.annotations.NotNull;
import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.SlingHttpServletResponse;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.api.resource.ResourceResolver;
import org.apache.sling.api.servlets.SlingSafeMethodsServlet;
import org.apache.sling.servlets.annotations.SlingServletPaths;
import org.osgi.service.component.annotations.Component;

import javax.servlet.Servlet;
import javax.servlet.ServletException;
import java.io.IOException;

@Component(service = { Servlet.class },immediate = true)
@SlingServletPaths(value = "/bin/createCF")
public class CFServlet extends SlingSafeMethodsServlet {


    protected void doGet(@NotNull SlingHttpServletRequest request, @NotNull SlingHttpServletResponse response) throws ServletException, IOException {
        ResourceResolver resourceResolver = request.getResourceResolver();
        Resource parent = resourceResolver.getResource("/content/dam/we-retail");
        Resource template = resourceResolver.getResource("/conf/we-retail/settings/dam/cfm/models/sample-cf-model");

        try {
            FragmentTemplate tpl = template.adaptTo(FragmentTemplate.class);
            ContentFragment newFragment = tpl.createFragment(parent, "testFragment", "A fragment description.");
            ContentElement element = newFragment.getElement("title");
            if(null!=element){
                element.setContent("chatgpt","text");
            }
            ContentElement elementDescription = newFragment.getElement("description");
            if(null!=elementDescription){
                elementDescription.setContent("This is sample description","text");
            }
            request.getResourceResolver().commit();
        } catch (ContentFragmentException e) {
            e.printStackTrace();
        }
    }
}
