//  AEM CODE ASSIST V18: AI Generated Code Start -
package com.divya.demo.core.models;

import org.osgi.annotation.versioning.ConsumerType;

/**
 * Interface for the CTA Banner Component Sling Model.
 */
@ConsumerType
public interface CTABannerComponentModel {

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
     * @return the text and CTA placement.
     */
    String getTextAndCTAPlacement();

    /**
     * Returns the file path of the uploaded background image.
     *
     * @return the background image path.
     */
    String getBackgroundImagePath();

    /**
     * Returns the label of the primary CTA.
     *
     * @return the primary CTA label.
     */
    String getPrimaryCTALabel();

    /**
     * Returns the link of the primary CTA.
     *
     * @return the primary CTA link.
     */
    String getPrimaryCTALink();

    /**
     * Returns the ARIA label for the primary CTA.
     *
     * @return the primary CTA ARIA label.
     */
    String getPrimaryCTAAriaLabel();

    /**
     * Returns true if the primary CTA link should open in a new window, false otherwise.
     *
     * @return true if the primary CTA opens in a new window.
     */
    boolean isPrimaryCTAOpenInNewWindow();

    /**
     * Returns the label of the secondary CTA, if authored.
     *
     * @return the secondary CTA label.
     */
    String getSecondaryCTALabel();

    /**
     * Returns the link of the secondary CTA, if authored.
     *
     * @return the secondary CTA link.
     */
    String getSecondaryCTALink();

    /**
     * Returns the ARIA label for the secondary CTA, if authored.
     *
     * @return the secondary CTA ARIA label.
     */
    String getSecondaryCTAAriaLabel();

    /**
     * Returns true if the secondary CTA link should open in a new window, false otherwise.
     *
     * @return true if the secondary CTA opens in a new window.
     */
    boolean isSecondaryCTAOpenInNewWindow();
}
// Token Usage: {'total_tokens': 8721, 'completion_tokens': 743, 'prompt_tokens': 7978}
// Timestamp: 2025-04-14T12:36:43
// Model Used: gpt-4o-2

//  AEM CODE ASSIST V18: AI Generated Code End -
