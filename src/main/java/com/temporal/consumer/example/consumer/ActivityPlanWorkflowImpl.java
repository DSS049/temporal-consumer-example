package com.temporal.consumer.example.consumer;

import com.temporal.consumer.example.model.ActivityPlanDomain;
import java.time.Instant;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ActivityPlanWorkflowImpl implements ActivityPlanWorkflow {

    @Override
    @SneakyThrows
    public String sendActivityPlan(ActivityPlanDomain activityPlanDomain) {
        log.info("ActivityPlanTemporalConsumerImpl received request: {}", activityPlanDomain);
        log.info("Executing business logic in ActivityPlanService for orderId: {}", activityPlanDomain.getOrderId());
        log.info("Business data saved in activity-plan DB with orderId: {}", activityPlanDomain.getOrderId());
        activityPlanDomain.setDomainData("Business data saved in activity-plan DB with orderId: " + activityPlanDomain.getOrderId() + " at " + Instant.now());
        return activityPlanDomain.getDomainData();
    }
}
