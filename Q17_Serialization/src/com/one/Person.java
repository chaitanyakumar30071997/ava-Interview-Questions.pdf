package com.one;

import java.io.*;

/* Q17. How can objects in a Java class be prevented from 
serialization?  */


class Person implements Serializable {
	
	   // 
	    private static final long serialVersionUID = 1L;
	    String name;
	    transient int age; // This field will not be serialized

	    
	    Person(String name, int age) {
	        this.name = name;
	        this.age = age;
	    }
	}





