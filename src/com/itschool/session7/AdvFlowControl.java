package com.itschool.session7;

import java.util.Scanner;

public class AdvFlowControl {

    static int wrongNumber = 3;

    public static void main(String[] args) {
        //classicSwitch();
        //enhancedSwitch();
        //whileDemo();
        //doWhileDemo();
        //breakDemo();
        continueDemo();
    }

    static void continueDemo() {
        for (int i = 0; i < 5; i++) {
            System.out.println("for start: i is: " + i);
            if (i == wrongNumber) {
                System.out.println("Found my wrong number");
                continue;
            }
            System.out.println("for end: i is: " + i);
        }
    }

    static void breakDemo() {
        for (int i = 0; i < 5; i++) {
            System.out.println("for start: i is: " + i);
            if (i == wrongNumber) {
                System.out.println("Found my lucky number, I dont care about the rest.");
                break;
            }
            System.out.println("for end: i is: " + i);
        }
    }

    static void doWhileDemo() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Google search responded with a total of pages:");
        int totPages = scanner.nextInt();
        int currentPage = 1;
        boolean hasGoogleResults;

        do {
            System.out.println("Showing results for page " + currentPage);
            hasGoogleResults = ++currentPage <= totPages;
        } while (hasGoogleResults);
    }

    static void whileDemo() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insert number:");
        int number = scanner.nextInt();
        while (number < 10) {
            System.out.println("The number is : " + number);
            number++;
        }
    }

    static void enhancedSwitch() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insert your age:");
        int age = scanner.nextInt();
        switch (age) {
            case 10 -> {
                System.out.println("You entered age 10");
                System.out.println("Second line with age 10");
            }
            case 20, 30 -> System.out.println("You entered an age that I like");
            default -> System.out.println("You entered an age that I don't like");
        }
    }

    static void classicSwitch() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insert your age:");
        int age = scanner.nextInt();
        int position;
        switch (age) {
            case 10:
                System.out.println("You entered age 10");
                System.out.println("Second line with age 10");
                position = 1;
                break;
            case 20:
                System.out.println("You entered age 20");
                position = 2;
                break;
            case 30:
                System.out.println("You entered age 30");
                position = 3;
                break;
            default:
                System.out.println("You entered an age that I don't like");
                position = 4;
        }

        System.out.println(position);
    }
}
