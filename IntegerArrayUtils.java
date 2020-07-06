package com.stayready.assessment1.part1;

public class IntegerArrayUtils {
    /**
     * @param intArray an array of integers
     * @return the sum of `intArray`
     */
    public static Integer getSum(Integer[] intArray) {
        int[] array = { 1, 2, 3, 4, 5};
        int sum = 0;
        for (int num : array){
            sum = sum+num;
        }
        System.out.println("Sum of array elements is: " +sum);
        return sum;
    }

    /**
     * @param intArray an array of integers
     * @return the product of `intArray`
     */
    public static Integer getProduct(Integer[] intArray, int ar[], int n) {
        int result = 1;
        for(int i = 0; i < n; i++);
        result = (result * ar[i]);
        return result;
        
        int[] ar[] = { 1, 2, 3, 4, 5};
        int n = intArray.length;

        }
        System.out.printf("%d", product(intArray, n));
        return product;
    }

    /**
     * @param intArray an array of integers
     * @return the sum of `intArray` divided by number of elements in `intArray`
     */
    public static Double getAverage(Integer[] intArray) {
        double array[] = { 1, 2, 3, 4, 5};
        double total = 0;

        for (int i = 0; i < array.length; i++){
            total = total + array[i];
        }

        double average = total/array.length;
        System.out.format("The average is: %.3f", average);
        return average;
    }

    /**
     * @param intArray an array of integers
     * @return the largest integer in intArray
     */
    public static Integer getLargest(Integer[] intArray, int total) {
        
        return null;
    }
}
