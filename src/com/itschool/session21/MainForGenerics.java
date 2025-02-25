package com.itschool.session21;

import com.itschool.session20.Person;

import java.util.ArrayList;
import java.util.List;

public class MainForGenerics {

    public static void main(String[] args) {
        //demo();
        /*String[] strings = {"ionutz", "gabriel", "baur"};
        printArray(strings);
        System.out.println("=======");
        Integer[] ints = {1, 2, 3};
        printArray(ints);*/

        //genericClass();
        List<String> strings = List.of("ionutz", "gabriel", "baur");
        printListSize(strings);
    }

    private static void printListSize(List<?> list) {
        System.out.println(list.get(0).getClass());
        System.out.println(list.size());
    }

    private static void genericClass() {
        GenericClass<String, Integer, Person> stringGenericClass = new GenericClass<>("ionutz",
                33, new Person("ceva", 100));
        String stringVal = stringGenericClass.getValue();
        Integer middle = stringGenericClass.getMiddleValue();
        Person right = stringGenericClass.getRightValue();
        System.out.println(stringVal);
        System.out.println(middle);
        System.out.println(right);
        System.out.println("========");

        GenericClass<Integer, Long, String> integerGenericClass = new GenericClass<>(12, 456L, "baur");
        int intVal = integerGenericClass.getValue();
        System.out.println(intVal);

        System.out.println("==========");
        GenericPerson<Person> personGeneric = new GenericPerson<>(new Person("ionutz", 33));
        GenericPerson<Child> childGeneric = new GenericPerson<>(new Child("baur", 34));
        // won't work because T must extend Person
        //GenericPerson<String> stringGeneric = new GenericPerson<String>("ionutz");
    }

    private static <E> void printArray(E[] array) {
        for (E element : array) {
            System.out.println(element);
        }
    }

    private static <E> void printList(List<E> list) {
        for (E element : list) {
            System.out.println(element);
        }
    }

    private static void demo() {
        List list1 = rawList();
        Integer a1 = (Integer) list1.get(1);
        System.out.println(a1);

        /*int b1 = (int) list1.get(0);
        System.out.println(b1);*/

        List<Integer> list = genericList();
        //String a = list.get(1); // won't work
        Integer a = list.get(1);
        int b = list.get(2);
        System.out.println(a);
        System.out.println(b);

        List<Person> personList = personList();
        Person firstPerson = personList.getFirst();
        Person lastPerson = personList.getLast();

        System.out.println(firstPerson);
        System.out.println(lastPerson);

        StringList stringList = new StringList();
        stringList.add("ionutz");
    }

    private static List<Person> personList() {
        List<Person> people = new ArrayList<>();
        people.add(new Person("ionutz", 33));
        people.add(new Person("baur", 34));

        return people;
    }

    private static List<Integer> genericList() {
        List<Integer> genericList = new ArrayList<>();
        //genericList.add("ionutz"); won't work
        genericList.add(10); // index 0
        //genericList.add(new Person("ionutz", 33)); won't work
        genericList.add(3); //index 1
        genericList.add(-16); // index 2

        return genericList;
    }



    private static List rawList() {
        List rawList = new ArrayList();
        rawList.add("ionutz");
        rawList.add(10);
        rawList.add(new Person("ionutz", 33));

        return rawList;
    }
}
