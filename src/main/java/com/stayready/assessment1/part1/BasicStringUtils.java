package com.stayready.assessment1.part1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class BasicStringUtils {
    /**
     * @param str string input from client
     * @return string with identical content, and the first character capitalized
     */
    public static String camelCase(String str) 
    {
        String words[] = str.split("\\s");
        String capitalWord = "";
        for(String w:words)
        {
            String first = w.substring(0,1);
            String afterString = w.substring(1);
            capitalWord+= first.toUpperCase() + afterString+" ";
        }

        return capitalWord.trim();
    }

    /**
     * @param str string input from client
     * @return string with identical contents, in the reverse order
     */
    public static String reverse(String str) {
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        return sb.toString();
    }

    /**
     * @param str string input from client
     * @return string with identical contents, with each word individually in reverse order
     */
    public static String reverseWords(String str) {
        StringBuilder reverseString = new StringBuilder();
        String [] words = str.split(" ");
        for(String word: words)
        {
            String reverseWord = new StringBuilder(word).reverse().toString();
            reverseString.append(reverseWord + " ");
        }
        return reverseString.toString().trim(); 
    }

    /**
     * @param str string input from client
     * @return string with identical contents, in reverse order, with first character capitalized
     */
    public static String reverseThenCamelCase(String str) {

       /* String reversewords = " ";
        String[] array = str.split(" ");
        int len = array.length -1;
        for(int i= len; i>=0; i--)
        {
            reversewords = reversewords +array[i]+ " ";
        }*/
      String reverse = BasicStringUtils.reverse(str);
        String thenCC = BasicStringUtils.camelCase(reverse);
      return thenCC;
    }


    /**
     * @param str a string input from user
     * @return string with identical contents excluding first and last character
     */
    public static String removeFirstAndLastCharacter(String str) {
        String [] arryOfStrings = str.split(" ");
        String result = " ";
        result += str.substring(1, str.length() -1);
        return result.trim();
    }

    /**
     * @param str a string input from user
     * @return string with identical characters, each with opposite casing
     */
    public static String invertCasing(String str) {
        char [] chararry = str.toCharArray();
        String something = "";
        for (int i = 0; i<str.length(); i++)
        {
            if(Character.isUpperCase(chararry[i]))
            {
                chararry[i] = Character.toLowerCase(chararry[i]);
            }
            else if(Character.isLowerCase(chararry[i]))
            {
                chararry[i]= Character.toUpperCase(chararry[i]);
            }
            something += chararry[i];
        }
        return something;
    }

}
