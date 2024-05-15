package com.consumer.kafka.kafkaconsuemer.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "CONSUMER_VEGIE")
public class ConsumerVeggie {

    @Id
    @Column(name = "VEGETABLE_ID")
    private String vegetableId;
    @Column(name = "NAME", nullable = false)
    private String name;
    @Column(name = "PRICE", nullable = false)
    private String price;
    @Column(name = "DESCRIPTION")
    private String description;
    @Column (name = "STOCK")
    private String stock;

    @Column(name = "TIMESTEMP")
    private String timestamp;

    public String getVegetableId() {
        return vegetableId;
    }

    public void setVegetableId(String vegetableId) {
        this.vegetableId = vegetableId;
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

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public void setStock(String stock) {
        this.stock = stock;
    }
}
