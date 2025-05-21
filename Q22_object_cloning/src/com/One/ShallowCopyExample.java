package com.One;

/*Q22. What is object cloning in Java? 
Object cloning is a way to create an exact copy of an object. Java provides 
the clone() method from the Cloneable interface to perform shallow copies. A 
shallow copy copies field values but does not duplicate referenced objects, 
while a deep copy creates new instances of referenced objects.  */

class ShallowCopyExample implements Cloneable {
    int id;
    String name;

    // Constructor
    ShallowCopyExample(int id, String name) {
        this.id = id;
        this.name = name;
    }
   // Method to clone the object
    protected Object clone() throws CloneNotSupportedException {
        return super.clone(); // Performs shallow copy
    }
    // Main method to demonstrate shallow copy
    public static void main(String[] args) throws CloneNotSupportedException {
        ShallowCopyExample obj1 = new ShallowCopyExample(1, "Alice");
        ShallowCopyExample obj2 = (ShallowCopyExample) obj1.clone();

        System.out.println("Original: " + obj1.name);
        System.out.println("Cloned: " + obj2.name);
    }
}

