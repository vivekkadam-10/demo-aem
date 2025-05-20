package com.divya.demo.core.configs;

import org.apache.sling.caconfig.annotation.Configuration;
import org.apache.sling.caconfig.annotation.Property;

@Configuration
public @interface NestedConfig {
    @Property(label = "Nested Param1")
    String nestedParam1();

    @Property(label = "Nested Param2")
    String nestedParam2() default "defaultValue";

    @Property(label = "SampleConfig")
    SampleConfiguration SampleConfig();
}
