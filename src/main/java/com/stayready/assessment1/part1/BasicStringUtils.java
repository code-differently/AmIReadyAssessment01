package com.stayready.assessment1.part1;

public class BasicStringUtils {
    /**
     * @param str string input from client
     * @return string with identical content, and the first character capitalized
     */
    public static String camelCase(String str) {
        StringBuilder camelCased = new StringBuilder();

        for(int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);

            if(i == 0) {
                currentChar = Character.toUpperCase(currentChar);
                camelCased.append(currentChar);
            } else if(str.charAt(i - 1) == ' ') {
                currentChar = Character.toUpperCase(currentChar);
                camelCased.append(currentChar);
            } else {
                currentChar = Character.toLowerCase(currentChar);
                camelCased.append(currentChar);
            }
        }
        
        return camelCased.toString();
    }

    /**
     * @param str string input from client
     * @return string with identical contents, in the reverse order
     */
    public static String reverse(String str) {
        StringBuilder reversed = new StringBuilder();

        for(int i = str.length()- 1; i >= 0; i--) {
            reversed.append(str.charAt(i));
        }
        
        return reversed.toString();
    }

    /**
     * @param str string input from client
     * @return string with identical contents, with each word individually in reverse order
     */
    public static String reverseWords(String str) {
        String[] eachWord = str.split(" ");
        StringBuilder reversedWords = new StringBuilder();

        for(int i = 0; i < eachWord.length; i++) {
            reversedWords.append(reverse(eachWord[i]));
            if(eachWord[i] != eachWord[eachWord.length-1]) {
                reversedWords.append(" ");
            }
        }
        
        return reversedWords.toString();
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
        return str.substring(1, str.length()-1);
    }

    /**
     * @param str a string input from user
     * @return string with identical characters, each with opposite casing
     */
    public static String invertCasing(String str) {
        String inverted = "";

        for(int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);

            if(currentChar >= 'A' && currentChar <= 'Z') {
                inverted += Character.toLowerCase(currentChar);
            } else {
                inverted += Character.toUpperCase(currentChar);
            }
        }
        
        return inverted;
    }

}
