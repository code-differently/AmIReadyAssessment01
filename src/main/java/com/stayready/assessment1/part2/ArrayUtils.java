package com.stayready.assessment1.part2;

import java.util.Map.Entry;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ArrayUtils {
    /**
     * @param objectArray   an array of any type of Object
     * @param objectToCount any non-primitive value
     * @return the number of times the specified `value` occurs in the specified `objectArray`
     * Given an array of objects, named `objectArray`, and an object `objectToCount`, return the number of times the `objectToCount` appears in the `objectArray`
     */
    public static Integer getNumberOfOccurrences(Object[] objectArray, Object objectToCount) {
        int counter =0 ; 
        for(int i = 0; i < objectArray.length; i++){
            if(objectArray[i] == objectToCount){
                counter++;
            }
        } 
        return counter;
    }

    /**
     * @param objectArray    an array of any type of Object
     * @param objectToRemove a value to be removed from the `objectArray`
     * @return an array with identical content excluding the specified `objectToRemove`
     * Given an array of objects, name `objectArray`, and an object `objectToRemove`, return an array of objects with identical contents excluding `objectToRemove`
     */
    public static Object[] removeValue(Object[] objectArray, Object objectToRemove) {
    
        return Arrays.stream(objectArray)
                      .filter(num -> num != objectToRemove)
                      .toArray();
    }

    /**
     * @param objectArray an array of any type of Object
     * @return the most frequently occurring object in the array
     * given an array of objects, named `objectArray` return the most frequently occuring object in the array
     */
    public static Object getMostCommon(Object[] objectArray) {
        //use hashmap here 
        Map <Object, Integer> map = new HashMap <Object, Integer>(); 
        int n = objectArray.length; 
        for(int i = 0; i < n; i++){
            Object key = objectArray[i];  //this is the key, hashmap maps key to value. we will count the values in the end
            if(map.containsKey(key)){
                int common = map.get(key);
                common++; 
                map.put(key, common);
            } else {
                map.put(key, 1);
            }
        }
        int maximumCount = 0; 
        Object result = -1; 
        for(Entry<Object, Integer> x : map.entrySet()){
            if(maximumCount < x.getValue()){
                result = x.getKey(); 
                maximumCount = x.getValue();
            }
        }

        return result;
    }


    /**
     * @param objectArray an array of any type of Object
     * @return the least frequently occurring object in the array
     * given an array of objects, named `objectArray` return the least frequently occuring object in the array
     */
    public static Object getLeastCommon(Object[] objectArray) {

         //use hashmap here 
         Map <Object, Integer> map = new HashMap <Object, Integer>(); 
         int n = objectArray.length; 
         for(int i = 0; i < n; i++){
             Object key = objectArray[i];  //this is the key, hashmap maps key to value. we will count the values in the end
             if(map.containsKey(key)){
                 int common = map.get(key);
                 common++; 
                 map.put(key, common);
             } else {
                 map.put(key, 1);
             }
         }
         int minCount = Integer.MAX_VALUE;
         Object result = -1; 
         for(Entry<Object, Integer> x : map.entrySet()){
             if(minCount >= x.getValue()){
                 result = x.getKey(); 
                 minCount = x.getValue();
             }
         }
 
         return result;
    }

    /**
     * @param objectArray      an array of any type of Object
     * @param objectArrayToAdd an array of Objects to add to the first argument
     * @return an array containing all elements in `objectArray` and `objectArrayToAdd`
     * given two arrays `objectArray` and `objectArrayToAdd`, return an array containing all elements in `objectArray` and `objectArrayToAdd`
     */
    public static Object[] mergeArrays(Object[] objectArray, Object[] objectArrayToAdd) {
        int n = objectArray.length;
        int m = objectArrayToAdd.length;
        Object[] merge = new Object[m + n];
        int counter = 0;  
        for(int i = 0; i < n; i++){
            merge[i] = objectArray[i];
            counter++; 
        }
        for(int j = 0; j < m; j++){
            merge[counter++] = objectArrayToAdd[j]; 
        }

        return merge;
    }
}
