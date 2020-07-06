package com.stayready.assessment1.part1;

import java.util.ArrayList;

public class BasicArrayUtils {
    /**
     * @param stringArray an array of String objects
     * @return the first element in the array
     */
    public static String getFirstElement(String[] stringArray) {
        return stringArray[0];
    }

    /**
     * @param stringArray an array of String objects
     * @return the second element in the array
     */
    public static String getSecondElement(String[] stringArray) {
        return stringArray[1];
    }

    /**
     * @param stringArray an array of String objects
     * @return stringArray with the elements in reverse order
     */
    public static String[] reverse(String[] stringArray) {
        
        String m[] = stringArray.clone();
        int increment = 0;
        int decrement = stringArray.length-1;
        //for loop probably would have been better in this case
        for(String s : stringArray){
            stringArray[increment] = m[decrement];
            increment++;
            decrement--;
        }
        return stringArray;
        
        
    }

    /**
     * @param stringArray an array of String objects
     * @return String made up of the first character in each element of stringArray
     */
    public static String getFirstLetterOfEachElement(String[] stringArray) {
        StringBuilder strontium = new StringBuilder();
        for(String s : stringArray){
            char[] m = s.toCharArray();
            strontium.append(m[0]);
        }
        return strontium.toString();
    }
}
