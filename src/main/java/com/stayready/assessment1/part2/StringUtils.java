package com.stayready.assessment1.part2;

import com.stayready.assessment1.part1.BasicStringUtils;

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
        String[] answer = sentence.split(" ");
        return answer[0];
    }

    /**
     * @param sentence a string containing words delimited by spaces, representative of a sentence
     * @return the specified sentence with the first word in reverse order
     * given a string containing words delimited by spaces, representative of a sentence, return the first word with identical contents in reverse order
     */
    public static String reverseFirstWord(String sentence) {
        String[] answer = sentence.split(" ");
        String s = "";

        for(int i = 0; i < answer.length; i++){
            if(i == 0){
                answer[i] = BasicStringUtils.reverse(answer[i]) + " ";
                s += answer[i];
            } else if (i != answer.length -1 ) {
                s = s + answer[i] + " ";
            } else{ 
                s += answer[i];
            }
        }
        return s;
    }

    /**
     * @param sentence a string containing words delimited by spaces, representative of a sentence
     * @return the specified sentence with the first word capitalized and in reverse order
     * given a string containing words delimited by spaces, representative of a sentence, return the first word with identical contents in reverse order with the first character capitalized
     */
    public static String reverseFirstWordThenCamelCase(String sentence) {
        String s = reverseFirstWord(sentence); 
        String answer = BasicStringUtils.camelCase(s);
        
        return answer = answer.replaceAll("\\s", "");

        
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
