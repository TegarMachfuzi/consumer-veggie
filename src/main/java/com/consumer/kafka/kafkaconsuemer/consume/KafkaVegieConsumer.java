package com.consumer.kafka.kafkaconsuemer.consume;

import com.consumer.kafka.kafkaconsuemer.biz.IConsumeDataBiz;
import com.consumer.kafka.kafkaconsuemer.constant.KafkaConstant;
import com.consumer.kafka.kafkaconsuemer.consume.kafkahelper.IKafkaHelperMessageReceive;
import com.consumer.kafka.kafkaconsuemer.dto.VegieConsumeDto;
import com.consumer.kafka.kafkaconsuemer.utils.JsonUtils;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Slf4j
@Component
public class KafkaVegieConsumer implements IKafkaHelperMessageReceive<String> {

    private ObjectMapper objectMapper;

    @Autowired
    public KafkaVegieConsumer(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }

    @Autowired
    IConsumeDataBiz consumeDataBiz;

    @Override
    @KafkaListener(topics = KafkaConstant.KafkaTopic.KAFKA_VEGGIE, groupId = "my-group-id", containerFactory = "kafkaListenerContainerFactory")
    public void receive(@Payload String vegieConsumeDto) {
        try {
           VegieConsumeDto veggie =  objectMapper.readValue(vegieConsumeDto, VegieConsumeDto.class);
           consumeDataBiz.processConsumeDataVeggie(veggie);
           log.info(KafkaConstant.LOG_FORMAT_CONSUME_KAFKA, KafkaConstant.KafkaTopic.KAFKA_VEGGIE, vegieConsumeDto);
        }catch (IOException e){
            log.info("Error for consume kafka");
        }



    }
}
