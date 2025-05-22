package com.Method_Overriding;

/*Q35. What is polymorphism in Java? 
	    Polymorphism allows the same method to behave differently based on the context. 
	   ● Compile-time polymorphism (Method Overloading): Methods with the same name but different parameters.
	   ● Runtime polymorphism (Method Overriding): A subclass provides a specific implementation of a parent method */

public class Dog extends Method_Overriding_Class {

    // Overriding the makeSound method from Method_Overriding_Class
    void makeSound() {
        System.out.println("Dog barks");
    }
    
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.makeSound(); // Output: Dog barks
    }
}
