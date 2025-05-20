package com.divya.demo.core.service.impl;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.event.Event;
import org.osgi.service.event.EventConstants;
import org.osgi.service.event.EventHandler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Component(service = EventHandler.class,immediate = true,property = {
        EventConstants.EVENT_TOPIC +"=org/apache/sling/api/resource/Resource/ADDED",
        EventConstants.EVENT_TOPIC +"=org/apache/sling/api/resource/Resource/CHANGED",
        EventConstants.EVENT_FILTER +"=/content/we-retail/us/en/men/*"
})
public class CustomEventHandler implements EventHandler {

    private static final Logger log = LoggerFactory.getLogger(CustomEventHandler.class);
    @Override
    public void handleEvent(Event event) {
        System.out.println("Event occured:: "+event.getTopic());
        for(String prop:event.getPropertyNames())
        log.info("Property :: {} :: {}", prop,event.getProperty(prop));
    }
}
