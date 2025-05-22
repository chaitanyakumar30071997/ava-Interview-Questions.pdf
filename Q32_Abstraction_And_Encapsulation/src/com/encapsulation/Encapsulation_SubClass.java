package com.encapsulation;

public class Encapsulation_SubClass {
	    public static void main(String[] args) {
        EncapsulationSuperClass obj = new EncapsulationSuperClass(1, "John Doe");
        System.out.println("ID: " + obj.getId());
        System.out.println("Name: " + obj.getName());

        // Modifying the private fields using setter methods
        obj.setId(2);
        obj.setName("john Smith");
        System.out.println("Updated ID: " + obj.getId());
        System.out.println("Updated Name: " + obj.getName());
    }

}
