package com.one;
import java.util.ArrayList;

/*Wrapper classes provide an object representation of primitive data types, 
such as Integers, Doubles, and Booleans. These classes allow primitives to be 
used in collections and provide useful utility methods. 

Primitive Type	Wrapper Class
byte	Byte
short	Short
int	    Integer
long	Long
float	Float
double	Double
char	Character
boolean	Boolean */

public class wrapperClass {
	public static void main(String[] args) {
		int i = 20;
		Integer n = 30; // Wrapper class object
		
		Integer objNum = Integer.valueOf(10); // Wrapper object
		
		wrapperClass wc = new wrapperClass(); // create object to class 
		
		Integer i2 = Integer.valueOf(i);  // boxing 
		
		Integer i3 = Integer.valueOf(i); // Auto-Boxing 
		
		
		
		int num = n ; // Auto-unboxing, no need for .intValue()
		
		int nu = objNum.intValue(); // Explicitly converting to primitive
		System.out.println("Unboxed value: " + num);

		
		
		
	}
	
	
         
	}



