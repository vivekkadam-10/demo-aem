//  AEM CODE ASSIST V18: AI Generated Code Start -
package com.divya.demo.core.models.impl;

import com.divya.demo.core.models.ColorIDCarouselModel;
import com.divya.demo.core.models.ColorIDCarouselSlideModel;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ChildResource;
import org.apache.sling.models.annotations.injectorspecific.InjectionStrategy;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

/**
 * Implementation for the ColorID Carousel Sling Model.
 */
@Model(adaptables = Resource.class, adapters = ColorIDCarouselModel.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class ColorIDCarouselModelImpl implements ColorIDCarouselModel {

    @ChildResource(name = "slides", injectionStrategy = InjectionStrategy.OPTIONAL)
    private Resource slidesResource;

    private List<ColorIDCarouselSlideModel> slides;

    @PostConstruct
    protected void init() {
        slides = new ArrayList<>();
        if (slidesResource != null) {
            for (Resource childResource : slidesResource.getChildren()) {
                ColorIDCarouselSlideModel slide = childResource.adaptTo(ColorIDCarouselSlideModel.class);
                if (slide != null) {
                    slides.add(slide);
                }
            }
        }
    }

    @Override
    public List<ColorIDCarouselSlideModel> getSlides() {
        return new ArrayList<>(slides);
    }

    @Override
    public String getImagePath() {
        return "";
    }

    @Override
    public String getColorID() {
        return "";
    }

    @Override
    public String getColorHexcode() {
        return "";
    }

    @Override
    public String getColorName() {
        return "";
    }

    @Override
    public String getColorNumber() {
        return "";
    }

    @Override
    public String getColorURL() {
        return "";
    }

    @Override
    public boolean isOpenInNewWindow() {
        return false;
    }
}
// Token Usage: {'total_tokens': 9810, 'completion_tokens': 497, 'prompt_tokens': 8675}
// Timestamp: 2025-04-14T10:14:35
// Model Used: gpt-4o-2

//  AEM CODE ASSIST V18: AI Generated Code End -
