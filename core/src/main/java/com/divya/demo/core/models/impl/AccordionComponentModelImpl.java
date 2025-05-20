//  AEM Code Assist V15: AI Generated Code Start -
package com.divya.demo.core.models.impl;

import com.divya.demo.core.models.AccordionComponentModel;
import org.apache.commons.lang3.StringUtils;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;
import org.apache.sling.models.annotations.Default;
import javax.annotation.PostConstruct;

/**
 * Implementation of the AccordionComponentModel interface.
 */
@Model(adaptables = Resource.class, adapters = AccordionComponentModel.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class AccordionComponentModelImpl implements AccordionComponentModel {

    @ValueMapValue(name = "./heading")
    @Default(values = StringUtils.EMPTY)
    private String heading;

    @ValueMapValue(name = "./details")
    @Default(values = StringUtils.EMPTY)
    private String details;

    @ValueMapValue(name = "./image")
    @Default(values = StringUtils.EMPTY)
    private String imagePath;

    @ValueMapValue(name = "./imageAltText")
    @Default(values = StringUtils.EMPTY)
    private String imageAltText;

    /**
     * Initializes the model, performing necessary validation and transformation.
     */
    @PostConstruct
    protected void init() {
        if (StringUtils.isNotBlank(imagePath) && !imagePath.endsWith(".html")) {
            imagePath += ".html";
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getHeading() {
        return heading;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getDetails() {
        return details;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getImagePath() {
        return imagePath;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getImageAltText() {
        return imageAltText;
    }
}

//  AEM Code Assist V15: AI Generated Code End -