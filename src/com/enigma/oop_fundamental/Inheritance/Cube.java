package com.enigma.oop_fundamental.Inheritance;

public class Cube extends Rectangle {
    Double height;

    public Cube(Double width, Double length, Double height) {
        super(width, length);
        this.height = height;
    }

    public Double getVolume() {
        return super.getArea() * height;
    }

    public Double getArea() {
        return 2 * (width * length) +
                2 * (width * height) +
                2 * (height * length);
    }
}

