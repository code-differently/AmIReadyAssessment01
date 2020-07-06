package com.stayready.assessment1.part1;

public class IntegerArrayUtils {
    /**
     * @param intArray an array of integers
     * @return the sum of `intArray`
     */
    public static Integer getSum(Integer[] intArray) {
        int sum = 0;
        for(int element: intArray) {
            sum += element;
        }
        return sum;
    }

    /**
     * @param intArray an array of integers
     * @return the product of `intArray`
     */
    public static Integer getProduct(Integer[] intArray) {
        //you don't want to multiply by zero
        int product = 1;
        for(int element: intArray) {
            product *= element;
        }
        return product;
    }

    /**
     * @param intArray an array of integers
     * @return the sum of `intArray` divided by number of elements in `intArray`
     */
    public static Double getAverage(Integer[] intArray) {
        //using casting from int to double so that the returned value will be a double
        double sum = 0.0, numElements = 0.0;
        for(int element: intArray) {
            sum += element;
            numElements++;
        }
        
        return sum/numElements;
    }

    /**
     * @param intArray an array of integers
     * @return the largest integer in intArray
     */
    public static Integer getLargest(Integer[] intArray) {
        int max = 0;
        for(int element : intArray) {
            if(max < element) {
                max = element;
            }
        }
        return max;
    }
}
