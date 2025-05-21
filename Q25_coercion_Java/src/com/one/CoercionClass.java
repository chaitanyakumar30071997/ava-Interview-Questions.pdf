package com.one;
/* Q25. What is coercion in Java? 
Coercion in Java refers to the automatic or explicit conversion of one data 
type into another. 
● Implicit coercion: Automatically converts smaller data types to larger
 ones (e.g., int to double).
 ● Explicit coercion (casting): Converts larger data types to smaller ones
 using type casting (e.g., (int) 3.14). */

public class CoercionClass {
	
	public static void main(String[] args) {
		
	
	int a = 5;
	double b = 2.5;
	double sum = a + b; // int is converted to double
	System.out.println("Sum: " + sum);
	
	double pi = 3.14;
	int intPi = (int) pi; // Explicit conversion from double to int
	System.out.println("Converted value: " + intPi);

	}

}
