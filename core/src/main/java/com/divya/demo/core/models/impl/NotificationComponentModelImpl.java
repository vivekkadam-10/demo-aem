package com.divya.demo.core.models.impl;

import com.divya.demo.core.models.NotificationComponentModel;
import com.divya.demo.core.models.PagePathModel;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ChildResource;
import org.apache.sling.models.annotations.injectorspecific.InjectionStrategy;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

/**
 * Implementation for the NotificationComponent Sling Model.
 */
@Model(adaptables = Resource.class, adapters = NotificationComponentModel.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class NotificationComponentModelImpl implements NotificationComponentModel {

    @ValueMapValue(name = "./notificationType")
    private String notificationType;

    @ValueMapValue(name = "./displayLocation")
    private String displayLocation;

    @ChildResource(name = "pagePaths", injectionStrategy = InjectionStrategy.OPTIONAL)
    private Resource pagePathsResource;

    private List<PagePathModel> pagePaths;

    @ValueMapValue(name = "./notificationLabel")
    private String notificationLabel;

    @ValueMapValue(name = "./imageIconPath")
    private String imageIconPath;

    @ValueMapValue(name = "./backgroundColor")
    private String backgroundColor;

    @ValueMapValue(name = "./textStyle")
    private String textStyle;

    @ValueMapValue(name = "./timing")
    private int timing;

    @ValueMapValue(name = "./linkLabel")
    private String linkLabel;

    @ValueMapValue(name = "./linkURL")
    private String linkURL;

    @ValueMapValue(name = "./interactionOptions")
    private List<String> interactionOptions;

    @ValueMapValue(name = "./trackInteractions")
    private boolean trackInteractions;

    @PostConstruct
    protected void init() {
        if (pagePathsResource != null) {
            pagePaths = new ArrayList<>();
            for (Resource childResource : pagePathsResource.getChildren()) {
                PagePathModel pagePath = childResource.adaptTo(PagePathModel.class);
                if (pagePath != null) {
                    pagePaths.add(pagePath);
                }
            }
        }
    }

    @Override
    public String getNotificationType() {
        return notificationType != null ? notificationType : "Basic";
    }

    @Override
    public String getDisplayLocation() {
        return displayLocation != null ? displayLocation : "Site-wide";
    }

    @Override
    public List<PagePathModel> getPagePaths() {
        return pagePaths != null ? new ArrayList<>(pagePaths) : new ArrayList<>();
    }

    @Override
    public String getNotificationLabel() {
        return notificationLabel != null ? notificationLabel : "";
    }

    @Override
    public String getImageIconPath() {
        return imageIconPath != null ? imageIconPath : "";
    }

    @Override
    public String getBackgroundColor() {
        return backgroundColor != null ? backgroundColor : "#FFFFFF";
    }

    @Override
    public String getTextStyle() {
        return textStyle != null ? textStyle : "";
    }

    @Override
    public int getTiming() {
        return timing > 0 ? timing : 5;
    }

    @Override
    public String getLinkLabel() {
        return linkLabel != null ? linkLabel : "";
    }

    @Override
    public String getLinkURL() {
        return linkURL != null ? linkURL : "";
    }

    @Override
    public List<String> getInteractionOptions() {
        return interactionOptions != null ? new ArrayList<>(interactionOptions) : new ArrayList<>();
    }

    @Override
    public boolean isTrackInteractionsEnabled() {
        return trackInteractions;
    }
}
// Token Usage: {'total_tokens': 11023, 'completion_tokens': 1205, 'prompt_tokens': 9602}
// Timestamp: 2025-02-18T10:23:30
// Model Used: gpt-4o-2
