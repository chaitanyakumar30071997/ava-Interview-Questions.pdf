package com.abstraction;

public interface Abstraction_Interface {
	    // Interface members are public and abstract by default
        // private and static are not allowed in interfaces
	   // default methods are allowed in interfaces
	   // static methods are allowed in interfaces
	   // default and static methods are not abstract 
	   // default and static methods are not inherited by implementing classes
       // and cannot be overridden in implementing classes
       // private methods are allowed in interfaces (Java 9 and later)
       // private methods are not accessible outside the interface
       // private methods can be used to share code between default methods
       // private static methods are allowed in interfaces (Java 9 and later)
       // private static methods are not accessible outside the interface
       // private static methods can be used to share code between static methods

    private void privateMethod() {
        System.out.println("This is a private method in an interface.");
    }
    
    private static void privateStaticMethod() {
        System.out.println("This is a private static method in an interface.");
    }
    
    static void staticMethod() {
        System.out.println("This is a static method in an interface.");
    }
    
    default void defaultMethod() {
        System.out.println("This is a default method in an interface.");
    }
    
    // Abstract method
    void abstractMethod();
    
    // Abstract method with parameters
    void abstractMethodWithParameters(int a, int b);
    
    // Abstract method with return type
    int  abstractMethodWithReturnType(int a, int b);
     
   
}
