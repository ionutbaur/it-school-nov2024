package com.itschool.session19;

import java.util.*;

public class SetDemo {

    public static void main(String[] args) {
        Season season = Season.WINTER;
        System.out.println(season);
        //hashSetDemo();
        //linkedHashSetDemo();
        //treeSetDemo();
        enumSetDemo();
    }

    private static void enumSetDemo() {
        EnumSet<Season> seasonEnumSet = EnumSet.allOf(Season.class);
        System.out.println(seasonEnumSet);
    }

    private static void treeSetDemo() {
        Set<String> set = new TreeSet<>();
        set.add("ionutz");
        set.add("gabriel");
        set.add("nickname");
        set.add("gabriel");
        set.add("baur");

        System.out.println(set);
    }

    private static void linkedHashSetDemo() {
        Set<String> set = new LinkedHashSet<>();
        set.add("ionutz");
        set.add("gabriel");
        set.add("nickname");
        set.add("gabriel");
        set.add("baur");

        System.out.println(set);
    }

    private static void hashSetDemo() {
        Set<String> set = new HashSet<>();
        set.add("ionutz");
        set.add("gabriel");
        set.add("nickname");
        set.add("gabriel");
        set.add("baur");

        System.out.println(set);
    }
}
