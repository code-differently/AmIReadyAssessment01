package com.stayready.assessment1.part2;

public class StringUtils {

    /**
     * @param sentence a string containing words delimited by spaces, representative of a sentence
     * @return an array of strings, representative of each word in the sentence
     * given a string containing words delimited by spaces, representative of a sentence, return an array of strings, each element representative of a respective word in the sentence
     */
    public static String[] getWords(String sentence) {
        String[] answer = sentence.split(" ");
        return answer;
    }


    /**
     * @param sentence a string containing words delimited by spaces, representative of a sentence
     * @return the first word in the specified sentence
     * given a string containing words delimited by spaces, representative of a sentence, return the first word of the sentence
     */
    public static String getFirstWord(String sentence) {
        String a = "";
        int i = 0;
        while (sentence.charAt(i) != ' ') {
            a += sentence.charAt(i);
            i++;
        }
        return a;
    }

    /**
     * @param sentence a string containing words delimited by spaces, representative of a sentence
     * @return the specified sentence with the first word in reverse order
     * given a string containing words delimited by spaces, representative of a sentence, return the first word with identical contents in reverse order
     */
    public static String reverseFirstWord(String sentence) {
        String a = "";
        String a2 = "";
        int i = 0;
        while (sentence.charAt(i) != ' ') {
            a += sentence.charAt(i);
            i++;
        }
        for (int j = a.length() - 1; j >= 0; j--) {
            a2 += a.charAt(j);
        }

        for (int k = i; k < sentence.length(); k++) {
            a2 += sentence.charAt(k);
        }
        return a2;
    }

    /**
     * @param sentence a string containing words delimited by spaces, representative of a sentence
     * @return the specified sentence with the first word capitalized and in reverse order
     * given a string containing words delimited by spaces, representative of a sentence, return the first word with identical contents in reverse order with the first character capitalized
     */
    public static String reverseFirstWordThenCamelCase(String sentence) {
        sentence = sentence.toLowerCase();
        String a = "";
        String a2 = "";
        int i = 0;
        while (sentence.charAt(i) != ' ') {
            a += sentence.charAt(i);
            i++;
        }
        for (int j = a.length() - 1; j >= 0; j--) {
            a2 += a.charAt(j);
        }

        for (int k = i; k < sentence.length(); k++) {
            a2 += sentence.charAt(k);
        }
        
        String a3 = "";
        a3 += Character.toUpperCase(a2.charAt(0));

        for (int l = 1; l < a2.length(); l++) {
            char c = a2.charAt(l);
            a3 += c;
            if (a2.charAt(l) == ' ') {
                char c2 = a2.charAt(l+1);
                a3 += Character.toUpperCase(c2);
                l++;
            }
        }
        return a3.replaceAll(" ", "");
    }


    /**
     * @param str string input from client
     * @param index the index of the character to be removed from `str`
     * @return string with identical contents, excluding the character at the specified index
     * given a string and index, return an identical string excluding the character at the specified index
     */
    public static String removeCharacterAtIndex(String str, int index) {
        String a = "";
        for (int i = 0; i < str.length(); i++) {
            if (i != index)
                a += str.charAt(i);
        }
        return a;
    }

}
