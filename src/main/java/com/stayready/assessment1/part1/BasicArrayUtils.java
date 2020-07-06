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
        List<String> list =Arrays.asList(stringArray); //Creating a list and converting the string array to a list
        Collections.reverse(list);// reversing the list 
        String [] reverseString = list.toArray(stringArray); //turning the reversed list back into an array

        return reverseString;
    }

    /**
     * @param stringArray an array of String objects
     * @return String made up of the first character in each element of stringArray
     */
    public static String getFirstLetterOfEachElement(String[] stringArray) {
        String placeholder = "";
        String floea = "";
        char firstelement;
        for (int i = 0; i<=stringArray.length - 1; i++)
        {
           placeholder = stringArray[i];
           firstelement = placeholder.charAt(0);
            floea += firstelement;

        }
        return floea;
    }
}
