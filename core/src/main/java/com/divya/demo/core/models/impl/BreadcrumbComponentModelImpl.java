package com.divya.demo.core.models.impl;

import com.divya.demo.core.models.BreadcrumbComponentModel;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.Default;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ChildResource;
import org.apache.sling.models.annotations.injectorspecific.InjectionStrategy;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Model(adaptables = Resource.class, adapters = BreadcrumbComponentModel.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class BreadcrumbComponentModelImpl implements BreadcrumbComponentModel {

    @ValueMapValue
    @Default(values = "static")
    private String breadcrumbType;

    @ValueMapValue
    @Default(booleanValues = false)
    private boolean syncWithSiteStructure;

    @ValueMapValue
    @Default(values = "")
    private String breadcrumbTitle;

    @ValueMapValue
    @Default(booleanValues = true)
    private boolean manageLinks;

    @ValueMapValue
    @Default(values = "slash")
    private String breadcrumbSeparator;

    @ChildResource(name = "breadcrumbItems", injectionStrategy = InjectionStrategy.OPTIONAL)
    private Resource breadcrumbItemsResource;

    private List<BreadcrumbItem> breadcrumbItems;

    @ValueMapValue
    @Default(values = "#000000")
    private String fontColor;

    @ValueMapValue
    @Default(booleanValues = true)
    private boolean applyAccessibility;

    @PostConstruct
    protected void init() {
        breadcrumbItems = new ArrayList<>();
        if (breadcrumbItemsResource != null) {
            for (Resource childResource : breadcrumbItemsResource.getChildren()) {
                BreadcrumbItem item = childResource.adaptTo(BreadcrumbItem.class);
                if (item != null) {
                    breadcrumbItems.add(item);
                }
            }
        }
    }

    @Override
    public String getBreadcrumbType() {
        return breadcrumbType;
    }

    @Override
    public boolean isSyncWithSiteStructure() {
        return syncWithSiteStructure;
    }

    @Override
    public String getBreadcrumbTitle() {
        return breadcrumbTitle;
    }

    @Override
    public boolean isManageLinks() {
        return manageLinks;
    }

    @Override
    public String getBreadcrumbSeparator() {
        return breadcrumbSeparator;
    }

    @Override
    public List<BreadcrumbItemModel> getBreadcrumbItems() {
        return new ArrayList<>(breadcrumbItems);
    }

    @Override
    public String getFontColor() {
        return fontColor;
    }

    @Override
    public boolean isApplyAccessibility() {
        return applyAccessibility;
    }

    @Model(adaptables = Resource.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
    public static class BreadcrumbItem implements BreadcrumbItemModel {
        @ValueMapValue
        private String textvalue;

        @ValueMapValue
        private int numbervalue;

        @Override
        public String getTextValue() {
            return textvalue;
        }

        @Override
        public int getNumberValue() {
            return numbervalue;
        }
    }
}
