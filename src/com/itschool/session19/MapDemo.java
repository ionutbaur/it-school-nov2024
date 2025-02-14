package com.itschool.session19;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapDemo {

    public static void main(String[] args) {
        //hashMapDemo();
        //linkedHashMapDemo();
        treeMapDemo();
    }

    private static void treeMapDemo() {
        Map<Long, String> cnpMap = new TreeMap<>();
        cnpMap.put(12345678910L, "ionutz");
        cnpMap.put(987654321L, "alex");
        cnpMap.put(3762764764764L, "Renata");

        for (Map.Entry<Long, String> entry : cnpMap.entrySet()) {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }

        //System.out.println(cnpMap);
    }

    private static void linkedHashMapDemo() {
        Map<Long, String> cnpMap = new LinkedHashMap<>();
        cnpMap.put(12345678910L, "ionutz");
        cnpMap.put(987654321L, "alex");
        cnpMap.put(3762764764764L, "Renata");

        System.out.println(cnpMap);
    }

    private static void hashMapDemo() {
        Map<Long, String> cnpMap = new HashMap<>();
        cnpMap.put(12345678910L, "ionutz");
        cnpMap.put(987654321L, "alex");
        cnpMap.put(3762764764764L, "Renata");

        System.out.println(cnpMap);
    }
}
