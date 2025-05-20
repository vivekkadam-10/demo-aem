//  AEM Code Assist V15: AI Generated Code Start -
package com.divya.demo.core.models;

import org.osgi.annotation.versioning.ConsumerType;
import com.adobe.cq.wcm.core.components.models.Accordion;

/**
 * Interface for the Accordion Component Sling Model.
 */
@ConsumerType
public interface AccordionComponentModel extends Accordion {

    /**
     * Returns the heading text from the RTE.
     *
     * @return the heading text.
     */
    String getHeading();

    /**
     * Returns the details text from the RTE.
     *
     * @return the details text.
     */
    String getDetails();

    /**
     * Returns the file path of the uploaded image if provided.
     *
     * @return the image file path.
     */
    String getImagePath();

    /**
     * Returns the alt text for the image, ensuring accessibility compliance.
     *
     * @return the image alt text.
     */
    String getImageAltText();
}

//  AEM Code Assist V15: AI Generated Code End -