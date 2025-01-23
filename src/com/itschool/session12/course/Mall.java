package com.itschool.session12.course;

public class Mall {

    void walk() {
        System.out.println("I am walking through shopping Mall");
        //throw new RuntimeException();
    }

    int boughtItems() {
        int clothes = 2;
        int shoes = 1;

        System.out.println("I bought some items.");

        int total = clothes + shoes;
        if (total < 0) {
            throw new RuntimeException("Total is negative");
        }

        return total;
    }

    String myFavouriteItem() {
        return "clothes";
    }
}
