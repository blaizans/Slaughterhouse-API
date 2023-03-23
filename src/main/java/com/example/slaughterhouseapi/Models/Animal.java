package com.example.slaughterhouseapi.Models;
import javax.persistence.*;

import java.time.LocalDate;


@Entity
@Table(name = "animals")
public class Animal {
    @Column(name = "date")
    private LocalDate regDate;
    @Column(name = "weight")
    private float weight;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long regNumber;
    @Column(name = "origin")
    private String origin;

    public Animal(){}

    public Animal(LocalDate regDate, float weight, long regNumber, String origin) {
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
