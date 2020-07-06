package com.stayready.assessment1.part1;

public class IntegerUtils {
    /**
     * @param n integer value input by client
     * @return the sum of all integers between 0 and not including `n`
     */
    public static Integer getSumOfN(Integer n) {
        int sum=0;

        for(int i=0; int<n;i++)
            sum += i;
            
        return sum;

    }

    /**
     * @param val integer value input by client
     * @return integer with identical digits in the reverse order
     */
    public static Integer reverseDigits(Integer val) {
        int rev=0;

        while(val != 0){
            int numbers = val % 10;//seperate last digit
            rev = rev * 10 + numbers;//increase digit
            val /= 10;//drops last digit
        }
        return rev;
    }

    /**
     * @param val integer value input by client
     * @return true if the integer is even and false if it is not even.
     */
    public static Boolean isEven(Integer val) {
        if(val%2 == 1)
            return false;
        return true;
    }
}

