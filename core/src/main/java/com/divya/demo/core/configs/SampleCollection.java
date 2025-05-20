package com.divya.demo.core.configs;

import org.apache.sling.caconfig.annotation.Configuration;
import org.apache.sling.caconfig.annotation.Property;

@Configuration(collection = true, label = "Sample Collection")
public @interface SampleCollection {
    @Property(label = "Param1")
    String param1();

    @Property(label = "Param2")
    String param2() default "param2";
}
