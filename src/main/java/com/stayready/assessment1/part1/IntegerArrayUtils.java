package com.stayready.assessment1.part1;

public class IntegerArrayUtils {
    /**
     * @param intArray an array of integers
     * @return the sum of `intArray`
     */
    public static Integer getSum(Integer[] intArray) {
        int sum = 0;
        for (int i : intArray) {
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
        for (int i : intArray) {
            product *= i;
        }
        return product;
    }

    /**
     * @param intArray an array of integers
     * @return the sum of `intArray` divided by number of elements in `intArray`
     */
    public static Double getAverage(Integer[] intArray) {
        int sum = 0;
        for (int i : intArray) {
            sum += i;
        }
        sum = sum / intArray.length;
        return (double) sum;
    }

    /**
     * @param intArray an array of integers
     * @return the largest integer in intArray
     */
    public static Integer getLargest(Integer[] intArray) {
        int maxValue = intArray[0];
        for (int i = 0; i < intArray.length; i++) {
            if (intArray[i] > maxValue) {
                maxValue = intArray[i];
            }
        }
        return maxValue;
    }
}
