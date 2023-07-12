package com.temporal.consumer.example.utils;

public class Constants {

    public static final String SECURITY_PROTOCOL = "security.protocol";
    public static final String SASL_MECHANISM = "sasl.mechanism";
    public static final String SASL_JAAS_CONFIG = "sasl.jaas.config";

    public static final String SASL_TRUSTSTORE_LOCATION = "ssl.truststore.location";

    public static final String SASL_TRUSTSTORE_PWORD = "ssl.truststore.password";

    public static final String AUTO_COMMIT_ENABLE = "auto.commit.enable";

    public static final String SPECIFIC_AVRO_READER = "specific.avro.reader";

    public static final String SCHEMA_REGISTRY_TRUST_STORE_TYPE =
            "schema.registry.ssl.truststore.type";

    public static final String SCHEMA_REGISTRY_TRUST_STORE_LOCATION =
            "schema.registry.ssl.truststore.location";

    public static final String SCHEMA_REGISTRY_TRUST_STORE_PASSWORD =
            "schema.registry.ssl.truststore.password";

    public static final String SCHEMA_REGISTRY_KEYSTORE_LOCATION =
            "schema.registry.ssl.keystore.location";

    public static final String SCHEMA_REGISTRY_KEYSTORE_PASSWORD =
            "schema.registry.ssl.keystore.password";

    public static final String METRICS_ACTIVITY_PLAN = "booking_events_activityPlan_produced";
    public static final String METRICS_EVENT_NAME = "event_name";
    public static final String METRICS_TOPIC_NAME = "topic";

    public static final String ACTIVITY_PLAN_TASK_QUEUE_NAME = "sendActivityPlan";
}
