package com.ThroeandThrows;

/* 
 *  Used to explicitly  throw an exception
 *  throw new Exception("Error")
 *  Can throw one exception at a time */

public class ThrowClass {

		    public static void checkAge(int age) {
		        if (age < 18) {
		            throw new ArithmeticException("Not eligible to vote"); // Explicitly throwing an exception
		        } else {
		            System.out.println("Eligible to vote");
		        }
		    }

		    public static void main(String[] args) {
		    	
		            try {
		              checkAge(16); // Throws an exception
		            } catch (ArithmeticException e) {
		                System.out.println("Exception caught: " + e.getMessage());
		             }
		    	                    
		    	  }
		    	
		    }
        // The above code will throw an exception and terminate the program
        // The catch block will handle the exception and print the message
           // Output: Exception caught: Not eligible to vote	
	    

