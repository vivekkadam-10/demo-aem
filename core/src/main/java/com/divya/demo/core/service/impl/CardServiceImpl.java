package com.divya.demo.core.service.impl;

import com.divya.demo.core.configs.CardConfiguration;
import com.divya.demo.core.service.CardService;
import org.osgi.framework.Constants;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.metatype.annotations.Designate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Component(
        service = CardService.class,
        immediate = true,
        property = {
                Constants.SERVICE_ID + "=Card Service",
                Constants.SERVICE_DESCRIPTION + "=This service reads values from Card Configuration"
        })
@Designate(ocd = CardConfiguration.class)
public class CardServiceImpl implements CardService {

    private static final String TAG = CardServiceImpl.class.getSimpleName();
    private static final Logger LOGGER = LoggerFactory.getLogger(CardServiceImpl.class);

    private CardConfiguration configuration;

    @Activate
    protected void activate(CardConfiguration configuration) {
        this.configuration = configuration;
    }

    @Override
    public String getOrganizationName() {
        LOGGER.debug("{}: reading organization name", TAG);
        return configuration.getOrganizationName();
    }

    @Override
    public String getHomepageURL() {
        LOGGER.debug("{}: reading homepage url", TAG);
        return configuration.getHomepageURL();
    }
}

