package com.enigma.oop_fundamental.Inheritance;


public class Rectangle {
    Double width;
    Double length;

    public Rectangle(Double width, Double length) {
        this.width = width;
        this.length = length;
    }

    public Double getArea() {
        return width * length;
    }

    public Double getCircumference() {
        return 2 * (width + length);
    }
}
