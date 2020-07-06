package com.stayready.assessment1.part1;

import java.util.ArrayList;
import java.util.Scanner;

public class BasicArrayUtils {
    /**
     * @param stringArray an array of String objects
     * @return the first element in the array
     */
    public static String getFirstElement(String[] stringArray) { 
  
        // creating an Empty Integer ArrayList 
        ArrayList<Integer> list = new ArrayList<Integer>(3); 
  
        // using add() to initialize values 
        list.add("The"); 
        list.add("Quick"); 
        list.add("Brownn"); 
        
  
        // printing initial value ArrayList 
        System.out.print("ArrayList: " + list); 
  
        // find first element 
        int first = list.get(0); 
  
        // find last element 
        int last = list.get(list.size() - 1); 
  
        // print first and last element of ArrayList 
        System.out.println("\nFirst : " + first);
                           
    } 
} 

    /**
     * @param stringArray an array of String objects
     * @return the second element in the array
     */
    public static String getSecondElement(String[] stringArray) {
        return null;
    }

    /**
     * @param stringArray an array of String objects
     * @return stringArray with the elements in reverse order
     */
    public static String[] reverse(String[] stringArray) {
        return null;
    }

    /**
     * @param stringArray an array of String objects
     * @return String made up of the first character in each element of stringArray
     */
    public static String getFirstLetterOfEachElement(String[] stringArray) {
        return null;
    }
}
