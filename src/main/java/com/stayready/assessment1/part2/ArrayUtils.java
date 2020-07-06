package com.stayready.assessment1.part2;


public class ArrayUtils {
    /**
     * @param objectArray   an array of any type of Object
     * @param objectToCount any non-primitive value
     * @return the number of times the specified `value` occurs in the specified `objectArray`
     * Given an array of objects, named `objectArray`, and an object `objectToCount`, return the number of times the `objectToCount` appears in the `objectArray`
     */
    public static Integer getNumberOfOccurrences(Object[] objectArray, Object objectToCount) {
        int occurances = 0; 
        for(int i = 0; i<objectArray.length;i++)
        {
            if(objectArray[i]==objectToCount)
            {
                occurances++;
            }
        }
        return occurances;
    }

    /**
     * @param objectArray    an array of any type of Object
     * @param objectToRemove a value to be removed from the `objectArray`
     * @return an array with identical content excluding the specified `objectToRemove`
     * Given an array of objects, name `objectArray`, and an object `objectToRemove`, return an array of objects with identical contents excluding `objectToRemove`
     */
    public static Object[] removeValue(Object[] objectArray, Integer objectToRemove) {
        int length = objectArray.length;
        Object[] newArray = new Object[objectArray.length +1];
    int i, k = 0;
        for (i = 0, k = 0; i<length; i++)
        {
            if(objectToRemove == objectArray[i])
            {
                continue;
            }
            newArray[k++] = objectArray[i];
        }
        

        return objectArray;
    }

    /**
     * @param objectArray an array of any type of Object
     * @return the most frequently occurring object in the array
     * given an array of objects, named `objectArray` return the most frequently occuring object in the array
     */
    public static Object getMostCommon(Integer[] objectArray) {

        int maximum_freq = 0; int answer =-1;
        int length= objectArray.length;
        for(int i = 0; i<length;i++)
        {
            int current_freq = 1;
            for(int j = i+1; j<length-1; j++)
            {
                if(objectArray[j]== objectArray[i])
                {
                    current_freq ++;
                }
            }
            if(maximum_freq < current_freq)
            {
                maximum_freq = current_freq;
                answer = objectArray[i];
            }  
            else if(maximum_freq ==current_freq)
            {
                if(answer<objectArray[i])
                {
                    answer = objectArray[i];
                }
                
            }    
        }
        return answer;
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
        return null;
    }
}
