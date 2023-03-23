package com.example.slaughterhouseapi.Models;

import java.time.LocalDate;

public class AnimalO {

    private LocalDate regDate;
    private float weight;
    private long regNumber;
    private String origin;

    public AnimalO(LocalDate regDate, float weight, long regNumber, String origin) {
        this.regDate = regDate;
        this.weight = weight;
        this.regNumber = regNumber;
        this.origin = origin;
    }

    public LocalDate getRegDate() {
        return regDate;
    }

    public void setRegDate(LocalDate regDate) {
        this.regDate = regDate;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
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
}
