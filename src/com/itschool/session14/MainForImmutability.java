package com.itschool.session14;

public class MainForImmutability {

    public static void main(String[] args) {
        //ImmutableClass immutableClass = new HackingClass("string val", 7);

        ImmutableClass immutableClass = new ImmutableClass("string val", 7);
        System.out.println(immutableClass.getSomeInt());
        System.out.println(immutableClass.getSomeString());

        /*immutableClass.setSomeInt(10);
        immutableClass.setSomeString("ionutz");*/
        System.out.println("==========");

        System.out.println(immutableClass.getSomeInt());
        System.out.println(immutableClass.getSomeString());
        System.out.println("=============");

        ImmutableClass2 immutableClass2 = new ImmutableClass2("ionutz", -8);
        System.out.println(immutableClass2.someString());
        System.out.println(immutableClass2.someInt());

    }
}
