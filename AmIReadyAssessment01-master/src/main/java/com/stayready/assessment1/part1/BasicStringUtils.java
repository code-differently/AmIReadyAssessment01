package com.stayready.assessment1.part1;

import com.stayready.assessment1.part2.StringUtils;

public class BasicStringUtils {
    /**
     * @param str string input from client
     * @return string with identical content, and the first character capitalized
     */
    public static String camelCase(String str) {
        String b = str.substring(0,1);
        b = b.toUpperCase();
        String s = str.substring(1);
        System.out.println(s);
        System.out.println(b);
        return b+s;
    }

    /**
     * @param str string input from client
     * @return string with identical contents, in the reverse order
     */
    public static String reverse(String str) {
        char arr[] = str.toCharArray();
        char newarr[] = arr.clone();
        int d = arr.length ;
        for(int i=arr.length-1; i>0; i--){
            newarr[i] = arr[d];
            d++;
        }
        return newarr.toString();
    }

    /**
     * @param str string input from client
     * @return string with identical contents, with each word individually in reverse order
     */
    public static String reverseWords(String str) {
        return null;
    }

    /**
     * @param str string input from client
     * @return string with identical contents, in reverse order, with first character capitalized
     */
    public static String reverseThenCamelCase(String str) {
        return null;
    }


    /**
     * @param str a string input from user
     * @return string with identical contents excluding first and last character
     */
    public static String removeFirstAndLastCharacter(String str) {
        return null;
    }

    /**
     * @param str a string input from user
     * @return string with identical characters, each with opposite casing
     */
    public static String invertCasing(String str) {
        return null;
    }

}
