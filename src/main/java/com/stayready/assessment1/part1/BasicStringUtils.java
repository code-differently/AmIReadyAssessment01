package com.stayready.assessment1.part1;

import java.util.Arrays;
import java.util.stream.Collectors;

public class BasicStringUtils {
    /**
     * @param str string input from client
     * @return string with identical content, and the first character capitalized
     */
    public static String camelCase(String str) {
        String output = Arrays.stream(str.split("\\s+")).map(t -> t.substring(0, 1).toUpperCase() + t.substring(1))
                .collect(Collectors.joining(" "));
        return output;
    }

    /**
     * @param str string input from client
     * @return string with identical contents, in the reverse order
     */
    public static String reverse(String str) {
        String reverse = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse = reverse + str.charAt(i);
        }
        return reverse;
    }

    /**
     * @param str string input from client
     * @return string with identical contents, with each word individually in
     *         reverse order
     */
    public static String reverseWords(String str) {
        String[] words = str.split(" ");
        String reversedString = "";
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            String reverseWord = "";
            for (int j = word.length() - 1; j >= 0; j--) {

                reverseWord = reverseWord + word.charAt(j);
            }
            reversedString = reversedString + reverseWord + " ";
        }
        return reversedString.trim();
    }

    /**
     * @param str string input from client
     * @return string with identical contents, in reverse order, with first
     *         character capitalized
     */
    public static String reverseThenCamelCase(String str) {
        StringBuilder resultBuilder = new StringBuilder();
        for (String string : str.split(" ")) {
            String revStr = new StringBuilder(string).reverse().toString();
            revStr = Character.toUpperCase(revStr.charAt(0)) + revStr.substring(1);
            resultBuilder.append(revStr).append(" ");
        }
        return resultBuilder.toString();
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
        return null;
    }
}
