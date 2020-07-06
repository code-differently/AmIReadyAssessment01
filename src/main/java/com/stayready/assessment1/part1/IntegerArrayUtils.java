package com.stayready.assessment1.part1;

public class IntegerArrayUtils {
    /**
     * @param intArray an array of integers
     * @return the sum of `intArray`
     */
    public static Integer getSum(Integer[] intArray) {
        int sum = 0;
        for( int num : intArray) {
            sum = sum+num;
        }
        return sum;
    }

    /**
     * @param intArray an array of integers
     * @return the product of `intArray`
     */
    public static Integer getProduct(Integer[] intArray) {
        int n=1;
        for(int i: intArray){
            n*=i;;
        }
        return n;
    }

    /**
     * @param intArray an array of integers
     * @return the sum of `intArray` divided by number of elements in `intArray`
     */
    public static Double getAverage(Integer[] intArray) {
        int sum = 0;
        for(int i=0; i < intArray.length ; i++)
        sum = sum + intArray[i];
        double average = sum / intArray.length;

        return average;
    }

    /**
     * @param intArray an array of integers
     * @return the largest integer in intArray
     */
    public static Integer getLargest(Integer[] intArray) {
        int i; 
        int max = intArray[0]; 
        for (i = 1; i < intArray.length; i++) 
             if (intArray[i] > max) 
                 max = intArray[i];
        return max;
    }
}
