package com.superKeyword;

public class Parent {
	
	// Constructor
	 Parent() {
	        System.out.println("Parent constructor called.");
	    }
	 
	 // Method to be overridden child class
	 public void display() {
            System.out.println("Parent display method.");
        }
	 
	 // variable to be overridden child class
	 public int x = 10;
}
