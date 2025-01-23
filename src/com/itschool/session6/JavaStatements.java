package com.itschool.session6;

import java.util.Scanner;

public class JavaStatements {

    public static void main(String[] args) {
        //ifDemo();
        //elseIfDemo();
        ternaryOperator();
    }

    static void ternaryOperator() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insert a number:");
        int number = scanner.nextInt();

        /*String text;
        if (number >=0) {
            text = "number is positive";
        } else {
            text = "number is negative";
        }*/
        // variable = condition       if yes                    if no
        String text = number >=0 ? "number is positive" : "number is negative";

        System.out.println("Text is: " + text);
    }

    static void elseIfDemo() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insert a number:");
        int number = scanner.nextInt();

        if (number == 1) {
            System.out.println("The number is 1 from else-if branch");
        } else if (number >= 2) {
            System.out.println("The number is >=2 from else-if branch");
        } else if (number == 3) {
            System.out.println("The number is 3 from else-if branch");
        } else {
            System.out.println("The number is lower than 1");
            System.out.println("Another line in else statement");
        }

        if (number == 1)
            System.out.println("The number is 1 from simple if");

        if (number >= 2) {
            System.out.println("The number is >=2 from simple if");
        }

        if (number == 3) {
            System.out.println("The number is 3 from simple if");
        }

        System.out.println("======end program");
    }

    static void ifDemo() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insert a number:");
        int number = scanner.nextInt();

        //boolean isHigherThanZero = (number > 0);
        if (number > 0) {
            System.out.println("Number is higher than 0");
        } else {
            System.out.println("Number is NOT higher than 0");
        }

        System.out.println("======end program");
    }
}
