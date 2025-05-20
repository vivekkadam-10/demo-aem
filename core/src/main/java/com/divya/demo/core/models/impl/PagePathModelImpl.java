package com.divya.demo.core.models.impl;

import com.divya.demo.core.models.PagePathModel;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

/**
 * Implementation for Page Path Model.
 */
@Model(adaptables = Resource.class, adapters = PagePathModel.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class PagePathModelImpl implements PagePathModel {

    @ValueMapValue(name = "./pagePath")
    private String pagePath;

    @Override
    public String getPagePath() {
        return pagePath;
    }
}
// Token Usage: {'total_tokens': 11023, 'completion_tokens': 215, 'prompt_tokens': 9602}
// Timestamp: 2025-02-18T10:23:30
// Model Used: gpt-4o-2
