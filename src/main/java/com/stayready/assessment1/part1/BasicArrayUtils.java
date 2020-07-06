package com.stayready.assessment1.part1;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

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
        List<String> rev = Arrays.asList(stringArray);//array to list
        Collections.reverse(rev);//reverse list
        String[] reversed = rev.toArray(stringArray); //list to array
        return reversed;
    }

    /**
     * @param stringArray an array of String objects
     * @return String made up of the first character in each element of stringArray
     */
    public static String getFirstLetterOfEachElement(String[] stringArray) {
        String[]getFirst = new String[stringArray.length];
        
        return null;
    }
}
