package com.stayready.assessment1.part1;

import java.lang.reflect.Array;
import java.lang.StringBuilder;

public class IntegerUtils {
    /**
     * @param n integer value input by client
     * @return the sum of all integers between 0 and not including `n`
     */
    public static Integer getSumOfN(Integer n) {
        int sum=0;
        for(int i=0;i<n;i++)
            sum+=i;
        return sum;
    }

    /**
     * @param val integer value input by client
     * @return integer with identical digits in the reverse order
     */
    public static Integer reverseDigits(Integer val) {
        StringBuilder reverseS= new StringBuilder();
        reverseS.append(Integer.toString(val));
        reverseS.reverse();
        Integer result=Integer.parseInt(reverseS.toString());
        return result;
    }

    /**
     * @param val integer value input by client
     * @return true if the integer is even and false if it is not even.
     */
    public static Boolean isEven(Integer val) {
        return val%2==0 ? true:false;
    }
}

