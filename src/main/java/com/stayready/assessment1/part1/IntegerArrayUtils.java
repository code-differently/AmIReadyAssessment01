package com.stayready.assessment1.part1;

public class IntegerArrayUtils {
    /**
     * @param intArray an array of integers
     * @return the sum of `intArray`
     */
    public static Integer getSum(Integer[] intArray) {
        Integer mySum = 0;
        for (Integer x : intArray){
            mySum += x;
        }
        return mySum;
    }

    /**
     * @param intArray an array of integers
     * @return the product of `intArray`
     */
    public static Integer getProduct(Integer[] intArray) {
        Integer myProduct = 1;
        for(Integer i = 0; i < intArray.length; i++){
            myProduct = myProduct * intArray[i];
        }
        return myProduct;
    }

    /**
     * @param intArray an array of integers
     * @return the sum of `intArray` divided by number of elements in `intArray`
     */
    public static Double getAverage(Integer[] intArray) {
        Double mySum = 0.0;
        Integer arr_length = intArray.length;
        for (Integer x : intArray){
            mySum += x;
        }
        return mySum / arr_length;
    }

    /**
     * @param intArray an array of integers
     * @return the largest integer in intArray
     */
    public static Integer getLargest(Integer[] intArray) {
        int n = intArray.length;
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                if (intArray[j] < intArray[j+1])
                {
                    // swap temp and arr[i]
                    int temp = intArray[j];
                    intArray[j] = intArray[j+1];
                    intArray[j+1] = temp;
                }
        return intArray[0];
        }
}
