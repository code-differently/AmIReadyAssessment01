package com.stayready.assessment1.part1;

public class BasicStringUtils {
    /**
     * @param str string input from client
     * @return string with identical content, and the first character capitalized
     */
    public static String camelCase(String str)
    {
        String s[] = str.split(" ");
        String finalRes = "";
        for(int i = 0; i < s.length; i++)
        {
            finalRes = finalRes + " " + properCamel(s[i]);

        }
        //erg, had to remove the front space
        return finalRes.substring(1);
    }
    public static String properCamel(String s)
    {
        return s.substring(0, 1).toUpperCase() + s.substring(1).toLowerCase();
    }

    /**
     * @param str string input from client
     * @return string with identical contents, in the reverse order
     */
    public static String reverse(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    /**
     * @param str string input from client
     * @return string with identical contents, with each word individually in reverse order
     */
    public static String reverseWords(String str) {
        
        String[] s = str.split(" ");
        String ret = "";
        for(int i = 0; i < s.length; i++)
        {
            ret += " " + new StringBuilder(s[i]).reverse().toString();
        }

        return ret.substring(1);
    }

    /**
     * @param str string input from client
     * @return string with identical contents, in reverse order, with first character capitalized
     */
    public static String reverseThenCamelCase(String str)
    {
        //i vommited at this code, i know there was a better way, had a mental block
        String finalArr = "";
        String s[] = str.split(" ");

        for(int i = 0; i < s.length; i++)
        {
            finalArr += " " + properCamel(new StringBuilder(s[i]).reverse().toString());
        }
        String crap[] = finalArr.split(" ");
        String realFinal = "";
        for(int i = crap.length - 1; i > 0; i--)
        {
            realFinal += " " +crap[i];
        }
        return realFinal.substring(1);
    }


    /**
     * @param str a string input from user
     * @return string with identical contents excluding first and last character
     */
    public static String removeFirstAndLastCharacter(String str) {
        return str.substring(1, str.length() - 1);
    }

    /**
     * @param str a string input from user
     * @return string with identical characters, each with opposite casing
     */
    public static String invertCasing(String str) {
        char[] arr = str.toCharArray();

        for(int i = 0; i < arr.length; i++)
        {
            arr[i] = Character.isUpperCase(arr[i]) ? Character.toLowerCase(arr[i]) : Character.toUpperCase(arr[i]);
        }

        return new String(arr);
    }

}
