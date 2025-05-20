package com.divya.demo.core.util;

import com.divya.demo.core.configs.SolrCAConfig;
import org.apache.sling.api.resource.ResourceResolver;

public interface CAUtilInt {
    SolrCAConfig getCAConfig(String path, ResourceResolver resourceResolver);
}
