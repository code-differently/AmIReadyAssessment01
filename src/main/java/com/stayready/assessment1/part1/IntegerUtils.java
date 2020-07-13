package com.stayready.assessment1.part1;

public class IntegerUtils {
    /**
     * @param n integer value input by client
     * @return the sum of all integers between 0 and not including `n`
     */
    public static Integer getSumOfN(Integer n)
    {
        int i = 0;
        while(i < n)
        {
            i++;
        }

        return i + i;
    }

    /**
     * @param val integer value input by client
     * @return integer with identical digits in the reverse order
     */
    public static Integer reverseDigits(Integer val) {
        if(val == null)
        {
            return -1;
        }
        String s = val+"";
        StringBuilder revedUp = new StringBuilder(s).reverse();
        return Integer.parseInt(revedUp.toString());
    }

    /**
     * @param val integer value input by client
     * @return true if the integer is even and false if it is not even.
     */
    public static Boolean isEven(Integer val) {
        return val % 2 == 0 ? true : false;
    }
}

