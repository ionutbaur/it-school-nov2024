package com.itschool.session15.homework.ex6;

public class Circle extends Shape {

    private final int radix;

    protected Circle(int radix) {
        super("Circle");
        this.radix = radix;
    }

    @Override
    protected double area() {
        return Math.PI * radix * radix;
    }
}
