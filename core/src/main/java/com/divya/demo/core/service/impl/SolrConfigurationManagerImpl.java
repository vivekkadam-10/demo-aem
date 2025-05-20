package com.divya.demo.core.service.impl;

import com.divya.demo.core.service.SolrConfigurationManager;
import com.divya.demo.core.service.SolrConfigurationService;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.component.annotations.ReferenceCardinality;
import org.osgi.service.component.annotations.ReferencePolicy;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Component(service = SolrConfigurationManager.class, immediate = true)
public class SolrConfigurationManagerImpl implements SolrConfigurationManager {

    private Map<String, SolrConfigurationService> configurationServiceMap;

    @Reference(service = SolrConfigurationService.class, cardinality = ReferenceCardinality.MULTIPLE,policy = ReferencePolicy.DYNAMIC)
    void bindApiServiceConfiguration(SolrConfigurationService config){
        if(configurationServiceMap==null){
            configurationServiceMap = new ConcurrentHashMap<>();
        }
        configurationServiceMap.put(config.getSiteId(),config);
    }

    void unbindApiServiceConfiguration(SolrConfigurationService config){
        if(configurationServiceMap!=null) {
            configurationServiceMap.remove(config.getSiteId());
        }
    }


    @Override
    public SolrConfigurationService getSolrConfiguration(String siteId) {
        return configurationServiceMap.get(siteId);
    }
}
