package com.temporal.consumer.example.consumer;

import com.temporal.consumer.example.model.Feedback;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class BookingFeedbackActivityImpl implements BookingFeedbackActivity {
    @Override
    public String feedBackActivity(Feedback feedback) {
        String data = "New booking status saved in DB with bookingId: " + feedback.getBookingId();
        log.info(data);
        return data;
    }
}
