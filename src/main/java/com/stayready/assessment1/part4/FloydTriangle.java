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
        int count = 1;
        int rowNum = 1;
        StringBuilder triangle = new StringBuilder();
        for (int i = 0; i < numOfRows; i++) {
            for (int k = 0; k < rowNum; k++) {
                if (k < rowNum - 1) {
                    triangle.append(count + " ");
                    count++;
                } else {
                    triangle.append(count);
                    count++;
                }
            }
            rowNum++;
            if (i < numOfRows - 1) {
                triangle.append("\n");
            }
        }
        System.out.println(triangle.toString());
        return triangle.toString();
    }

    /**
     * @param row the row number
     * @return the row'th row of a floyd triangle
     */
    public static String getNthRow(Integer row) {
        int count = 1;
        int rowNum = 1;
        StringBuilder triangle = new StringBuilder();
        StringBuilder rowT = new StringBuilder();
        for (int i = 0; i < row; i++) {
            for (int k = 0; k < rowNum; k++) {
                if (k < rowNum - 1) {
                    triangle.append(count + " ");
                    rowT.append(count + " ");
                    count++;
                } else {
                    triangle.append(count);
                    rowT.append(count);
                    count++;
                }
            } 
            rowNum++;
            if (i < row - 1) {
                triangle.append("\n");
            }
            if (i == row - 1) {
               return rowT.toString();
            }
            rowT.setLength(0);
        }
        System.out.println(triangle.toString());
        return triangle.toString();
    }
}
