package com.stayready.assessment1.part1;

import java.util.ArrayList;
import java.util.Collections;

public class BasicArrayUtils {
    /**
     * @param stringArray an array of String objects
     * @return the first element in the array
     */
    public static String getFirstElement(String[] stringArray) {
        return stringArray[0];
    }

    /**
     * @param stringArray an array of String objects
     * @return the second element in the array
     */
    public static String getSecondElement(String[] stringArray) {
        return stringArray[1];
    }

    /**
     * @param stringArray an array of String objects
     * @return stringArray with the elements in reverse order
     */
    public static String[] reverse(String[] stringArray)
    {
        ArrayList<String> s = new ArrayList<String>();
        for(String val : stringArray)
        {
            s.add(val);
        }
        Collections.reverse(s);
        String[] finalArr = new String[s.size()];
        for(int i = 0; i < s.size(); i++)
        {
            finalArr[i] = s.get(i);
        }

        return finalArr;

    }

    /**
     * @param stringArray an array of String objects
     * @return String made up of the first character in each element of stringArray
     */
    public static String getFirstLetterOfEachElement(String[] stringArray)
    {
        char[] c = new char[stringArray.length];

        for(int i = 0; i < stringArray.length; i++)
        {
            c[i] = stringArray[i].charAt(0);
        }
        String returnVal = "";
        for(int i = 0; i < c.length; i++)
        {
            returnVal = returnVal  + c[i];
        }
        return returnVal;
    }
}
