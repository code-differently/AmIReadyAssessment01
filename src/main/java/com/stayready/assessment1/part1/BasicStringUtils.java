package com.stayready.assessment1.part1;

public class BasicStringUtils {
    /**
     * @param str string input from client
     * @return string with identical content, and the first character capitalized
     */
    public static String camelCase(String str) {
        String a = "";
        a += Character.toUpperCase(str.charAt(0));

        for (int i = 1; i < str.length(); i++) {
            char c = str.charAt(i);
            a += c;
            if (str.charAt(i) == ' ') {
                char c2 = str.charAt(i+1);
                a += Character.toUpperCase(c2);
                i++;
            }
        }
        return a;
    }

    /**
     * @param str string input from client
     * @return string with identical contents, in the reverse order
     */
    public static String reverse(String str) {
        String a = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            a += str.charAt(i);
        }
        return a;
    }

    /**
     * @param str string input from client
     * @return string with identical contents, with each word individually in reverse order
     */
    public static String reverseWords(String str) {
        String[] words = str.split(" ");
        String answer = "";
        for (int i = 0; i < words.length; i++) {
            for (int j = words[i].length() - 1; j >= 0; j--) {
                answer += words[i].charAt(j);
            }
            if (i != words.length - 1)
                answer += " ";
        }
        return answer;
    }

    /**
     * @param str string input from client
     * @return string with identical contents, in reverse order, with first character capitalized
     */
    public static String reverseThenCamelCase(String str) {
        String a = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            a += str.charAt(i);
        }

        String a2 = "";
        a2 += Character.toUpperCase(a.charAt(0));
        for (int i = 1; i < a.length(); i++) {
            char c = a.charAt(i);
            a2 += c;
            if (a.charAt(i) == ' ') {
                char c2 = a.charAt(i+1);
                a2 += Character.toUpperCase(c2);
                i++;
            }
        }

        return a2;
    }


    /**
     * @param str a string input from user
     * @return string with identical contents excluding first and last character
     */
    public static String removeFirstAndLastCharacter(String str) {
        String a = "";
        for (int i = 1; i < str.length() - 1; i++) {
            a += str.charAt(i);
        }
        return a;
    }

    /**
     * @param str a string input from user
     * @return string with identical characters, each with opposite casing
     */
    public static String invertCasing(String str) {
        String a = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == Character.toLowerCase(str.charAt(i))) {
                a += Character.toUpperCase(str.charAt(i));
            }
            else {
                a += Character.toLowerCase(str.charAt(i));
            }
        }
        return a;
    }

}
