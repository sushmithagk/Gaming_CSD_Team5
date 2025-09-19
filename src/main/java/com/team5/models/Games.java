package com.team5.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "games")
public class Games {

    @Id
    private String id;
    private String name;
    private Double price;
    private String description;
    // private Integer duration;              // duration in minutes
    // private String status;                 // e.g., "active", "inactive"
    // private Integer minPlayerCount;
    // private Integer maxPlayerCount;
    // private Integer playerCountMultiple;

    // Constructors
    public Games() {}

    public Games(String name, Double price, String description, Integer duration,
                 String status, Integer minPlayerCount, Integer maxPlayerCount,
                 Integer playerCountMultiple) {
        this.name = name;
        this.price = price;
        this.description = description;
        // this.duration = duration;
        // this.status = status;
        // this.minPlayerCount = minPlayerCount;
        // this.maxPlayerCount = maxPlayerCount;
        // this.playerCountMultiple = playerCountMultiple;
    }

    // Getters and Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Games{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", description='" + description + '\'' +
                '}';
    }
}
