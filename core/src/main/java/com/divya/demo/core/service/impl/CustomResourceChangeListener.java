package com.divya.demo.core.service.impl;

import org.apache.sling.api.resource.observation.ResourceChange;
import org.apache.sling.api.resource.observation.ResourceChangeListener;
import org.osgi.service.component.annotations.Component;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

@Component(service = ResourceChangeListener.class,immediate = true,property = {
        ResourceChangeListener.PATHS +"=/content/we-retail/us/en/men",
        ResourceChangeListener.CHANGES +"=ADDED",
        ResourceChangeListener.CHANGES +"=REMOVED",
        ResourceChangeListener.CHANGES +"=CHANGED"
})
public class CustomResourceChangeListener implements ResourceChangeListener {

    private static final Logger log = LoggerFactory.getLogger(CustomResourceChangeListener.class);
    @Override
    public void onChange(List<ResourceChange> list) {

        for(ResourceChange rc:list){
            log.info("Event - {} Resource {}",rc.getType(),rc.getPath());
        }
    }
}
