package com.example.slaughterhouseapi.Models;

import java.util.Date;

public class Animal {
    private Date regDate;
    private float weight;
    private long regNumber;
    private String origin;

    public Animal(){}

    public Animal(Date regDate, float weight, long regNumber, String origin) {
        this.regDate = regDate;
        this.weight = weight;
        this.regNumber = regNumber;
        this.origin = origin;
    }


    public Date getRegDate() {
        return regDate;
    }

    public void setRegDate(Date regDate) {
        this.regDate = regDate;
    }

    public long getRegNumber() {
        return regNumber;
    }

    public void setRegNumber(long regNumber) {
        this.regNumber = regNumber;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }
}
