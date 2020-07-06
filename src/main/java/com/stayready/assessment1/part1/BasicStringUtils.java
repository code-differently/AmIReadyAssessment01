package com.stayready.assessment1.part1;

public class BasicStringUtils {
    /**
     * @param str string input from client
     * @return string with identical content, and the first character capitalized
     */
    public static String camelCase(String str) 
    {
        String [] holder = str.split(" ");
        String result = "";
        for (int i = 0; i < holder.length;i++)
        {
            result += holder[i].substring(0, 1).toUpperCase() + holder[i].substring(1)+ " ";
        }
        result = result.trim();
        return result;
    }
  
    /**
     * @param str string input from client
     * @return string with identical contents, in the reverse order
     */
    public static String reverse(String str) 
    {
       StringBuilder sBuilder = new StringBuilder(str);
       str = sBuilder.reverse().toString();
       return str;
    }
  
    /**
     * @param str string input from client
     * @return string with identical contents, with each word individually in reverse order
     */
    public static String reverseWords(String str) 
    {
        StringBuilder sBuilder = new StringBuilder();
        String [] splitter = str.split(" ");
        String result = "";
        for (int i = 0; i < splitter.length;i++)
        {
            sBuilder = new StringBuilder(splitter[i]);
            result += sBuilder.reverse().toString()+" ";
        }
        result = result.trim();
        return result;
    }
  
    /**
     * @param str string input from client
     * @return string with identical contents, in reverse order, with first character capitalized
     */
    public static String reverseThenCamelCase(String str) 
    {
        StringBuilder sBuilder = new StringBuilder(str);
        str = sBuilder.reverse().toString();
        
        String [] splitter = str.split(" ");
        String result = "";
        for (int i = 0; i < splitter.length;i++)
        {
            result += splitter[i].substring(0,1).toUpperCase()+splitter[i].substring(1)+" ";
        }
        result = result.trim();
        return result;
    }
  
  
    /**
     * @param str a string input from user
     * @return string with identical contents excluding first and last character
     */
    public static String removeFirstAndLastCharacter(String str) 
    {
        str = str.substring(1, str.length()-1);
        return str;
    }
  
    /**
     * @param str a string input from user
     * @return string with identical characters, each with opposite casing
     */
    public static String invertCasing(String str) 
    {
      char [] stringHolder = str.toCharArray();
      for (int i = 0; i < stringHolder.length;i++)
      {
          char c = stringHolder[i];
          if (Character.isUpperCase(c))
          {
              stringHolder[i] = Character.toLowerCase(c);
          }
          else if(Character.isLowerCase(c))
          {
            stringHolder[i] = Character.toUpperCase(c);
          }

         
      } 
      str = new String(stringHolder);
          return str;
    }
  
 }