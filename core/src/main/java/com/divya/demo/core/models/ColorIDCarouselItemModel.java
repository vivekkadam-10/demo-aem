package com.divya.demo.core.models;

import org.osgi.annotation.versioning.ConsumerType;

/**
 * Interface for ColorID Carousel Item Model.
 */
@ConsumerType
public interface ColorIDCarouselItemModel {

    /**
     * Retrieves the image path.
     * @return the image path.
     */
    String getImagePath();
    
    /**
     * Retrieves the color ID.
     * @return the color ID.
     */
    String getColorID();
    
    /**
     * Retrieves the color hexcode.
     * @return the color hexcode.
     */
    String getColorHexcode();
    
    /**
     * Retrieves the color name.
     * @return the color name.
     */
    String getColorName();
    
    /**
     * Retrieves the color number.
     * @return the color number.
     */
    String getColorNumber();
    
    /**
     * Retrieves the color URL.
     * @return the color URL.
     */
    String getColorURL();
    
    /**
     * Checks if the link should open in a new window.
     * @return true if the link should open in a new window, false otherwise.
     */
    boolean isOpenInNewWindow();
}

// Token Usage: {'total_tokens': 8208, 'completion_tokens': 393, 'prompt_tokens': 7362}
// Timestamp: 2025-02-17T13:12:32
// Model Used: gpt-4o-2
