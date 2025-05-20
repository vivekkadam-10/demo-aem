package com.divya.demo.core.models.impl;

import com.divya.demo.core.models.CarouselSliderModel;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.Default;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ChildResource;
import org.apache.sling.models.annotations.injectorspecific.InjectionStrategy;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Model(adaptables = Resource.class, adapters = CarouselSliderModel.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class CarouselSliderComponentModelImpl implements CarouselSliderModel {

    @ValueMapValue
    @Default(values = "basic")
    private String carouselType;

    @ValueMapValue
    @Default(intValues = 1)
    private int numberOfSlides;

    @ChildResource(name = "slides", injectionStrategy = InjectionStrategy.OPTIONAL)
    private Resource slidesResource;

    private List<SlideModelImpl> slides;

    @ValueMapValue
    @Default(booleanValues = true)
    private boolean autoplay;

    @ValueMapValue
    @Default(values = "fade")
    private String transitionType;

    @ValueMapValue
    @Default(booleanValues = false)
    private boolean ariaLabels;

    @ValueMapValue
    @Default(booleanValues = false)
    private boolean trackInteractions;

    @PostConstruct
    protected void init() {
        slides = new ArrayList<>();
        if (slidesResource != null) {
            for (Resource childResource : slidesResource.getChildren()) {
                SlideModelImpl slide = childResource.adaptTo(SlideModelImpl.class);
                if (slide != null) {
                    slides.add(slide);
                }
            }
        }
    }

    @Override
    public String getCarouselType() {
        return carouselType;
    }

    @Override
    public int getNumberOfSlides() {
        return numberOfSlides;
    }

    @Override
    public List<SlideModel> getSlides() {
        return new ArrayList<>(slides);
    }

    @Override
    public boolean isAutoplay() {
        return autoplay;
    }

    @Override
    public String getTransitionType() {
        return transitionType;
    }

    @Override
    public boolean isAriaLabels() {
        return ariaLabels;
    }

    @Override
    public boolean isTrackInteractions() {
        return trackInteractions;
    }

    @Model(adaptables = Resource.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
    public static class SlideModelImpl implements SlideModel {

        @ValueMapValue
        private String type;

        @ValueMapValue
        private String imagePath;

        @ValueMapValue
        private String altText;

        @ValueMapValue
        private String videoSource;

        @ValueMapValue
        private String videoURL;

        @ValueMapValue
        private String textOverlay;

        @ChildResource(name = "interactiveLinks", injectionStrategy = InjectionStrategy.OPTIONAL)
        private Resource interactiveLinksResource;

        private List<InteractiveLinkModelImpl> interactiveLinks;

        @PostConstruct
        protected void init() {
            interactiveLinks = new ArrayList<>();
            if (interactiveLinksResource != null) {
                for (Resource childResource : interactiveLinksResource.getChildren()) {
                    InteractiveLinkModelImpl link = childResource.adaptTo(InteractiveLinkModelImpl.class);
                    if (link != null) {
                        interactiveLinks.add(link);
                    }
                }
            }
        }

        @Override
        public String getType() {
            return type;
        }

        @Override
        public String getImagePath() {
            return imagePath;
        }

        @Override
        public String getAltText() {
            return altText;
        }

        @Override
        public String getVideoSource() {
            return videoSource;
        }

        @Override
        public String getVideoURL() {
            return videoURL;
        }

        @Override
        public String getTextOverlay() {
            return textOverlay;
        }

        @Override
        public List<InteractiveLinkModel> getInteractiveLinks() {
            return new ArrayList<>(interactiveLinks);
        }
    }

    @Model(adaptables = Resource.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
    public static class InteractiveLinkModelImpl implements InteractiveLinkModel {

        @ValueMapValue
        private String linkLabel;

        @ValueMapValue
        private String linkDetails;

        @ValueMapValue
        private String linkStyle;

        @Override
        public String getLinkLabel() {
            return linkLabel;
        }

        @Override
        public String getLinkDetails() {
            return linkDetails;
        }

        @Override
        public String getLinkStyle() {
            return linkStyle;
        }
    }
}
