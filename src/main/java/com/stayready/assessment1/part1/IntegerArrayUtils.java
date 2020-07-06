package com.stayready.assessment1.part1;

public class IntegerArrayUtils {
    /**
     * @param intArray an array of integers
     * @return the sum of `intArray`
     */
    public static Integer getSum(Integer[] intArray) {
        int a = 0;
        for(int i : intArray){
            a = Integer.sum(a, i);
        }
        return a;
    }

    /**
     * @param intArray an array of integers
     * @return the product of `intArray`
     */
    public static Integer getProduct(Integer[] intArray) {
        int a = intArray[0];
        for(int i = 1; i < intArray.length ;i++){
            a *= intArray[i];
        }
        return a;
    }

    /**
     * @param intArray an array of integers
     * @return the sum of `intArray` divided by number of elements in `intArray`
     */
    public static Double getAverage(Integer[] intArray) {
        return (double) (getSum(intArray)/intArray.length);
    }

    /**
     * @param intArray an array of integers
     * @return the largest integer in intArray
     */
    public static Integer getLargest(Integer[] intArray) {
        int a = 0;
        if(intArray.length == 1){
            return intArray[0];
        }
        else if(intArray.length == 2){
           return Integer.max(intArray[0], intArray[1]);
        }
        else{
            
            for(int i : intArray){
                a = Integer.max(a, intArray[i-1]);
            }
        }
        return a;
    }
}
