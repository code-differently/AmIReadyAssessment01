package com.stayready.assessment1.part1;

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
        for (int i = 0; i < stringArray.length / 2; i++) {
            String temp = stringArray[i];
            stringArray[i] = stringArray[stringArray.length - i - 1];
            stringArray[stringArray.length - i - 1] = temp;
        }
        return stringArray;

    }

    /**
     * @param stringArray an array of String objects
     * @return String made up of the first character in each element of stringArray
     */
    public static String getFirstLetterOfEachElement(String[] stringArray) {
        String output = stringArray.substring(0, 1).toUpperCase() + stringArray.substring(1).toLowerCase();
        return output;
    }
}
