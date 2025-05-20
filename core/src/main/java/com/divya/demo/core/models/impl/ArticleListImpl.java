package com.divya.demo.core.models.impl;

import com.adobe.cq.dam.cfm.ContentFragment;
import com.adobe.cq.export.json.ComponentExporter;
import com.adobe.cq.export.json.ExporterConstants;
import com.divya.demo.core.models.ArticleList;
import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.api.resource.ResourceResolver;
import org.apache.sling.models.annotations.Exporter;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.Optional;
import org.apache.sling.models.annotations.injectorspecific.Self;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

import java.util.ArrayList;
import java.util.List;

@Model(adaptables = {SlingHttpServletRequest.class, Resource.class},adapters = {ArticleList.class, ComponentExporter.class})
@Exporter(name = ExporterConstants.SLING_MODEL_EXPORTER_NAME, extensions = {ExporterConstants.SLING_MODEL_EXTENSION})
public class ArticleListImpl implements ArticleList {

    @Self
    SlingHttpServletRequest request;

    @ValueMapValue
    String listFrom;

    @ValueMapValue
    @Optional
    List<String> fragments;

    @Override
    public List<ContentFragment> getArticleListItems() {
        List<ContentFragment> contentFragments = new ArrayList<>();
        if(listFrom.equals("contentfragments")){
            ResourceResolver resourceResolver = request.getResourceResolver();
            for(String frag:fragments){
                Resource cfResource=resourceResolver.getResource(frag);
                if(null!=cfResource) {
                    ContentFragment cf = cfResource.adaptTo(ContentFragment.class);
                    contentFragments.add(cf);
                }
            }
        }
        return contentFragments;
    }

}
