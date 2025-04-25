package com.itschool.session38.thread;

import java.time.LocalDateTime;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorOp {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        System.out.println("Starting parallel operations on main thread " + Thread.currentThread()
        + " at " + LocalDateTime.now());

        try (ExecutorService executorService = Executors.newVirtualThreadPerTaskExecutor()) {
            Future<Integer> futureMult = executorService.submit(() -> {
                int result = 10 * 2;
                Thread.sleep(2000);
                System.out.println("Multiplication done: " + result + " on thread " + Thread.currentThread());
                return result;
            });

            Future<Integer> futureDiv = executorService.submit(() -> {
                int result = 20 / 5;
                Thread.sleep(5000);
                System.out.println("Division done: " + result + " on thread " + Thread.currentThread());
                return result;
            });

            System.out.println("Waiting for results on main thread " + Thread.currentThread());

            int multResult = futureMult.get();
            int divResult = futureDiv.get();

            int finalResult = multResult + divResult;
            System.out.println("The final result is: " + finalResult + " on thread " + Thread.currentThread() +
                    " on " + LocalDateTime.now());
        }
    }
}
