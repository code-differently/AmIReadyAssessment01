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
        String newArray[] = new String [stringArray.length];
        int count = 0;
        for(int i = stringArray.length - 1; i >= 0; i--){
            newArray[count] = stringArray[i];
            count += 1;
        }
        return newArray;
    }

    /**
     * @param stringArray an array of String objects
     * @return String made up of the first character in each element of stringArray
     */
    public static String getFirstLetterOfEachElement(String[] stringArray) {
        String newString = "";
        for(int i = 0; i < stringArray.length; i++){
            newString += stringArray[i].charAt(0);
        }
        return newString;
    }
}
