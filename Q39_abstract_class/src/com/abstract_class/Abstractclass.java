package com.abstract_class;
 /*Q39. What is an abstract class? 
   An abstract class in Java is a class that cannot be instantiated and is meant to be extended by subclasses. 
 ● Declared using the abstract keyword.
 ● Can have both abstract (without implementation) and concrete methods.
 ● Used for partial implementation and code reusability.
 ● Must be extended by a subclass that provides implementations for abstract methods. */

public abstract class Abstractclass {
	    // Abstract method (does not have a body) 
	    // without implementation
    public abstract void abstractMethod();

    // Regular method
    public void regularMethod() {
        System.out.println("This is a regular method.");
    }

}
