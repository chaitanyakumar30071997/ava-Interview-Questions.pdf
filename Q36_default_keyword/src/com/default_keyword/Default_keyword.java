package com.default_keyword;

/* Q36. What is the purpose of the default keyword in interfaces? 
The default keyword allows methods in interfaces to have default 
implementations, enabling backward compatibility without forcing all 
implementing classes to override them. */

public interface Default_keyword {

	default void defaultMethod() {
        System.out.println("This is a default method in an interface.");
    }
	
	static void staticMethod() {
        System.out.println("This is a static method in an interface.");
    }
	
	void abstractMethod();
	
	default void defaultMethod2() {
        System.out.println("This is another default method in an interface.");
    }
}
