package com.stayready.assessment1.part1;

import java.util.HashMap;

public class BasicArrayUtils {
    /**
     * @param stringArray an array of String objects
     * @return the first element in the array
     */
    public static String getFirstElement(String[] stringArray) {
        return stringArray[0];
        //System.out.println(getFirstElement(arr));
    }

    /**
     * @param stringArray an array of String objects
     * @return the second element in the array
     */
    public static String getSecondElement(String[] stringArray) {
        return stringArray[1];
        //System.out.println(getSecondElement(arr));
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
    //hashmap??? scanner?? confused.
    public static String getFirstLetterOfEachElement(String[] stringArray) {
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("Chase", "Braxton");
        map.put("Olivia", "Dilarentus");
        map.put("Devin", "Cooper");
        map.put("Evan", "Parker");
        return null;
    }

    /*String[] arr = new String[5];
       arr[0] = "I";
       arr[1] = "Love";
       arr[2] = "Coding";
    */
}
