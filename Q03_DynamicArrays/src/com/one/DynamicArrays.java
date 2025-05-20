package com.one;

 /* Q3. Are there dynamic arrays in Java? 
Java arrays are fixed indynamically. Q4 size. However, ArrayList (from the 
Java.util package) provides a dynamic array implementation where elements 
can be added or removed dynamically.
 */

public class DynamicArrays {
	    public static void main(String[] args) {
	    	
        // Create a dynamic array
        int[] dynamicArray = new int[5]; //fixed size array  
        
        // Add elements to the dynamic array
        for (int i = 0; i < dynamicArray.length; i++) {
            dynamicArray[i] = i + 1;
        }
        
        // Print the elements of the dynamic array
        for (int i : dynamicArray) {
            System.out.print(i + " ");
        }
          System.out.println();
  }
}