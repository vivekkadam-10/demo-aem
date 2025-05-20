//  AEM CODE ASSIST V18: AI Generated Code Start -
package com.divya.demo.core.models.impl;

import com.divya.demo.core.models.TileModel;
import org.apache.commons.lang3.StringUtils;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.Default;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

/**
 * Implementation for Tile Model.
 */
@Model(adaptables = Resource.class, adapters = TileModel.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class TileModelImpl implements TileModel {

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String title;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String description;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String cta;

    @ValueMapValue(name = "backgroundImage")
    @Default(values = StringUtils.EMPTY)
    private String backgroundImagePath;

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public String getCTA() {
        return cta;
    }

    @Override
    public String getBackgroundImagePath() {
        return backgroundImagePath;
    }
}
// Token Usage: {'total_tokens': 7824, 'completion_tokens': 399, 'prompt_tokens': 6974}
// Timestamp: 2025-04-14T13:56:50
// Model Used: gpt-4o-2

//  AEM CODE ASSIST V18: AI Generated Code End -
