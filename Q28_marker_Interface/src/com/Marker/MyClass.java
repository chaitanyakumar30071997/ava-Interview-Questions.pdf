package com.Marker;

public class MyClass implements MarkerInterface {
	    // Class implementation goes here
    public void display() {
        System.out.println("MyClass implementing MarkerInterface");
    }
    
    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.display();
    }

}
