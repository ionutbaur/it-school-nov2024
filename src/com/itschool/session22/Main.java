package com.itschool.session22;

public class Main {

    public static void main(String[] args) {
        //traditional();
        //anonymous();
        lambda();
    }

    private static void lambda() {
        SimpleOperation simpleOperation = (a, b) -> a.length() + b.length();
        int result = simpleOperation.sumOfStringsLength("ionutz", "baur");
        System.out.println(result);

        int result2 = simpleOperation.sumOfStringsLength("gabriel", "ceva");
        System.out.println(result2);
    }

    private static void anonymous() {
        SimpleOperation simpleOperation = new SimpleOperation() {
            @Override
            public int sumOfStringsLength(String a, String b) {
                return a.length() + b.length();
            }
        };

        int result = simpleOperation.sumOfStringsLength("ionutz", "baur");
        System.out.println(result);
    }

    private static void traditional() {
        SimpleOperation simpleOperation = new SimpleOperationImpl();
        int result = simpleOperation.sumOfStringsLength("ionutz", "baur");
        System.out.println(result);
    }

    private class InnerClass {

        public static void main(String[] args) {

        }
    }
}
