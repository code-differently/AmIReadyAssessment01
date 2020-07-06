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
        String[] reversed = new String[stringArray.length];

        for(int i = 0; i < reversed.length; i++) {
            reversed[i] = stringArray[stringArray.length-1-i];
        }
        
        return reversed;
    }

    /**
     * @param stringArray an array of String objects
     * @return String made up of the first character in each element of stringArray
     */
    public static String getFirstLetterOfEachElement(String[] stringArray) {
        StringBuilder firstLetters = new StringBuilder();

        for(int i = 0; i < stringArray.length; i++) {
            firstLetters.append(stringArray[i].charAt(0));
        }
        
        return firstLetters.toString();
    }
}
