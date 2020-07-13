package com.stayready.assessment1.part1;

import static org.junit.Assume.assumeNoException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class IntegerArrayUtils {
    /**
     * @param intArray an array of integers
     * @return the sum of `intArray`
     */
    public static Integer getSum(Integer[] intArray) {
        Integer finalSum = 0; 
        for(Integer I : intArray) 
        {
            finalSum += I;
        }

        return finalSum;
    }

    /**
     * @param intArray an array of integers
     * @return the product of `intArray`
     */
    public static Integer getProduct(Integer[] intArray)
    {
        Integer finalProd = 1;
        for(Integer I : intArray)
        {
            finalProd *= I;
        }

        return finalProd;
    }

    /**
     * @param intArray an array of integers
     * @return the sum of `intArray` divided by number of elements in `intArray`
     */
    public static Double getAverage(Integer[] intArray)
    {

        Double getSum = 0.0;
        for(Integer i : intArray)
        {
            getSum += i;
        }

        return getSum / intArray.length;
    }

    /**
     * @param intArray an array of integers
     * @return the largest integer in intArray
     */
    public static Integer getLargest(Integer[] intArray)
    {
        ArrayList<Integer> arrList = new ArrayList<Integer>(Arrays.asList(intArray));
        Collections.sort(arrList);
        return arrList.get(arrList.size() - 1);
    }
}
