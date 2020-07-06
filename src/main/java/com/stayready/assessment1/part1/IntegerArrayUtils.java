package com.stayready.assessment1.part1;

public class IntegerArrayUtils {
    /**
     * @param intArray an array of integers
     * @return the sum of `intArray`
     */
    public static Integer getSum(Integer[] intArray) {
        int sum = 0;
        for (Integer num : intArray) {
            sum += num;
        }
        return sum;
    }

    /**
     * @param intArray an array of integers
     * @return the product of `intArray`
     */
    public static Integer getProduct(Integer[] intArray) {
        int product = 1;
        for (Integer num : intArray) {
            product *= num;
        }
        return product;
    }

    /**
     * @param intArray an array of integers
     * @return the sum of `intArray` divided by number of elements in `intArray`
     */
    public static Double getAverage(Integer[] intArray) {
        int sum = 0;
        int numCount = 0;
        double average = 0;
        for (Integer num : intArray) {
            sum += num;
            numCount++;
        }
        average = sum / numCount;
        return average;
    }

    /**
     * @param intArray an array of integers
     * @return the largest integer in intArray
     */
    public static Integer getLargest(Integer[] intArray) {
        int largest = intArray[0];
        for (Integer num : intArray) {
            if (largest < num) {
                largest = num;
            }
        }
        return largest;
    }
}
