package com.divya.demo.core.models;

import org.osgi.annotation.versioning.ConsumerType;
import java.util.List;

/**
 * Interface for the Accordion component Sling Model.
 */
@ConsumerType
public interface AccordionModel {

    /**
     * Retrieves the heading of the accordion.
     * @return the heading of the accordion.
     */
    String getHeading();

    /**
     * Retrieves the details of the accordion.
     * @return the details of the accordion.
     */
    String getDetails();

    /**
     * Retrieves the image path of the accordion.
     * @return the image path of the accordion.
     */
    String getImage();

    /**
     * Retrieves the alt text for the image.
     * @return the alt text for the image.
     */
    String getImageAltText();

    /**
     * Retrieves the list of accordion items.
     * @return list of accordion items.
     */
    List<AccordionItemModel> getAccordionItems();

    /**
     * Nested interface for Accordion Item Model.
     */
    @ConsumerType
    interface AccordionItemModel {

        /**
         * Retrieves the heading of the accordion item.
         * @return the heading of the accordion item.
         */
        String getHeading();

        /**
         * Retrieves the details of the accordion item.
         * @return the details of the accordion item.
         */
        String getDetails();

        /**
         * Retrieves the image path of the accordion item.
         * @return the image path of the accordion item.
         */
        String getImage();

        /**
         * Retrieves the alt text for the image of the accordion item.
         * @return the alt text for the image of the accordion item.
         */
        String getImageAltText();
    }
}
