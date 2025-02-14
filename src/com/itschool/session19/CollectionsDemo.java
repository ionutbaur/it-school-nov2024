package com.itschool.session19;

import java.util.*;

public class CollectionsDemo {

    public static void main(String[] args) {
        //listDemo();
        setDemo();
        //mapDemo();
        //iterableUsage();
    }

    private static void iterableUsage() {
        List<Integer> myList = getList();
        int listSize = myList.size();
        System.out.println(listSize);
        System.out.println(myList);

        Iterator<Integer> integerIterator = myList.iterator();
        while (integerIterator.hasNext()) {
            if(integerIterator.next() == 3) {
                integerIterator.remove();
            }
        }
        System.out.println(myList);

        // error
        for (int i = 0; i < listSize; i++) {
            if (myList.get(i).equals(3)) {
                myList.remove(myList.get(i));
            }
        }

        // error
        for (Integer element : myList) {
            if (element.equals(3)) {
                myList.remove(element);
            }
        }
    }

    private static List<Integer> getList() {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        return list;
    }

    private static void mapDemo() {
        Map<Long, String> cnpMap = new HashMap<>();
        cnpMap.put(12345678910L, "ionutz");
        cnpMap.put(987654321L, "alex");
        cnpMap.put(3762764764764L, "Renata");

        System.out.println(cnpMap);
        String value = cnpMap.get(987654321L);
        System.out.println(value);
        System.out.println(cnpMap.get(12345678910L));
        System.out.println(cnpMap.get(8888L));
    }

    private static void setDemo() {
        Set<String> set = new HashSet<>();
        set.add("ionutz");
        set.add("gabriel");
        set.add("nickname");
        set.add("gabriel");
        set.add("baur");

        System.out.println(set);
    }

    private static void listDemo() {
        List<String> list = new ArrayList<>();
        list.add("ionutz");
        list.add("gabriel");
        list.add("nickname");
        list.add("gabriel");
        list.add("baur");

        list.add(1, "it school");

        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
    }
}
