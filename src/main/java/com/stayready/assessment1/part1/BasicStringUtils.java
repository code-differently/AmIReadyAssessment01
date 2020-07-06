package com.stayready.assessment1.part1;

public class BasicStringUtils {
    /**
     * @param str string input from client
     * @return string with identical content, and the first character capitalized
     */
    public static String camelCase(String str) {
        if (str == null || str.isEmpty()) return null;

        String[] words = str.split(" "); // splits string by every space
        StringBuilder strbuilder = new StringBuilder(); // Creates a modifiable string

        for (String s: words){
            if (!s.equals(" ")) {
                strbuilder.append(Character.toUpperCase(s.charAt(0)));
                strbuilder.append(s.substring(1));
            }
            strbuilder.append(" ");
        }
        // trim() to remove extra space in the end before returning
        return strbuilder.toString().trim();
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
        return null;
    }

    /**
     * @param str string input from client
     * @return string with identical contents, in reverse order, with first character capitalized
     */
    public static String reverseThenCamelCase(String str) {
        if (str == null || str.isEmpty()) return null;

        String[] words = str.split(" ");
        StringBuilder strbuilder = new StringBuilder();

        for (String s: words){
            if (!s.equals(" ")) {
                strbuilder.append(Character.toUpperCase(s.charAt(0)));
                strbuilder.reverse();
                strbuilder.append(s.substring(1));
            }
            strbuilder.append(" ");
        }
        return strbuilder.toString().trim();
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
        return null;
    }

}
