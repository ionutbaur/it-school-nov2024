package com.itschool.session15.homework.ex6;

public class Square extends Shape {

    private final int side;

    protected Square(int side) {
        super("Square");
        this.side = side;
    }

    @Override
    protected double area() {
        return side * side;
    }
}
