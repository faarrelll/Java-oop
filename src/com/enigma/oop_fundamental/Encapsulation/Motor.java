package com.enigma.oop_fundamental.Encapsulation;

public class Motor {
    private String name;
    private String color;
    private String brand;

    public Motor(String name, String color, String brand) {
        this.name = name;
        this.color = color;
        this.brand = brand;
    }

    public Motor() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
