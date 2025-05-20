//  AEM CODE ASSIST V18: AI Generated Code Start -
package com.divya.demo.core.models.impl;

import com.divya.demo.core.models.ColorIDCarouselSlideModel;
import org.apache.commons.lang3.StringUtils;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.Default;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

/**
 * Implementation for ColorID Carousel Slide Model.
 */
@Model(adaptables = Resource.class, adapters = ColorIDCarouselSlideModel.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class ColorIDCarouselSlideModelImpl implements ColorIDCarouselSlideModel {

    @ValueMapValue(name = "./image")
    @Default(values = StringUtils.EMPTY)
    private String imagePath;

    @ValueMapValue(name = "./colorID")
    @Default(values = StringUtils.EMPTY)
    private String colorID;

    @ValueMapValue(name = "./colorHexcode")
    @Default(values = StringUtils.EMPTY)
    private String colorHexcode;

    @ValueMapValue(name = "./colorName")
    @Default(values = StringUtils.EMPTY)
    private String colorName;

    @ValueMapValue(name = "./colorNumber")
    @Default(values = StringUtils.EMPTY)
    private String colorNumber;

    @ValueMapValue(name = "./colorURL")
    @Default(values = StringUtils.EMPTY)
    private String colorURL;

    @ValueMapValue(name = "./openInNewWindow")
    @Default(booleanValues = false)
    private boolean openInNewWindow;

    @Override
    public String getImagePath() {
        return imagePath;
    }

    @Override
    public String getColorID() {
        return colorID;
    }

    @Override
    public String getColorHexcode() {
        return colorHexcode;
    }

    @Override
    public String getColorName() {
        return colorName;
    }

    @Override
    public String getColorNumber() {
        return colorNumber;
    }

    @Override
    public String getColorURL() {
        return colorURL;
    }

    @Override
    public boolean isOpenInNewWindow() {
        return openInNewWindow;
    }
}
// Token Usage: {'total_tokens': 9810, 'completion_tokens': 637, 'prompt_tokens': 8675}
// Timestamp: 2025-04-14T10:14:35
// Model Used: gpt-4o-2

//  AEM CODE ASSIST V18: AI Generated Code End -
