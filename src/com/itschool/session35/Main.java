package com.itschool.session35;

import java.io.File;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        //checkedExceptionWithTryCatch();
        //checkedExceptionWithDeclaration();
        //catchMultipleExceptionsInSameBlock();
        //catchMultipleExceptionsInDifferentBlocks();
        //finallyBlock();
        tryWithResources();
    }

    private static void tryWithResources() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Please insert a number:");
            int number = scanner.nextInt();
            System.out.println("The number is: " + number);
            String name = null;
            String upper = name.toUpperCase();
            System.out.println(upper);
        }
    }

    private static void finallyBlock() {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Please insert a number:");
            int number = scanner.nextInt();
            System.out.println("The number is: " + number);
            String name = null;
            String upper = name.toUpperCase();
            System.out.println(upper);
        } catch (InputMismatchException e) {
            System.out.println("Some error happened");
        } finally {
            System.out.println("finally we close the scanner");
            scanner.close();
            //scanner.nextInt();
        }

        System.out.println("============at the end of the program");
    }

    private static void catchMultipleExceptionsInDifferentBlocks() {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please insert a number:");
            int number = scanner.nextInt();
            System.out.println("The number is: " + number);
            /*String name = null;
            String upper = name.toUpperCase();
            System.out.println(upper);*/
            int[] array = {1, 2};
            int element = array[10];
            System.out.println(element);
        } catch (InputMismatchException e) {
            System.out.println("InputMismatchException caught");
        } catch (NullPointerException e) {
            System.out.println("NullPointerException caught");
        } catch (Exception e) {
            System.out.println("Some other exception happened");
        }
    }

    private static void catchMultipleExceptionsInSameBlock() {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please insert a number:");
            int number = scanner.nextInt();
            System.out.println("The number is: " + number);
            String name = null;
            String upper = name.toUpperCase();
            System.out.println(upper);
        } catch (InputMismatchException | NullPointerException e) {
            System.out.println("Some error happened");
        }
    }

    private static void checkedExceptionWithDeclaration() throws IOException {
        File myFile = new File("/ionutz.txt");
        boolean isFileCreated = myFile.createNewFile();
        System.out.println("File created? " + isFileCreated);
    }

    private static void checkedExceptionWithTryCatch() {
        File myFile = new File("/ionutz.txt");
        try {
            boolean isFileCreated = myFile.createNewFile();
            System.out.println("File created? " + isFileCreated);
        } catch (IOException e) {
            System.out.println("The file couldn't be created");
            //e.printStackTrace();
        }
    }
}
