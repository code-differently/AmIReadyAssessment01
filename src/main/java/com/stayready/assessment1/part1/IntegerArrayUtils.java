package com.stayready.assessment1.part1;

public class IntegerArrayUtils {
    /**
     * @param intArray an array of integers
     * @return the sum of `intArray`
     */
    public static Integer getSum(Integer[] intArray) {
        int sum = 0; 
        for(int i = 0; i <= intArray.length-1; i++){
            sum = sum + intArray[i];
        } 
        return sum;
    }

    /**
     * @param intArray an array of integers
     * @return the product of `intArray`
     */
    public static Integer getProduct(Integer[] intArray) {
        int product = intArray[0]; 
        for(int i = 1; i <= intArray.length-1; i++){
            product = product * intArray[i];
        } 
        return product;
    }

    /**
     * @param intArray an array of integers
     * @return the sum of `intArray` divided by number of elements in `intArray`
     */
    public static Double getAverage(Integer[] intArray) {
            int divisor = intArray.length;
            int sum = 0; 
            for(int i = 0; i <= intArray.length-1; i++){
                sum = sum + intArray[i];
            } 
            Double quotient = (double) sum / divisor;
            return quotient;
        }
    
    

    /**
     * @param intArray an array of integers
     * @return the largest integer in intArray
     */
    public static Integer getLargest(Integer[] intArray) {
        int largest = intArray[0];
        int i = 1;
        while (i != intArray.length){
            if(intArray[i] > largest){
                largest = intArray[i];
            }
            i += 1;
        } 
        return largest;
    }
}
