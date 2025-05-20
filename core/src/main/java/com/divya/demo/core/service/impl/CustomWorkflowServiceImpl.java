package com.divya.demo.core.service.impl;

import com.adobe.granite.workflow.WorkflowException;
import com.adobe.granite.workflow.WorkflowSession;
import com.adobe.granite.workflow.exec.WorkflowData;
import com.adobe.granite.workflow.model.WorkflowModel;


import com.divya.demo.core.service.CustomWorkflowService;
import org.apache.sling.api.resource.LoginException;
import org.apache.sling.api.resource.ResourceResolver;
import org.apache.sling.api.resource.ResourceResolverFactory;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import java.util.HashMap;
import java.util.Map;

@Component(service = CustomWorkflowService.class,immediate = true)
public class CustomWorkflowServiceImpl implements CustomWorkflowService {

    @Reference
    ResourceResolverFactory resourceResolverFactory;

    @Override
    public void triggerWorkflow() {

        Map<String,Object> serviceParams = new HashMap<>();
        serviceParams.put(ResourceResolverFactory.SUBSERVICE,"demouser");
        ResourceResolver resourceResolver = null;
        try {
            resourceResolver = resourceResolverFactory.getResourceResolver(serviceParams);

            if(resourceResolver!=null){
                System.out.println("In triggerWorkflow");
                final String wfModel = "/var/workflow/models/request_for_activation";
                final WorkflowSession session = resourceResolver.adaptTo(WorkflowSession.class);
                final WorkflowModel model = session.getModel(wfModel);
                WorkflowData data = session.newWorkflowData("JCR_PATH","/content/we-retail/us/en/men");
                session.startWorkflow(model,data);
            }
        }catch (LoginException e) {
                e.printStackTrace();
            } catch (WorkflowException e) {
            e.printStackTrace();
        }
    }
    }

