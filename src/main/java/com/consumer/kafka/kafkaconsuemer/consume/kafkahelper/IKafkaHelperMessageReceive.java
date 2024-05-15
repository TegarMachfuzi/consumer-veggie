package com.consumer.kafka.kafkaconsuemer.consume.kafkahelper;

public interface IKafkaHelperMessageReceive<T> {

    void receive(T message);
}
