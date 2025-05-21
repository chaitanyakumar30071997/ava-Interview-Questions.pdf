package com.one;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TransientExample {
	   public static void main(String[] args) throws IOException, ClassNotFoundException {
	        Person person = new Person("Alice", 25);

	        // Serialize the object
	        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("person.ser"));
	        oos.writeObject(person);
	        oos.close();

	        // Deserialize the object
	        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("person.ser"));
	        Person deserializedPerson = (Person) ois.readObject();
	        ois.close();

	        System.out.println("Name: " + deserializedPerson.name);
	        System.out.println("Age: " + deserializedPerson.age); // Will print default value (0)
	    }

}
