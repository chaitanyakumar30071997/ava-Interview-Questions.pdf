package com.lambda_expressions;

public class Student {
	int rollNo;
    String name;

    Student(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }

    @Override
    public String toString() {
        return rollNo + ": " + name;
    }

}
