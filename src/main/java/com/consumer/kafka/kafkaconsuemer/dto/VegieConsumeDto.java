package com.consumer.kafka.kafkaconsuemer.dto;

import java.io.Serializable;

public class VegieConsumeDto implements Serializable {
    private String vegetableId;

    private String name;
    private String price;
    private String description;
    private String stock;

    private String timestamp;

    public VegieConsumeDto() {
    }

    public VegieConsumeDto(Integer id, String name, String description, String price, String stock) {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStock() {
        return stock;
    }

    public void setStock(String stock) {
        this.stock = stock;
    }

    public String getVegetableId() {
        return vegetableId;
    }

    public void setVegetableId(String vegetableId) {
        this.vegetableId = vegetableId;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }
}
