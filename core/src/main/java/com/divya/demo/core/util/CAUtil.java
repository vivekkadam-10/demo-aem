package com.divya.demo.core.util;

import com.divya.demo.core.configs.SolrCAConfig;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.api.resource.ResourceResolver;
import org.apache.sling.caconfig.ConfigurationBuilder;
import org.osgi.service.component.annotations.Component;


@Component(service = CAUtilInt.class)
public class CAUtil implements CAUtilInt{


    @Override
    public SolrCAConfig getCAConfig(String path, ResourceResolver resourceResolver) {
        if(path!=null && resourceResolver!=null){
            Resource contentResource = resourceResolver.getResource(path);
            if(contentResource!=null){
                ConfigurationBuilder configurationBuilder = contentResource.adaptTo(ConfigurationBuilder.class);
                if(configurationBuilder!=null){
                    return configurationBuilder.as(SolrCAConfig.class);
                }
            }
        }
        return null;
    }
}