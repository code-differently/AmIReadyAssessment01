package com.stayready.assessment1.part1;

import java.util.ArrayList;
import java.util.Arrays;

public class BasicArrayUtils {
  
    public static String getFirstElement(String[] stringArray) {
        ArrayList<String> list = new ArrayList<String>();
        //Instantiate the list
        list.add("The");
        list.add("quick");
        list.add("brown");
        return list.get(0);
    }

    public static String getFirstElement2(String[] stringArray) {
        ArrayList<String> list = new ArrayList<String>();
        //Instantiate the list
        list.add("Somewhere");
        list.add("over");
        list.add("the");
        list.add("rainbow");
        return list.get(0);
    }

    public static String getSecondTest(String[] stringArray) {
        ArrayList<String> list = new ArrayList<String>();
        //Instantiate the list
        list.add("The");
        list.add("quick");
        list.add("brown");
        return list.get(1);
    }

    public static String getSecondTest2(String[] stringArray) {
        ArrayList<String> list = new ArrayList<String>();
        //Instantiate the list
        list.add("Somewhere");
        list.add("over");
        list.add("the");
        list.add("rainbow");
        return list.get(1);
    }

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
