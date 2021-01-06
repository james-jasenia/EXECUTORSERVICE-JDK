package com.company;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) {

        //Instantiate via Facto        //Instantiate via Factory Methodry Method
        ExecutorService executorService = Executors.newFixedThreadPool(10);

        //Assign Runnable and/or Callable tasks
        Runnable runnableTask = () -> {
            try {
                TimeUnit.MILLISECONDS.sleep(60);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };

        //Execute
        executorService.execute(runnableTask);

        //Shutdown
        //.shutdown() will finish any tasks that are still running
        executorService.shutdown();

        //.shutdownNow() will shut down the service immediately and return a list of tasks are still waiting to get processed.
        executorService.shutdownNow();
    }
}
