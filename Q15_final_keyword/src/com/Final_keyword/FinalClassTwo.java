package com.Final_keyword;


/* Q15. What do you mean by the final keyword? 
 * The final keyword is used to restrict modifications in Java. It can be applied 
   in three contexts: 
 1. Final variable: Its value cannot be changed once assigned.
 2. Final method: Prevents method overriding in subclasses.
 3. Final class: Prevents inheritance by other classes
 *  */

public class FinalClassTwo {
	
	// final variable
    int var = 10;
    
    // final method
    void display() {
        System.out.println("This is a final class");
    }
    
    // final constructor
   
      FinalClassTwo() {
        System.out.println("Constructor of final class");
    }

}
