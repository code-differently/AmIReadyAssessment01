package com.stayready.assessment1.part1;
import java.util.Arrays;

public class IntegerArrayUtils {
    /**
     * @param intArray an array of integers
     * @return the sum of `intArray`
     */
    public static Integer getSum(Integer[] intArray) {
        int arr[] = {1, 4, 5, 7};
        int sum = 0;
        int i;
        for (i = 0; i < arr.length; i++)
            sum += arr[i];
        return sum;
    }

    /**
     * @param intArray an array of integers
     * @return the product of `intArray`
     */
    //Not sure how to do this 
    public static Integer getProduct(Integer[] intArray) {
        int ar[] = {1, 4, 5, 7};
        int n = ar.length; 
        int total = 1;
        for (int i = 0; i < n; i++);
        total = total * ar[i];
        return total;
        
        //or 
        int numbers = 1;{
            for (int i: intArray){
                numbers *=i;
            }
                return numbers;
        }

    }

    /**
     * @param intArray an array of integers
     * @return the sum of `intArray` divided by number of elements in `intArray`
     */
    public static Double getAverage(Integer[] intArray) {
        return null;
    }

    /**
     * @param intArray an array of integers
     * @return the largest integer in intArray
     */
    public static Integer getLargest(Integer[] intArray) {
        int arr[] = {40, 60, 70, 80, 1000};
        int i;
        int largest = arr[0];
        for (i =1; i < arr.length; i++)
        if (arr[i] > largest)
        largest = arr[i];
        return largest;
    }
}
