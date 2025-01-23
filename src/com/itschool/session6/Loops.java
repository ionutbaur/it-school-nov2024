package com.itschool.session6;

public class Loops {

    public static void main(String[] args) {
        //classicForDemo();
        enhancedFor();
    }

    // or named for-each
    static void enhancedFor() {
        String text = "ionutz";
        char[] chars = text.toCharArray();
        char symbol = 'C';
        char[] variable = {'D','E','F'};
        for (char letter : chars) {
            System.out.println("The letter is: " + letter);
        }

        for (int i = 0; i < chars.length; i++) {
            System.out.println("The letter with classic for is: " + chars[i]);
        }

        int[] array = {1, 2, 3, 4, 5};
        String[] stringArray = {"ionutz", "gabriel", "baur"};
    }

    static void classicForDemo() {
        int k;
        for (k = 1; k <=5; k++) {
            System.out.println("Hello " + k);
        }
        System.out.println("end for with increment");

        for (int i = 10; i > 0 ; i--) {
            System.out.println("Decremented hello: " + i);
        }
        System.out.println("end for with decrement");
    }
}
