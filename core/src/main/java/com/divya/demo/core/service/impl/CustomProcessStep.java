package com.divya.demo.core.service.impl;

import com.day.cq.workflow.WorkflowException;
import com.day.cq.workflow.WorkflowSession;
import com.day.cq.workflow.exec.WorkItem;
import com.day.cq.workflow.exec.WorkflowData;
import com.day.cq.workflow.exec.WorkflowProcess;
import com.day.cq.workflow.metadata.MetaDataMap;
import org.osgi.service.component.annotations.Component;

@Component(service = WorkflowProcess.class,name = "Custom Step")
public class CustomProcessStep implements WorkflowProcess {
    @Override
    public void execute(WorkItem workItem, WorkflowSession workflowSession, MetaDataMap metaDataMap) throws WorkflowException {
        WorkflowData data = workItem.getWorkflowData();
        String payload = (String) data.getPayload();
        System.out.println(payload);
    }
}
