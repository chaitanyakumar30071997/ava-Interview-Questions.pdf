package com.Encapsulation;
/* 
Q7. What is data encapsulation? 
Encapsulation is an OOP principle where data (variables) and code (methods) 
are bundled into a single unit (class). It restricts direct access to data using 
access modifiers (private, protected).*/
public class TwoClass {
	
	public static void main(String[] args) {
		OneClass obj = new OneClass();
        
        obj.setId(1);
        obj.setName("John");
        
        System.out.println("Id: " + obj.getId());
        System.out.println("Name: " + obj.getName());
        
        // obj.id = 2; // This line would cause a compilation error because id is private
        // obj.name = "Doe"; // This line would also cause a compilation error because name is private
	}

}

/*output
Local Variable: 5
Global Variable: 10 */