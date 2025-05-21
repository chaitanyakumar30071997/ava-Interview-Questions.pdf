package com.try_catch_finally;

/* Q16. How is an exception handled in Java? 
   Java handles exceptions using the try-catch-finally mechanism: 
1. Try block: Contains the code that might generate an exception.
2. Catch block: Handles the exception and defines what should be done
   when an error occurs.
3. Finally block: Executes regardless of whether an exception occurs or
   not, often used for resource cleanup (e.g., closing files or database
   connections).*/

public class Exception_Handled {
	    public static void main(String[] args) {
        try {
            int a = 10;
            int b = 0;
            int c = a / b; // This will cause an ArithmeticException
            System.out.println("Result: " + c);
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException caught: " + e.getMessage());
        } finally {
            System.out.println("This block always executes.");
        }
    }

}
