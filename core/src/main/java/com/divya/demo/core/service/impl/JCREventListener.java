package com.divya.demo.core.service.impl;

import org.apache.sling.jcr.api.SlingRepository;
import org.apache.sling.models.annotations.injectorspecific.SlingObject;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.jcr.RepositoryException;
import javax.jcr.Session;
import javax.jcr.observation.Event;
import javax.jcr.observation.EventIterator;
import javax.jcr.observation.EventListener;

@Component(service = EventListener.class,immediate = true)
public class JCREventListener implements EventListener {

    private static final Logger log = LoggerFactory.getLogger(JCREventListener.class);
    Session session;
    @SlingObject
    SlingRepository slingRepository;

    @Activate
    public void activate() throws RepositoryException {
        session = slingRepository.loginService("admin",null);
        session.getWorkspace().getObservationManager().
                addEventListener(this, Event.NODE_ADDED | Event.NODE_REMOVED,
                        "/content/we-retail/us/en/men/jcr:content",true,
                        null,null,false);


    }
    @Override
    public void onEvent(EventIterator events) {
        while (events.hasNext()){
            try {
                Event event = events.nextEvent();
                System.out.println("Event occured:: "+event.getType());
                log.info("Event::{}, Node::{}, Path::{}",event.getType(),event.getIdentifier(),event.getPath());
            } catch (RepositoryException e) {
                e.printStackTrace();
            }
        }
    }
}
