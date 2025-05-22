package com.lambda_expressions;

import java.util.ArrayList;
import java.util.List;

public class ComparatorLambdaExample {

	public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(111, "Mayank"));
        students.add(new Student(131, "Anshul"));
        students.add(new Student(121, "Solanki"));
        students.add(new Student(101, "Aggarwal"));

        // Sorting using Lambda Expression
        students.sort((s1, s2) -> Integer.compare(s1.rollNo, s2.rollNo));

        // Display sorted list
        students.forEach(System.out::println);
    }

 }

