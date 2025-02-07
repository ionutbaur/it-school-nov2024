package com.itschool.session17.solid;

public class LiskovViolation {

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        printArea(rectangle);

        Rectangle square = new Square();
        printArea(square);
    }

    private static void printArea(Rectangle rectangle) {
        rectangle.setWidth(5);
        rectangle.setLength(10);
        System.out.println("Area of rectangle is: " + rectangle.area());
    }
}
