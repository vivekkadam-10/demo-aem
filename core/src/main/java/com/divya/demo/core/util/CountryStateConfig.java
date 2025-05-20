package com.divya.demo.core.util;

import org.osgi.service.metatype.annotations.AttributeDefinition;
import org.osgi.service.metatype.annotations.AttributeType;
import org.osgi.service.metatype.annotations.ObjectClassDefinition;

@ObjectClassDefinition(
        name = "Country-State Configuration",
        description = "This configuration reads the values to make an HTTP call to a JSON webservice")
public @interface CountryStateConfig {

    /**
     * Returns the server
     *
     * @return {@link String}
     */
    @AttributeDefinition(
            name = "CountryStateMap",
            description = "Enter the Country:{States}",
            type = AttributeType.STRING)
    public String[] getCountryStateMap();

}
