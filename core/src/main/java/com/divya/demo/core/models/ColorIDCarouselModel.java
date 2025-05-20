//  AEM CODE ASSIST V18: AI Generated Code Start -
package com.divya.demo.core.models;

import com.adobe.cq.wcm.core.components.models.Carousel;
import org.osgi.annotation.versioning.ConsumerType;

import java.util.List;

/**
 * Interface for the ColorID Carousel Sling Model.
 */
@ConsumerType
public interface ColorIDCarouselModel extends Carousel {

    /**
     * Retrieves the list of slides.
     *
     * @return list of slides.
     */
    List<ColorIDCarouselSlideModel> getSlides();

    /**
     * Retrieves the image path.
     *
     * @return the image path.
     */
    String getImagePath();

    /**
     * Retrieves the color ID.
     *
     * @return the color ID.
     */
    String getColorID();

    /**
     * Retrieves the color hexcode.
     *
     * @return the color hexcode.
     */
    String getColorHexcode();

    /**
     * Retrieves the color name.
     *
     * @return the color name.
     */
    String getColorName();

    /**
     * Retrieves the color number.
     *
     * @return the color number.
     */
    String getColorNumber();

    /**
     * Retrieves the color URL.
     *
     * @return the color URL.
     */
    String getColorURL();

    /**
     * Checks if the URL should open in a new window.
     *
     * @return true if the URL should open in a new window.
     */
    boolean isOpenInNewWindow();
}

// Token Usage: {'total_tokens': 9259, 'completion_tokens': 482, 'prompt_tokens': 8385}
// Timestamp: 2025-04-14T10:14:22
// Model Used: gpt-4o-2

//  AEM CODE ASSIST V18: AI Generated Code End -
