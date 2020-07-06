package com.stayready.assessment1.part2;

import java.util.ArrayList;
import java.util.List;

public class ArrayUtils {
    /**
     * @param objectArray   an array of any type of Object
     * @param objectToCount any non-primitive value
     * @return the number of times the specified `value` occurs in the specified `objectArray`
     * Given an array of objects, named `objectArray`, and an object `objectToCount`, return the number of times the `objectToCount` appears in the `objectArray`
     */
    public static Integer getNumberOfOccurrences(Object[] objectArray, Object objectToCount) {
        int count = 0;
        for(int i = 0; i < objectArray.length; i++){
            if(objectToCount == objectArray[i]){
                count += 1;
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
        List<Object> ob = new ArrayList<>();
        for(int i = 0; i < objectArray.length; i ++){
            if(!(objectArray[i]==objectToRemove)){
                ob.add(objectArray[i]);
            }
        }
        Object[] obj = new Object[ob.size()];
        for(int i = 0; i < ob.size(); i++){
            obj[i] = ob.get(i);
        }
        return obj;
    }

    /**
     * @param objectArray an array of any type of Object
     * @return the most frequently occurring object in the array
     * given an array of objects, named `objectArray` return the most frequently occuring object in the array
     */
    public static Object getMostCommon(Object[] objectArray) {
        Object most = 0;
        for(int i = 0; i < objectArray.length; i++){
            for(int j = 1; j < objectArray.length - 1; j++){
                if(objectArray[i] == objectArray[j]){
                    most = objectArray[i];
                }
            }
        }
        return most;
    }


    /**
     * @param objectArray an array of any type of Object
     * @return the least frequently occurring object in the array
     * given an array of objects, named `objectArray` return the least frequently occuring object in the array
     */
    public static Object getLeastCommon(Object[] objectArray) {
        return null;
    }

    /**
     * @param objectArray      an array of any type of Object
     * @param objectArrayToAdd an array of Objects to add to the first argument
     * @return an array containing all elements in `objectArray` and `objectArrayToAdd`
     * given two arrays `objectArray` and `objectArrayToAdd`, return an array containing all elements in `objectArray` and `objectArrayToAdd`
     */
    public static Object[] mergeArrays(Object[] objectArray, Object[] objectArrayToAdd) {
        Object[] array = new Object[objectArray.length + objectArrayToAdd.length];
        int count = objectArray.length;
        for(int i = 0; i < objectArray.length; i++){
            array[i] = objectArray[i];
        }
        for(int j = 0; j < objectArrayToAdd.length; j++){
            array[count] = objectArrayToAdd[j];
            count -= 1;
        }
        return array;
    }
}
