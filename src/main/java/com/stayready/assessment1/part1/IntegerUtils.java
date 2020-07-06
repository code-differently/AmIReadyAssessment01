package com.stayready.assessment1.part1;

public class IntegerUtils {
    /**
     * @param n integer value input by client
     * @return the sum of all integers between 0 and not including `n`
     */
    public static Integer getSumOfN(Integer n) {
        int sumNotIncludingN = 0;
        for(int i = 0; i < n; i++) {
            sumNotIncludingN += i;
        }
        return sumNotIncludingN;
    }

    /**
     * @param val integer value input by client
     * @return integer with identical digits in the reverse order
     */
    public static Integer reverseDigits(Integer val) {
        String strAns = "";
        //string version of Integer val 
        String strVersion = Integer.toString(val);
        for(int i = 0; i < strVersion.length(); i++) {
            //putting what the string was at the end and putting new stuff at the beginning
            strAns = strVersion.charAt(i) + strAns;
        }
        int actualAns = Integer.valueOf(strAns);
        return actualAns;
    }

    /**
     * @param val integer value input by client
     * @return true if the integer is even and false if it is not even.
     */
    public static Boolean isEven(Integer val) {
        if(val % 2 == 0) {
            return true;
        }
        else {
            return false;
        }
    }
}

