package com.one;

/* Q27. What are the phases in the lifecycle of a thread in Java? 
A Java thread goes through the following states: 
 1. New: The thread is created but has not started executing.
 2. Runnable: The thread is ready to run and waiting for CPU allocation.
 3. Blocked: The thread is waiting for a resource or lock to be available.
 4. Waiting: The thread is indefinitely waiting for another thread to notify it.
 5. Timed Waiting: The thread waits for a specified time (e.g., using Thread.sleep()).
 6. Terminated: The thread has completed execution or stopped due to an error. */

public class ThreadLifecycleDemo  extends Thread {
	    public void run() {
	   // This is the code that will run when the thread starts
        System.out.println("Thread is running.");
        try {
            Thread.sleep(2000); // Simulates work
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted.");
        }
        System.out.println("Thread has finished execution.");
    }

    public static void main(String[] args) throws InterruptedException {
        ThreadLifecycleDemo thread = new ThreadLifecycleDemo();
        
        System.out.println("Thread is in NEW state.");
        thread.start(); // Moves to RUNNABLE state
        System.out.println("Thread is in RUNNABLE state.");
        
        Thread.sleep(1000); // Simulates work
        
        synchronized (thread) {
            System.out.println("Thread is in BLOCKED state.");
            thread.wait(); // Moves to WAITING state
        }
        
        System.out.println("Thread has TERMINATED.");
        // The thread will terminate after finishing its execution
        }
	}

	