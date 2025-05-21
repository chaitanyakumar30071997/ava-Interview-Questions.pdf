package com.superKeyword;

public class Child extends Parent {
	
    // Constructor
    Child() {
        // Calls Parent constructor
    	// In child class constructor calling parent class constructor
        super();
        System.out.println("Child constructor called.");
    }
    
    public static void main(String[] args) {
        // Create an object of Child class
        Child child = new Child();
        
        // Calls Parent display method
        child.display();
        
        // Calls Parent variable
        System.out.println("Value of x: " + child.x);
    }
     
    
     
    
     
}
