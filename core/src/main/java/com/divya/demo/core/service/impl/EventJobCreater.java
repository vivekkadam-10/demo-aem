package com.divya.demo.core.service.impl;

import org.apache.sling.api.SlingConstants;
import org.apache.sling.event.jobs.Job;
import org.apache.sling.event.jobs.JobManager;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.event.Event;
import org.osgi.service.event.EventConstants;
import org.osgi.service.event.EventHandler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;
import java.util.Map;

@Component(service = EventHandler.class,immediate = true,property = {
        EventConstants.EVENT_TOPIC +"=org/apache/sling/api/resource/Resource/ADDED",
        EventConstants.EVENT_TOPIC +"=org/apache/sling/api/resource/Resource/CHANGED",
        EventConstants.EVENT_FILTER +"=/content/we-retail/us/en/men/*"
})
public class EventJobCreater implements EventHandler {
    private static final Logger log = LoggerFactory.getLogger(EventJobCreater.class);

    @Reference
    JobManager jobManager;
    @Override
    public void handleEvent(Event event) {
        Map<String,Object> consumer = new HashMap<>();
        consumer.put("event",event.getTopic());
        consumer.put("path",event.getProperty(SlingConstants.PROPERTY_PATH));
        Job job = jobManager.addJob("mycustom/topic",consumer);
    }
}
