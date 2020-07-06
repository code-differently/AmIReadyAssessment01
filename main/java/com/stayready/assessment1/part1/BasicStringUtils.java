package com.stayready.assessment1.part1;

public class BasicStringUtils {
    /**
     * @param str string input from client
     * @return string with identical content, and the first character capitalized
     */
    public static String camelCase(String str) {
        return str.substring(0, 1).toUpperCase() + str.substring(1).toLowerCase();
        //System.out.println(camelCase("mariam"));
    }

    /**
     * @param str string input from client
     * @return string with identical contents, in the reverse order
     */
    public static String reverse(String str) {
        StringBuilder reverseString = new StringBuilder(str);
        return reverseString.reverse().toString();
        // System.out.println(reverse("Mariam"));;
    }

    /**
     * @param str string input from client
     * @return string with identical contents, with each word individually in reverse order
     */
    //confused
    public static String reverseWords(String str) {
    StringBuilder reverseWString = new StringBuilder(str);
     String words[] = str.split("");
     
     for (String word : words) 
     {
     String reverseWord = new StringBuilder(word).reverse().toString();      
     reverseWString.append(reverseWord + " ");                                
    }
    return reverseWords(str).split(str).toString(); 
    }


    /**
     * @param str string input from client
     * @return string with identical contents, in reverse order, with first character capitalized
     */
    public static String reverseThenCamelCase(String str) {
        return reverse(camelCase(str));
        //System.out.println(reverseThenCamelCase("mariam"));

        //An idea that I originally had
        // StringBuilder reverseString = new StringBuilder(str);
        //return reverseString.reverse().toString() + str.substring(0, 1).toUpperCase() +
        //str.substring(1).toLowerCase();
        //System.out.println(reverse("mariam") + (camelCase("mariam"))); 
    }


    /**
     * @param str a string input from user
     * @return string with identical contents excluding first and last character
     */
    public static String removeFirstAndLastCharacter(String str) {
        //I believe I can use a char array here too
        //String text = "mariam";
        return str.substring(1, str.length() - 1);
        //System.out.println(removeFirstAndLastCharacter("mariam"));
    }

    /**
     * @param str a string input from user
     * @return string with identical characters, each with opposite casing
     */
    public static String invertCasing(String str) {
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++)
       {
       char c = chars[i];
       if (Character.isUpperCase(c))
       {
           chars[i] = Character.toLowerCase(c);
       }
       else if (Character.isLowerCase(c))
       {
           chars[i] = Character.toUpperCase(c);
       }
       }
        return new String(chars);
       //System.out.println(invertCasing("MaRiAm")); 
    }

}
