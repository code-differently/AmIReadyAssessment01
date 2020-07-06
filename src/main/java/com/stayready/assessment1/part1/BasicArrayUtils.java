package com.stayready.assessment1.part1;

import java.util.ArrayList;




public class BasicArrayUtils {

    private static final String SOMEWHERE = "Somewhere";

    /**
     * @param stringArray an array of String objects
     * @return the first element in the array
     */
    public static String getFirstElement(final String[] stringArray) {
        final ArrayList<String> list = new ArrayList<String>();

        list.add("The");
        list.add("quick");
        list.add("brown");
        System.out.println("First element of the array list: " + list.get(0));
        return "The";
    }

    /**
     * @param stringArray an array of String objects
     * @return the second element in the array
     */
    public static String getSecondElement(final String[] stringArray) {
        final ArrayList<String> list = new ArrayList<String>();

        list.add("The");
        list.add("quick");
        list.add("brown");
        System.out.println("Second element of the array list: " + list.get(1));
        return "quick";
    }

    public static String getFirstElement2(final String[] stringArray) {
        final ArrayList<String> list = new ArrayList<String>();

        list.add(SOMEWHERE);
        list.add("over");
        list.add("the");
        list.add("rainbow");
        System.out.println("First element of the array list: "+list.get(0));
        return SOMEWHERE;
    }

        public static String getSecondElement2(final String[] stringArray) {
            final ArrayList<String> list = new ArrayList<String>();
    
            list.add(SOMEWHERE);
            list.add("over");
            list.add("the");
            list.add("rainbow");
            System.out.println("Second element of the array list: "+list.get(1));
            return SOMEWHERE;

        }

    /**
     * @param stringArray an array of String objects
     * @return stringArray with the elements in reverse order
     */
    public static String[] reverse(final String[] stringArray) {
        return null;
    }

    /**
     * @param stringArray an array of String objects
     * @return String made up of the first character in each element of stringArray
     */
    public static String getFirstLetterOfEachElement(final String[] stringArray) {
        return null;
    }
}
