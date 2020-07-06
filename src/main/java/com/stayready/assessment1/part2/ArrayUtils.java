package com.stayready.assessment1.part2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class ArrayUtils {
    /**
     * @param objectArray   an array of any type of Object
     * @param objectToCount any non-primitive value
     * @return the number of times the specified `value` occurs in the specified `objectArray`
     * Given an array of objects, named `objectArray`, and an object `objectToCount`, return the number of times the `objectToCount` appears in the `objectArray`
     */
    public static Integer getNumberOfOccurrences(Object[] objectArray, Object objectToCount) {
        int count = 0;
        for (int i = 0; i < objectArray.length; i++) {
            if (objectArray[i] == objectToCount) {
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
        ArrayList<Object> answer = new ArrayList<Object>(Arrays.asList(objectArray));
        for (int i = 0; i < answer.size(); i++) {
            if (answer.get(i) == objectToRemove) {
                answer.remove(i);
            }
        }
        return answer.toArray();
    }

    /**
     * @param objectArray an array of any type of Object
     * @return the most frequently occurring object in the array
     * given an array of objects, named `objectArray` return the most frequently occuring object in the array
     */
    public static Object getMostCommon(Object[] objectArray) {
        HashMap<Object, Integer> h = new HashMap<Object, Integer>();
        for (int i = 0; i < objectArray.length; i++) {
            Object key = objectArray[i];
            if (h.containsKey(key)) {
                Integer frequency = h.get(key);
                frequency++;
                h.put(key, frequency);
            }
            else {
                Integer frequency = 1;
                h.put(key, frequency);
            }
            
        }
        
        Integer count = h.get(objectArray[0]);
        Object max = null;
        for (Object key : h.keySet()) {
            if (h.get(key) > count) {
                max = key;
                count = h.get(key);
            }
        }
        return max;
    }


    /**
     * @param objectArray an array of any type of Object
     * @return the least frequently occurring object in the array
     * given an array of objects, named `objectArray` return the least frequently occuring object in the array
     */
    public static Object getLeastCommon(Object[] objectArray) {
        HashMap<Object, Integer> h = new HashMap<Object, Integer>();
        for (int i = 0; i < objectArray.length; i++) {
            Object key = objectArray[i];
            if (h.containsKey(key)) {
                Integer frequency = h.get(key);
                frequency++;
                h.put(key, frequency);
            }
            else {
                Integer frequency = 1;
                h.put(key, frequency);
            }
            
        }
        
        Integer count = h.get(objectArray[0]);
        Object min = null;
        for (Object key : h.keySet()) {
            if (h.get(key) < count) {
                min = key;
                count = h.get(key);
            }
        }
        return min;
    }

    /**
     * @param objectArray      an array of any type of Object
     * @param objectArrayToAdd an array of Objects to add to the first argument
     * @return an array containing all elements in `objectArray` and `objectArrayToAdd`
     * given two arrays `objectArray` and `objectArrayToAdd`, return an array containing all elements in `objectArray` and `objectArrayToAdd`
     */
    public static Object[] mergeArrays(Object[] objectArray, Object[] objectArrayToAdd) {
        ArrayList<Object> answer = new ArrayList<>();
        for (int i = 0; i < objectArray.length; i++) {
            answer.add(objectArray[i]);
        }
        for (int i = 0; i < objectArrayToAdd.length; i++) {
            answer.add(objectArrayToAdd[i]);
        }
        return answer.toArray();
    }
}
