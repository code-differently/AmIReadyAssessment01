package com.stayready.assessment1.part1;

public class IntegerArrayUtils {
    /**
     * @param intArray an array of integers
     * @return the sum of `intArray`
     */
    public static Integer getSum(Integer[] intArray) {
        int[] array = {1, 2, 3, 4, 5};
        int sum = 0;
        for( int num : array) {
            sum = sum+num;
        }
        System.out.println("Sum of array elements is:"+sum);
        return sum; 
     }


    /**
     * @param intArray an array of integers
     * @return the product of `intArray`
     */
    public static Integer getProduct(Integer[] intArray) {
        int[] array = {1, 2, 3, 4, 5};
        int sum = 1;
        for( int num : array) {
            sum = sum*num;
        }
        System.out.println("Sum of array elements is:"+sum);
        return sum; 
     }

        

    /**
     * @param intArray an array of integers
     * @return the sum of `intArray` divided by number of elements in `intArray`
     */
    public static int getAverage(Integer[] intArray) {
        double average(int a[], int n); 
    { 
          
       
        int sum = 0; 
          
        for (int i = 0; i < n; i++) 
            sum += a[i]; 
      
        return sum / n; 
    } 
      
    
    public static void main (String[] args) 
    { 
          
        int arr[] = {10, 2, 3, 4, 5, 6, 7, 8, 9}; 
        int n = arr.length; 
      
        System.out.println(average(arr, n)); 
    } 
} 
          
    
       


     private static char[] average(int[] arr, int n) {
         return null;
     }

     /**
      * @param intArray an array of integers
      * @return the largest integer in intArray
      */
    public static Integer getLargest(Integer[] intArray) {
        return null;
    }
}
