package com.divya.demo.core.configs;

import org.apache.sling.caconfig.annotation.Configuration;
import org.apache.sling.caconfig.annotation.Property;

@Configuration(label = "Sample Configuration")
public @interface SampleConfiguration {
    @Property(label = "Param1")
    String param1();

    @Property(label = "Param2")
    String param2() default "defaultVal";
}
