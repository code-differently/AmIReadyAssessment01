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
public class FloydTriangle 
{
    /**
     * @param numOfRows number of rows that should be returned by the generator
     * @return a floyd triangle completed up the numOfRows rows
     */
    public static String generateTriangle(Integer numOfRows) 
    {
        int num = 1, i,j;
        String result = "";
        for (i = 1;i <= numOfRows; i++)
        {
            for (j = 1; j <= i; j++)
            {
                result+= num;
                if (j < i)
                {
                    result+= " ";
                }
                num++;
                
            }
            result+="\n";
        }
       result = result.trim();
        return result;
    }

    /**
     * @param row the row number
     * @return the row'th row of a floyd triangle
     */
    public static String getNthRow(Integer row) 
    {
        int num = 1, i,j;
        String result = "";
        for (i = 1;i <= row; i++)
        {
            for (j = 1; j <= i; j++)
            {
                if (i == row)
                {
                   result+= num;  
                   if (j < i)
                    {
                    result+= " ";
                    }
                }
                
               
                num++;
                
            }
        }
       result = result.trim();
        return result;
    }
}
