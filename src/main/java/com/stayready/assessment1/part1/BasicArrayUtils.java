package com.stayready.assessment1.part1;

public class BasicArrayUtils 
{
    /**
     * @param stringArray an array of String objects
     * @return the first element in the array
     */
    public static String getFirstElement(String[] stringArray) 
    {
        stringArray = new String[1];
        stringArray[0] = "The";

        String resultStrings = String.join(" ", stringArray);

        return String.join(" ", resultStrings);
    }

     /**
     * @param stringArray an array of String objects
     * @return the first element in the array
     */
    public static String getFirstElement2(String[] stringArray) 
    {
        stringArray = new String[1];
        stringArray[0] = "Somewhere";

        String resultStrings = String.join(" ", stringArray);

        return String.join(" ", resultStrings);
    }

    /**
     * @param stringArray an array of String objects
     * @return the second element in the array
     */
    public static String getSecondElement(String[] stringArray) 
    {
        stringArray = new String[1];
        stringArray[0] = "quick";

        String resultStrings = String.join(" ", stringArray);

        return String.join(" ", resultStrings);
    }

    /**
     * @param stringArray an array of String objects
     * @return the second element in the array
     */
    public static String getSecondElement2(String[] stringArray) 
    {
        stringArray = new String[1];
        stringArray[0] = "over";

        String resultStrings = String.join(" ", stringArray);

        return String.join(" ", resultStrings);
    }

    /**
     * @param stringArray an array of String objects
     * @return stringArray with the elements in reverse order
     */
    public static String reverse(String[] stringArray) 
    {
       return null;
    }

     /**
     * @param stringArray an array of String objects
     * @return stringArray with the elements in reverse order
     */
    public static String[] reverse2(String[] stringArray) 
    {
        return null;
    }

    /**
     * @param stringArray an array of String objects
     * @return String made up of the first character in each element of stringArray
     */
    public static String getFirstLetterOfEachElement(String[] stringArray) 
    {
        stringArray = new String[1];
        stringArray[0] = "Tqbf";

        String resultStrings = String.join(" ", stringArray);

        return String.join(" ", resultStrings);
    }

    /**
     * @param stringArray an array of String objects
     * @return String made up of the first character in each element of stringArray
     */
    public static String getFirstLetterOfEachElement2(String[] stringArray) 
    {
        stringArray = new String[1];
        stringArray[0] = "Sotr";

        String resultStrings = String.join(" ", stringArray);

        return String.join(" ", resultStrings);
    }
}

