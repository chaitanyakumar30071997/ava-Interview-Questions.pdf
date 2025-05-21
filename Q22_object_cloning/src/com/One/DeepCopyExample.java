package com.One;

/*Q22. What is object cloning in Java? 
Object cloning is a way to create an exact copy of an object. Java provides 
the clone() method from the Cloneable interface to perform shallow copies. A 
shallow copy copies field values but does not duplicate referenced objects, 
while a deep copy creates new instances of referenced objects.  */

class DeepCopyExample implements Cloneable {
    int id;
    String name;

    // Constructor
    DeepCopyExample(int id, String name) {
        this.id = id;
        this.name = new String(name); // Creates a new instance
    }
    
     // Method to clone the object
    protected Object clone() throws CloneNotSupportedException {
        return new DeepCopyExample(this.id, this.name); // Creates a new object
    }
    
    // Main method to demonstrate deep copy
    public static void main(String[] args) throws CloneNotSupportedException {
        DeepCopyExample obj1 = new DeepCopyExample(1, "Alice");
        DeepCopyExample obj2 = (DeepCopyExample) obj1.clone();

        System.out.println("Original: " + obj1.name);
        System.out.println("Cloned: " + obj2.name);
    }
}

