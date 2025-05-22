package com.abstraction;

// Class members are private by default
// private and static are allowed in classes
// default methods are not allowed in classes
// static methods are allowed in classes
// default and static methods are not abstract 
// default and static methods are inherited by extending classes and can be overridden in extending classes
// private methods are allowed in classes (Java 9 and later)
// private methods are accessible only within the class
// private methods cannot be inherited by extending classes
// private static methods are allowed in classes (Java 9 and later)
// private static methods are accessible only within the class
// private static
// methods cannot be inherited by extending classes
// interfaces private static methods can be used to share code between static methods
public class Abstraction_Class implements Abstraction_Interface {
	
   public static void main(String[] args) {
	   
	   Abstraction_Class obj = new Abstraction_Class();
       obj.abstractMethod();	
       obj.abstractMethodWithParameters(5, 10);
       System.out.println("return" + obj.abstractMethodWithReturnType(5, 10));
   }

@Override
public void abstractMethod() {
	System.out.println("This is an abstract method in a class.");
	
}

@Override
public void abstractMethodWithParameters(int a, int b) {
	
	     System.out.println("This is an abstract method with parameters in a class." + a + b);
    }

@Override
public int abstractMethodWithReturnType(int a, int b) {
	// TODO Auto-generated method stub
      return a + b;
      
}

// without implementing the interface method call display method from interface

}