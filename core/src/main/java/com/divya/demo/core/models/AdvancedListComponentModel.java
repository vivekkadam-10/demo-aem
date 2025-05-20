//  AEM Code Assist V15: AI Generated Code Start -
package com.divya.demo.core.models;

import org.osgi.annotation.versioning.ConsumerType;
import java.util.List;

/**
 * Interface for the Advanced List Component Sling Model.
 */
@ConsumerType
public interface AdvancedListComponentModel extends com.adobe.cq.wcm.core.components.models.List {

    /**
     * Returns the selected source type for the list, either 'Static' or 'Dynamic'.
     *
     * @return the source type as a String.
     */
    String getSourceType();

    /**
     * Returns the selected layout option, either 'Grid' or 'Vertical List'.
     *
     * @return the layout option as a String.
     */
    String getLayoutOption();

    /**
     * Returns a list of items if the source type is 'Static'.
     *
     * @return list of ListItem objects.
     */
    List<ListItemModel> getListItem();

    /**
     * Returns true if pagination is enabled, false otherwise.
     *
     * @return boolean indicating if pagination is enabled.
     */
    boolean isPaginationEnabled();

    /**
     * Returns the maximum number of items to display in the list.
     *
     * @return the limit of items as an integer.
     */
    int getLimitItems();

    /**
     * Returns the label for the 'Read More' link.
     *
     * @return the Read More label as a String.
     */
    String getReadMoreLabel();

    /**
     * Returns the URL for the 'Read More' link.
     *
     * @return the Read More link as a String.
     */
    String getReadMoreLink();

    /**
     * Returns a list of selected interactive elements, such as checkboxes or radio buttons.
     *
     * @return list of interactive elements as Strings.
     */
    List<String> getInteractiveElements();

    /**
     * Nested interface for List Item Model.
     */
    @ConsumerType
    interface ListItemModel {

        /**
         * Returns the text of the list item.
         *
         * @return the text of the list item as a String.
         */
        String getText();
    }
}

//  AEM Code Assist V15: AI Generated Code End -