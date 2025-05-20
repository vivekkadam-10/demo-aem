package com.divya.demo.core.models.impl;

import com.divya.demo.core.models.ColorIDCarouselItemModel;
import org.apache.commons.lang3.StringUtils;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.Default;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

/**
 * Implementation for ColorID Carousel Item Model.
 */
@Model(adaptables = Resource.class, adapters = ColorIDCarouselItemModel.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class ColorIDCarouselItemModelImpl implements ColorIDCarouselItemModel {

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
// Token Usage: {'total_tokens': 8789, 'completion_tokens': 643, 'prompt_tokens': 7627}
// Timestamp: 2025-02-17T13:12:45
// Model Used: gpt-4o-2
