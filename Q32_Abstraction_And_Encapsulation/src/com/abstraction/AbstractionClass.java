package com.abstraction;

public abstract class AbstractionClass implements Abstraction_Interface {
	
      public static void main(String[] args) {
         
         AbstractionClass obj = new AbstractionClass() {
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
                 return a + b;
             }

         };
         
         obj.abstractMethod();	
         obj.abstractMethodWithParameters(5, 10);
         System.out.println("return" + obj.abstractMethodWithReturnType(5, 10));

         }
      }
