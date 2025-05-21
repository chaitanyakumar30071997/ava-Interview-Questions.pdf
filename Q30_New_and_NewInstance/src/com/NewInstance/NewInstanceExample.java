package com.NewInstance;

public class NewInstanceExample {
	public static void main(String[] args) throws Exception {
        Class<?> clazz = Class.forName("Example");
        Example obj = (Example) clazz.newInstance(); // Object created dynamically
    }

}
