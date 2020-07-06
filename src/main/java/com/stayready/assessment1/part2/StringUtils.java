package com.stayready.assessment1.part2;

public class StringUtils {

    /**
     * @param sentence a string containing words delimited by spaces, representative of a sentence
     * @return an array of strings, representative of each word in the sentence
     * given a string containing words delimited by spaces, representative of a sentence, return an array of strings, each element representative of a respective word in the sentence
     */
    public static String[] getWords(String sentence) {

        String[] words = sentence.split(" ");
        return words;
    }


    /**
     * @param sentence a string containing words delimited by spaces, representative of a sentence
     * @return the first word in the specified sentence
     * given a string containing words delimited by spaces, representative of a sentence, return the first word of the sentence
     */
    public static String getFirstWord(String sentence) {

        String[] words = getWords(sentence);
        String firstWord = words[0];

        return firstWord;
    }

    /**
     * @param sentence a string containing words delimited by spaces, representative of a sentence
     * @return the specified sentence with the first word in reverse order
     * given a string containing words delimited by spaces, representative of a sentence, return the first word with identical contents in reverse order
     */
    public static String reverseFirstWord(String sentence) {

        /*String reversedWord = getFirstWord(sentence);
        char[] arr = new char[reversedWord.length()];
        int correctWordIndex = 0;

        for(int i = reversedWord.length() - 1; i >= 0; i--){
            arr[correctWordIndex] = reversedWord.charAt(i);
        }

        String newWord = new String(arr);
        String[] newArr = getWords(sentence);
        newArr[0] = newWord;

        StringBuilder sb = new StringBuilder();
        for(String index : newArr){
            sb.append(index);
        }

        return sb.toString();*/
        return null;
    }

    /**
     * @param sentence a string containing words delimited by spaces, representative of a sentence
     * @return the specified sentence with the first word capitalized and in reverse order
     * given a string containing words delimited by spaces, representative of a sentence, return the first word with identical contents in reverse order with the first character capitalized
     */
    public static String reverseFirstWordThenCamelCase(String sentence) {
        return null;
    }


    /**
     * @param str string input from client
     * @param index the index of the character to be removed from `str`
     * @return string with identical contents, excluding the character at the specified index
     * given a string and index, return an identical string excluding the character at the specified index
     */
    public static String removeCharacterAtIndex(String str, int index) {

        StringBuilder sb = new StringBuilder(str);
        sb.deleteCharAt(index);

        return sb.toString();
    }

}
