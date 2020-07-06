package com.stayready.assessment1.part1;

public class BasicStringUtils {
    /**
     * @param str string input from client
     * @return string with identical content, and the first character capitalized
     */
    public static String camelCase(String str) {
        StringBuffer sb = new StringBuffer();
        for (String s : str.split("_")) {
            sb.append(Character.toUpperCase(s.charAt(0)));
            if (s.length() > 1) {
                sb.append(s.substring(1, s.length()).toLowerCase());
            }
        }
        return sb.toString();
    }

    /**
     * @param str string input from client
     * @return string with identical contents, in the reverse order
     */
    public static String reverse(String str) {
        char newCharacter[] = str.toCharArray();
        String result = "";
        for (int i = newCharacter.length - 1; i >= 0; i--) {
            result += newCharacter[i];
        }
        return result;
    }

    /**
     * @param str string input from client
     * @return string with identical contents, with each word individually in
     *         reverse order
     */
    public static String reverseWords(String str) {
        int i = 1;
        while (i < str.length()) {
            if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
                return (" " + Character.toLowerCase(str.charAt(i)));
            }
            // }else{
            // return str.charAt(i);
            // }
            i++;
        }

    }

    /**
     * @param str string input from client
     * @return string with identical contents, in reverse order, with first
     *         character capitalized
     */
    public static String reverseThenCamelCase(String str) {
        return null;
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
        char newCharacter[] = str.toCharArray();
        for (int i = 0; i < newCharacter.length; i++) {
            if (Character.isUpperCase(newCharacter[i])) {
                newCharacter[i] = Character.toLowerCase(newCharacter[i]);
            } else if (Character.isLowerCase(newCharacter[i])) {
                newCharacter[i] = Character.toUpperCase(newCharacter[i]);
            }
        }
        str = new String(newCharacter);
        return str;
    }

}
