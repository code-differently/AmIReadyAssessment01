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
        String strTriangle = "";
        //int [][] triangle = new int [numOfRows][];
        //triangle starts at 1
        int whatElement = 1;
        //int remaining = 0;
        //each row will have one more than the previous row
        //using < instead of <= because I did not use numOfRows + 1 above
        //creating the different arrays
        // for(int row = 0; row < numOfRows; row++) {
        //     triangle[row] = new int [row + 1];
        // }
        // int whichNum = 1;
        for(int i = 0; i < numOfRows; i++) {
            for(int j = 0; j < i + 1; j++) {
                //put a space if there is another number in the sequence, otherwise don't
                if(i + 1 - j > 1) {
                    strTriangle += whatElement + " ";
                }
                else {
                    strTriangle += whatElement;
                }
                whatElement++;
            }
            //don't put a new line if your at the end of all of the rows
            if(i + 1 != numOfRows) {
                strTriangle += "\n";
            }
        }

        // //populating the array
        // for(int row = 0; row < triangle.length; row++) {
        //     for(int col = 0; col < triangle[row].length; col++) {
        //         remaining = triangle[row].length;
        //         //put a space if there is another number in the sequence, otherwise don't
        //         if(remaining - col > 1) {
        //             strTriangle += whatElement + " ";
        //         } 
        //         else {
        //             strTriangle += whatElement;
        //         }
        //         whatElement++;
        //     }
        //     //don't put a new line if your at the end of all of the rows
        //     if(row + 1 != triangle.length) {
        //         strTriangle += "\n";
        //     }
        // }
        return strTriangle;
    }

    /**
     * @param row the row number
     * @return the row'th row of a floyd triangle
     */
    public static String getNthRow(Integer row) {
        String triangle = generateTriangle(row);
        String [] allRows = triangle.split("\n");
        //if I do row then it goes out of bounds
        return allRows[row - 1];
    }
}
