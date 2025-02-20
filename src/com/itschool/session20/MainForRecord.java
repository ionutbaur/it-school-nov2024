package com.itschool.session20;

import java.util.HashSet;
import java.util.Set;

public class MainForRecord {

    public static void main(String[] args) {
        PersonRecord p1 = new PersonRecord("ionutz", 33);
        PersonRecord p2 = new PersonRecord("gabriel", 50);
        PersonRecord p3 = new PersonRecord("ionutz", 33);

        System.out.println(p1.equals(p3));
        System.out.println(p1.equals(p2));

        System.out.println(p1.hashCode());
        System.out.println(p3.hashCode());

        Set<PersonRecord> people = new HashSet<>();
        people.add(p1);
        people.add(p2);
        people.add(p3);

        System.out.println(people);
    }
}
