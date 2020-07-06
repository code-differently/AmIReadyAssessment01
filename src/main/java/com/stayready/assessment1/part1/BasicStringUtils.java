package com.stayready.assessment1.part1;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.lang.Character;

public class BasicStringUtils {
    /**
     * @param str string input from client
     * @return string with identical content, and the first character capitalized
     */
    public static String camelCase(String str) {
        String camelCase = "";
        
        //adding a space after the strings
        String[] cam = str.split(" ");
        for(int i= 0; i< cam.length; i++){
            if(i != cam.length -1){
                cam[i] += " ";
            }
        }

        for(String s : cam){
            camelCase += convertFirstLetter(s); 
        }

        //now remove the spaces in the string
        //camelCase = camelCase.replaceAll("\\s", "");

        return camelCase;
    }
    //helper method for camel case 
    public static String convertFirstLetter(String s){
        return s.substring(0,1).toUpperCase() 
                  + s.substring(1).toLowerCase();  //making sure the rest of the characters are lowerCase

    }

    /**
     * @param str string input from client
     * @return string with identical contents, in the reverse order
     */
    public static String reverse(String str) {
        //reverse the string and then reverse the elements in each index
         //create the string builder
         StringBuilder rev = new StringBuilder();
         //add the input string into the string builder:
         rev.append(str); 
         //now we can repoint reverse to the reverse of that string
         rev = rev.reverse(); 
         //now we convert string builder into a string
         String answer = rev.toString();
 
         return answer;
    }

    /**
     * @param str string input from client
     * @return string with identical contents, with each word individually in reverse order
     */
    public static String reverseWords(String str) {
        //create an array of the words from the string by splitting the spaces
        //create a string to store the reversed answer
        String answer = Arrays.asList(str.split(" ")).stream()
                        .map(s -> new StringBuilder(s).reverse())
                        .collect(Collectors.joining(" "));

        return answer;
    }

    /**
     * @param str string input from client
     * @return string with identical contents, in reverse order, with first character capitalized
     */
    public static String reverseThenCamelCase(String str) {
        str = reverse(str);
        str = camelCase(str);
        return str;
    }


    /**
     * @param str a string input from user
     * @return string with identical contents excluding first and last character
     */
    public static String removeFirstAndLastCharacter(String str) {
         //making an array of characters
         char[] chars = str.toCharArray(); 
         //making a return String that will store the answer statement
         String answer = "";
 
         for(int i = 1; i < chars.length - 1; i++){ // making sure not to add last or first character to the answer string
                 answer += chars[i]; 
         }
 
         return answer;
        
    }

    /**
     * @param str a string input from user
     * @return string with identical characters, each with opposite casing
     */
    public static String invertCasing(String str) {
       char[] chars = str.toCharArray(); 
       for(int i = 0; i < chars.length; i++){
           chars[i] = Character.isUpperCase(chars[i]) ?
            Character.toLowerCase(chars[i]) : Character.toUpperCase(chars[i]);
       }
       return new String(chars);
    }

}
