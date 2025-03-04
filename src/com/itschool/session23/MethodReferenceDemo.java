package com.itschool.session23;

import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class MethodReferenceDemo {

    public static void main(String[] args) {
        //forEachDemo();
        methodRef();
    }

    private static void methodRef() {
        MethodReferenceDemo methodReferenceDemo = new MethodReferenceDemo();
        Function<String, Integer> function = String::length;
        Function<String, Integer> function2 = methodReferenceDemo::wordLength;

        System.out.println(function.apply("ionutz"));
        System.out.println(function2.apply("ionutz"));
    }

    private static void forEachDemo() {
        List<Integer> list = List.of(1, 2, 3);
        //list.forEach(integer -> System.out.println(integer));

        list.forEach(System.out::println);
    }

    private int wordLength(String word) {
        return word.length();
    }
}
