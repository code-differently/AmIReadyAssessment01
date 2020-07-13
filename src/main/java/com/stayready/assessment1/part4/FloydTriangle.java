package com.stayready.assessment1.part4;

import java.util.ArrayList;
import java.util.HashMap;

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
    public static String generateTriangle(Integer numOfRows)
    {
        String s = "";

        int start = 1;
        for(int i = 1; i <= numOfRows; i++)
        {
            for(int j = 1; j <= i; j++)
            {
                s = s +start+" ";
                start++;
            }
            s = s.trim() + "\n";
        }

        return s.trim();
    }

    /**
     * @param row the row number
     * @return the row'th row of a floyd triangle
     */
    public static String getNthRow(Integer row)
    {
        String tri = generateTriangle(row);
        String [] countRow = tri.split("\n");
        //if I do row then it goes out of bounds
        return countRow[row - 1];
    }
}
