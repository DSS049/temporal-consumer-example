package com.temporal.consumer.example.consumer;

import com.temporal.consumer.example.model.ActivityPlanDomain;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class BookingFeedbackActivityImpl implements BookingFeedbackActivity {
    @Override
    public String feedBackActivity(ActivityPlanDomain activityPlanDomain) {
        String data = "New booking status saved in DB with orderId: " + activityPlanDomain.getOrderId();
        log.info(data);
        return data;
    }
}
