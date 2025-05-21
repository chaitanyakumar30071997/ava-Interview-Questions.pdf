package com.New_Keyworld;
/* Q30. What is the difference between new and newInstance() in 
Java? 
● New is a keyword that creates a new object of a known class at
 compile time.
 ● newInstance() (from Class) creates an object dynamically at runtime,
 requiring reflection, and is slower because it involves additional
 security and access checks */

public class Example {

	Example() {
        System.out.println("Constructor called using new keyword.");
    }
	    public void display(int a) {
        System.out.println("Constructor called with value: " + a);
    }
}
