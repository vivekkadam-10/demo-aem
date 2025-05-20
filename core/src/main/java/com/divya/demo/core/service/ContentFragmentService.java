package com.divya.demo.core.service;

import com.adobe.cq.dam.cfm.ContentFragmentException;
import org.apache.sling.api.resource.LoginException;
import org.apache.sling.api.resource.Resource;

public interface ContentFragmentService {
    public void createContentFragment(Resource parent, Resource template) throws ContentFragmentException;
}
