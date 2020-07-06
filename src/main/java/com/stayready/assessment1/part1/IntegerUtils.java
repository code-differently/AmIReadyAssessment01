package com.stayready.assessment1.part1;

public class IntegerUtils {
    /**
     * @param n integer value input by client
     * @return the sum of all integers between 0 and not including `n`
     */
    public static Integer getSumOfN(Integer n) {
        
        int ans = 0;
        for (int i = 0; i < n; i++){
            
            ans += i;
        }
        
        
        return ans;
    }

    /**
     * @param val integer value input by client
     * @return integer with identical digits in the reverse order
     */
    public static Integer reverseDigits(Integer val) {

        int temp = 0;
        while(val != 0) {
            int remd = val % 10;
            temp = temp * 10 + remd;
            val /= 10;
         }
        return temp;
    }

    /**
     * @param val integer value input by client
     * @return true if the integer is even and false if it is not even.
     */
    public static Boolean isEven(Integer val) {

        if (val % 2 == 0){

            return true;
        } else {

            return false;
        }
        
    }
}

