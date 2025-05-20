package com.divya.demo.core.models.impl;

import com.divya.demo.core.models.HeaderComponentModel;
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

@Model(adaptables = Resource.class, adapters = HeaderComponentModel.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class HeaderComponentModelImpl implements HeaderComponentModel {

    @ValueMapValue(name = "./navigationRoot")
    @Default(values = "")
    private String navigationRoot;

    @ValueMapValue(name = "./structureStart")
    @Default(intValues = 1)
    private int structureStart;

    @ValueMapValue(name = "./collectAllPages")
    @Default(booleanValues = true)
    private boolean collectAllPages;

    @ValueMapValue(name = "./structureDepth")
    @Default(intValues = 1)
    private int structureDepth;

    @ValueMapValue(name = "./disableShadowing")
    @Default(booleanValues = false)
    private boolean disableShadowing;

    @ValueMapValue(name = "./id")
    @Default(values = "")
    private String id;

    @ValueMapValue(name = "./accessibilityLabel")
    @Default(values = "")
    private String accessibilityLabel;

    @ChildResource(name = "navigationPages", injectionStrategy = InjectionStrategy.OPTIONAL)
    private Resource navigationPagesResource;

    private List<NavigationPage> navigationPages;

    @PostConstruct
    protected void init() {
        navigationPages = new ArrayList<>();
        if (navigationPagesResource != null) {
            for (Resource childResource : navigationPagesResource.getChildren()) {
                NavigationPage page = childResource.adaptTo(NavigationPage.class);
                if (page != null) {
                    navigationPages.add(page);
                }
            }
        }
    }

    @Override
    public String getNavigationRoot() {
        return navigationRoot;
    }

    @Override
    public int getStructureStart() {
        return structureStart;
    }

    @Override
    public boolean isCollectAllPages() {
        return collectAllPages;
    }

    @Override
    public int getStructureDepth() {
        return structureDepth;
    }

    @Override
    public boolean isDisableShadowing() {
        return disableShadowing;
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public String getAccessibilityLabel() {
        return accessibilityLabel;
    }

    @Override
    public List<NavigationPageModel> getNavigationPages() {
        return new ArrayList<>(navigationPages);
    }

    @Model(adaptables = Resource.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
    public static class NavigationPage implements NavigationPageModel {
        @ValueMapValue
        private String path;

        @ValueMapValue
        private String title;

        @Override
        public String getPath() {
            return path;
        }

        @Override
        public String getTitle() {
            return title;
        }
    }
}
