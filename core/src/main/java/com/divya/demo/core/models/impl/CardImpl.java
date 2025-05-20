package com.divya.demo.core.models.impl;

import com.divya.demo.core.models.Card;
import com.divya.demo.core.service.CardService;
import lombok.Getter;
import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.OSGiService;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

import javax.annotation.PostConstruct;

@Model(adaptables = {SlingHttpServletRequest.class, Resource.class})
public class CardImpl implements Card {

        @ValueMapValue
        @Getter
        String organizationName;

        @ValueMapValue
        @Getter
        String cardTitle;

        @ValueMapValue
        @Getter
        String buttonText;

        @ValueMapValue
        @Getter
        String homepageURL;

        @OSGiService
        CardService cardService;

    @PostConstruct
    public void init(){
        homepageURL =cardService.getHomepageURL();
        organizationName = cardService.getOrganizationName();
    }
}
