package com.stayready.assessment1.part1;

public class IntegerArrayUtils {
    /**
     * @param intArray an array of integers
     * @return the sum of `intArray`
     */
    public static Integer getSum(Integer[] intArray) {
        int sum = 0;

        for(int i=0; i<intArray.length; i++){
            sum += intArray[i];
        }
        return sum;
    }

    /**
     * @param intArray an array of integers
     * @return the product of `intArray`
     */
    public static Integer getProduct(Integer[] intArray) {
        int multi = 1;

        for(int i=0; i<intArray.length; i++){
            multi = multi*intArray[i];
        }
        return multi;
    }

    /**
     * @param intArray an array of integers
     * @return the sum of `intArray` divided by number of elements in `intArray`
     */
    public static Double getAverage(Integer[] intArray) {
        double prod = 1;
        double size = intArray.length;

        for(int i=0; i<intArray.length; i++){
            prod = prod*intArray[i];
        }
        double avg = prod/size;
        return avg;
    }

    /**
     * @param intArray an array of integers
     * @return the largest integer in intArray
     */
    public static Integer getLargest(Integer[] intArray) {
        int large = intArray[0];

        for(int i=0; i<intArray.length; i++){
            if(intArray[i] > large)
                large = intArray[i];
        }
        return large;
    }
}
