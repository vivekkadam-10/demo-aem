//  AEM CODE ASSIST V18: AI Generated Code Start -
package com.divya.demo.core.models.impl;

import com.divya.demo.core.models.CTABannerComponentModel;
import org.apache.commons.lang3.StringUtils;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.Default;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

import javax.annotation.PostConstruct;

/**
 * Implementation for the CTA Banner Component Sling Model.
 */
@Model(adaptables = Resource.class, adapters = CTABannerComponentModel.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class CTABannerComponentModelImpl implements CTABannerComponentModel {

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String heading;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String subheading;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String description;

    @ValueMapValue
    @Default(values = "Top")
    private String textAndCTAPlacement;

    @ValueMapValue(name = "backgroundImagePath")
    @Default(values = StringUtils.EMPTY)
    private String backgroundImagePath;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String primaryCTALabel;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String primaryCTALink;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String primaryCTAAriaLabel;

    @ValueMapValue
    @Default(booleanValues = false)
    private boolean primaryCTAOpenInNewWindow;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String secondaryCTALabel;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String secondaryCTALink;

    @ValueMapValue
    @Default(values = StringUtils.EMPTY)
    private String secondaryCTAAriaLabel;

    @ValueMapValue
    @Default(booleanValues = false)
    private boolean secondaryCTAOpenInNewWindow;

    @PostConstruct
    protected void init() {
        // Initialization logic if needed
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
    public String getTextAndCTAPlacement() {
        return textAndCTAPlacement;
    }

    @Override
    public String getBackgroundImagePath() {
        return backgroundImagePath;
    }

    @Override
    public String getPrimaryCTALabel() {
        return primaryCTALabel;
    }

    @Override
    public String getPrimaryCTALink() {
        return primaryCTALink;
    }

    @Override
    public String getPrimaryCTAAriaLabel() {
        return primaryCTAAriaLabel;
    }

    @Override
    public boolean isPrimaryCTAOpenInNewWindow() {
        return primaryCTAOpenInNewWindow;
    }

    @Override
    public String getSecondaryCTALabel() {
        return secondaryCTALabel;
    }

    @Override
    public String getSecondaryCTALink() {
        return secondaryCTALink;
    }

    @Override
    public String getSecondaryCTAAriaLabel() {
        return secondaryCTAAriaLabel;
    }

    @Override
    public boolean isSecondaryCTAOpenInNewWindow() {
        return secondaryCTAOpenInNewWindow;
    }
}
// Token Usage: {'total_tokens': 10553, 'completion_tokens': 1096, 'prompt_tokens': 9457}
// Timestamp: 2025-04-14T12:36:52
// Model Used: gpt-4o-2

//  AEM CODE ASSIST V18: AI Generated Code End -
