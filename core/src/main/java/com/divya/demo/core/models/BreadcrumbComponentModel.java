package com.divya.demo.core.models;

import org.osgi.annotation.versioning.ConsumerType;
import java.util.List;

/**
 * Interface for the Breadcrumb component Sling Model.
 */
@ConsumerType
public interface BreadcrumbComponentModel {

    /**
     * Retrieves the type of breadcrumb to display.
     * @return the breadcrumb type.
     */
    String getBreadcrumbType();

    /**
     * Checks if the breadcrumb is synchronized with the site structure.
     * @return true if synchronized, false otherwise.
     */
    boolean isSyncWithSiteStructure();

    /**
     * Retrieves the custom title for the breadcrumb.
     * @return the breadcrumb title.
     */
    String getBreadcrumbTitle();

    /**
     * Checks if link management is enabled for breadcrumb items.
     * @return true if link management is enabled, false otherwise.
     */
    boolean isManageLinks();

    /**
     * Retrieves the separator style for breadcrumb items.
     * @return the breadcrumb separator style.
     */
    String getBreadcrumbSeparator();

    /**
     * Retrieves the list of breadcrumb items.
     * @return list of breadcrumb items.
     */
    List<BreadcrumbItemModel> getBreadcrumbItems();

    /**
     * Retrieves the font color for breadcrumb items.
     * @return the font color.
     */
    String getFontColor();

    /**
     * Checks if accessibility settings are applied to the breadcrumb.
     * @return true if accessibility settings are applied, false otherwise.
     */
    boolean isApplyAccessibility();

    /**
     * Nested interface for Breadcrumb Item Model.
     */
    @ConsumerType
    interface BreadcrumbItemModel {

        /**
         * Retrieves the text value of the breadcrumb item.
         * @return the text value.
         */
        String getTextValue();

        /**
         * Retrieves the number value of the breadcrumb item.
         * @return the number value.
         */
        int getNumberValue();
    }
}
