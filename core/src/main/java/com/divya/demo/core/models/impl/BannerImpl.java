//  AEM Code Assist V15: AI Generated Code Start -
package com.divya.demo.core.models.impl;

import com.divya.demo.core.models.Banner;
import org.apache.commons.lang3.StringUtils;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;
import org.apache.sling.models.annotations.Default;
import javax.annotation.PostConstruct;

@Model(adaptables = Resource.class, adapters = Banner.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class BannerImpl implements Banner {

    @ValueMapValue(name = "./heading")
    @Default(values = StringUtils.EMPTY)
    private String heading;

    @ValueMapValue(name = "./subheading")
    @Default(values = StringUtils.EMPTY)
    private String subheading;

    @ValueMapValue(name = "./description")
    @Default(values = StringUtils.EMPTY)
    private String description;

    @ValueMapValue(name = "./textAndCtaPlacement")
    @Default(values = "Top")
    private String textAndCtaPlacement;

    @ValueMapValue(name = "./backgroundImage")
    @Default(values = StringUtils.EMPTY)
    private String backgroundImagePath;

    @ValueMapValue(name = "./primaryCtaLabel")
    @Default(values = StringUtils.EMPTY)
    private String primaryCtaLabel;

    @ValueMapValue(name = "./primaryCtaLink")
    @Default(values = StringUtils.EMPTY)
    private String primaryCtaLink;

    @ValueMapValue(name = "./primaryCtaAriaLabel")
    @Default(values = StringUtils.EMPTY)
    private String primaryCtaAriaLabel;

    @ValueMapValue(name = "./openInNewWindow")
    @Default(booleanValues = false)
    private boolean openInNewWindow;

    @ValueMapValue(name = "./secondaryCtaLabel")
    @Default(values = StringUtils.EMPTY)
    private String secondaryCtaLabel;

    @ValueMapValue(name = "./secondaryCtaLink")
    @Default(values = StringUtils.EMPTY)
    private String secondaryCtaLink;

    @ValueMapValue(name = "./secondaryCtaAriaLabel")
    @Default(values = StringUtils.EMPTY)
    private String secondaryCtaAriaLabel;

    @ValueMapValue(name = "./secondaryOpenInNewWindow")
    @Default(booleanValues = false)
    private boolean secondaryOpenInNewWindow;

    @PostConstruct
    protected void init() {
        if (StringUtils.isNotBlank(primaryCtaLink) && !primaryCtaLink.endsWith(".html")) {
            primaryCtaLink += ".html";
        }
        if (StringUtils.isNotBlank(secondaryCtaLink) && !secondaryCtaLink.endsWith(".html")) {
            secondaryCtaLink += ".html";
        }
    }

    @Override
    public String getHeading() {
        return heading;
    }

    @Override
    public String getSubheading() {
        return subheading;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public String getTextAndCtaPlacement() {
        return textAndCtaPlacement;
    }

    @Override
    public String getBackgroundImagePath() {
        return backgroundImagePath;
    }

    @Override
    public String getPrimaryCtaLabel() {
        return primaryCtaLabel;
    }

    @Override
    public String getPrimaryCtaLink() {
        return primaryCtaLink;
    }

    @Override
    public String getPrimaryCtaAriaLabel() {
        return primaryCtaAriaLabel;
    }

    @Override
    public boolean isOpenInNewWindow() {
        return openInNewWindow;
    }

    @Override
    public String getSecondaryCtaLabel() {
        return secondaryCtaLabel;
    }

    @Override
    public String getSecondaryCtaLink() {
        return secondaryCtaLink;
    }

    @Override
    public String getSecondaryCtaAriaLabel() {
        return secondaryCtaAriaLabel;
    }

    @Override
    public boolean isSecondaryOpenInNewWindow() {
        return secondaryOpenInNewWindow;
    }
}

//  AEM Code Assist V15: AI Generated Code End -