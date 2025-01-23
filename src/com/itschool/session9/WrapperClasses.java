package com.itschool.session9;

public class WrapperClasses {

    public static void main(String[] args) {
        int number = 10;
        Integer objectNumber = new Integer(10);
        Integer objectNumber2 = 10;

        String str = "7";
        Integer num = Integer.valueOf(str);
        int num2 = num;
        System.out.println(num.equals(num2));
    }
}
