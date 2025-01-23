package com.itschool.session6;

public class MemoryRef {

    static Animal dog;
    static int number;

    public static void main(String[] args) {
        //memoryRef();
        //equalityDemo();
        equalsDemo();
    }

    static void equalsDemo() {
        String text1 = "ionutz";
        String text2 = "ionutZ";
        System.out.println("is text1 == text2? " + (text1 == text2));
        System.out.println("is text1.equals(text2): " + text1.equalsIgnoreCase(text2));

        String text3 = new String("ionutz");
        System.out.println("is text1 == text3? " + (text1 == text3));
        System.out.println("is text1.equals(text3): " + text1.equals(text3));

        String text4 = new String("ionutz");
        System.out.println("is text3 == text4? " + (text3 == text4));
        System.out.println("is text3.equals(text4): " + text3.equals(text4));
    }

    static void equalityDemo() {
        int a = 10;
        int b = 10;
        System.out.println("Are primitives equal? " + (a == b));

        Animal animal1 = new Animal();
        System.out.println("Animal1: " + animal1);

        Animal animal2 = new Animal();
        System.out.println("Animal2: " + animal2);

        Animal animal3 = animal1;
        System.out.println("is animal1 equal to animal3: " + (animal1 == animal3));

        System.out.println("Are animal objects equal? " + (animal1 == animal2));
        System.out.println(animal1 == animal1);
    }

    static void memoryRef() {
        Animal cat = new Animal();
        System.out.println(dog);
        System.out.println(number);

        dog.ionutz();
        dog.sum();

        cat.ionutz();
        cat.toString();
    }
}
