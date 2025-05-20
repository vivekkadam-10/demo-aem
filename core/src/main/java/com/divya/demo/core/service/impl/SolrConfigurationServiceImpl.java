package com.divya.demo.core.service.impl;

import com.divya.demo.core.configs.SolrOsgiConfig;
import com.divya.demo.core.service.SolrConfigurationService;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Modified;
import org.osgi.service.metatype.annotations.Designate;

@Component(service = SolrConfigurationService.class, immediate = true)
@Designate(ocd = SolrOsgiConfig.class, factory = true)
public class SolrConfigurationServiceImpl implements SolrConfigurationService {

    private String siteId;

    private String solrEndpointUrl;

    private String solrUsername;

    private String solrPassword;

    @Activate
    @Modified
    void activate(SolrOsgiConfig config){
        siteId = config.siteId();
        solrEndpointUrl = config.solrEndpointUrl();
        solrUsername = config.solrUsername();
        solrPassword = config.solrPassword();
    }

    @Override
    public String getSiteId() {
        return siteId;
    }

    @Override
    public String getSolrEndpointUrl() {
        return solrEndpointUrl;
    }

    @Override
    public String getSolrUsername() {
        return solrUsername;
    }

    @Override
    public String getSolrPassword() {
        return solrPassword;
    }
}
