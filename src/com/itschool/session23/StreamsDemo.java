package com.itschool.session23;

import com.itschool.session20.Person;

import java.util.*;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsDemo {

    public static void main(String[] args) {
        //traditional();
        //streamExample();
        //removeElementOnCondition();
        //sortedDemo();
        mapDemo();
        //flatMapDemo();
        //sumOfListElementsTraditional();
        //sumOfListElementsReduce();
    }

    private static void sumOfListElementsReduce() {
        List<Integer> list = List.of(1, 2, 3, 4, 5);
        int sum = list.stream()
                .reduce(0, (num, num2) -> num + num2);
        System.out.println(sum);
    }

    private static void sumOfListElementsTraditional() {
        List<Integer> list = List.of(1, 2, 3, 4, 5);
        int sum = 0;
        for (int element : list) {
            sum += element;
        }

        System.out.println(sum);
    }

    private static void flatMapDemo() {
        List<List<Integer>> matrix = List.of(
                List.of(1, 2),
                List.of(3, 4, 5),
                List.of(6, 7, 8, 9)
        );

        List<Integer> flattenNumbers = matrix.stream()
                .flatMap(list -> list.stream())
                .filter(integer -> integer % 2 == 0)
                .toList();

        System.out.println(flattenNumbers);
    }

    private static void mapDemo() {
        List<Person> persons = new ArrayList<>();
        Person p1 = new Person("ionutz", 33);
        Person p2 = new Person("gabriel", 100);
        Person p3 = new Person("kid", 5);
        persons.add(p1);
        persons.add(p2);
        persons.add(p3);

        int sum = persons.stream()
                .map(Person::getAge)
                .filter(age -> age > 18)
                .reduce(Integer::sum)
                .orElse(0);
        System.out.println(sum);

        List<Integer> ages = persons.stream()
                .map(person -> person.getAge())
                .toList();

        System.out.println(ages);
    }

    private static void sortedDemo() {
        String[] array = {"ionutz", "gabriel", "baur", "gabriel"};
        Set<String> set = Arrays.stream(array)
                .sorted(Comparator.comparing(string -> string.length()))
                .collect(Collectors.toCollection(LinkedHashSet::new));

        System.out.println(set);
    }

    private static void removeElementOnCondition() {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        numbers.removeIf(integer -> integer == 3);

        System.out.println(numbers);
    }

    private static void streamExample() {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);

        List<Integer> evenNumbers = numbers.stream()
                .filter(number -> number % 2 == 0)
                .toList();

        Stream<Integer> evenStreams = numbers.stream()
                .filter(number -> number % 2 == 0);

        List<Integer> evenList = evenStreams.toList();
        System.out.println(evenList);

        // won't work because stream is consumed
        /*List<Integer> evenList2 = evenStreams.toList();
        System.out.println(evenList2);*/

        Supplier<Stream<Integer>> streamSupplier = () -> numbers.stream()
                .filter(number -> number % 2 == 0);

        List<Integer> list = streamSupplier.get().toList();
        System.out.println(list);

        List<Integer> list2 = streamSupplier.get().toList();
        System.out.println(list2);

        System.out.println(evenNumbers);
    }

    private static void traditional() {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);
        List<Integer> evenNumbers = new ArrayList<>();
        for (Integer number : numbers) {
            if (number % 2 == 0) {
                evenNumbers.add(number);
            }
        }

        System.out.println(evenNumbers);
    }
}
