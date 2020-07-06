package com.stayready.assessment1.part1;

public class IntegerArrayUtils {

    /**
     * @param intArray an array of integers
     * @return the sum of `intArray`
     */
    public static Integer getSum(Integer[] intArray) {
        int sum = 0;
        for (int i = 0; i < intArray.length; i++)
            sum += intArray[i]; 
        return sum; 
    }

    /**
     * @param intArray an array of integers
     * @return the product of `intArray`
     */
    public static Integer getProduct(Integer[] intArray) {
        int result = 1; 
        for (int i = 0; i < intArray.length; i++) 
            result = result * intArray[i]; 
        return result; 
    }

    /**
     * @param intArray an array of integers
     * @return the sum of `intArray` divided by number of elements in `intArray`
     */
    public static Double getAverage(Integer[] intArray) {
        double sum = 0;
        for (int i = 0; i < intArray.length; i++)
            sum += intArray[i]; 
        return sum / intArray.length;
    }

    /**
     * @param intArray an array of integers
     * @return the largest integer in intArray
     */
    public static Integer getLargest(Integer[] intArray) {
        Integer largestInt = intArray[0];
        for (int i = 1; i < intArray.length; i++) {
                if(largestInt < intArray[i]){
                    largestInt = intArray[i];
                } 
            }
            return largestInt;
    }
}
