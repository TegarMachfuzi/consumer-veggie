package com.consumer.kafka.kafkaconsuemer.biz.Impl;

import com.consumer.kafka.kafkaconsuemer.biz.IConsumeDataBiz;
import com.consumer.kafka.kafkaconsuemer.dto.VegieConsumeDto;
import com.consumer.kafka.kafkaconsuemer.model.ConsumerVeggie;
import com.consumer.kafka.kafkaconsuemer.repository.ConsumerVeggieRepository;
import com.consumer.kafka.kafkaconsuemer.utils.JsonUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class ConsumeDataBiz implements IConsumeDataBiz {

    @Autowired
    private ConsumerVeggieRepository consumerVeggieRepository;
    @Override
    public void processConsumeDataVeggie(VegieConsumeDto vegieConsumeDto) {
        ConsumerVeggie consumerVeggie = new ConsumerVeggie();
        consumerVeggie.setDescription(vegieConsumeDto.getDescription());
        consumerVeggie.setName(vegieConsumeDto.getName());
        consumerVeggie.setPrice(vegieConsumeDto.getPrice());
        consumerVeggie.setStock(vegieConsumeDto.getStock());
        consumerVeggie.setVegetableId(vegieConsumeDto.getVegetableId());
        consumerVeggie.setTimestamp(vegieConsumeDto.getTimestamp());
        consumerVeggieRepository.save(consumerVeggie);
        log.info(" sava to db consume veggie {}: ", JsonUtils.toJson(consumerVeggie));
    }
}
