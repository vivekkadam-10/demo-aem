//  AEM CODE ASSIST V18: AI Generated Code Start -
package com.divya.demo.core.models.impl;

import com.divya.demo.core.models.HeroComponentModel;
import org.apache.commons.lang3.StringUtils;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

import javax.annotation.PostConstruct;

/**
 * Implementation for the Hero Component Sling Model.
 */
@Model(adaptables = Resource.class, adapters = HeroComponentModel.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class HeroComponentModelImpl implements HeroComponentModel {

    @ValueMapValue(name = "./variation")
    private String variation;

    @ValueMapValue(name = "./overline")
    private String overline;

    @ValueMapValue(name = "./headline")
    private String headline;

    @ValueMapValue(name = "./subhead")
    private String subhead;

    @ValueMapValue(name = "./logoImage")
    private String logoImagePath;

    @ValueMapValue(name = "./backgroundImage")
    private String backgroundImagePath;

    @ValueMapValue(name = "./primaryCtaLink")
    private String primaryCtaLink;

    @ValueMapValue(name = "./primaryCtaAriaLabel")
    private String primaryCtaAriaLabel;

    @ValueMapValue(name = "./primaryCtaOpenInNewWindow")
    private boolean primaryCtaOpenInNewWindow;

    @ValueMapValue(name = "./secondaryCtaLabel")
    private String secondaryCtaLabel;

    @ValueMapValue(name = "./secondaryCtaLink")
    private String secondaryCtaLink;

    @ValueMapValue(name = "./secondaryCtaAriaLabel")
    private String secondaryCtaAriaLabel;

    @ValueMapValue(name = "./secondaryCtaOpenInNewWindow")
    private boolean secondaryCtaOpenInNewWindow;

    @PostConstruct
    protected void init() {
        if (StringUtils.isBlank(variation)) {
            variation = "Short";
        }
    }

    @Override
    public String getVariation() {
        return variation;
    }

    @Override
    public String getOverline() {
        return StringUtils.defaultString(overline);
    }

    @Override
    public String getHeadline() {
        return StringUtils.defaultString(headline);
    }

    @Override
    public String getSubhead() {
        return StringUtils.defaultString(subhead);
    }

    @Override
    public String getLogoImagePath() {
        return StringUtils.defaultString(logoImagePath);
    }

    @Override
    public String getBackgroundImagePath() {
        return StringUtils.defaultString(backgroundImagePath);
    }

    @Override
    public String getPrimaryCtaLink() {
        return StringUtils.defaultString(primaryCtaLink);
    }

    @Override
    public String getPrimaryCtaAriaLabel() {
        return StringUtils.defaultString(primaryCtaAriaLabel);
    }

    @Override
    public boolean isPrimaryCtaOpenInNewWindow() {
        return primaryCtaOpenInNewWindow;
    }

    @Override
    public String getSecondaryCtaLabel() {
        return StringUtils.defaultString(secondaryCtaLabel);
    }

    @Override
    public String getSecondaryCtaLink() {
        return StringUtils.defaultString(secondaryCtaLink);
    }

    @Override
    public String getSecondaryCtaAriaLabel() {
        return StringUtils.defaultString(secondaryCtaAriaLabel);
    }

    @Override
    public boolean isSecondaryCtaOpenInNewWindow() {
        return secondaryCtaOpenInNewWindow;
    }
}
// Token Usage: {'total_tokens': 10898, 'completion_tokens': 1159, 'prompt_tokens': 9739}
// Timestamp: 2025-04-10T09:14:10
// Model Used: gpt-4o-2

//  AEM CODE ASSIST V18: AI Generated Code End -
