package com.consumer.kafka.kafkaconsuemer.biz;

import com.consumer.kafka.kafkaconsuemer.dto.VegieConsumeDto;

public interface IConsumeDataBiz {
    void processConsumeDataVeggie(VegieConsumeDto vegieConsumeDto);
}
