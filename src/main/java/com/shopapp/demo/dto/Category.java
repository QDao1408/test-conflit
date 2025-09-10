package com.shopapp.demo.dto;

import jakarta.validation.constraints.NotEmpty;


public class Category {
    @NotEmpty(message = "khong the de trong")
    private String name;

    @NotEmpty
    private int number;

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

    //co tinh gay conflit
}
