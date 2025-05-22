package com.default_keyword;

/* Q36. What is the purpose of the default keyword in interfaces? 
The default keyword allows methods in interfaces to have default 
implementations, enabling backward compatibility without forcing all 
implementing classes to override them. */

public class Default_keyword_Class  implements Default_keyword{
	
	public static void main(String[] args) {
		Default_keyword obj = new Default_keyword_Class();
        obj.defaultMethod();
        Default_keyword.staticMethod();
        obj.abstractMethod();
	}

	@Override
	public void abstractMethod() {
	
		System.out.println("This is an abstract method implemented in the class.");
	}
	

}
