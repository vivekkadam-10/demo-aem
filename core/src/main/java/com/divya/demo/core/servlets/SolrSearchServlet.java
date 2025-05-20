package com.divya.demo.core.servlets;

import com.divya.demo.core.service.PageService;
import com.divya.demo.core.service.SolrConfigurationManager;
import com.divya.demo.core.service.SolrService;
import com.divya.demo.core.util.SolrSearchHelper;
import com.drew.lang.annotations.NotNull;
import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.SlingHttpServletResponse;
import org.apache.sling.api.resource.LoginException;
import org.apache.sling.api.servlets.SlingAllMethodsServlet;
import org.apache.sling.servlets.annotations.SlingServletPaths;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import javax.servlet.ServletException;
import java.io.IOException;

@Component(service = SolrSearchServlet.class)
@SlingServletPaths(value = "/bin/solr/search")
public class SolrSearchServlet extends SlingAllMethodsServlet {

    @Reference
    PageService pageService;

    @Reference
    SolrService solrService;

    @Reference
    SolrConfigurationManager solrConfigurationManager;

    @Override
    protected void doGet(@NotNull SlingHttpServletRequest request, @NotNull SlingHttpServletResponse response) throws ServletException, IOException {
        SolrSearchHelper solrSearchHelper = new SolrSearchHelper(request,response,solrConfigurationManager);
        try {
            solrSearchHelper.searchSolr(pageService,solrService);
        } catch (LoginException e) {
            e.printStackTrace();
        }
    }
}
