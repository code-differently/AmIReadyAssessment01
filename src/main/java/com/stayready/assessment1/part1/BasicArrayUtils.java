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
        //swapping elements in order to keep space complexity low
        int first, last, length;
        first = 0;
        length = stringArray.length;
        last = length - 1;

        //will keep a temporary variable of a string so that you don't lose values
        String temp = "";
        
        //only going halfway because you don't need to swap the rest of the elements
        for(int i = 0; i < length / 2; i++) {
            //swap
            temp = stringArray[first];
            stringArray[first] = stringArray[last - i];
            stringArray[last] = temp;
        }

        return stringArray;
    }

    /**
     * @param stringArray an array of String objects
     * @return String made up of the first character in each element of stringArray
     */
    public static String getFirstLetterOfEachElement(String[] stringArray) {
        //more efficent when using add operations
        StringBuilder ans = new StringBuilder();
        for(int i = 0; i < stringArray.length; i++) {
            //need to get the first letter of the string
            ans.append(stringArray[i].charAt(0));
        }
        return ans.toString();
    }
}
