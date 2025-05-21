package com.one;

/*Q26. Can a private method be overridden in Java? 
No, private methods cannot be overridden because they are not accessible 
outside their class. If a subclass defines a method with the same name, it is 
treated as a separate method rather than an override */

public class SuperClass {
	
	private void method() {
        System.out.println("SuperClass method");
    }
	
	public void display() {
        System.out.println("SuperClass display");
    }

}
