package com.itschool.session8;

public class Main {

    public static void main(String[] args) {
        //stringImmutability();
        stringBuilderDemo();
    }

    static void stringBuilderDemo() {
        StringBuilder sb = new StringBuilder("ionutz");
        String name = sb.toString();
        System.out.println(name);

        sb.append("gabriel");
        sb.append(123).append(13.7d).append(132447636437L).append('C');
        sb.insert(5, "baur");
        sb.delete(5, 9);
        String myString = sb.toString();

        String reversed = sb.reverse().toString();
        System.out.println(myString);
        System.out.println(reversed);
    }

    static void stringImmutability() {
        String firstName = "ionutz";
        firstName = "gabriel";
        String upperFirstName = firstName.toUpperCase();

        System.out.println(upperFirstName);
        System.out.println(firstName);
    }
}
