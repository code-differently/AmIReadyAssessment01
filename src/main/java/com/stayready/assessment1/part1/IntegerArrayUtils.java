package com.stayready.assessment1.part1;

public class IntegerArrayUtils {
    /**
     * @param intArray an array of integers
     * @return the sum of `intArray`
     */
    public static Integer getSum(Integer[] intArray) {
        int sum = 0;
        for(Integer i : intArray){
            sum += i; 
        }
        return sum;
    }

    /**
     * @param intArray an array of integers
     * @return the product of `intArray`
     */
    public static Integer getProduct(Integer[] intArray) {
        int product = 1;
        for(Integer i : intArray){
            product *= i; 
        }
        return product;
    }

    /**
     * @param intArray an array of integers
     * @return the sum of `intArray` divided by number of elements in `intArray`
     */
    public static Double getAverage(Integer[] intArray) {
        int n = intArray.length; 
        double average = (double) getSum(intArray) / (double) n;
        return average;
 
    }

    /**
     * @param intArray an array of integers
     * @return the largest integer in intArray
     */
    public static Integer getLargest(Integer[] intArray) {
        int largest = 0; 
        
       for(int i = 0; i < intArray.length; i++){
           if(intArray[i] > largest){
               largest = intArray[i]; 
           }
       }
        return largest;
    }
}
