package com.ArrayList_and_Vector;

import java.util.Vector;

/* Q38. What is the difference between ArrayList and Vector? 
● ArrayList is not synchronized (faster), while Vector is synchronized (thread-safe).
● ArrayList increases its size by 50% when full, while Vector doubles its size */

public class Vector_Class {

	 public static void main(String[] args) {
	        Vector<Integer> vector = new Vector<>();
            // Initial capacity and increment
	        // Creating multiple threads modifying the same Vector
	        // The default capacity is 10, and the increment is 10
	        Runnable task = () -> {
	            for (int i = 0; i < 5; i++) {
	                vector.add(i);
	                System.out.println(Thread.currentThread().getName() + " added: " + i);
	            }
	        };

	        Thread t1 = new Thread(task);
	        Thread t2 = new Thread(task);

	        t1.start();
	        t2.start();

	        try {
	            t1.join();
	            t2.join();
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }

	        System.out.println("Final Vector: " + vector);
	    }
}
