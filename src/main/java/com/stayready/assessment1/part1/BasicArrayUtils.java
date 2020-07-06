package com.stayready.assessment1.part1;

public class BasicArrayUtils {
    /**
     * @param stringArray an array of String objects
     * @return the first element in the array
     */
    public static String getFirstElement(String[] stringArray) {
        String firstElement = stringArray[0];
        return firstElement;
    }

    /**
     * @param stringArray an array of String objects
     * @return the second element in the array
     */
    public static String getSecondElement(String[] stringArray) {
        String secondElement = stringArray[1];
        return secondElement;
    }

    /**
     * @param stringArray an array of String objects
     * @return stringArray with the elements in reverse order
     */
    public static String[] reverse(String[] stringArray) {
        int arrLength = stringArray.length;
        String[] reversedArray = new String[arrLength];
        for (int i = 0; i < stringArray.length; i++) {
            reversedArray[i] = stringArray[arrLength - 1 - i];
        }
        stringArray = reversedArray;
        return stringArray;
    }

    /**
     * @param stringArray an array of String objects
     * @return String made up of the first character in each element of stringArray
     */
    public static String getFirstLetterOfEachElement(String[] stringArray) {
        StringBuilder newString = new StringBuilder();
        for (String string : stringArray) {
            newString.append(string.substring(0,1));
        }
        return newString.toString();
    }
}
