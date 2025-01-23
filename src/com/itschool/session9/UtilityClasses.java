package com.itschool.session9;

import java.text.DecimalFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Random;

public class UtilityClasses {

    public static void main(String[] args) {
        //localDateDemo();
        //localDateTimeDemo();
        //instantDemo();
        //randomDemo();
        //mathDemo();
    }

    static void mathDemo() {
        double number = Math.pow(3, 4);
        System.out.println(number);

        double doubleNum = Math.PI;
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        System.out.println(decimalFormat.format(doubleNum));
        System.out.println(Math.PI);
    }

    static void randomDemo() {
        Random random = new Random();
        double randomDouble = random.nextDouble();
        System.out.println(randomDouble);

        int randomInt = random.nextInt(-1, 2);
        System.out.println(randomInt);
    }

    static void instantDemo() {
        Instant instant = Instant.now();
        System.out.println(instant);
    }

    static void localDateTimeDemo() {
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);

        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd.MMM.yy HH:mm:ss");
        String formatted = df.format(localDateTime);
        System.out.println(formatted);
    }

    static void localDateDemo() {
        LocalDate localDate = LocalDate.now();
        System.out.println("Is leap year: " + localDate.isLeapYear());

        DayOfWeek day = localDate.getDayOfWeek();
        LocalDate twoYearsAgo = localDate.minusYears(2);
        System.out.println("Is leap year: " + twoYearsAgo.isLeapYear());

        LocalDate dateOfBirth = LocalDate.of(1991, Month.OCTOBER, 11);
        System.out.println("I was born in a: " + dateOfBirth.getDayOfWeek());

        System.out.println(localDate);
        System.out.println(day);
        System.out.println(twoYearsAgo);
    }
}
