package com.divya.demo.core.util;


import com.divya.demo.core.configs.SolrCAConfig;
import com.divya.demo.core.models.PageDetails;
import com.divya.demo.core.service.PageService;
import com.divya.demo.core.service.SolrConfigurationManager;
import com.divya.demo.core.service.SolrConfigurationService;
import com.divya.demo.core.service.SolrService;
import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.SlingHttpServletResponse;
import org.apache.sling.api.resource.LoginException;
import org.apache.sling.api.resource.ResourceResolver;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import java.io.IOException;
import java.util.List;

@Component
public class SolrSearchHelper {

    private SlingHttpServletRequest request;
    private SlingHttpServletResponse response;
    private String siteId;
    private SolrCAConfig solrCAConfig;
    private SolrConfigurationService solrConfigurationService;

    @Reference
    SolrConfigurationManager solrConfigurationManager;

    @Reference
    CAUtilInt caUtilInt;

    public SolrSearchHelper(SlingHttpServletRequest request, SlingHttpServletResponse response, SolrConfigurationManager solrConfigurationManager) {
        this.request = request;
        this.response = response;
        this.siteId = request.getParameter("sitePath");
        this.solrCAConfig = caUtilInt.getCAConfig(this.siteId,this.request.getResourceResolver());
    }

    public void searchSolr(PageService pageService, SolrService solrService) throws IOException, LoginException {
        ResourceResolver resourceResolver = request.getResourceResolver();
        solrConfigurationService = solrConfigurationManager.getSolrConfiguration(solrCAConfig.siteId());
        String searchOp = request.getParameter("searchOperation");
        if(searchOp!=null & searchOp.equalsIgnoreCase("index")){
            List<PageDetails> pageDetails = pageService.getPageDetails(siteId);
            String docAdded = solrService.addDocument(pageDetails,this);
        }else if(searchOp!=null & searchOp.equalsIgnoreCase("delete")){
            solrService.deleteIndex(this);
        }else{
            response.getWriter().write("Choose an operation");
        }
    }

    public SlingHttpServletRequest getRequest() {
        return request;
    }

    public SlingHttpServletResponse getResponse() {
        return response;
    }

    public String getSiteId() {
        return siteId;
    }

    public SolrCAConfig getSolrCAConfig() {
        return solrCAConfig;
    }

    public CAUtilInt getCaUtilInt() {
        return caUtilInt;
    }

    public SolrConfigurationService getSolrConfigurationService() {
        return solrConfigurationService;
    }
}
