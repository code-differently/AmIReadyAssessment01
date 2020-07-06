package com.stayready.assessment1.part2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class ArrayUtils {
    /**
     * @param objectArray   an array of any type of Object
     * @param objectToCount any non-primitive value
     * @return the number of times the specified `value` occurs in the specified `objectArray`
     * Given an array of objects, named `objectArray`, and an object `objectToCount`, return the number of times the `objectToCount` appears in the `objectArray`
     */
    public static Integer getNumberOfOccurrences(Object[] objectArray, Object objectToCount)
    {
        ArrayList<Object> arr = new ArrayList<Object>(Arrays.asList(objectArray));
        Integer occurrences = Collections.frequency(arr, objectToCount);

        return occurrences;
    }

    /**
     * @param objectArray    an array of any type of Object
     * @param objectToRemove a value to be removed from the `objectArray`
     * @return an array with identical content excluding the specified `objectToRemove`
     * Given an array of objects, name `objectArray`, and an object `objectToRemove`, return an array of objects with identical contents excluding `objectToRemove`
     */
    public static Object[] removeValue(Object[] objectArray, Object objectToRemove)
    {
        //another hacky solution
        ArrayList<Object> arr = new ArrayList<Object>(Arrays.asList(objectArray));
        Object[] yuck = {objectToRemove};
        ArrayList<Object> yucky = new ArrayList<>(Arrays.asList(yuck));

        arr.removeAll(yucky);

        return (Object[])arr.toArray();
    }

    /**
     * @param objectArray an array of any type of Object
     * @return the most frequently occurring object in the array
     * given an array of objects, named `objectArray` return the most frequently occuring object in the array
     */
    public static Object getMostCommon(Object[] objectArray)
    {
        Map<Object, Integer> hash = new HashMap<Object, Integer>();
        for(Object o : objectArray)
        {
            //finds the occurence of the object, if null, return 1, if not add one to it
            hash.put(o, hash.get(o) == null ? 1 : hash.get(o) + 1);
        }

        Object mostCommonEl = new Object();
        int maxCount = 0;
        for(Map.Entry<Object, Integer> entry :hash.entrySet())
        {
            Object key = entry.getKey();
            Integer count = entry.getValue();

            if(maxCount < count)
            {
                maxCount = count;
                mostCommonEl = key;
            }
        }

        return mostCommonEl;
    }


    /**
     * @param objectArray an array of any type of Object
     * @return the least frequently occurring object in the array
     * given an array of objects, named `objectArray` return the least frequently occuring object in the array
     */
    public static Object getLeastCommon(Object[] objectArray)
    {
        Map<Object, Integer> hash = new HashMap<Object, Integer>();
        for(Object o : objectArray)
        {
            //finds the occurence of the object, if null, return 1, if not add one to it
            hash.put(o, hash.get(o) == null ? 1 : hash.get(o) + 1);
        }

        Object leastCommonEl = new Object();
        int minCount = Integer.MAX_VALUE;
        for(Map.Entry<Object, Integer> entry :hash.entrySet())
        {
            Object key = entry.getKey();
            Integer count = entry.getValue();

            if(minCount > count)
            {
                minCount = count;
                leastCommonEl = key;
            }
        }

        return leastCommonEl;
    }

    /**
     * @param objectArray      an array of any type of Object
     * @param objectArrayToAdd an array of Objects to add to the first argument
     * @return an array containing all elements in `objectArray` and `objectArrayToAdd`
     * given two arrays `objectArray` and `objectArrayToAdd`, return an array containing all elements in `objectArray` and `objectArrayToAdd`
     */
    public static Object[] mergeArrays(Object[] objectArray, Object[] objectArrayToAdd)
    {
        ArrayList<Object> arrList = new ArrayList<>(Arrays.asList(objectArray));
        arrList.addAll(new ArrayList<Object>(Arrays.asList(objectArrayToAdd)));

        return (Object[]) arrList.toArray();
    }
}
