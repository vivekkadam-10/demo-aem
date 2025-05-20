//  AEM Code Assist V15: AI Generated Code Start -
package com.divya.demo.core.models;

import org.osgi.annotation.versioning.ConsumerType;

/**
 * Interface for the CTABannerComponent Sling Model.
 */
@ConsumerType
public interface Banner {

    /**
     * Returns the authored heading text.
     *
     * @return the heading text.
     */
    String getHeading();

    /**
     * Returns the authored subheading text.
     *
     * @return the subheading text.
     */
    String getSubheading();

    /**
     * Returns the authored description text.
     *
     * @return the description text.
     */
    String getDescription();

    /**
     * Returns the selected text and CTA placement option, either 'Top' or 'Bottom'.
     *
     * @return the text and CTA placement option.
     */
    String getTextAndCtaPlacement();

    /**
     * Returns the file path of the uploaded background image.
     *
     * @return the background image path.
     */
    String getBackgroundImagePath();

    /**
     * Returns the authored primary CTA label.
     *
     * @return the primary CTA label.
     */
    String getPrimaryCtaLabel();

    /**
     * Returns the authored primary CTA link.
     *
     * @return the primary CTA link.
     */
    String getPrimaryCtaLink();

    /**
     * Returns the authored primary CTA ARIA label.
     *
     * @return the primary CTA ARIA label.
     */
    String getPrimaryCtaAriaLabel();

    /**
     * Returns true if the primary CTA should open in a new window, false otherwise.
     *
     * @return true if the primary CTA opens in a new window.
     */
    boolean isOpenInNewWindow();

    /**
     * Returns the authored secondary CTA label.
     *
     * @return the secondary CTA label.
     */
    String getSecondaryCtaLabel();

    /**
     * Returns the authored secondary CTA link.
     *
     * @return the secondary CTA link.
     */
    String getSecondaryCtaLink();

    /**
     * Returns the authored secondary CTA ARIA label.
     *
     * @return the secondary CTA ARIA label.
     */
    String getSecondaryCtaAriaLabel();

    /**
     * Returns true if the secondary CTA should open in a new window, false otherwise.
     *
     * @return true if the secondary CTA opens in a new window.
     */
    boolean isSecondaryOpenInNewWindow();
}

//  AEM Code Assist V15: AI Generated Code End -