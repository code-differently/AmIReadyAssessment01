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
        StringBuilder triangle = new StringBuilder();
        int[][] floyd = new int[numOfRows][];
        int count = 1;

        for(int i = 0; i < numOfRows; i++) {
            floyd[i] = new int[i + 1];
        }
        for(int j = 0; j < floyd.length; j++) {
            for(int n = 0; n < floyd[j].length; n++) {
                floyd[j][n] = count;
                count++;
            }
        }

        for(int row = 0; row < floyd.length; row++) {
            for(int col = 0; col < floyd[row].length; col++) {
                triangle.append(floyd[row][col]);
                if(col != floyd[row].length -1)
                    triangle.append(" ");
            }
            if(row != floyd.length-1)
                triangle.append("\n");
        }

        return triangle.toString();
    }

    /**
     * @param row the row number
     * @return the row'th row of a floyd triangle
     */
    public static String getNthRow(Integer row) {
        StringBuilder triangle = new StringBuilder();
        int[][] floyd = new int[row][];
        int count = 1;

        for(int i = 0; i < row; i++) {
            floyd[i] = new int[i + 1];
        }
        for(int j = 0; j < floyd.length; j++) {
            for(int n = 0; n < floyd[j].length; n++) {
                floyd[j][n] = count;
                count++;
            }
        }

        for(int k = 0; k < floyd[row].length; k++) {
            triangle.append(floyd[row][k]);
            if(k != floyd[row].length-1)
                triangle.append(" ");
        }

        return triangle.toString();
    }
}
