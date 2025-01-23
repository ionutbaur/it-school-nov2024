package com.itschool.session4.course;

import java.util.Scanner;

public class Main {

    static int number = -10;

    public static void main(String[] args) {
        //basicOperators();
        logicalOperators();
        //compoundOperator();
        //incrementExample();
        //decrementExample();
        //numericPromotion();
    }

    static void numericPromotion() {
        Scanner scanner = new Scanner(System.in);
        long number1 = scanner.nextLong();

        int x = 100;
        long y = 12345;

        long z = x + y;
        System.out.println(z);
    }

    static void decrementExample() {
        int random = 5;
        System.out.println(random); // 5
        //System.out.println(--random); // 4
        //System.out.println(random); // 4
        System.out.println(random--); // 5
        System.out.println(random); // 4
    }

    static void incrementExample() {
        int random = 5;
        System.out.println(random);
        //System.out.println(++random); // 6
        //System.out.println(random); // 6
        System.out.println(random++); // 5
        //System.out.println(random); // 6
    }

    static void compoundOperator() {
        String firstName = "Maria";
        String lastName = "Ionescu";
        System.out.println("Classic concatenation: " + firstName + lastName);

        /*firstName = firstName + lastName;
        System.out.println("Reassigned firstName in classic way: " + firstName);*/

        firstName += lastName;
        System.out.println("Reassigned with compound op: " + firstName);
    }

    static void logicalOperators() {
        // number in range 1 to 99  // false                    true
        boolean isNumberHigherThanZero = isNumberHigherThanZero();
        boolean isNumberLowerThan100 = isNumberLowerThan100();
        boolean isNumberInRange = isNumberHigherThanZero && isNumberLowerThan100;
        System.out.println("Is number in range: " + isNumberInRange);

        /*boolean isNumberPositive = isNumberHigherThanZero() || isNumberNotZero();
        System.out.println("Is number positive: " + isNumberPositive);*/
    }

    static boolean isNumberHigherThanZero() {
        System.out.println("Checking if number is > 0");
        boolean var = number > 0;
        System.out.println("The result is: " + var);
        return var;
    }

    static boolean isNumberLowerThan100() {
        System.out.println("Checking if number is < 100");
        return number < 100;
    }

    static boolean isNumberNotZero() {
        return number != 0;
    }

    static void basicOperators() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please insert number:");
        int number = scanner.nextInt();

        System.out.println("Please insert cifra:");
        int cifra = scanner.nextInt();

        boolean isNumberHigher = number > cifra;
        System.out.println("Is number higher than cifra? " + isNumberHigher);

        boolean areNumbersEqual = number == cifra;
        System.out.println("Are numbers equal? " + areNumbersEqual);

        boolean areNumbersDifferent = number != cifra;
        System.out.println("Are numbers different? " + areNumbersDifferent);

        System.out.println("Negated areNumbersEqual is: " + !areNumbersEqual);
    }
}
