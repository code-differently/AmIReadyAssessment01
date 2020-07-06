package com.stayready.assessment1.part1;

public class IntegerArrayUtils {
    /**
     * @param intArray an array of integers
     * @return the sum of `intArray`
     */
    public static Integer getSum(Integer[] intArray) {

        int arrLen = intArray.length - 1;
        int sum = 0;
        for(int i = 0; i <= arrLen; i++){

            sum += intArray[i];
        }


        return sum;
    }

    /**
     * @param intArray an array of integers
     * @return the product of `intArray`
     */
    public static Integer getProduct(Integer[] intArray) {
        
        int arrLen = intArray.length - 1;
        int prod = 1;
        for(int i = 0; i <= arrLen; i++){

            prod *= intArray[i];
        }

        return prod;
    }

    /**
     * @param intArray an array of integers
     * @return the sum of `intArray` divided by number of elements in `intArray`
     */
    public static Double getAverage(Integer[] intArray) {
        
        int arrLen = intArray.length - 1;
        double avg = getSum(intArray) / arrLen;
        
        return avg;
    }

    /**
     * @param intArray an array of integers
     * @return the largest integer in intArray
     */
    public static Integer getLargest(Integer[] intArray) {
        
        int arrLen = intArray.length - 1;
        int largest = intArray[0];
        for(int i = 1; i <= arrLen; i++){

            if(largest < intArray[i]){

                largest = intArray[i];
            }
            
        }

        return largest;
    }
}
