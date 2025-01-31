package com.itschool.session15.homework.ex6;

public class Rectangle extends Shape {

    private final int length;
    private final int width;

    protected Rectangle(int length, int width) {
        super("Rectangle");
        this.length = length;
        this.width = width;
    }

    @Override
    protected double area() {
        return length * width;
    }
}
