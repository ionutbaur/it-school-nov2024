package com.itschool.session12.course;

import com.itschool.session12.homework.ex1.Professor;

public class MainForMall {

    public static void main(String[] args) {
        Mall mall = new Mall();
        mall.walk();
        int items = mall.boughtItems();
        System.out.println(items);

        String favorite = mall.myFavouriteItem();
        System.out.println(favorite);
        System.out.println(mall.myFavouriteItem());

        mall.methodWithParams("ionutz", 33, new Professor());
        mall.methodWithParams("gabriel", 20, new Professor());

        String param = "baur";
        int myAge = 34;
        Professor professor = new Professor();
        mall.methodWithParams(param, myAge, professor);
    }
}
