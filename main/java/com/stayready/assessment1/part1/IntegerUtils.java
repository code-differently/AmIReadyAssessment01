package com.stayready.assessment1.part1;

public class IntegerUtils {
    /**
     * @param n integer value input by client
     * @return the sum of all integers between 0 and not including `n`
     */
    //Confused
    public static Integer getSumOfN(Integer n) {
        int result = 0;
        for (int x = 1; n <= n; x++)
        result += getSumOfN(x);
        return result;
    }

    /**
     * @param val integer value input by client
     * @return integer with identical digits in the reverse order
     */
    //Ehhh
    public static Integer reverseDigits(Integer val) {
        int rev_val = 0;
        while (val > 0)
        {
            rev_val = rev_val * 10 + val % 10;
            val = val / 10;
        }
        return rev_val;
    }

    /**
     * @param val integer value input by client
     * @return true if the integer is even and false if it is not even.
     */
    public static Boolean isEven(Integer val) {
        return null;
    }
}

