package com.itschool.session38.thread.platform;

public class MainPlatformThreads {

    public static void main(String[] args) {
        System.out.println("Starting program on main thread: " + Thread.currentThread());
        MyThread threadA = new MyThread("A");
        MyThread threadB = new MyThread("B");
        Thread threadC = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Thread C started for iteration: " + i +
                        " on thread " + Thread.currentThread());
                try {
                    Thread.sleep(1000L);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Thread C ended for iteration: " + i +
                        " on thread " + Thread.currentThread());
            }
        });

        threadA.start();
        threadB.start();
        threadC.start();

        System.out.println("End of program with main thread: " + Thread.currentThread());
    }
}
