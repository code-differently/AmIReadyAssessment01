package com.stayready.assessment1.part1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class BasicArrayUtils {
    private ArrayList<String> basicArrayUtils = new ArrayList<String>();

    public void addArrayUtils(String item) {
        basicArrayUtils.add(item);
    }
    /**
     * 
     * @param stringArray an array of String objects
     * @return the first element in the array
     */
    public static String getFirstElement(String[] stringArray) {
        return stringArray[0];
    }

    public static String getSecondElement(String[] stringArray) {
        return stringArray[1];
    }

    public static String[] reverse(String[] stringArray) {
        ArrayList<String> listA = new ArrayList<String>();
        for(String word: stringArray) {
            listA.add(word);
        }
        Collections.reverse(listA);
        String[] sizeA = new String[stringArray.length];
        for(int i = 0; i < stringArray.length; i++) {
            //sizeA[i] = string ;
        }

        return sizeA;
    }

    
    public static String getFirstLetterOfEachElement(String[] stringArray) {
        List<String> basicU = Arrays.asList(stringArray);
        String first = basicU.get(0);
        String f = first.substring(0);
        String second = basicU.get(1);
        char s = second.charAt(0);
        String third = basicU.get(2);
        char t = third.charAt(0);
        String fourth = basicU.get(3);
        char fo = fourth.charAt(0);



        return f + s + t +fo;
    }
}
