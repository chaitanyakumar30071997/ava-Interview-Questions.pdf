package com.lambda_expressions;

public class Lambda_expressions {
	public static void main(String[] args) {
       
		MyFunction message = (name) -> System.out.println("Hello, " + name);
        message.greet("Chaitanya"); // Output: Hello, Chaitanya     
	}
	
}
