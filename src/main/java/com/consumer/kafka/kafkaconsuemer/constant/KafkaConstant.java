package com.consumer.kafka.kafkaconsuemer.constant;

public class KafkaConstant {
    private KafkaConstant(){}

    public static final String LOG_FORMAT_CONSUME_KAFKA = "***** Consume Kafka topic {} -> params: {} -> result: {}";

    public static class KafkaTopic{
        private KafkaTopic() {}

        public static final String KAFKA_VEGGIE ="kafka-veggie";
    }
}
