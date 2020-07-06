package com.stayready.assessment1.part1;

public class IntegerArrayUtils {
    /**
     * @param intArray an array of integers
     * @return the sum of `intArray`
     */
    public static Integer getSum(Integer[] intArray) {
        int sum = 0;
        for(int i : intArray){
            sum += i;
        }
        return sum;
    }

    /**
     * @param intArray an array of integers
     * @return the product of `intArray`
     */
    public static Integer getProduct(Integer[] intArray) {
        int sum = 1;
        for(int i : intArray){
            sum *= i;
        }
        return sum;
    }

    /**
     * @param intArray an array of integers
     * @return the sum of `intArray` divided by number of elements in `intArray`
     */
    public static Double getAverage(Integer[] intArray) {
        int sum = 0;
        int divisor = intArray.length;
        double avg = 0;
        for(int i : intArray){
            sum += i;
            avg = sum / divisor;
        }
        return avg;
    }

    /**
     * @param intArray an array of integers
     * @return the largest integer in intArray
     */
    public static Integer getLargest(Integer[] intArray){
        Integer biggest = intArray[0];
        for(int i=0;i<intArray.length;i++){
            int prospect = intArray[i];
            if(prospect>biggest){
            biggest = prospect;
        }
    }
    return biggest;
    }

    }
        
    