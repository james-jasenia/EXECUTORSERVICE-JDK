package com.company;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) {

        //Instantiate via Factory Method
        ExecutorService executorService = Executors.newFixedThreadPool(10);

        //Execute a runnable task
        executorService.execute(new Runnable() {
            @Override
            public void run() {
                System.out.println("Async tasks performed on background thread");
            }
        });

        //Shutdown service
        executorService.shutdown();
    }
}
