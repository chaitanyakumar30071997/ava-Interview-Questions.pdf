package com;

/*Q8. What is function overloading? 
Function overloading allows multiple methods to have the same name but 
different parameter lists. The compiler differentiates them based on the 
number or type of parameters. */

public class Overloading {
	    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }

    public String add(String a, String b) {
        return a + b;
    }
    
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        Overloading obj = new Overloading();
        System.out.println("Sum of integers: " + obj.add(5, 10));
        System.out.println("Sum of doubles: " + obj.add(5.5, 10.5));
        System.out.println("Concatenation of strings: " + obj.add("Hello ", "World"));
        System.out.println("Sum of three integers: " + obj.add(5, 10, 15));
    }
	

}
