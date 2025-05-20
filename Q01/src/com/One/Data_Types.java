package com.One;

public class Data_Types {
    public static void main(String[] args) {
        // Primitive Data Types
        int a = 10; // Integer
        float b = 20.5f; // Float
        double c = 30.5; // Double
        char d = 'A'; // Character
        boolean e = true; // Boolean
        long f = 100000L; // Long
        byte g = 127; // Byte
        short h = 1000; // Short
        // Non-Primitive Data Types
        String str = "Hello, World!"; // String
        int[] arr = {1, 2, 3, 4, 5}; // Array

        System.out.println("Integer: " + a);
        System.out.println("Float: " + b);
        System.out.println("Double: " + c);
        System.out.println("Character: " + d);
        System.out.println("Boolean: " + e);
        System.out.println("String: " + str);
        System.out.print("Array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}