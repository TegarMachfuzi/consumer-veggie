package com.consumer.kafka.kafkaconsuemer.consume;

import com.consumer.kafka.kafkaconsuemer.constant.KafkaConstant;
import com.consumer.kafka.kafkaconsuemer.consume.kafkahelper.IKafkaHelperMessageReceive;
import com.consumer.kafka.kafkaconsuemer.dto.VegieConsumeDto;
import com.consumer.kafka.kafkaconsuemer.utils.JsonUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@Component
public class KafkaVegieConsumer implements IKafkaHelperMessageReceive<VegieConsumeDto> {
    private static final Logger logger = LogManager.getLogger(KafkaVegieConsumer.class);

    @Override
    @KafkaListener(topics = KafkaConstant.KafkaTopic.KAFKA_VEGGIE, groupId = "my-group-id", containerFactory = "kafkaListenerContainerFactory")
    public void receive(@Payload VegieConsumeDto vegieConsumeDto) {
        String result = JsonUtils.toJson(vegieConsumeDto);
        logger.info(KafkaConstant.LOG_FORMAT_CONSUME_KAFKA, KafkaConstant.KafkaTopic.KAFKA_VEGGIE, result);


    }
}
