package com.stayready.assessment1.part2;
import java.lang.StringBuilder;

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
        StringBuilder reversed= new StringBuilder();
        String[] s= getWords(sentence);
        if(s.length>1){
            reversed.append(s[0]);
            reversed.reverse();
            reversed.append(" ");
            for (int i = 1; i < s.length; i++) {
                reversed.append(s[i]);
                if(i!=s.length-1)
                    reversed.append(" ");
            }
        }
        else{
            reversed.append(s[0]);
            reversed.reverse();
        }
        return reversed.toString();

    }

    /**
     * @param sentence a string containing words delimited by spaces, representative of a sentence
     * @return the specified sentence with the first word capitalized and in reverse order
     * given a string containing words delimited by spaces, representative of a sentence, return the first word with identical contents in reverse order with the first character capitalized
     */
    public static String reverseFirstWordThenCamelCase(String sentence) {
        StringBuilder reversed= new StringBuilder();
        sentence=reverseFirstWord(sentence);
        String[] s=getWords(sentence);
        for (int i = 0; i < s.length; i++) {
            char[] word=s[i].toCharArray();
            for (int j = 0; j < word.length; j++) {
                if(j==0)
                    reversed.append(Character.toUpperCase(word[j]));
                else
                    reversed.append(Character.toLowerCase(word[j]));
            }
        }
        return reversed.toString();
    }


    /**
     * @param str string input from client
     * @param index the index of the character to be removed from `str`
     * @return string with identical contents, excluding the character at the specified index
     * given a string and index, return an identical string excluding the character at the specified index
     */
    public static String removeCharacterAtIndex(String str, int index) {
        String result="";
        String[] array=str.split("");
        for (int i = 0; i < array.length; i++) {
            if(i!=index)
                result+=array[i];
        }
        return result;
    }

}
