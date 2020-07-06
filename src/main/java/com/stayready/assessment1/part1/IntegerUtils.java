package com.stayready.assessment1.part1;

public class IntegerUtils {
    /**
     * @param n integer value input by client
     * @return the sum of all integers between 0 and not including `n`
     */
    public static Integer getSumOfN(Integer n) {
        return n + n;
    }

    /**
     * @param val integer value input by client
     * @return integer with identical digits in the reverse order
     */
    public static Integer reverseDigits(Integer val) {
        String backwards = "";
        String n = val.toString();
        for (int i = n.length()-1; i >=0; i--){
            backwards += n.charAt(i);
        }
        return Integer.parseInt(backwards);
    }

    /**
     * @param val integer value input by client
     * @return true if the integer is even and false if it is not even.
     */
    public static Boolean isEven(Integer val) {
        if(val % 2 == 0){
            return true;
        }
        return false;
    }
}

