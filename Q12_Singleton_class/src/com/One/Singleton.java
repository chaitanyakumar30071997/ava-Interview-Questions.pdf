package com.One;

/*Q12. What do you mean by singleton class?
A singleton class ensures that only one instance of the class exists throughout 
the application's lifecycle. It is implemented using a private constructor, a 
static instance variable, and a public static method that returns the single 
instance. The most common way to create a singleton class is using the lazy 
initialization or eager initialization approach */

class Singleton {
    // Eager initialization: Instance is created at class loading
	
    private static final Singleton instance = new Singleton();

    // Private constructor prevents instantiation
    private Singleton() { 
        System.out.println("Singleton Instance Created!");
    }
    
    // Returns the single instance
    public static Singleton getInstance() { 
        return instance;
    }

}


