package com.itschool.session15.homework.ex6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        /*Shape circle = new Circle(5);
        Shape square = new Square(8);
        Shape rectangle = new Rectangle(10, 4);*/

        List<Shape> shapeList = new ArrayList<>();
        shapeList.add(new Circle(5));
        shapeList.add(new Square(8));
        shapeList.add(new Rectangle(10, 4));
        Collections.shuffle(shapeList);

        for (Shape shape : shapeList) {
            System.out.println("Area of " + shape.getName() + " is: " + shape.area());
        }
    }
}
