package com.itschool.session12.course;

import com.itschool.session12.homework.ex1.Professor;

public class Mall {

    void walk() {
        System.out.println("I am walking through shopping Mall");
        //throw new RuntimeException();
    }

    protected int boughtItems() {
        int clothes = 2;
        int shoes = 1;

        System.out.println("I bought some items.");

        int total = clothes + shoes;
        if (total < 0) {
            throw new RuntimeException("Total is negative");
        }

        return total;
    }

    protected void methodWithParams(String param1, int age, Professor professor) {
        System.out.println("Param1 is: " + param1);
        System.out.println("Age is: " + age);
        System.out.println(professor);
        System.out.println(professor.firstName);
    }

    String myFavouriteItem() {
        return "clothes";
    }
}
