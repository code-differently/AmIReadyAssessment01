package com.stayready.assessment1.part2;

import java.util.ArrayList;

public class MultiplesDeleter{
    /**
     * @param ints array of Integer objects
     * @return all ints which are not divisible by 2
     * given an array of integers, named `ints` return an identical array with evens removed
     */
    public static Integer[] deleteEvens(Integer[] ints) {

        int evenNumbers = 0;
        for(int current : ints){
            if(current % 2 == 0)
                evenNumbers++;
        }

        Integer[] oddArray = new Integer[(ints.length - evenNumbers)];
        int oddIndex = 0;

        for(int i = 0; i < ints.length; i++){
            if(ints[i] % 2 != 0)
                oddArray[oddIndex++] = ints[i];
        }

        return oddArray;
    }

    /**
     * @param ints array of Integer objects
     * @return all ints which are divisible by 2
     * given an array of integers, named `ints` return an identical array with odds removed
     */
    public static Integer[] deleteOdds(Integer[] ints) {
        int oddNumbers = 0;
        for(int current : ints){
            if(current % 2 != 0)
            oddNumbers++;
        }

        Integer[] evenArray = new Integer[(ints.length - oddNumbers)];
        int evenIndex = 0;

        for(int i = 0; i < ints.length; i++){
            if(ints[i] % 2 == 0)
                evenArray[evenIndex++] = ints[i];
        }

        return evenArray;
    }

    /**
     * @param ints array of Integer objects
     * @return all ints which are not divisible by 3
     * given an array of integers, named `ints` return an identical array with numbers indivisible by 3 removed
     */
    public static Integer[] deleteMultiplesOf3(Integer[] ints) {

        int count = 0;
        for(int current : ints){
            if(current % 3 == 0)
                count++;
        }

        Integer[] newArray = new Integer[(ints.length - count)];
        int curentIndex = 0;

        for(int i = 0; i < ints.length; i++){
            if(ints[i] % 3 != 0)
                newArray[curentIndex++] = ints[i];
        }

        return newArray;
    }

    /**
     * @param ints array of Integer objects
     * @param multiple the multiple to evaluate divisibility against
     * @return all ints which are not divisible by the `multiple` specified
     * given an array of integers, named `ints` return an identical array with numbers indivisible by `multiple` removed
     */
    public static Integer[] deleteMultiplesOfN(Integer[] ints, int multiple) {
        
        int count = 0;
        for(int current : ints){
            if(current % multiple == 0)
                count++;
        }

        Integer[] newArray = new Integer[(ints.length - count)];
        int curentIndex = 0;

        for(int i = 0; i < ints.length; i++){
            if(ints[i] % multiple != 0)
                newArray[curentIndex++] = ints[i];
        }

        return newArray;
    }
}
