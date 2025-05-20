package com.divya.demo.core.models;

import org.osgi.annotation.versioning.ConsumerType;
import java.util.List;

/**
 * Interface for the CarouselSlider component Sling Model.
 */
@ConsumerType
public interface CarouselSliderModel {

    /**
     * Retrieves the type of the carousel.
     * @return the type of the carousel.
     */
    String getCarouselType();

    /**
     * Retrieves the number of slides in the carousel.
     * @return the number of slides.
     */
    int getNumberOfSlides();

    /**
     * Retrieves the list of slides.
     * @return list of slides.
     */
    List<SlideModel> getSlides();

    /**
     * Checks if autoplay is enabled for the carousel.
     * @return true if autoplay is enabled, false otherwise.
     */
    boolean isAutoplay();

    /**
     * Retrieves the transition type of the carousel.
     * @return the transition type.
     */
    String getTransitionType();

    /**
     * Checks if ARIA labels are applied for accessibility.
     * @return true if ARIA labels are applied, false otherwise.
     */
    boolean isAriaLabels();

    /**
     * Checks if user interactions with the carousel are tracked.
     * @return true if interactions are tracked, false otherwise.
     */
    boolean isTrackInteractions();

    /**
     * Nested interface for Slide Model.
     */
    @ConsumerType
    interface SlideModel {

        /**
         * Retrieves the type of the slide.
         * @return the type of the slide.
         */
        String getType();

        /**
         * Retrieves the image path for the slide.
         * @return the image path.
         */
        String getImagePath();

        /**
         * Retrieves the alternative text for the image.
         * @return the alternative text.
         */
        String getAltText();

        /**
         * Retrieves the video source for the slide.
         * @return the video source.
         */
        String getVideoSource();

        /**
         * Retrieves the video URL for the slide.
         * @return the video URL.
         */
        String getVideoURL();

        /**
         * Retrieves the text overlay for the slide.
         * @return the text overlay.
         */
        String getTextOverlay();

        /**
         * Retrieves the list of interactive links for the slide.
         * @return list of interactive links.
         */
        List<InteractiveLinkModel> getInteractiveLinks();
    }

    /**
     * Nested interface for Interactive Link Model.
     */
    @ConsumerType
    interface InteractiveLinkModel {

        /**
         * Retrieves the label of the link.
         * @return the link label.
         */
        String getLinkLabel();

        /**
         * Retrieves the details of the link.
         * @return the link details.
         */
        String getLinkDetails();

        /**
         * Retrieves the style of the link.
         * @return the link style.
         */
        String getLinkStyle();
    }
}
