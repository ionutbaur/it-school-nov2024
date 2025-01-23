package com.itschool.session12.course;

public class MainForMall {

    public static void main(String[] args) {
        Mall mall = new Mall();
        mall.walk();
        int items = mall.boughtItems();
        System.out.println(items);

        String favorite = mall.myFavouriteItem();
        System.out.println(favorite);
        System.out.println(mall.myFavouriteItem());
    }
}
