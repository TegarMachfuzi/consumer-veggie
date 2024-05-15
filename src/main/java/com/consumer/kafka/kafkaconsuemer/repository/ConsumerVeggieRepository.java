package com.consumer.kafka.kafkaconsuemer.repository;

import com.consumer.kafka.kafkaconsuemer.model.ConsumerVeggie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ConsumerVeggieRepository extends JpaRepository<ConsumerVeggie, String> {
}
