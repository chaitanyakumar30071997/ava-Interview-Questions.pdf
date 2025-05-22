package com.MethodOverloading;

/* Q35. What is polymorphism in Java? 
    Polymorphism allows the same method to behave differently based on the context. 
   ● Compile-time polymorphism (Method Overloading): Methods with the same name but different parameters.
   ● Runtime polymorphism (Method Overriding): A subclass provides a specific implementation of a parent method */

// Example of Method Overloading in Java

public class Method_Overloading_Class {
	 // Overloaded method for addition
    int add(int a, int b) {
        return a + b;
    }

    // Overloaded method with three parameters
    int add(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
    	Method_Overloading_Class math = new Method_Overloading_Class();
        System.out.println("Sum of two numbers: " + math.add(5, 10));
        System.out.println("Sum of three numbers: " + math.add(5, 10, 15));
    }

}
