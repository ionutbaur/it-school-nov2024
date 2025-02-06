package com.itschool.session15.course;

public class Main2 {

    public static void main(String[] args) {
        MyInterf1.someStaticMethod();

        CanBurrow canBurrow = new CanBurrowImpl();
        canBurrow.someMethod1();
        String string = canBurrow.someDefaultMethod();
        System.out.println(string);
    }
}
