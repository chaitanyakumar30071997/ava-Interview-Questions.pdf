package com.one;

/*Q6. What are local and global variables?
 
● Local variables are declared inside methods or blocks and are
 accessible only within their scope.
 
● Global variables (also called instance variables) are declared within a
 class but outside any method and have a wider scope. */

public class OneClass {

	// Global variable and instance variable class variable 
	// (class level variable)
	// accessible to all methods in the class
	   
    int globalVariable = 10;

    public void method() {
        // Local variable
        int localVariable = 5;
        System.out.println("Local Variable: " + localVariable);
        System.out.println("Global Variable: " + globalVariable);
    }

    public static void main(String[] args) {
        OneClass obj = new OneClass();
        obj.method();
    }
}
