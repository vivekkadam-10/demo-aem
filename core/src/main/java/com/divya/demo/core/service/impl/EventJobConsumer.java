package com.divya.demo.core.service.impl;

import org.apache.sling.event.jobs.Job;
import org.apache.sling.event.jobs.consumer.JobConsumer;
import org.osgi.service.component.annotations.Component;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Component(service = JobConsumer.class,immediate = true,property = {
        JobConsumer.PROPERTY_TOPICS +" = mycustom/topic"
})
public class EventJobConsumer implements JobConsumer {

    private static final Logger log = LoggerFactory.getLogger(EventJobConsumer.class);

    @Override
    public JobResult process(Job job) {
        log.info("Job - {}",job.getProperty("path"));
        return JobResult.OK;
    }
}
