package com.stayready.assessment1.part2;

import com.stayready.assessment1.part1.BasicStringUtils;

public class StringUtils {

    /**
     * @param sentence a string containing words delimited by spaces, representative of a sentence
     * @return an array of strings, representative of each word in the sentence
     * given a string containing words delimited by spaces, representative of a sentence, return an array of strings, each element representative of a respective word in the sentence
     */
    public static String[] getWords(String sentence) {
        return sentence.split(" ");
    }


    /**
     * @param sentence a string containing words delimited by spaces, representative of a sentence
     * @return the first word in the specified sentence
     * given a string containing words delimited by spaces, representative of a sentence, return the first word of the sentence
     */
    public static String getFirstWord(String sentence) {
        return sentence.split(" ")[0];
    }

    /**
     * @param sentence a string containing words delimited by spaces, representative of a sentence
     * @return the specified sentence with the first word in reverse order
     * given a string containing words delimited by spaces, representative of a sentence, return the first word with identical contents in reverse order
     */
    public static String reverseFirstWord(String sentence) {
        String[] allWords = sentence.split(" ");
        allWords[0] = BasicStringUtils.reverse(allWords[0]);
        String newSentence = "";

        for(int i = 0; i < allWords.length; i++) {
            newSentence += allWords[i];
            if(i != allWords.length-1)
                newSentence += " ";
        }

        return newSentence;
    }

    /**
     * @param sentence a string containing words delimited by spaces, representative of a sentence
     * @return the specified sentence with the first word capitalized and in reverse order
     * given a string containing words delimited by spaces, representative of a sentence, return the first word with identical contents in reverse order with the first character capitalized
     */
    public static String reverseFirstWordThenCamelCase(String sentence) {
        String firstReverse = reverseFirstWord(sentence);
        StringBuilder firstReverseCamelCase = new StringBuilder();

        for(int i = 0; i < firstReverse.length(); i++) {
            char currentChar = firstReverse.charAt(i);

            if(i == 0) {
                currentChar = Character.toUpperCase(currentChar);
                firstReverseCamelCase.append(currentChar);
            } else if(firstReverse.charAt(i - 1) == ' ') {
                currentChar = Character.toUpperCase(currentChar);
                firstReverseCamelCase.append(currentChar);
            } else if(firstReverse.charAt(i) != ' ') {
                currentChar = Character.toLowerCase(currentChar);
                firstReverseCamelCase.append(currentChar);
            }
        }

        return firstReverseCamelCase.toString();
    }


    /**
     * @param str string input from client
     * @param index the index of the character to be removed from `str`
     * @return string with identical contents, excluding the character at the specified index
     * given a string and index, return an identical string excluding the character at the specified index
     */
    public static String removeCharacterAtIndex(String str, int index) {
        StringBuilder newString = new StringBuilder();

        for(int i = 0; i < str.length(); i++) {
            if(i != index)
                newString.append(str.charAt(i));
        }
        
        return newString.toString();
    }

}
