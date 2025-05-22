package com.ArrayList_and_Vector;

import java.util.ArrayList;

/* Q38. What is the difference between ArrayList and Vector? 
 ● ArrayList is not synchronized (faster), while Vector is synchronized (thread-safe).
 ● ArrayList increases its size by 50% when full, while Vector doubles its size */

public class ArrayList_Class {

	public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        // Creating multiple threads modifying the same ArrayList
        Runnable task = () -> {
            for (int i = 0; i < 5; i++) {
                list.add(i);
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

        System.out.println("Final List: " + list);
    }
}
