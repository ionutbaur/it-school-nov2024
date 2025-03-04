package com.itschool.session22;

import java.util.List;
import java.util.function.*;

public class MainForPredefinedFunctions {

    public static void main(String[] args) {
        //predicateDemo();
        //consumerDemo();
        //supplierDemo();
        functionDemo();
    }

    private static void functionDemo() {
        Function<String, Integer> function = word -> functionResult(word);
        Integer lentgh = function.apply("ionutz");
        System.out.println(lentgh);

        BiFunction<String, Long, Integer> biFunction = (name, cnp) -> (int) (cnp / name.length());
        Integer result = biFunction.apply("ionutz", 18L);
        System.out.println(result);
    }

    private static Integer functionResult(String word) {
        return word.length();
    }

    private static void supplierDemo() {
        Supplier<String> supplier = () -> "ionutz" + "baur";
        String result = supplier.get();
        System.out.println(result);

        Supplier<Integer> integerSupplier = () -> 10;
        int result2 = integerSupplier.get();
        System.out.println(result2);
    }

    private static void consumerDemo() {
        Consumer<String> consumer = string -> System.out.println(string);
        consumer.accept("ionutz");
        consumer.accept("baur");

        Consumer<Integer> integerConsumer = num -> System.out.println(num * num);
        integerConsumer.accept(7);

        List<String> list = List.of("ionutz", "gabriel", "baur");
        list.forEach(string -> System.out.println(string));
    }

    private static void predicateDemo() {
        Predicate<String> predicate = inputStr -> inputStr.length() == 3;

        boolean result = predicate.test("ionutz");
        System.out.println(result);

        boolean result2 = predicate.test("abc");
        System.out.println(result2);

        Predicate<Integer> integerPredicate = num -> num < 10;
        boolean result3 = integerPredicate.test(12);
        System.out.println(result3);
    }
}
