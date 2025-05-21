package com.Try_block_catch_Block;

/* Q13. Does every try block need a catch block?
 * No, a try block does not necessarily need a catch block. It can be followed by 
either a catch block, a final block, or both. A catch block handles exceptions 
that may arise in the try block, while a final block ensures that certain code */

// Only one try block is not executed without a catch block Or finally block.
// only one finally block is used to handle the exception if it occurs.


public class Try_Block {
	public static void main(String[] args) {
		
	try {
	    int result = 10 / 0; // This causes an ArithmeticException
	} finally {
	    System.out.println("This will always execute.");  // This block will always execute
	}
// ----------------------------------------- One Method of handling exceptions ------------------------	
	
	try {
        int[] numbers = {1, 2, 3};
        System.out.println(numbers[5]); // Trying to access an index out of bounds
    } catch (ArrayIndexOutOfBoundsException e) {
        System.out.println("Oops! Index is out of bounds."); // This will catch the exception
     }
	
// ------------------------------------------ Another Method of handling exceptions --------------------------------
	try {
		int num = 10 / 0;    // This will cause an ArithmeticException
	}catch (ArithmeticException e) {
        System.out.println("ArithmeticException: " + e.getMessage());// This will catch the exception
    } catch (Exception e) {
        System.out.println("Exception: " + e.getMessage()); // This will catch any other exception
    } finally {
        System.out.println("This block always executes."); // This block will always execute
      }
// --------------------------------------------------- Finally Block --------------------------	
	}
}
