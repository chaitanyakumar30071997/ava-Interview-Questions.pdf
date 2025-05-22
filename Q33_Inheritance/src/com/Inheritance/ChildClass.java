package com.Inheritance;


public class ChildClass extends ParentClass {
    int value = 20;

    public void display() {
        System.out.println("This is the Child class");
        System.out.println("Value of a in Child class: " + value);
        System.out.println("Value of a in Parent class: " + super.value); // Use getter method
    }

    public void show() {
        System.out.println("This is the Child class show method");
    }

    public static void main(String[] args) {
        ChildClass child = new ChildClass();
        child.display();
        child.show();
        
        ParentClass parent = new ParentClass();
        parent.display();
        parent.show();
    }
}


