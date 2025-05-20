package com.divya.demo.core.configs;

import org.apache.sling.caconfig.annotation.Configuration;
import org.apache.sling.caconfig.annotation.Property;

@Configuration(label = "Solr CA Config", description = "This is context aware configuration for solr")
public @interface SolrCAConfig {

    @Property(label="Site Id")
    String siteId();

    @Property(label = "Core Name")
    String coreName();
}
