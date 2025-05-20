package com.divya.demo.core.models;

import org.osgi.annotation.versioning.ConsumerType;

import java.util.List;

/**
 * Interface for the NotificationComponent Sling Model.
 */
@ConsumerType
public interface NotificationComponentModel {

    /**
     * Returns the selected notification type.
     * @return the notification type.
     */
    String getNotificationType();
    
    /**
     * Returns the selected display location.
     * @return the display location.
     */
    String getDisplayLocation();
    
    /**
     * Returns the list of page paths if the display location is 'Specific Page'.
     * @return list of page paths.
     */
    List<PagePathModel> getPagePaths();
    
    /**
     * Returns the notification label text.
     * @return the notification label.
     */
    String getNotificationLabel();
    
    /**
     * Returns the file path of the included image or icon.
     * @return the image/icon path.
     */
    String getImageIconPath();
    
    /**
     * Returns the selected background color.
     * @return the background color.
     */
    String getBackgroundColor();
    
    /**
     * Returns the CSS style for text.
     * @return the text style.
     */
    String getTextStyle();
    
    /**
     * Returns the duration for timed notifications.
     * @return the timing duration.
     */
    int getTiming();
    
    /**
     * Returns the link label for interactive notifications.
     * @return the link label.
     */
    String getLinkLabel();
    
    /**
     * Returns the URL for the link within the notification.
     * @return the link URL.
     */
    String getLinkURL();
    
    /**
     * Returns the list of selected interaction options.
     * @return list of interaction options.
     */
    List<String> getInteractionOptions();
    
    /**
     * Returns true if interaction tracking is enabled.
     * @return true if tracking is enabled.
     */
    boolean isTrackInteractionsEnabled();
}
// Token Usage: {'total_tokens': 8796, 'completion_tokens': 688, 'prompt_tokens': 8007}
// Timestamp: 2025-02-18T10:23:20
// Model Used: gpt-4o-2
