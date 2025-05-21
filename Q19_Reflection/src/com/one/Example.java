package com.one;


/*Q19. Why is reflection used in Java? 
Reflection in Java allows a running program to inspect and manipulate its 
methods, fields, and constructors at runtime. It is commonly used in 
frameworks, debugging tools, and JavaBeans to dynamically access class 
properties. */

public class Example  {
	private String message = "Hello, Reflection!";

    public void display() {
        System.out.println("Method invoked using reflection.");
    }

}
