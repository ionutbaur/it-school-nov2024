package com.itschool.session19;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListsDemo {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        //List<Integer> list = new LinkedList<>();
        System.out.println("Started at "+ LocalDateTime.now());
        for (int i = 0; i < 1_000_000; i++) {
            list.add(0, i);
        }
        System.out.println("Ended at "+ LocalDateTime.now());
    }
}
