package com.stayready.assessment1.part2;

import java.util.Arrays;

public class ArrayUtils {
    /**
     * @param objectArray   an array of any type of Object
     * @param objectToCount any non-primitive value
     * @return the number of times the specified `value` occurs in the specified `objectArray`
     * Given an array of objects, named `objectArray`, and an object `objectToCount`, return the number of times the `objectToCount` appears in the `objectArray`
     */
    public static Integer getNumberOfOccurrences(Object[] objectArray, Object objectToCount) {
        int count = 0;
        for(Object a: objectArray){
            if (a == objectToCount)
                count++;
        }
        return count;
    }

    /**
     * @param objectArray    an array of any type of Object
     * @param objectToRemove a value to be removed from the `objectArray`
     * @return an array with identical content excluding the specified `objectToRemove`
     * Given an array of objects, name `objectArray`, and an object `objectToRemove`, return an array of objects with identical contents excluding `objectToRemove`
     */
    public static Object[] removeValue(Object[] objectArray, Object objectToRemove) {
        Object [] copy = new Object[99];
        int i = 0;
        for (Object a: objectArray){
            if(a != objectToRemove){
                copy[i] = a;
                i++;
            }
        }
        return Arrays.copyOf(copy, i);
    }

    /**
     * @param objectArray an array of any type of Object
     * @return the most frequently occurring object in the array
     * given an array of objects, named `objectArray` return the most frequently occuring object in the array
     */
    public static Object getMostCommon(Object[] objectArray) {
        int count = 0;
        int maxCount = -1;
        Object item = objectArray[0];
        int maxIndex = 0;
        int check = 0;
        int i;

        while(check != objectArray.length-1){
            System.out.println("Next: " + item);
             for(i = 0; i < objectArray.length-1;i++){
                if(item == objectArray[i]){
                    count++;
                }
             }
             if(count > maxCount){
                 maxCount = count;
                 maxIndex = check;
                 System.out.println("max Index:"+maxIndex);
             }
             count = 0;
             check++;
             item = objectArray[check];
         }

        return objectArray[maxIndex];
    }


    /**
     * @param objectArray an array of any type of Object
     * @return the least frequently occurring object in the array
     * given an array of objects, named `objectArray` return the least frequently occuring object in the array
     */
    public static Object getLeastCommon(Object[] objectArray) {
        int count = 0;
        int minCount = 999;
        Object item = objectArray[0];
        int minIndex = 0;
        int check = 0;
        int i;

        while(check != objectArray.length-1){
             for(i = 0; i < objectArray.length-1;i++){
                if(item == objectArray[i]){
                    count++;
                }
             }
             if(count < minCount){
                 minCount = count;
                 minIndex = check;
             }
             count = 0;
             check++;
             item = objectArray[check];
         }

        return objectArray[minIndex];
    }

    /**
     * @param objectArray      an array of any type of Object
     * @param objectArrayToAdd an array of Objects to add to the first argument
     * @return an array containing all elements in `objectArray` and `objectArrayToAdd`
     * given two arrays `objectArray` and `objectArrayToAdd`, return an array containing all elements in `objectArray` and `objectArrayToAdd`
     */
    public static Object[] mergeArrays(Object[] objectArray, Object[] objectArrayToAdd) {
        int firstLength = objectArray.length;
        int SecondLength = objectArray.length;
       Object [] both = Arrays.copyOf(objectArray, firstLength + SecondLength);
       System.arraycopy(objectArrayToAdd, 0, both, firstLength, SecondLength);
        return both;
    }
}
