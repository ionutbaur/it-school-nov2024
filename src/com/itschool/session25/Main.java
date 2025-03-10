package com.itschool.session25;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Map<Integer, String> studentsMap = new HashMap<>();
        studentsMap.put(27, "Constantin");
        studentsMap.put(9, "Emanuel");
        studentsMap.put(7, "Ghita");
        studentsMap.put(6, "Marian");
        studentsMap.put(30, "Narcis");
        studentsMap.put(13, "Renata");
        studentsMap.put(25, "Alex");
        studentsMap.put(11, "Ando");
        studentsMap.put(10, "Andi");
        studentsMap.put(29, "Cosmin");

        List<Map.Entry<Integer, String>> list = new ArrayList<>(studentsMap.entrySet());

        Collections.shuffle(list);

        for (int i = 0; i < list.size(); i++) {
            Map.Entry<Integer, String> entry = list.get(i);
            System.out.println((i+1) + ". -> " + entry.getKey() + " - " + entry.getValue());
        }
    }
}
