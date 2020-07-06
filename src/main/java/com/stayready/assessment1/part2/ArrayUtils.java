package com.stayready.assessment1.part2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Arrays;

public class ArrayUtils {
    public static void main(String [] args) {
        Integer[] inputArray = {1, 2, 7, 8, 4, 5, 7, 0, 9, 8, 7};
        Object [] expected = removeValue(inputArray, 7);
        for(Object obj : expected) {
            System.out.println(obj);
        }
    }
    /**
     * @param objectArray   an array of any type of Object
     * @param objectToCount any non-primitive value
     * @return the number of times the specified `value` occurs in the specified `objectArray`
     * Given an array of objects, named `objectArray`, and an object `objectToCount`, return the number of times the `objectToCount` appears in the `objectArray`
     */
    public static Integer getNumberOfOccurrences(Object[] objectArray, Object objectToCount) {
        int count = 0;
        for(Object obj : objectArray) {
            if(obj.equals(objectToCount)) {
                count++;
            }
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
        //there could be multiple instances of that object, so use an arraylist so that you don't need to worry about indexes
        //you can convert the arraylist back into an object with arr.toArray()
        ArrayList <Object> arr = new ArrayList <Object>();
        for(Object obj : objectArray) {
            //you want to add the objects that don't equal objectToRemove
            if(!obj.equals(objectToRemove)) {
                arr.add(obj);
                //only increment index if you do not find the object, otherwise will get a null pointer reference
            }
        }
        Object [] ans = arr.toArray();
        return ans;
    }

    /**
     * @param objectArray an array of any type of Object
     * @return the most frequently occurring object in the array
     * given an array of objects, named `objectArray` return the most frequently occuring object in the array
     */
    public static Object getMostCommon(Object[] objectArray) {
        HashMap <Object, Integer> hm = new HashMap <Object, Integer>();
        
        for(Object obj: objectArray) {
            if(hm.containsKey(obj)) {
                //incrementing the value by one
                hm.put(obj, hm.get(obj) + 1);
            }
            else {
                hm.put(obj, 1);
            }
        }

        int maxNumOccurances = 0;
        Object ans = new Object();
        for(Entry <Object, Integer> element : hm.entrySet()) {
            int occurances = element.getValue();
            if(maxNumOccurances < occurances) {
                maxNumOccurances = occurances;
                ans = element.getKey();
            }
        }

        return ans;
    }


    /**
     * @param objectArray an array of any type of Object
     * @return the least frequently occurring object in the array
     * given an array of objects, named `objectArray` return the least frequently occuring object in the array
     */
    public static Object getLeastCommon(Object[] objectArray) {
        HashMap <Object, Integer> hm = new HashMap <Object, Integer>();
        
        for(Object obj: objectArray) {
            if(hm.containsKey(obj)) {
                //incrementing the value by one
                hm.put(obj, hm.get(obj) + 1);
            }
            else {
                hm.put(obj, 1);
            }
        }

        //has to occur at least once
        //if it was set to 0 then the answer returned would be an empty object
        int minNumOccurances = 1;
        Object ans = new Object();
        for(Entry <Object, Integer> element : hm.entrySet()) {
            int occurances = element.getValue();
            if(occurances <= minNumOccurances) {
                minNumOccurances = occurances;
                ans = element.getKey();
            }
        }

        return ans;
    }

    /**
     * @param objectArray      an array of any type of Object
     * @param objectArrayToAdd an array of Objects to add to the first argument
     * @return an array containing all elements in `objectArray` and `objectArrayToAdd`
     * given two arrays `objectArray` and `objectArrayToAdd`, return an array containing all elements in `objectArray` and `objectArrayToAdd`
     */
    public static Object[] mergeArrays(Object[] objectArray, Object[] objectArrayToAdd) {
        int combinedLength = objectArray.length + objectArrayToAdd.length;
        Object [] combinedArr = new Object [combinedLength];
        for(int i = 0; i < objectArray.length; i++) {
            combinedArr[i] = objectArray[i];
        }
        for(int j = 0; j < objectArrayToAdd.length; j++) {
            //going into the length of the first which is where the previous loop left of, not going out of bounds
            combinedArr[objectArray.length + j] = objectArrayToAdd[j];
        }
        return combinedArr;
    }
}
