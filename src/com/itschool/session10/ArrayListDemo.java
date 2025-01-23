package com.itschool.session10;

import java.util.ArrayList;

public class ArrayListDemo {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(16);
        list.add(6);
        list.remove(1);

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("ionutz");
        list2.add("baur");
        list2.add("gabriel");
        list2.remove("baur");

        System.out.println(list2);
        System.out.println(list2.size());
        System.out.println(list2.isEmpty());

        System.out.println(list);
    }
}
