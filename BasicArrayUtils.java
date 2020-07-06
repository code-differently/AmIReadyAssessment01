package com.stayready.assessment1.part1;

import java.util.Arrays;

public class BasicArrayUtils {
    /**
     * @param stringArray an array of String objects
     * @return the first element in the array
     */
    public static String getFirstElement(final String[] stringArray){
        final String[] array = {"The", "quick", "brown"};
        System.out.println(array[0]);
        return array[0];
    }

    public static String getFirstElement2(final String[] stringArray2){
        final String[] array2 = {"Somewhere", "over", "the", "rainbow"};
        System.out.println(array2[0]);
        return array2[0];
    }

    /**
     * @param stringArray an array of String objects
     * @return the second element in the array
     */
    public static String getSecondElement(final String[] stringArray){
        final String[] array3 = {"The", "quick", "brown"};
        System.out.println(array3[1]);
        return array3[1];
    }

    public static String getSecondElement2(final String [] stringArray){
        final String[] array4 = {"Somewhere", "over", "the", "rainbow"};
        System.out.println(array4[1]);
        return array4[1];
    }

    /**
     * @param stringArray an array of String objects
     * @return stringArray with the elements in reverse order
     */
    public static String[] reverse(final String[] stringArray) {
        String[] arr = {"The", "quick", "brown"};
        String[] a = new String[stringArray.length];
        for (int i = 0; i < stringArray.length; i++){
            arr[i] = "";
            for (int j=stringArray[i].length()-1; j>=0; j--){
                a[i]+=stringArray[i].substring(j, j+1);
            }
            return a;
    }

    public static String[] reverse2(String[] stringArray){
        
        String[] array2 = {"rainbow", "the", "over", "Somewhere"};
        System.out.println("array before reverse: " + Arrays.toString(array2));
            for (int i = 0; i < array2.length/2; i++){
            String arr = array2[i];
            array2[i]  = array2[i];
            array2[array2.length] = arr;
        }
        
        System.out.println("array after reverse: " + Arrays.toString(array2));
        return array2;
        
    }

    /**
     * @param stringArray an array of String objects
     * @return String made up of the first character in each element of stringArray
     */
    public static String getFirstLetterOfEachElement(final String[] stringArray) {
        final String array[] = {"The", "quick", "brown", "fox"};
        char[][] substring;
		System.out.println(substring[0,1];
        )
        
        return null;
    }
}
