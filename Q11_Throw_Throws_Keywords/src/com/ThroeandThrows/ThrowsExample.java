package com.ThroeandThrows;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


// Declares that a method may throw an exception
// public void  myMethod() throws IOException 
// Can declare multiple exceptions using commas 

public class ThrowsExample {
    public static void readFile() throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("test.txt"));
        System.out.println(br.readLine());
        br.close();
    }

    public static void main(String[] args) {
        try {
            readFile(); // Calls method that may throw an exception
        } catch (IOException e) {
            System.out.println("File not found!");
        }
    }
   
} 
