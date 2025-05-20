package com.divya.demo.core.configs;

import org.osgi.service.metatype.annotations.AttributeDefinition;
import org.osgi.service.metatype.annotations.ObjectClassDefinition;

@ObjectClassDefinition(name = "Solr Endpoints config")
public @interface SolrOsgiConfig {

    @AttributeDefinition(name="Site Id")
    String siteId();

    @AttributeDefinition(name = "Endpoint Url")
    String solrEndpointUrl();

    @AttributeDefinition(name = "Solr Username")
    String solrUsername();

    @AttributeDefinition(name = "Solr Password")
    String solrPassword();

}
