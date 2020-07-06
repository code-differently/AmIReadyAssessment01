package com.stayready.assessment1.part1;

import javax.naming.spi.DirStateFactory.Result;

import java.lang.StringBuilder;

public class BasicStringUtils {
    /**
     * @param str string input from client
     * @return string with identical content, and the first character capitalized
     */
    public static String camelCase(String str) {

        int strLen = str.length();
        char [] result = str.toCharArray();

        for(int i = 0; i < strLen; i++) {

            if(i == 0){

                result[i] = Character.toUpperCase(result[i]);
                
            } else if( result[i] == ' '){

                i++;
                result[i] = Character.toUpperCase(result[i]);

            }

        }
        str = new String(result);

        return str;
    }

    /**
     * @param str string input from client
     * @return string with identical contents, in the reverse order
     */
    public static String reverse(String str) {

        int strLen = str.length() - 1;
        char [] result = str.toCharArray();
        char temp;
        for(int i = 0; i <= strLen/2; i++) {

            temp = result[i];
            result[i] = result[strLen - i];
            result[strLen - i] = temp;

        }
        str = new String(result);
        

        return str;
    }

    /**
     * @param str string input from client
     * @return string with identical contents, with each word individually in reverse order
     */
    public static String reverseWords(String str) {


        int strLen = str.length() - 1;
        int [] spaceIndex = new int[(strLen/2)];
        int spCount = 0;
        String subStr = "";
        String result = "";
        for(int i = 0; i <= strLen; i++) {
            if(str.charAt(i) == ' ' || i == 0 || i == strLen){
                
                spaceIndex[spCount] = i;
                spCount++;
            } 
        }
        for(int j = 0; j <= spCount; j++){
            subStr = str.substring(spaceIndex[j], spaceIndex[j+1]);
            result += reverse(subStr);
        }
       
        System.out.println(result);
        

        return str;


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
        
        str = str.substring(1, (str.length()-1));

        return str;
    }

    /**
     * @param str a string input from user
     * @return string with identical characters, each with opposite casing
     */
    public static String invertCasing(String str) {


        int strLen = str.length() - 1;
        char [] result = str.toCharArray();
        for(int i = 0; i <= strLen; i++) {

           if(Character.isLowerCase(result[i])){

            result[i]= Character.toUpperCase(result[i]);
           } else {

            result[i]= Character.toLowerCase(result[i]);

           }

        }
        str = new String(result);
        

        return str;
    }

}
