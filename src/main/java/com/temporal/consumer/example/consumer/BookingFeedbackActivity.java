package com.temporal.consumer.example.consumer;

import com.temporal.consumer.example.model.ActivityPlanDomain;
import com.temporal.consumer.example.model.Feedback;
import io.temporal.activity.ActivityInterface;
import io.temporal.activity.ActivityMethod;

@ActivityInterface
public interface BookingFeedbackActivity {

    @ActivityMethod(name = "FeedbackActivityTaskQueue")
    String feedBackActivity(Feedback feedback);

}
