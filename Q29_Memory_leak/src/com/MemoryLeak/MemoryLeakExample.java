package com.MemoryLeak;

/* Q29. What is a memory leak in Java? 
A memory leak occurs when objects that are no longer needed are not 
garbage collected because they are still referenced somewhere. This can 
cause excessive memory consumption and slow down the application. */

import java.util.ArrayList;
import java.util.List;

public class MemoryLeakExample {
    public static void main(String[] args) {
        // Example of a memory leak
        List<Object> list = new ArrayList<>();
        while (true) {
            list.add(new Object()); // Continuously adding objects to the list
            // This will eventually cause a memory leak as the list grows indefinitely
        }
    }
}
