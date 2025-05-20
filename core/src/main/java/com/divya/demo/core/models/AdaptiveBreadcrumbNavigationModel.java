//  AEM Code Assist V15: AI Generated Code Start -
package com.divya.demo.core.models;

import com.adobe.cq.wcm.core.components.models.Breadcrumb;
import org.osgi.annotation.versioning.ConsumerType;
import java.util.List;

/**
 * Interface for the Adaptive Breadcrumb Navigation component Sling Model.
 */
@ConsumerType
public interface AdaptiveBreadcrumbNavigationModel extends Breadcrumb {

    /**
     * Retrieves the breadcrumb type.
     *
     * @return the breadcrumb type.
     */
    String getBreadcrumbType();

    /**
     * Checks if site structure synchronization is enabled.
     *
     * @return true if site structure synchronization is enabled; false otherwise.
     */
    boolean isSiteStructureSyncEnabled();

    /**
     * Retrieves the breadcrumb title for static breadcrumbs.
     *
     * @return the breadcrumb title.
     */
    String getBreadcrumbTitle();

    /**
     * Checks if link management is enabled.
     *
     * @return true if link management is enabled; false otherwise.
     */
    boolean isLinkManagementEnabled();

    /**
     * Retrieves the breadcrumb separator.
     *
     * @return the breadcrumb separator.
     */
    String getBreadcrumbSeparator();

    /**
     * Retrieves the list of breadcrumb items.
     *
     * @return list of breadcrumb items.
     */
    List<BreadcrumbItemModel> getBreadcrumbItems();

    /**
     * Retrieves the font color for breadcrumb items.
     *
     * @return the font color.
     */
    String getFontColor();

    /**
     * Checks if accessibility settings are enabled.
     *
     * @return true if accessibility settings are enabled; false otherwise.
     */
    boolean isAccessibilitySettingsEnabled();

    /**
     * Nested interface for Breadcrumb Item Model.
     */
    @ConsumerType
    interface BreadcrumbItemModel {

        /**
         * Retrieves the text value of the breadcrumb item.
         *
         * @return the text value.
         */
        String getTextvalue();

        /**
         * Retrieves the number value of the breadcrumb item.
         *
         * @return the number value.
         */
        int getNumbervalue();
    }
}

//  AEM Code Assist V15: AI Generated Code End -