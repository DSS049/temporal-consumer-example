package com.temporal.consumer.example.consumer;

import com.temporal.consumer.example.model.ActivityPlanDomain;
import io.temporal.workflow.WorkflowInterface;
import io.temporal.workflow.WorkflowMethod;

@WorkflowInterface
public interface ActivityPlanWorkflow {
    @WorkflowMethod
    String sendActivityPlan(ActivityPlanDomain activityPlanDomain);
}
