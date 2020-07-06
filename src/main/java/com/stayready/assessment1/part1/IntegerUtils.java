package com.stayready.assessment1.part1;

public class IntegerUtils {
    /**
     * @param n integer value input by client
     * @return the sum of all integers between 0 and not including `n`
     */
    public static Integer getSumOfN(Integer n) {
        Integer sum = 0;
        for (Integer i = 1; i < n; i++){
            sum += i;
        }
        return sum;
    }

    /**
     * @param val integer value input by client
     * @return integer with identical digits in the reverse order
     */
    public static Integer reverseDigits(Integer val) {
        Integer reverse = 0;
        while (val != 0){
            Integer digit = val % 10;
            reverse = reverse * 10 + digit;
            val /= 10;
        }
        return val;
    }

    /**
     * @param val integer value input by client
     * @return true if the integer is even and false if it is not even.
     */
    public static Boolean isEven(Integer val) {
        if (val % 2 == 0){
            return true;
        }
        return false;
    }
}

