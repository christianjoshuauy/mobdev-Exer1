package com.example.myapplication;

public class Circle {
    double radius;

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return Math.PI * Math.pow(getRadius(), 2);
    }

    public double getCircumference() {
        return 2 * Math.PI * getRadius();
    }
}
