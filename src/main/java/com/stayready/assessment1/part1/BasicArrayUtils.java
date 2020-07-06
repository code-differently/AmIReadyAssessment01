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
        int length = stringArray.length - 1;
        if(length < 1){
            return stringArray;
        }
        else if(length == 1|| length == 2){
            String temp = stringArray[0];
            stringArray[0] = stringArray[length];
            stringArray[length] = temp;
        }
        else{
            int count = stringArray.length-1;
            for (int i = 0; i < stringArray.length-2; i++){
                String temp = stringArray[count];
                stringArray[count] = stringArray[i];
                stringArray[i] = temp;
                count--;
            }
        }
        return stringArray;
    }

    /**
     * @param stringArray an array of String objects
     * @return String made up of the first character in each element of stringArray
     */
    public static String getFirstLetterOfEachElement(String[] stringArray) {
        String firstLetter;
        for (int i = 0; i < stringArray.length ; i++){
            stringArray[i] = stringArray[i].substring(0,1);
        }
        firstLetter = stringArray[0];
        for (int i = 1; i < stringArray.length; i++){
            firstLetter = firstLetter + stringArray[i];
        }
        return firstLetter;
    }
}
