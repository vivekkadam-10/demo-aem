//  AEM CODE ASSIST V18: AI Generated Code Start -
package com.divya.demo.core.models;

import org.osgi.annotation.versioning.ConsumerType;

/**
 * Interface for the Hero Component Sling Model.
 */
@ConsumerType
public interface HeroComponentModel {

    /**
     * Returns the selected variation option.
     * @return the variation option, either 'Short', 'Article', or 'Landing'.
     */
    String getVariation();
    
    /**
     * Returns the overline text.
     * @return the overline text.
     */
    String getOverline();
    
    /**
     * Returns the headline text.
     * @return the headline text.
     */
    String getHeadline();
    
    /**
     * Returns the subhead text.
     * @return the subhead text.
     */
    String getSubhead();
    
    /**
     * Returns the file path of the uploaded logo image.
     * @return the logo image path.
     */
    String getLogoImagePath();
    
    /**
     * Returns the file path of the uploaded background image.
     * @return the background image path.
     */
    String getBackgroundImagePath();
    
    /**
     * Returns the URL of the primary CTA link.
     * @return the primary CTA link.
     */
    String getPrimaryCtaLink();
    
    /**
     * Returns the aria-label for the primary CTA.
     * @return the primary CTA aria-label.
     */
    String getPrimaryCtaAriaLabel();
    
    /**
     * Returns true if the primary CTA should open in a new window.
     * @return true if the primary CTA opens in a new window, false otherwise.
     */
    boolean isPrimaryCtaOpenInNewWindow();
    
    /**
     * Returns the label for the secondary CTA.
     * @return the secondary CTA label.
     */
    String getSecondaryCtaLabel();
    
    /**
     * Returns the URL of the secondary CTA link.
     * @return the secondary CTA link.
     */
    String getSecondaryCtaLink();
    
    /**
     * Returns the aria-label for the secondary CTA.
     * @return the secondary CTA aria-label.
     */
    String getSecondaryCtaAriaLabel();
    
    /**
     * Returns true if the secondary CTA should open in a new window.
     * @return true if the secondary CTA opens in a new window, false otherwise.
     */
    boolean isSecondaryCtaOpenInNewWindow();
}
// Token Usage: {'total_tokens': 8989, 'completion_tokens': 735, 'prompt_tokens': 8254}
// Timestamp: 2025-04-10T09:14:02
// Model Used: gpt-4o-2

//  AEM CODE ASSIST V18: AI Generated Code End -
