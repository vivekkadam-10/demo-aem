package com.divya.demo.core.models;

import org.osgi.annotation.versioning.ConsumerType;
import java.util.List;

/**
 * Interface for the Advanced List component Sling Model.
 */
@ConsumerType
public interface AdvancedListModel {

    /**
     * Retrieves the source type of the list.
     * @return the source type of the list.
     */
    String getSourceType();

    /**
     * Retrieves the layout options for displaying the list.
     * @return the layout options for displaying the list.
     */
    String getLayoutOptions();

    /**
     * Retrieves the manual entry list items when the source type is static.
     * @return list of manual entry items.
     */
    List<ManualEntryItemModel> getManualEntry();

    /**
     * Checks if pagination is enabled for the list.
     * @return true if pagination is enabled, false otherwise.
     */
    boolean isPagination();

    /**
     * Retrieves the item limit for the list.
     * @return the item limit for the list.
     */
    int getItemLimit();

    /**
     * Checks if 'Read More' link is added to the list items.
     * @return true if 'Read More' link is added, false otherwise.
     */
    boolean isReadMore();

    /**
     * Checks if interactive elements are enabled for the list.
     * @return true if interactive elements are enabled, false otherwise.
     */
    boolean isInteractiveElements();

    /**
     * Nested interface for Manual Entry Item Model.
     */
    @ConsumerType
    interface ManualEntryItemModel {

        /**
         * Retrieves the list item.
         * @return the list item.
         */
        String getListItem();
    }
}
