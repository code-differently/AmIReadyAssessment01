package com.stayready.assessment1.part2;

public class StringUtils {

    public static void main(String [] args) {
        System.out.println(removeCharacterAtIndex("Jumping", 2)); 
    }

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
        return getWords(sentence)[0];
    }

    /**
     * @param sentence a string containing words delimited by spaces, representative of a sentence
     * @return the specified sentence with the first word in reverse order
     * given a string containing words delimited by spaces, representative of a sentence, return the first word with identical contents in reverse order
     */
    public static String reverseFirstWord(String sentence) {
        String firstWord = getFirstWord(sentence);
        //going to use this for substring
        //starts right after first word
        String rest = sentence.substring(firstWord.length());
        
        //reversing the first word
        char [] firstWordArr = firstWord.toCharArray();
        char [] reverseArr = new char [firstWord.length()];
        for(int i = 0; i < firstWordArr.length; i++) {
            reverseArr[i] = firstWordArr[firstWord.length() - 1 - i];
        }

        //if I do .toString it returns an address
        firstWord = new String(reverseArr);

        //not substring length because you would be missing the space in the string
        return firstWord + rest;

    }

    /**
     * @param sentence a string containing words delimited by spaces, representative of a sentence
     * @return the specified sentence with the first word capitalized and in reverse order
     * given a string containing words delimited by spaces, representative of a sentence, return the first word with identical contents in reverse order with the first character capitalized
     */
    public static String reverseFirstWordThenCamelCase(String sentence) {
        String reverse = reverseFirstWord(sentence);
        //staY Ready
        //splitting it at spaces, already reversed
        String [] arrString = reverse.split(" ");

        String first = "", rest = "", ans = "";
        for(String word: arrString) {
            //only first letter should be upper case, so change everything to lowercase first
            word = word.toLowerCase();
            //first letter is upper cased
            first = word.substring(0, 1).toUpperCase();
            //the rest
            rest = word.substring(1);
            //no spaces in the test case, appends to the end
            ans += first + rest;
        }
        return ans;
    }


    /**
     * @param str string input from client
     * @param index the index of the character to be removed from `str`
     * @return string with identical contents, excluding the character at the specified index
     * given a string and index, return an identical string excluding the character at the specified index
     */
    public static String removeCharacterAtIndex(String str, int index) {
        char [] strArr = str.toCharArray();
        //only excluding one index
        char [] result = new char [str.length() - 1];
        int smallerIndex = 0;

        for(int i = 0; i < str.length(); i++) {
            if(i != index) {
                result[smallerIndex] = strArr[i];
                smallerIndex++;
            }
        }
        //returns a string version of the char []
        return String.valueOf(result);
    }

}
