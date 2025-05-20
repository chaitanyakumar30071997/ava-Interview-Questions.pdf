package com.staticMethos;

/*Q10. Why is the main method static in Java? 
The main method is static so that it can be called without creating an 
instance of the class, allowing the program to start execution without object 
instantiation.*/

public class StaticMethod {

	    public static void main(String[] args) {
        System.out.println("Hello, World!");   // // Calling static method without an object
    }
    
    // Static method
    static void staticMethod() {
        System.out.println("This is a static method.");
    }
    
    // Non-static method
    void nonStaticMethod() {
        System.out.println("This is a non-static method.");
    }
    
    // Static block
    static {
        System.out.println("Static block executed.");
    }
    
    // Instance block
    {
        System.out.println("Instance block executed.");
    }
}
