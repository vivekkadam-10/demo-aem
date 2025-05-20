//  AEM Code Assist V15: AI Generated Code Start -
package com.divya.demo.core.models.impl;

import com.divya.demo.core.models.VersatileNotificationComponentModel;
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

@Model(adaptables = Resource.class, adapters = VersatileNotificationComponentModel.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class VersatileNotificationComponentModelImpl implements VersatileNotificationComponentModel {

    @ValueMapValue
    @Default(values = "Basic")
    private String notificationType;

    @ValueMapValue
    @Default(values = "Site-wide")
    private String displayLocation;

    @ChildResource(name = "pagePaths", injectionStrategy = InjectionStrategy.OPTIONAL)
    private Resource pagePathsResource;

    private List<String> pagePaths;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String notificationLabel;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String imageIconPath;

    @ValueMapValue
    @Default(values = "#FFFFFF")
    private String backgroundColor;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String textStyle;

    @ValueMapValue
    @Default(intValues = 5)
    private int timing;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String linkLabel;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String linkURL;

    @ChildResource(name = "interactionOptions", injectionStrategy = InjectionStrategy.OPTIONAL)
    private Resource interactionOptionsResource;

    private List<String> interactionOptions;

    @ValueMapValue
    @Default(booleanValues = false)
    private boolean trackInteractions;

    @PostConstruct
    protected void init() {
        pagePaths = new ArrayList<>();
        if (pagePathsResource != null) {
            for (Resource childResource : pagePathsResource.getChildren()) {
                String path = childResource.getValueMap().get("pagePath", String.class);
                if (StringUtils.isNotBlank(path)) {
                    pagePaths.add(path);
                }
            }
        }
        interactionOptions = new ArrayList<>();
        if (interactionOptionsResource != null) {
            for (Resource childResource : interactionOptionsResource.getChildren()) {
                String option = childResource.getValueMap().get("value", String.class);
                if (StringUtils.isNotBlank(option)) {
                    interactionOptions.add(option);
                }
            }
        }
        if (StringUtils.isNotBlank(linkURL) && !linkURL.endsWith(".html")) {
            linkURL += ".html";
        }
    }

    @Override
    public String getNotificationType() {
        return notificationType;
    }

    @Override
    public String getDisplayLocation() {
        return displayLocation;
    }

    @Override
    public List<String> getPagePaths() {
        return new ArrayList<>(pagePaths);
    }

    @Override
    public String getNotificationLabel() {
        return notificationLabel;
    }

    @Override
    public String getImageIconPath() {
        return imageIconPath;
    }

    @Override
    public String getBackgroundColor() {
        return backgroundColor;
    }

    @Override
    public String getTextStyle() {
        return textStyle;
    }

    @Override
    public int getTiming() {
        return timing;
    }

    @Override
    public String getLinkLabel() {
        return linkLabel;
    }

    @Override
    public String getLinkURL() {
        return linkURL;
    }

    @Override
    public List<String> getInteractionOptions() {
        return new ArrayList<>(interactionOptions);
    }

    @Override
    public boolean isTrackInteractionsEnabled() {
        return trackInteractions;
    }
}
//  AEM Code Assist V15: AI Generated Code End -