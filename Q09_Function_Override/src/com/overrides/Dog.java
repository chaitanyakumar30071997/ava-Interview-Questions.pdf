package com.overrides;

/*Overriding allows a subclass to provide a specific implementation of a 
method defined in its superclass. It enables dynamic method dispatch 
(runtime polymorphism). */

public class Dog extends Animal {
	
	@Override
    void makeSound() {
        System.out.println("Dog barks");
    }
    
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.makeSound(); // Output: Dog barks
    }
	
}
