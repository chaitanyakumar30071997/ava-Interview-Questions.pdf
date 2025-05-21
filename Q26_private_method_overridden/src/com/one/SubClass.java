package com.one;
 
/* /*Q26. Can a private method be overridden in Java? 
No, private methods cannot be overridden because they are not accessible 
outside their class. If a subclass defines a method with the same name, it is 
treated as a separate method rather than an override */

public class SubClass extends SuperClass {
	
	public static void main(String[] args) {
		SuperClass superClass = new SuperClass();
		superClass.display(); // This will work fine
		
	//	superClass.method(); //*** This will not work because method() is private in SuperClass ***
		
		
	}

}
