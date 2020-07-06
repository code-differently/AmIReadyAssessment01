package com.stayready.assessment1.part1;

import java.util.Arrays;

public class BasicStringUtils {
    /**
     * @param str string input from client
     * @return string with identical content, and the first character capitalized
     */
    public static String camelCase(String str) {
        String[] camelCaseArr = str.split(" ");
        StringBuilder sentence = new StringBuilder();
        for (int i = 0; i < camelCaseArr.length; i++) {
            if (i < camelCaseArr.length - 1) {
                camelCaseArr[i] = camelCaseArr[i].substring(0,1).toUpperCase() + camelCaseArr[i].substring(1) +  " ";
                sentence.append(camelCaseArr[i]);
            } else {
                camelCaseArr[i] = camelCaseArr[i].substring(0,1).toUpperCase() + camelCaseArr[i].substring(1);
                sentence.append(camelCaseArr[i]);
            }
        }
        return sentence.toString();
    }

    /**
     * @param str string input from client
     * @return string with identical contents, in the reverse order
     */
    public static String reverse(String str) {
        StringBuilder newString = new StringBuilder();
        newString.append(str);
        newString = newString.reverse();
        return newString.toString();
    }

    /**
     * @param str string input from client
     * @return string with identical contents, with each word individually in reverse order
     */
    public static String reverseWords(String str) {
        String[] words = str.split(" ");
        StringBuilder sentence = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            StringBuilder temp = new StringBuilder(words[i]);
            if (i < words.length - 1) {
                words[i] = temp.reverse().toString() + " ";
                sentence.append(words[i]);
            } else {
                words[i] = temp.reverse().toString();
                sentence.append(words[i]);
            }
        }
        return sentence.toString();
    }

    /**
     * @param str string input from client
     * @return string with identical contents, in reverse order, with first character capitalized
     */
    public static String reverseThenCamelCase(String str) {
        String[] words = str.split(" ");
        StringBuilder sentence = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            int wordLength = words[i].length();
            if (i < words.length - 1) {
                words[i] = words[i].substring(0,wordLength - 1) + words[i].substring(wordLength - 1, wordLength).toUpperCase() + " ";
                sentence.append(words[i]);
            } else {
                words[i] = words[i].substring(0,wordLength - 1) + words[i].substring(wordLength - 1, wordLength).toUpperCase();
                sentence.append(words[i]);
            }
        }
        return sentence.reverse().toString();
    }


    /**
     * @param str a string input from user
     * @return string with identical contents excluding first and last character
     */
    public static String removeFirstAndLastCharacter(String str) {
        int strLength = str.length();
        String newString = str.substring(1, strLength - 1);
        return newString;
    }

    /**
     * @param str a string input from user
     * @return string with identical characters, each with opposite casing
     */
    public static String invertCasing(String str) {
        char[] characters = str.toCharArray();
        for (int i = 0; i < characters.length; i++) {
            if (Character.isUpperCase(characters[i])) {
                characters[i] = Character.toLowerCase(characters[i]);
            } else {
                characters[i] = Character.toUpperCase(characters[i]);
            }
        }
        String invertedCase = new String(characters);
        return invertedCase;
    }

}
