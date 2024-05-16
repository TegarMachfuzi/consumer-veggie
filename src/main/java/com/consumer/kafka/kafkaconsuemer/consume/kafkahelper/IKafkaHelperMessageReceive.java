package com.consumer.kafka.kafkaconsuemer.consume.kafkahelper;

public interface IKafkaHelperMessageReceive<String> {

    void receive(String message);
}
