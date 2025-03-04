package com.itschool.session20;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Person p1 = new Person("ionutz", 33);
        Person p2 = new Person("gabriel", 50);
        Person p3 = new Person("ionutz", 33);

        System.out.println(p1.equals(p3));
        System.out.println(p1.equals(p2));

        System.out.println(p1.hashCode());
        System.out.println(p3.hashCode());

        Set<Person> people = new TreeSet<>(
                (pers1, pers2) -> pers2.getName().compareTo(pers1.getName()));
        people.add(p1);
        people.add(p2);
        people.add(p3);

        System.out.println(people);
        System.out.println("========");

        String a = "ionutz";
        String b = new String("bionutz");
        System.out.println(a.equals(b));
        System.out.println(a.hashCode());
        System.out.println(b.hashCode());

        System.out.println(b.compareTo(a));
    }
}
