package com.stayready.assessment1.part2;

public class StringUtils {

    /**
     * @param sentence a string containing words delimited by spaces, representative of a sentence
     * @return an array of strings, representative of each word in the sentence
     * given a string containing words delimited by spaces, representative of a sentence, return an array of strings, each element representative of a respective word in the sentence
     */
    public static String[] getWords(String sentence) {
        String[] wordArr = sentence.split(" ");
        return wordArr;
    }


    /**
     * @param sentence a string containing words delimited by spaces, representative of a sentence
     * @return the first word in the specified sentence
     * given a string containing words delimited by spaces, representative of a sentence, return the first word of the sentence
     */
    public static String getFirstWord(String sentence) {
        int i = sentence.indexOf(' ');
        String firstWord = sentence.substring(0, i);
        return firstWord;
    }

    /**
     * @param sentence a string containing words delimited by spaces, representative of a sentence
     * @return the specified sentence with the first word in reverse order
     * given a string containing words delimited by spaces, representative of a sentence, return the first word with identical contents in reverse order
     */
    public static String reverseFirstWord(String sentence) {
        int i = sentence.indexOf(' ');
        String firstWord = sentence.substring(0, i);
        StringBuilder reversed = new StringBuilder(firstWord);
        reversed = reversed.reverse();
        String newSentence = reversed + sentence.substring(i);
        return newSentence;
    }
    

    /**
     * @param sentence a string containing words delimited by spaces, representative of a sentence
     * @return the specified sentence with the first word capitalized and in reverse order
     * given a string containing words delimited by spaces, representative of a sentence, return the first word with identical contents in reverse order with the first character capitalized
     */
    public static String reverseFirstWordThenCamelCase(String sentence) {
        int i = sentence.indexOf(' ');
        String firstWord = sentence.substring(0, i);
        StringBuilder reversed = new StringBuilder(firstWord.toLowerCase());
        reversed = reversed.reverse();
        String[] words = sentence.split(" ");
        StringBuilder sbWords = new StringBuilder();
        words[0] = reversed.toString();
        for (int k = 0; k < words.length; k++) {
            words[k] = words[k].substring(0, 1).toUpperCase() + words[k].substring(1);
            sbWords.append(words[k]);
        }
        return sbWords.toString();
    }


    /**
     * @param str string input from client
     * @param index the index of the character to be removed from `str`
     * @return string with identical contents, excluding the character at the specified index
     * given a string and index, return an identical string excluding the character at the specified index
     */
    public static String removeCharacterAtIndex(String str, int index) {
        return str.substring(0, index) + str.substring(index + 1);
    }

}
