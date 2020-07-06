package com.stayready.assessment1.part1;
import java.lang.StringBuilder;

public class BasicStringUtils {
    /**
     * @param str string input from client
     * @return string with identical content, and the first character capitalized
     */
    public static String camelCase(String str) {
        String[] array=str.split("");
        String result=array[0].toUpperCase();
        for (int i = 1; i < array.length; i++) {
            if(array[i-1].equals(" "))
                result+=array[i].toUpperCase();
            else    
                result+=array[i];
        }
        return result;
    }

    /**
     * @param str string input from client
     * @return string with identical contents, in the reverse order
     */
    public static String reverse(String str) {
        StringBuilder string= new StringBuilder();
        string.append(str);
        return string.reverse().toString();

    }

    /**
     * @param str string input from client
     * @return string with identical contents, with each word individually in reverse order
     */
    public static String reverseWords(String str) {
        String[] array=str.split(" ");
        StringBuilder string= new StringBuilder();
        for (int i = 0; i < array.length; i++) {
            string.append(reverse(array[i]));
            if(i!=array.length-1)
                string.append(" ");
        }
        return string.toString();
        
    }

    /**
     * @param str string input from client
     * @return string with identical contents, in reverse order, with first character capitalized
     */
    public static String reverseThenCamelCase(String str) {
        return camelCase(reverse(str));
    }


    /**
     * @param str a string input from user
     * @return string with identical contents excluding first and last character
     */
    public static String removeFirstAndLastCharacter(String str) {
        return str.substring(1,str.length()-1);
    }

    /**
     * @param str a string input from user
     * @return string with identical characters, each with opposite casing
     */
    public static String invertCasing(String str) {
        String[] array=str.split(" ");
        String result="";
        for (int i = 0; i < array.length; i++) {
            char[] word=array[i].toCharArray();
            for(char letter : word){
                if(Character.isUpperCase(letter))
                    result+=Character.toLowerCase(letter);
                else
                    result+=Character.toUpperCase(letter);
            }
            if(i!=array.length-1)
                result+=" ";
        }
        return result;
    }

}
