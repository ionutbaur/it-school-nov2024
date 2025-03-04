package com.itschool.session22;

public class SimpleOperationImpl implements SimpleOperation {

    @Override
    public int sumOfStringsLength(String a, String b) {
        return a.length() + b.length();
    }

}
