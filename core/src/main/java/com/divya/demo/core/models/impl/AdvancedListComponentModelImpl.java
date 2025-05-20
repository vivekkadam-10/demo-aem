//  AEM Code Assist V15: AI Generated Code Start -
package com.divya.demo.core.models.impl;

import com.divya.demo.core.models.AdvancedListComponentModel;
import org.apache.commons.lang3.StringUtils;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ChildResource;
import org.apache.sling.models.annotations.injectorspecific.InjectionStrategy;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;
import org.apache.sling.models.annotations.Default;
import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Model(adaptables = Resource.class, adapters = AdvancedListComponentModel.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class AdvancedListComponentModelImpl implements AdvancedListComponentModel {

    @ValueMapValue
    @Default(values = "Static")
    private String sourceType;

    @ValueMapValue
    @Default(values = "Vertical List")
    private String layoutOption;

    @ChildResource(name = "listItems", injectionStrategy = InjectionStrategy.OPTIONAL)
    private Resource listItemsResource;

    private List<ListItemModelImpl> listItem;

    @ValueMapValue
    @Default(values = "false")
    private boolean pagination;

    @ValueMapValue
    @Default(intValues = 10)
    private int limitItems;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String readMoreLabel;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String readMoreLink;

    @ChildResource(name = "interactiveElements", injectionStrategy = InjectionStrategy.OPTIONAL)
    private Resource interactiveElementsResource;

    private List<String> interactiveElements;

    @PostConstruct
    protected void init() {
        listItem = new ArrayList<>();
        if (listItemsResource != null) {
            for (Resource childResource : listItemsResource.getChildren()) {
                ListItemModelImpl item = childResource.adaptTo(ListItemModelImpl.class);
                if (item != null) {
                    listItem.add(item);
                }
            }
        }

        interactiveElements = new ArrayList<>();
        if (interactiveElementsResource != null) {
            for (Resource childResource : interactiveElementsResource.getChildren()) {
                String element = childResource.getValueMap().get("text", String.class);
                if (StringUtils.isNotBlank(element)) {
                    interactiveElements.add(element);
                }
            }
        }

        if (StringUtils.isNotBlank(readMoreLink) && !readMoreLink.endsWith(".html")) {
            readMoreLink += ".html";
        }
    }

    @Override
    public String getSourceType() {
        return sourceType;
    }

    @Override
    public String getLayoutOption() {
        return layoutOption;
    }

    @Override
    public List<ListItemModel> getListItem() {
        return new ArrayList<>(listItem);
    }

    @Override
    public boolean isPaginationEnabled() {
        return pagination;
    }

    @Override
    public int getLimitItems() {
        return limitItems;
    }

    @Override
    public String getReadMoreLabel() {
        return readMoreLabel;
    }

    @Override
    public String getReadMoreLink() {
        return readMoreLink;
    }

    @Override
    public List<String> getInteractiveElements() {
        return new ArrayList<>(interactiveElements);
    }

    @Model(adaptables = Resource.class, adapters = AdvancedListComponentModel.ListItemModel.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
    public static class ListItemModelImpl implements AdvancedListComponentModel.ListItemModel {
        @ValueMapValue
        @Default(values = StringUtils.EMPTY)
        private String text;

        @Override
        public String getText() {
            return text;
        }
    }
}

//  AEM Code Assist V15: AI Generated Code End -