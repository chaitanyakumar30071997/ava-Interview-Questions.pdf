package com.one;

/*Q19. Why is reflection used in Java? 
Reflection in Java allows a running program to inspect and manipulate its 
methods, fields, and constructors at runtime. It is commonly used in 
frameworks, debugging tools, and JavaBeans to dynamically access class 
properties. */

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectionDemo {

	    public static void main(String[] args) {
	        try {
	            // Get the Class object
	            Class<?> obj = Example.class;

	            // Get the declared fields
	            Field field = obj.getDeclaredField("message");
	            field.setAccessible(true); // Allow access to private field

	            // Create an instance of Example
	            Example exampleInstance = new Example();
	            System.out.println("Original Message: " + field.get(exampleInstance));

	            // Modify the private field value
	            field.set(exampleInstance, "Reflection Modified!");
	            System.out.println("Modified Message: " + field.get(exampleInstance));

	            // Get the method and invoke it
	            Method method = obj.getDeclaredMethod("display");
	            method.invoke(exampleInstance);

	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }
	}


