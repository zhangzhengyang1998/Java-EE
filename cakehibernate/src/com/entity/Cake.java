package com.entity;

public class Cake {
    private int id;
    private  String name;
    private  String description;
    private int price;
    private CakeType caketype;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public CakeType getCaketype() {
        return caketype;
    }

    public void setCaketype(CakeType caketype) {
        this.caketype = caketype;
    }
}
