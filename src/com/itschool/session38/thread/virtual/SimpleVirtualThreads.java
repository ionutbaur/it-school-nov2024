package com.itschool.session38.thread.virtual;

public class SimpleVirtualThreads {

    public static void main(String[] args) {
        System.out.println("Main thread " + Thread.currentThread());
        Thread.startVirtualThread(() ->
                System.out.println("Virtual thread on " + Thread.currentThread()));
        Thread.ofVirtual().start(() ->
                System.out.println("Hello from a virtual thread " + Thread.currentThread()));
    }
}
