package com.itschool.session38.thread.platform;

public class AvailableProcessors {

    public static void main(String[] args) {
        int maxPlatformThreadNumber = Runtime.getRuntime().availableProcessors();
        System.out.println(maxPlatformThreadNumber);
    }
}
