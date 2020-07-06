package com.stayready.assessment1.part1;

public class IntegerUtils {
    /**
     * @param n integer value input by client
     * @return the sum of all integers between 0 and not including `n`
     */
    public static Integer getSumOfN(Integer n) {
        return null;
    }

    /**
     * @param val integer value input by client
     * @return integer with identical digits in the reverse order
     */
    public static Integer reverseDigits(Integer val) {
        int num = 12345;
        int reversed = 0;

        while(num != 0){
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }
        System.out.println("Reserved Number: " + reversed);
        return reversed;
    }

    /**
     * @param val integer value input by client
     * @return true if the integer is even and false if it is not even.
     */
    public static Boolean isEven(Integer val) {
        int num = 6;
        if (num % 2 == 0){
            System.out.println("The given number "+num+" is Even ");
        }else{
            System.out.println("The given number "+num+" is Odd ");
        }
        return true;
    }

    public static Boolean isEven2(Integer val) {
        int num1 = 7;
        if(num1 % 2 == 0){
            System.out.println("The given number "+num1+" is Even ");
        }else{
            System.out.println("The given number "+num1+" is Odd ");
        }
        return false;
    }
}

