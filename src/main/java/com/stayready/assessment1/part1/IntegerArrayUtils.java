package com.stayready.assessment1.part1;

public class IntegerArrayUtils {
    /**
     * @param intArray an array of integers
     * @return the sum of `intArray`
     */
    public static Integer getSum(Integer[] intArray) {

        int sum = 0;

        for(int currentIndex : intArray){
            sum += currentIndex;
        }

        return sum;
    }

    /**
     * @param intArray an array of integers
     * @return the product of `intArray`
     */
    public static Integer getProduct(Integer[] intArray) {
       
        int product = 1;

        for(int currentIndex : intArray){
            product *= currentIndex;
        }

        return product;
    }

    /**
     * @param intArray an array of integers
     * @return the sum of `intArray` divided by number of elements in `intArray`
     */
    public static Double getAverage(Integer[] intArray) {
        
        int count = intArray.length;

        double average = (getSum(intArray)) / count; 
        return average;
    }

    /**
     * @param intArray an array of integers
     * @return the largest integer in intArray
     */
    public static Integer getLargest(Integer[] intArray) {

        int largestElement = intArray[0];

        for(int i = 1; i < intArray.length; i++){
            if(intArray[i] > largestElement)
                largestElement = intArray[i];
        }

        return largestElement;
    }
}
