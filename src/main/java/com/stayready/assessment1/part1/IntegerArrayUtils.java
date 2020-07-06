package com.stayready.assessment1.part1;


public class IntegerArrayUtils {
    /**
     * @param intArray an array of integers
     * @return the sum of `intArray`
     */
    public static Integer getSum(Integer[] intArray) {
        int value = 0;
        for(int i : intArray) {
            value += intArray[i];
        }
        return value;
    }

    /**
     * @param intArray an array of integers
     * @return the product of `intArray`
     */
    public static Integer getProduct(Integer[] intArray) {
        int value = 1;
        for(int i: intArray) {
            value *= intArray[i];
        }
        return value;
    }

    /**
     * @param intArray an array of integers
     * @return the sum of `intArray` divided by number of elements in `intArray`
     */
    public static Double getAverage(Integer[] intArray) {
        double value = 0;
        for(int i : intArray) {
            getSum(intArray);
        }
        value = getSum(intArray) / intArray.length;

        return value;
    }

    /**
     * @param intArray an array of integers
     * @return the largest integer in intArray
     */
    public static Integer getLargest(Integer[] intArray) {
        int value = 0;
        for(int i : intArray) {
            if(intArray[1]>value ){
                value = intArray[i];
            }
        }
        return value;
    }
}
