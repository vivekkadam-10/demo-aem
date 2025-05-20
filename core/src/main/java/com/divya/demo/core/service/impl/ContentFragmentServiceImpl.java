package com.divya.demo.core.service.impl;

import com.adobe.cq.dam.cfm.*;

import com.divya.demo.core.service.ContentFragmentService;
import com.divya.demo.core.service.HttpService;
import org.apache.commons.lang3.StringUtils;
import org.apache.sling.api.resource.LoginException;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.api.resource.ResourceResolver;
import org.apache.sling.api.resource.ResourceResolverFactory;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

@Component(service = ContentFragmentService.class, immediate = true)
public class ContentFragmentServiceImpl implements ContentFragmentService {

    @Override
    public void createContentFragment(Resource parent, Resource template) throws ContentFragmentException {

        FragmentTemplate tpl = template.adaptTo(FragmentTemplate.class);
        ContentFragment newFragment = tpl.createFragment(parent, "A fragment name", "A fragment description.");
        if (null != newFragment) {

        }
    }
}
