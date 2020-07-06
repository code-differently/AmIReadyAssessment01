package com.stayready.assessment1.part1;

public class IntegerArrayUtils {
    /**
     * @param intArray an array of integers
     * @return the sum of `intArray`
     */
    public static Integer getSum(Integer[] intArray) {
        int sum = 0;
        for (int i = 0; i < intArray.length; i++) {
            sum += intArray[i];
        }
        return sum;
    }

    /**
     * @param intArray an array of integers
     * @return the product of `intArray`
     */
    public static Integer getProduct(Integer[] intArray) {
        int product = intArray[0];
        for (int i = 1; i < intArray.length; i++) {
            product *= intArray[i];
        }
        return product;
    }

    /**
     * @param intArray an array of integers
     * @return the sum of `intArray` divided by number of elements in `intArray`
     */
    public static Double getAverage(Integer[] intArray) {
        int sum = 0;
        int count = 0;
        for (int i = 0; i < intArray.length; i++) {
            sum += intArray[i];
            count++;
        }

        double average = sum / count;
        return average;
    }

    /**
     * @param intArray an array of integers
     * @return the largest integer in intArray
     */
    public static Integer getLargest(Integer[] intArray) {

        int largest = intArray[0];
        for (int i = 1; i < intArray.length; i++) {
            if (intArray[i] > largest)
            largest = intArray[i];
        }
        return largest;
    }
}
