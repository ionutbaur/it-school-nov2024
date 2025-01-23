package com.itschool.session10;

import java.util.Arrays;

public class ArrayDemo {

    public static void main(String[] args) {
        //easyDemo();
        //arrayInit();
        //multiDimensionalArray();
        //arrayManipulation();
        int[] array = {1, 2, 3};
        methodWithParams();
    }

    static void methodWithParams(int... params) {
        System.out.println(Arrays.toString(params));
        for (int param : params) {
            System.out.println(param);
        }
        methodWith2Params(4, "ionutz", "baur");
    }

    static void methodWith2Params(int param1, String... param2) {

    }

    static void arrayManipulation() {
        int[] numbers = {0, -7, 12, 4, 0, 2};
        System.out.println(Arrays.toString(numbers));
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));

        int number4 = Arrays.binarySearch(numbers, 4);
        System.out.println(number4);
    }

    static void multiDimensionalArray() {
        // index        0, 1
        int[] array1 = {1, 2};
        int[] array2 = {9, 6, 4};
        int[] array3 = {0, -5, 19};

        // index             0   ,   1   ,   2
        int[][] numbers = {array1, array2, array3};
        int[][] matrix = {{1, 2}, {9, 6, 4}, {0, -5, 19}};
        int number4 = matrix[1][2];
        System.out.println(number4);

        main_for:
        for (int[] numbersArray : matrix) {
            for (int element : numbersArray) {
                if (element == 4) {
                    System.out.println("The element is: " + element);
                    break main_for;
                }
            }
        }
    }

    static void arrayInit() {
        int[] numbers = new int[3];
        numbers[0] = 4;
        System.out.println(Arrays.toString(numbers));

        String[] names = new String[3];
        names[2] = "ionutz";
        System.out.println(Arrays.toString(names));
    }

    static void easyDemo() {
        int num1 = 1;
        int num2 = 2;
        int num3 = 3;
        int[] numbers = {5, 7, 10, -4, 0, 7, 5}; //hardcoded
        numbers[2] = 9;
        numbers[0] = 11;
        int negativeNumber = numbers[3];
        //int randomNumber = numbers[1];
        //System.out.println(negativeNumber);
        //System.out.println(randomNumber);
        System.out.println(Arrays.toString(numbers));
        int length = numbers.length;
        //System.out.println(length);
        System.out.println("=========");
        /*for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }*/
        for (int element : numbers) {
            System.out.println(element);
        }

        String name1 = "ionutz";
        String name2 = "gabriel";
        String[] names = {"ionutz", "gabriel", "baur"};
        System.out.println(Arrays.toString(names));
    }
}
