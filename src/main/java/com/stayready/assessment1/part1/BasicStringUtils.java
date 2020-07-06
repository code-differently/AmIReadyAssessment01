package com.stayready.assessment1.part1;

public class BasicStringUtils {
    /**
     * @param str string input from client
     * @return string with identical content, and the first character capitalized
     */
    public static String camelCase(String str) {
        String letters[] = str.split("\\s");
        String upperLetter = "";
        for(String w:letters){
            String firstLetter = w.substring(0,1);
            String nextLetter = w.substring(1);
            upperLetter += firstLetter.toUpperCase()+ nextLetter + " ";
        }
        return upperLetter.trim();
    }

    /**
     * @param str string input from client
     * @return string with identical contents, in the reverse order
     */
    public static String reverse(String str) {
        if((str == null) || (str.length() <= 1)){
            return str; 
        }    
        return reverse(str.substring(1)) + str.charAt(0);  
    }

    /**
     * @param str string input from client
     * @return string with identical contents, with each word individually in reverse order
     */
    public static String reverseWords(String str) {
        String letters[]=str.split("\\s");  
        String backwards="";  
        for(String w:letters){  
            StringBuilder sb=new StringBuilder(w);  
            sb.reverse();  
            backwards+=sb.toString()+" ";  
        }
        return backwards.trim();
    }

    /**
     * @param str string input from client
     * @return string with identical contents, in reverse order, with first character capitalized
     */
    public static String reverseThenCamelCase(String str) {
        String myString = "";
        myString = myString + camelCase(reverse(str));
        return myString;

    }


    /**
     * @param str a string input from user
     * @return string with identical contents excluding first and last character
     */
    public static String removeFirstAndLastCharacter(String str) {
        return str.substring(1, str.length()-1);
    }

    /**
     * @param str a string input from user
     * @return string with identical characters, each with opposite casing
     */
    public static String invertCasing(String str) 
    {
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++)
        {
            char c = chars[i];
            if (Character.isUpperCase(c))
            {
                chars[i] = Character.toLowerCase(c);
            }
            else if (Character.isLowerCase(c))
            {
                chars[i] = Character.toUpperCase(c);
            }
    }
    return new String(chars);
}
}
