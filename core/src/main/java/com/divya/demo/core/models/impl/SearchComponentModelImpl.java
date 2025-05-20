//  AEM Code Assist V15: AI Generated Code Start -
package com.divya.demo.core.models.impl;

import com.day.cq.commons.inherit.HierarchyNodeInheritanceValueMap;
import com.divya.demo.core.models.SearchComponentModel;
import org.apache.commons.lang3.StringUtils;
import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.Default;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.Self;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

import javax.annotation.PostConstruct;

/**
 * Implementation of the SearchComponentModel interface.
 */
@Model(adaptables = Resource.class, adapters = SearchComponentModel.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class SearchComponentModelImpl implements SearchComponentModel {

    @Self
    SlingHttpServletRequest request;

    @ValueMapValue
    @Default(values = "Keyword/Full-text")
    private String searchType;

    @ValueMapValue
    @Default(booleanValues = false)
    private boolean autocomplete;

    @ValueMapValue
    @Default(booleanValues = false)
    private boolean facetManagement;

    @ValueMapValue
    @Default(booleanValues = false)
    private boolean analyticsIntegration;

    @ValueMapValue
    @Default(booleanValues = false)
    private boolean searchSecurity;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String iconPath;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String searchLabel;

    @PostConstruct
    protected void init() {
        if (StringUtils.isBlank(searchType)) {
            searchType = "Keyword/Full-text";
        }
        if (StringUtils.isNotBlank(iconPath) && !iconPath.endsWith(".html")) {
            iconPath += ".html";
        }

        Resource resource = request.getResource();
        HierarchyNodeInheritanceValueMap hnivp = new HierarchyNodeInheritanceValueMap(resource);
        hnivp.get("property",String.class);
    }

    @Override
    public String getSearchType() {
        return searchType;
    }

    @Override
    public boolean isAutocompleteEnabled() {
        return autocomplete;
    }

    @Override
    public boolean isFacetManagementEnabled() {
        return facetManagement;
    }

    @Override
    public boolean isAnalyticsIntegrationEnabled() {
        return analyticsIntegration;
    }

    @Override
    public boolean isSearchSecurityEnabled() {
        return searchSecurity;
    }

    @Override
    public String getIconPath() {
        return iconPath;
    }

    @Override
    public String getSearchLabel() {
        return searchLabel;
    }
}

//  AEM Code Assist V15: AI Generated Code End -