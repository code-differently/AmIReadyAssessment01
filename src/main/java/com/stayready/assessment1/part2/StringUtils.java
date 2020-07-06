package com.stayready.assessment1.part2;

public class StringUtils {

    /**
     * @param sentence a string containing words delimited by spaces, representative of a sentence
     * @return an array of strings, representative of each word in the sentence
     * given a string containing words delimited by spaces, representative of a sentence, return an array of strings, each element representative of a respective word in the sentence
     */
    public static String[] getWords(String sentence) 
    {
        String [] getter = sentence.split(" ");
        return getter;
    }


    /**
     * @param sentence a string containing words delimited by spaces, representative of a sentence
     * @return the first word in the specified sentence
     * given a string containing words delimited by spaces, representative of a sentence, return the first word of the sentence
     */
    public static String getFirstWord(String sentence) 
    {
        String result = sentence.substring(0,sentence.indexOf(" "));
        return result;
    }

    /**
     * @param sentence a string containing words delimited by spaces, representative of a sentence
     * @return the specified sentence with the first word in reverse order
     * given a string containing words delimited by spaces, representative of a sentence, return the first word with identical contents in reverse order
     */
    public static String reverseFirstWord(String sentence) 
    {
      
      
        StringBuilder sBuilder = new StringBuilder(sentence.substring(0,sentence.indexOf(" ")));
       String result = sBuilder.reverse().toString()+sentence.substring(sentence.indexOf(" "));

       return result;
        
    }

    /**
     * @param sentence a string containing words delimited by spaces, representative of a sentence
     * @return the specified sentence with the first word capitalized and in reverse order
     * given a string containing words delimited by spaces, representative of a sentence, return the first word with identical contents in reverse order with the first character capitalized
     */
    public static String reverseFirstWordThenCamelCase(String sentence) 
    {
        String [] splitter = sentence.split(" ");
        StringBuilder sBuilder = new StringBuilder(splitter[0]);
       String result = sBuilder.reverse().toString();
       result = sBuilder.substring(0,1).toUpperCase()+ result.substring(1).toLowerCase();

       for (int i = 1; i < splitter.length;i++)
       {
           result += (splitter[i].substring(0,1).toUpperCase()+splitter[i].substring(1));
       }

       return result;
    }


    /**
     * @param str string input from client
     * @param index the index of the character to be removed from `str`
     * @return string with identical contents, excluding the character at the specified index
     * given a string and index, return an identical string excluding the character at the specified index
     */
    public static String removeCharacterAtIndex(String str, int index) 
    {
        String result = str.substring(0,index)+str.substring(index+1);
        return result;
    }

}
