package com.stayready.assessment1.part1;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BasicArrayUtils {
    private static int i;

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
     * @param expected an array of String objects
     * @return stringArray with the elements in reverse order
     */
    public static String[] reverse(String[] stringArray) {
        String[] s = new String[stringArray.length];
        int backwards = 0;
        for(int i = stringArray.length-1; i>=0; i--){
            s[backwards] = stringArray[i];
            backwards++;

        }
           
        return s;

    }

    /**
     * @param stringArray an array of String objects
     * @return String made up of the first character in each element of stringArray
     */
    public static String getFirstLetterOfEachElement(String[] stringArray) 
    {
        String firstLetters = "";
        for(String s : stringArray)
        {
            firstLetters += s.charAt(0);
        }
        return firstLetters;
}

}
