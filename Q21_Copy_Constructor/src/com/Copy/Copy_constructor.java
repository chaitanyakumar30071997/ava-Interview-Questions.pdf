package com.Copy;

/*Q21. What is a copy constructor in Java? 
A copy constructor creates a new object by copying the properties of an 
existing object. It takes an instance of the same class as an argument and 
initializes the new object with the same values.
*/

public class Copy_constructor { 
 // Copy constructor
    int id;
    String name;

    Copy_constructor(int i, String n) { // constructor to initialize id and name
        id = i;
        name = n;
    }

    Copy_constructor(Copy_constructor e) { // constructor to copy the values
        id = e.id;
        name = e.name;
    }

    void display() {
        System.out.println(id + " " + name);
    }

    public static void main(String[] args) {
        Copy_constructor c1 = new Copy_constructor(101, "Amit"); // creating object
        Copy_constructor c2 = new Copy_constructor(c1); // creating copy of c1
        c1.display();
        c2.display();
    }

}
