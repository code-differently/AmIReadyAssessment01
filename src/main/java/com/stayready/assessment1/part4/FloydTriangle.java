package com.stayready.assessment1.part4;

/**
 * Floyd's triangle is a right-angled triangular array of natural numbers.
 * It is defined by filling the rows of the triangle with consecutive numbers,
 * starting with a 1 in the top left corner:
 *
 * 1
 * 2 	3
 * 4 	5 	6
 * 7 	8 	9 	10
 *
 * https://en.wikipedia.org/wiki/Floyd%27s_triangle
 */
public class FloydTriangle {
    /**
     * @param numOfRows number of rows that should be returned by the generator
     * @return a floyd triangle completed up the numOfRows rows
     */
    public static String generateTriangle(Integer numOfRows) { 
        String ans = ""; 
        int num = 1;
        for(int row = 1; row <= numOfRows; row++){
            for(int col= 1; col <= row; col++){
                    ans += num + " ";
                    num++;
            }
            if(row != numOfRows){  
                ans += "\n"; //make sure to add a new line
            }  
        }

        return ans;
    }

    /**
     * @param row the row number
     * @return the row'th row of a floyd triangle
     */
    public static String getNthRow(Integer row) {
        String triangle = generateTriangle(row);
        String[] answer = triangle.split("\n");
        return answer[row -1];
    }
}
