package com.stayready.assessment1.part1;
//used for one of my answers
import java.util.Stack;

public class BasicStringUtils {
    public static void main(String [] args) {
        String ans = reverseWords("she sells sea shells");
        System.out.println(ans);
    }

    /**
     * @param str string input from client
     * @return string with identical content, and the first character capitalized
     */
    public static String camelCase(String str) {
        //splitting it at spaces
        String [] arrString = str.split(" ");
        //using this so that the last word does not have a space
        //count will be equal to 1 so that its easier to compare
        int length = arrString.length, count = 1;
        String first = "", rest = "", ans = "";
        for(String word: arrString) {
            //first letter is upper cased
            first = word.substring(0, 1).toUpperCase();
            //the rest
            rest = word.substring(1);
            //need the space to reflect how the original string was formatted
            //last word shouldn't have a space
            if(count != length) {
                ans += first + rest + " ";
            }
            //count is equal to length
            else {
                ans += first + rest;
            }
            count++;
            
        }
        //the first letter is upper case, the rest is the same
        return ans; 
    }

    /**
     * @param str string input from client
     * @return string with identical contents, in the reverse order
     */
    public static String reverse(String str) {
        //using StringBuilder because its more efficent then doing the overloaded operator Strings use 
       StringBuilder reversed = new StringBuilder();
       //not starting at length because it would be out of bounds
       //going to = because it should 
       for(int index = str.length() - 1; index >= 0; index--) {
        reversed.append(str.charAt(index));
       }
       //have to convert it back to a string
       return reversed.toString();
    }

    /**
     * @param str string input from client
     * @return string with identical contents, with each word individually in reverse order
     */
    public static String reverseWords(String str) {
        Stack <Character> stack = new Stack <Character>();
        StringBuilder ans = new StringBuilder();
        
        //looping through the string normally because the stack will add characters to the top so when it is time to pop it will be in reverse order
        for(int i = 0; i < str.length(); i++) {
            //used this variable a couple of times so that's why I created it
            char temp = str.charAt(i);
            if(temp != ' ') {
                stack.push(temp);
            }
            // there is a space, pop the characters out
            else {
                putReverseString(stack, ans, true);
            }
        }
        //there might be a word without a space at the end
        //you don't need to put a space for the last word
        if(stack.isEmpty() == false) {
            putReverseString(stack, ans, false);
        }
        return ans.toString();
    }

    //don't need to pass anything back because of ailising
    public static void putReverseString(Stack <Character> stack, StringBuilder ans, boolean putSpace) {
        while(stack.isEmpty() == false) {
            ans.append(stack.pop());
        }
        //need to have a space in between words so that when the main function returns there will be spaces
        //only put space when you need to put a space
        if(putSpace == true) {
            ans.append(' ');
        }
    }

    /**
     * @param str string input from client
     * @return string with identical contents, in reverse order, with first character capitalized
     */
    public static String reverseThenCamelCase(String str) {
        //first reverses it, then does camel case on the first letter of the reversed string
        return camelCase(reverse(str));
    }


    /**
     * @param str a string input from user
     * @return string with identical contents excluding first and last character
     */
    public static String removeFirstAndLastCharacter(String str) {
        return str.substring(1, str.length() - 1); 
    }

    /**
     * @param str a string input from user
     * @return string with identical characters, each with opposite casing
     */
    public static String invertCasing(String str) {
        //loops through the string and changes the casing of each individual character
        char [] charArr = str.toCharArray();
        for(int i = 0; i < charArr.length; i++) {
            if(Character.isUpperCase(charArr[i])) {
                charArr[i] = Character.toLowerCase(charArr[i]);
            }
            else if(Character.isLowerCase(charArr[i])) {
                charArr[i] = Character.toUpperCase(charArr[i]);
            }
        }
        // allows me to return a string and not a charArr
        return new String(charArr);
    }

}
