package com.stayready.assessment1.part1;

import java.util.ArrayList;

public class BasicArrayUtils {
    /**
     * @param stringArray an array of String objects
     * @return the first element in the array
     */


    public static void main(String[] args) {
     // creating an Empty Integer ArrayList 

        String [] words={"The", "quick", "brown"};
        int index=0;
        for (int i = 0; i < words.length; i++) {
            if (words[i] == "The") {
            }
        }
        System.out.println("Index="+index);
        System.out.println("The");
    }

        /**
     * @param stringArray an array of String objects
     * @return the second element in the array
     */

    public static void main(String[] args) {
       // creating an Empty Integer ArrayList 
       
    String words[] = {"Somewhere", "over", "the", "rainbow"};
    System.out.println("Somewhere: "+words.length); 
    for (int i = 0; i <words.length; i++);
    {
        int i;
		System.out.println(words[i]+ " "); }
        
    }


    /**
     * @param stringArray an array of String objects
     * @return stringArray with the elements in reverse order
     */
    public static String[] reverse(String[] stringArray) {
        return null;
    }

    /**
     * @param stringArray an array of String objects
     * @return String made up of the first character in each element of stringArray
     */
    public static String getFirstLetterOfEachElement(String[] stringArray) {
        return null;
    }
}
