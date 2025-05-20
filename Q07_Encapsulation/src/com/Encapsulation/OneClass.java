package com.Encapsulation;

/* 
 Q7. What is data encapsulation? 
Encapsulation is an OOP principle where data (variables) and code (methods) 
are bundled into a single unit (class). It restricts direct access to data using 
access modifiers (private, protected).*/
public class OneClass {
	
   private int id;
   private String name;
   
   
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
   
  
  

}
