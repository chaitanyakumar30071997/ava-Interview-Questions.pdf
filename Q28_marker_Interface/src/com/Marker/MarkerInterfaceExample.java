package com.Marker;

public class MarkerInterfaceExample {
	public static void main(String[] args) {
		// Creating an object of MyClass
        MyClass obj = new MyClass();
        
        // Checking if obj is an instance of MarkerInterface
        if (obj instanceof MarkerInterface) {
            System.out.println("obj is an instance of MarkerInterface");
        } else {
            System.out.println("obj is NOT an instance of MarkerInterface");
        }
        
        obj.display(); // Calling the display method
	}

}
