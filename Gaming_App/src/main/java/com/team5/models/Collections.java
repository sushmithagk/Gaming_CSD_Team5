package com.team5.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.util.Date;

@Document(collection = "collections")
public class Collections {

    @Id
    private String collections_id;
    private Date date;
    private double amount;

    public Collections() {
    }

    public Collections(String collections_id, Date date, double amount) {
        this.collections_id = collections_id;
        this.date = date;
        this.amount = amount;
    }

    public String getCollections_id() {
        return collections_id;
    }

    public void setCollections_id(String collections_id) {
        this.collections_id = collections_id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Collections{" +
                "collections_id='" + collections_id + '\'' +
                ", date=" + date +
                ", amount=" + amount +
                '}';
    }
}