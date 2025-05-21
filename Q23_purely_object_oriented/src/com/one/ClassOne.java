package com.one;
/*Q23. Is Java a purely object-oriented language? 
No, Java is not purely object-oriented because it supports primitive data 
types like int, char, boolean, and double, which are not objects. A purely 
object-oriented language would require every entity to be an object. */

public class ClassOne {

	 public static void main(String[] args) {
	        int num = 10; // Primitive type
	        Integer objNum = Integer.valueOf(num); // Wrapper class (Object)
	        
	        System.out.println("Primitive: " + num);
	        System.out.println("Wrapper Object: " + objNum);
	    }
}
