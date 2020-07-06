package com.stayready.assessment1.part1;

public class BasicStringUtils {
    /**
     * @param str string input from client
     * @return string with identical content, and the first character capitalized
     */
    public static String camelCase(String str) {
        String newString = "";
        newString += str.substring(0,1).toUpperCase();
        int length = str.length();

        for(int i = 1; i <= length-1; i++){
            char ch = str.charAt(i);
            if (ch == ' ') {
                newString += " " + str.substring(i + 1, i + 2).toUpperCase();
                i += 1;
            } else {
                newString += str.substring(i, i + 1);
            }
        }
        return newString;
    }

    /**
     * @param str string input from client
     * @return string with identical contents, in the reverse order
     */
    public static String reverse(String str) {
        StringBuilder input1 = new StringBuilder(); 
        input1.append(str); 
        input1 = input1.reverse(); 
        return input1.toString();
    }

    /**
     * @param str string input from client
     * @return string with identical contents, with each word individually in reverse order
     */
    public static String reverseWords(String str) {
        String[] words = str.split(" ");
        String reversedString = "";
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            String reverseWord = "";
            for (int j = word.length() - 1; j > 0; j--) {
                /* The charAt() function returns the character
                 * at the given position in a string
                 */
                reverseWord = reverseWord + word.charAt(j);
            }
            reversedString = reversedString + reverseWord + " ";
            
        
        
        }
        
        return reversedString.substring(0, reversedString.length());
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
