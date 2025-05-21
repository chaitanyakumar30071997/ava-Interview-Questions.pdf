package Com.MethodAndConstructro;

/* Q18. What is the difference between a constructor and a method in Java? 
 * 1. It has no return type.
 * 2. It always has the same name as the class name.  */

public class OneClass {
    
	// constructor
    // Constructor is a special method that is called when an object of the class is created.
    // It has the same name as the class and does not have a return type.
    // Constructors are used to initialize the object.
    // If no constructor is defined, Java provides a default constructor.
    // Constructor can be overloaded.
    
    // Constructor 
	OneClass() {
        System.out.println("Constructor");
    }
	
	// Constructor with parameters
	 OneClass(int a) {
        System.out.println("Constructor with parameter: " + a);
    }
	
	 // Default constructor

	 OneClass(String name) {
        System.out.println("Constructor with parameter: " + name);
    }
	 
	// method
	// A method is a block of code that performs a specific task.
    // It has a return type and can have parameters.
    // Methods are used to define the behavior of an object.
    // Methods can be overloaded.
	    void method() {
        System.out.println("Method");
	    }
	    
	   public static void main(String[] args) {
		// Creating an object of the class
        OneClass obj1 = new OneClass(); // Calls the default constructor
        OneClass obj2 = new OneClass(10); // Calls the constructor with parameter
        OneClass obj3 = new OneClass("Java"); // Calls the constructor with parameter

        // Calling method
        obj1.method(); // Calls the method
	}
}
