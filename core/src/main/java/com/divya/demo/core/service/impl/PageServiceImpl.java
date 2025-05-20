package com.divya.demo.core.service.impl;

import com.day.cq.commons.jcr.JcrUtil;
import com.day.cq.wcm.api.Page;
import com.day.cq.wcm.api.PageManager;
import com.divya.demo.core.models.PageDetails;
import com.divya.demo.core.service.PageService;
import com.drew.lang.annotations.NotNull;
import org.apache.sling.api.resource.LoginException;
import org.apache.sling.api.resource.ResourceResolver;
import org.apache.sling.api.resource.ResourceResolverFactory;
import org.osgi.service.component.annotations.Reference;

import javax.jcr.Node;
import javax.jcr.RepositoryException;
import javax.jcr.Session;
import java.util.*;

public class PageServiceImpl implements PageService {

    @NotNull
    @Reference
    ResourceResolverFactory resourceResolverFactory;

    List<PageDetails> pdList = new ArrayList<>();

    @Override
    public List<PageDetails> getPageDetails(String pagePath) throws LoginException, RepositoryException {

        Map<String,Object> serviceParams = new HashMap<>();
        serviceParams.put(ResourceResolverFactory.SUBSERVICE,"demouser");
        ResourceResolver resourceResolver = resourceResolverFactory.getResourceResolver(serviceParams);
        if(resourceResolver!=null){
            PageManager pageMgr = resourceResolver.adaptTo(PageManager.class);
            Page page = pageMgr.getPage(pagePath);
            Iterator pageItr = page.listChildren();
            Session session = resourceResolver.adaptTo(Session.class);
            JcrUtil.createPath("/content/abc","nt:unstructured",session);
            session.save();
            Node node = resourceResolver.adaptTo(Node.class);
            node.addNode("test");
            session.save();
            while (pageItr.hasNext()){
                PageDetails pd = new PageDetails();
                Page p = (Page) pageItr.next();
                pd.setPagePath(p.getPath());
                pd.setPageName(p.getTitle());
                pd.setPageDescription(p.getDescription());
                pdList.add(pd);
            }
        }
        return pdList;
    }
}
