package com.itschool.session38.thread.platform;

public class MyThread extends Thread {

    private final String threadName;

    public MyThread(String threadName) {
        this.threadName = threadName;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Thread " + threadName + " started for iteration: " + i +
                    " on thread " + Thread.currentThread());
            try {
                Thread.sleep(1000L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Thread " + threadName + " ended for iteration: " + i +
                    " on thread " + Thread.currentThread());
        }
    }
}
