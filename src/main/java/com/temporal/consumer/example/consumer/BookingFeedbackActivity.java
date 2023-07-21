package com.temporal.consumer.example.consumer;

import com.temporal.consumer.example.model.ActivityPlanDomain;
import io.temporal.activity.ActivityInterface;
import io.temporal.activity.ActivityMethod;

@ActivityInterface
public interface BookingFeedbackActivity {

    @ActivityMethod(name = "feedbackActivityTaskQueue")
    String feedBackActivity(ActivityPlanDomain activityPlanDomain);

}
