//  AEM Code Assist V15: AI Generated Code Start -
package com.divya.demo.core.models.impl;

import com.divya.demo.core.models.AdaptiveBreadcrumbNavigationModel;
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
import java.util.Collections;
import java.util.List;

@Model(adaptables = Resource.class, adapters = AdaptiveBreadcrumbNavigationModel.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class AdaptiveBreadcrumbNavigationModelImpl implements AdaptiveBreadcrumbNavigationModel {

    @ValueMapValue
    @Default(values = "Dynamic")
    private String breadcrumbType;

    @ValueMapValue
    @Default(booleanValues = true)
    private boolean siteStructureSync;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String breadcrumbTitle;

    @ValueMapValue
    @Default(booleanValues = false)
    private boolean linkManagement;

    @ValueMapValue
    @Default(values = "/")
    private String breadcrumbSeparator;

    @ChildResource(name = "breadcrumbItems", injectionStrategy = InjectionStrategy.OPTIONAL)
    private Resource breadcrumbItemsResource;

    private List<BreadcrumbItem> breadcrumbItems;

    @ValueMapValue
    @Default(values = "#000000")
    private String fontColor;

    @ValueMapValue
    @Default(booleanValues = true)
    private boolean accessibilitySettings;

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
    public boolean isSiteStructureSyncEnabled() {
        return siteStructureSync;
    }

    @Override
    public String getBreadcrumbTitle() {
        return breadcrumbTitle;
    }

    @Override
    public boolean isLinkManagementEnabled() {
        return linkManagement;
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
    public boolean isAccessibilitySettingsEnabled() {
        return accessibilitySettings;
    }

    @Model(adaptables = Resource.class, adapters = BreadcrumbItemModel.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
    public static class BreadcrumbItem implements BreadcrumbItemModel {

        @ValueMapValue
        private String textvalue;

        @ValueMapValue
        private int numbervalue;

        @PostConstruct
        protected void init() {
            // Initialization logic if needed
        }

        @Override
        public String getTextvalue() {
            return textvalue;
        }

        @Override
        public int getNumbervalue() {
            return numbervalue;
        }
    }
}

//  AEM Code Assist V15: AI Generated Code End -