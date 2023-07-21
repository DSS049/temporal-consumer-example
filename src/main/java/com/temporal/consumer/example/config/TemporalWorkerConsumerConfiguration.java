package com.temporal.consumer.example.config;

import com.maersk.composition.service.TemporalClientProvider;
import com.temporal.consumer.example.consumer.BookingFeedbackActivityImpl;
import io.temporal.client.WorkflowClient;
import io.temporal.worker.WorkerFactory;
import io.temporal.worker.WorkerFactoryOptions;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Getter
@Component
@RequiredArgsConstructor
public class TemporalWorkerConsumerConfiguration implements ApplicationRunner {

    private WorkflowClient client;
    private final TemporalClientProvider temporalClientProvider;


    @Value("${temporal.activity-plan.task-queue-name}")
    private String activityPlanTaskQueueName;

    @Value("${temporal.feedback.task-queue-name}")
    private String feedbackTaskQueueName;

    private final BookingFeedbackActivityImpl bookingFeedbackActivity;

    @Override
    public void run(ApplicationArguments args) {
        client = temporalClientProvider.getTemporalClientInstance();
        WorkerFactoryOptions workerFactoryOptions = temporalClientProvider.getWorkerFactoryOptions();
        WorkerFactory factory = WorkerFactory.newInstance(client, workerFactoryOptions);
        io.temporal.worker.Worker worker = factory.newWorker(feedbackTaskQueueName);
        //worker.registerWorkflowImplementationTypes(ActivityPlanWorkflowImpl.class);
        worker.registerActivitiesImplementations(bookingFeedbackActivity);
        factory.start();
    }
}
