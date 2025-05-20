//  AEM Code Assist V15: AI Generated Code Start -
package com.divya.demo.core.models;

import org.osgi.annotation.versioning.ConsumerType;

/**
 * Interface for the Search Component Sling Model.
 */
@ConsumerType
public interface SearchComponentModel {

    /**
     * Returns the selected search type option, either 'Keyword/Full-text' or 'Faceted'.
     *
     * @return the search type option.
     */
    String getSearchType();

    /**
     * Returns true if autocomplete is enabled, false otherwise.
     *
     * @return true if autocomplete is enabled; false otherwise.
     */
    boolean isAutocompleteEnabled();

    /**
     * Returns true if facet management is enabled, false otherwise.
     *
     * @return true if facet management is enabled; false otherwise.
     */
    boolean isFacetManagementEnabled();

    /**
     * Returns true if analytics integration is enabled, false otherwise.
     *
     * @return true if analytics integration is enabled; false otherwise.
     */
    boolean isAnalyticsIntegrationEnabled();

    /**
     * Returns true if search security is enabled, false otherwise.
     *
     * @return true if search security is enabled; false otherwise.
     */
    boolean isSearchSecurityEnabled();

    /**
     * Returns the DAM path of the uploaded search bar icon.
     *
     * @return the icon path.
     */
    String getIconPath();

    /**
     * Returns the placeholder text for the search bar.
     *
     * @return the search label.
     */
    String getSearchLabel();
}

//  AEM Code Assist V15: AI Generated Code End -