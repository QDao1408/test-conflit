package com.shopapp.demo.dto;

import jakarta.validation.constraints.NotEmpty;


public class Category {
    @NotEmpty(message = "khong the de trong")
    private String name;

    @NotEmpty
    private int number;

    // hiiii

    private String description;

    public Category(String name) {
        this.name = name;
    }

    public Category() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setDescription1(String description) {
        this.description = description;
    }
    //fhsaldkfhsadlkfhdsa;lfjdks
}
