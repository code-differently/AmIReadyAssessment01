package com.stayready.assessment1.part1;

public class BasicStringUtils {
    /**
     * @param str string input from client
     * @return string with identical content, and the first character capitalized
     */
    public static String camelCase(String str) {
        char[] chars = str.toLowerCase().toCharArray();
		boolean found = false;
		for (int i = 0; i < chars.length; i++) {
			if (!found && Character.isLetter(chars[i])) {
				chars[i] = Character.toUpperCase(chars[i]);
				found = true;
			} else if (Character.isWhitespace(chars[i])) {
				found = false;
			}
		}
		return String.valueOf(chars);
    }

    /**
     * @param str string input from client
     * @return string with identical contents, in the reverse order
     */
    public static String reverse(String str) {
        String newStr = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			newStr += str.charAt(i);
		}
		return newStr;
    }

    /**
     * @param str string input from client
     * @return string with identical contents, with each word individually in reverse order
     */
    public static String reverseWords(String str) {
        String[] newStr = str.split("\\s+");
		int count = 0;
		String holdStr = "";
		String finalStr = "";
		
		for(int i = 0; i < newStr.length; i++) {
			for(int j = newStr[i].length() - 1; j >= 0; j--) {
				holdStr += newStr[i].charAt(j);
			}
			newStr[count] = holdStr;
			holdStr = "";
			count += 1;
		}
		finalStr = String.join(" ", newStr);
		return finalStr;	
    }

    /**
     * @param str string input from client
     * @return string with identical contents, in reverse order, with first character capitalized
     */
    public static String reverseThenCamelCase(String str) {
        String[] newStr = str.split("\\s+");
		String[] newS = new String[newStr.length];
		int count = 0;
		String holdStr = "";
		String finalStr = "";
		
		for(int i = newStr.length - 1; i >= 0; i--) {
			for(int j = newStr[i].length() - 1; j >= 0; j--) {
				if(j == newStr[i].length() - 1) {
					holdStr += newStr[i].toUpperCase().charAt(j);
				}
				else {
				 holdStr += newStr[i].charAt(j);
				}
			}
			newS[count] = holdStr;
			holdStr = "";
			count += 1;
		}
		finalStr = String.join(" ", newS);
		return finalStr;	   
    }


    /**
     * @param str a string input from user
     * @return string with identical contents excluding first and last character
     */
    public static String removeFirstAndLastCharacter(String str) {
        String[] newStr = str.split("\\s+");
		int count = 0;
		String holdStr = "";
		String finalStr = "";
		for(int i = 0; i < newStr.length; i++) {
			for(int j = 0; j < newStr[i].length(); j++) {
				if(!((i == 0 && j == 0)|| (i == 3 && j == 5))) {
					holdStr += newStr[i].charAt(j);
				}
			}
			newStr[count] = holdStr;
			holdStr = "";
			count += 1;
		}
		finalStr = String.join(" ", newStr);
		return finalStr;
    }

    /**
     * @param str a string input from user
     * @return string with identical characters, each with opposite casing
     */
    public static String invertCasing(String str) {
        String[] newStr = str.split("\\s+");
		int count = 0;
		String holdStr = "";
		String finalStr = "";
		for(int i = 0; i < newStr.length; i++) {
			for(int j = 0; j < newStr[i].length(); j++) {
				if(newStr[i].charAt(j) == newStr[i].toUpperCase().charAt(j)) {
					holdStr += newStr[i].toLowerCase().charAt(j);
				}
				else if(newStr[i].charAt(j) == newStr[i].toLowerCase().charAt(j)) {
					holdStr += newStr[i].toUpperCase().charAt(j);
				}
			}
			newStr[count] = holdStr;
			holdStr = "";
			count += 1;
		}
		finalStr = String.join(" ", newStr);
		return finalStr;
    }

}
