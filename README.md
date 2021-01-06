# Executor Service Framework - Java Development Kit

## Purpose:
The purpose of this codebase is to explore the ExecutorService interface and how tasks can be delegated to service for async exectution. 

## Overview
The ExecutorService is an interface provided by the JDK which simplifies the execution of tasks asynchronously. It creates a pool of threads and provides an API for task assignement.

## Setup:

#### Instantion:
You can use a factory method for the Exectuors class to create a service.  You can create a service directly through an of the instances that implement the ExecutorService interface, however, for simplicity sake, I am going to stick to the factory method as a default.

```
ExecutorService executorService = Executors.newFixedThreadPool(10);
```

#### Task Assignment:
ExecutorService can exectue Runnable and Callable tasks.
```
executorService.execute(new Runnable() {
     @Override
     public void run() {
          System.out.println("Async tasks performed on background thread");
     }
});
```

#### Shutdown:
You can choose to shutdown the executorService immediately but calling .showdownNow(). Any remaining tasks that are incomplete will be returned to you in a list. Alternatively, you can invoke .shutdown() which will shutdown the service after all of the remaining tasks are complete.
```
executorService.shutdown();
executorService.shutdownNow();
```

