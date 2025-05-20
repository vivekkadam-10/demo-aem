package com.divya.demo.core.models;

import org.osgi.annotation.versioning.ConsumerType;
import java.util.List;

/**
 * Interface for the Header component Sling Model.
 */
@ConsumerType
public interface HeaderComponentModel {

    /**
     * Retrieves the navigation root.
     * @return the navigation root path.
     */
    String getNavigationRoot();

    /**
     * Retrieves the structure start level.
     * @return the structure start level.
     */
    int getStructureStart();

    /**
     * Checks if all child pages should be collected.
     * @return true if all child pages should be collected, false otherwise.
     */
    boolean isCollectAllPages();

    /**
     * Retrieves the navigation structure depth.
     * @return the navigation structure depth.
     */
    int getStructureDepth();

    /**
     * Checks if shadowing is disabled.
     * @return true if shadowing is disabled, false otherwise.
     */
    boolean isDisableShadowing();

    /**
     * Retrieves the HTML ID attribute for the component.
     * @return the HTML ID attribute.
     */
    String getId();

    /**
     * Retrieves the accessibility label for the navigation.
     * @return the accessibility label.
     */
    String getAccessibilityLabel();

    /**
     * Retrieves the list of navigation pages.
     * @return list of navigation pages.
     */
    List<NavigationPageModel> getNavigationPages();

    /**
     * Nested interface for Navigation Page Model.
     */
    @ConsumerType
    interface NavigationPageModel {

        /**
         * Retrieves the page path.
         * @return the page path.
         */
        String getPath();

        /**
         * Retrieves the page title.
         * @return the page title.
         */
        String getTitle();
    }
}
