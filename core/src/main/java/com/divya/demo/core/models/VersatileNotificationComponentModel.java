//  AEM Code Assist V15: AI Generated Code Start -
package com.divya.demo.core.models;

import org.osgi.annotation.versioning.ConsumerType;
import java.util.List;

/**
 * Interface for the Versatile Notification Component Sling Model.
 */
@ConsumerType
public interface VersatileNotificationComponentModel {

    /**
     * Returns the selected notification type.
     *
     * @return the notification type.
     */
    String getNotificationType();

    /**
     * Returns the display location option.
     *
     * @return the display location.
     */
    String getDisplayLocation();

    /**
     * Returns the list of page paths if the display location is 'Specific Page'.
     *
     * @return the list of page paths.
     */
    List<String> getPagePaths();

    /**
     * Returns the notification label text.
     *
     * @return the notification label.
     */
    String getNotificationLabel();

    /**
     * Returns the path to the included image or icon.
     *
     * @return the image/icon path.
     */
    String getImageIconPath();

    /**
     * Returns the selected background color.
     *
     * @return the background color.
     */
    String getBackgroundColor();

    /**
     * Returns the CSS style for text.
     *
     * @return the text style.
     */
    String getTextStyle();

    /**
     * Returns the duration for timed notifications.
     *
     * @return the timing duration.
     */
    int getTiming();

    /**
     * Returns the label for the link in interactive notifications.
     *
     * @return the link label.
     */
    String getLinkLabel();

    /**
     * Returns the URL for the link.
     *
     * @return the link URL.
     */
    String getLinkURL();

    /**
     * Returns the list of selected interaction options.
     *
     * @return the interaction options.
     */
    List<String> getInteractionOptions();

    /**
     * Returns true if interaction tracking is enabled.
     *
     * @return true if tracking is enabled, false otherwise.
     */
    boolean isTrackInteractionsEnabled();
}

//  AEM Code Assist V15: AI Generated Code End -