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

        int arrLen = stringArray.length - 1;
        String temp = "";
        for(int i = 0; i <= arrLen/2; i++) {

            temp = stringArray[i];
            stringArray[i] = stringArray[arrLen - i];
            stringArray[arrLen - i] = temp;

        }

        return stringArray;
    }

    /**
     * @param stringArray an array of String objects
     * @return String made up of the first character in each element of stringArray
     */
    public static String getFirstLetterOfEachElement(String[] stringArray) {
        
        int arrLen = stringArray.length - 1;
        String result = "";

        for(int i = 0; i <= arrLen; i++){

            result = result + stringArray[i].charAt(0); 
        }
        
        return result;
    }
}
