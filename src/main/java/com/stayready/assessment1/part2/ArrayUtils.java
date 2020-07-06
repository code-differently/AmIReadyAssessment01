package com.stayready.assessment1.part2;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayUtils {
    /**
     * @param objectArray   an array of any type of Object
     * @param objectToCount any non-primitive value
     * @return the number of times the specified `value` occurs in the specified `objectArray`
     * Given an array of objects, named `objectArray`, and an object `objectToCount`, return the number of times the `objectToCount` appears in the `objectArray`
     */
    public static Integer getNumberOfOccurrences(Object[] objectArray, Object objectToCount) {
        int numOccurences = 0;
        for (Object element : objectArray) {
            if (element.equals(objectToCount)) {
                numOccurences++;
            }
        }
        return numOccurences;
    }

    /**
     * @param objectArray    an array of any type of Object
     * @param objectToRemove a value to be removed from the `objectArray`
     * @return an array with identical content excluding the specified `objectToRemove`
     * Given an array of objects, name `objectArray`, and an object `objectToRemove`, return an array of objects with identical contents excluding `objectToRemove`
     */
    public static Object[] removeValue(Object[] objectArray, Object objectToRemove) {
        ArrayList<Object> objArr = new ArrayList<>(Arrays.asList(objectArray));
        for (int i = 0; i < objArr.size(); i++) {
            if (objArr.get(i).equals(objectToRemove)) {
                objArr.remove(i);
            }
        }
        objectArray = objArr.toArray();
        return objectArray;
    }

    /**
     * @param objectArray an array of any type of Object
     * @return the most frequently occurring object in the array
     * given an array of objects, named `objectArray` return the most frequently occuring object in the array
     */
    public static Object getMostCommon(Object[] objectArray) {
        int currentCount = 1;
        int maxCount = 1;
        Object mostCommon = objectArray[0];
        Arrays.sort(objectArray);
        for (int i = 1; i < objectArray.length; i++) {
            if (objectArray[i].equals(objectArray[i - 1])) {
                currentCount++;
            } else {
                if (currentCount > maxCount) {
                maxCount = currentCount;
                mostCommon = objectArray[i - 1];
            } 
                    currentCount = 1;
                }
            }
        if (currentCount > maxCount) {
            maxCount = currentCount;
            mostCommon = objectArray[objectArray.length - 1];
        }
        return mostCommon;
    }


    /**
     * @param objectArray an array of any type of Object
     * @return the least frequently occurring object in the array
     * given an array of objects, named `objectArray` return the least frequently occuring object in the array
     */
    public static Object getLeastCommon(Object[] objectArray) {
        int currentCount = 1;
        int leastCount = objectArray.length;
        Object leastCommon = objectArray[0];
        Arrays.sort(objectArray);
        for (int i = 1; i < objectArray.length; i++) {
            if (objectArray[i].equals(objectArray[i - 1])) {
                currentCount++;
            } else {
                if (currentCount < leastCount) {
                leastCount = currentCount;
                leastCommon = objectArray[i - 1];
            } 
                    currentCount = 1;
                }
            }
        if (currentCount < leastCount) {
            leastCount = currentCount;
            leastCommon = objectArray[objectArray.length - 1];
        }
        return leastCommon;
    }

    /**
     * @param objectArray      an array of any type of Object
     * @param objectArrayToAdd an array of Objects to add to the first argument
     * @return an array containing all elements in `objectArray` and `objectArrayToAdd`
     * given two arrays `objectArray` and `objectArrayToAdd`, return an array containing all elements in `objectArray` and `objectArrayToAdd`
     */
    
    public static Object[] mergeArrays(Object[] objectArray, Object[] objectArrayToAdd) {
        ArrayList<Object> merged = new ArrayList<Object>(Arrays.asList(objectArray));
        merged.addAll(Arrays.asList(objectArrayToAdd));
        return merged.toArray();
    }

    
}
