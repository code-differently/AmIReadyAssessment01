package com.stayready.assessment1.part1;

public class BasicArrayUtils {
    /**
     * @param stringArray an array of String objects
     * @return the first element in the array
     */
    public static String getFirstElement(String[] stringArray) 
    {
        return stringArray[0];
    }

    /**
     * @param stringArray an array of String objects
     * @return the second element in the array
     */
    public static String getSecondElement(String[] stringArray) 
    {
        return stringArray[1];
    }

    /**
     * @param stringArray an array of String objects
     * @return stringArray with the elements in reverse order
     */
    public static String[] reverse(String[] stringArray) 
    {
        String [] holder = new String [stringArray.length];
        int increment = 0;
        for (int j = stringArray.length-1; j > -1; j--)
        {
            holder[increment] = stringArray[j];
           increment++;
        }

        return holder;
    }

    /**
     * @param stringArray an array of String objects
     * @return String made up of the first character in each element of stringArray
     */
    public static String getFirstLetterOfEachElement(String[] stringArray) 
    {
      String result = "";

      for (int i = 0; i < stringArray.length;i++)
      {
          result += stringArray[i].substring(0,1);
      }

      return result;
    }
}
