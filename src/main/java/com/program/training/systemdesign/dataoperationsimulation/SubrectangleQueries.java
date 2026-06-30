package com.program.training.systemdesign.dataoperationsimulation;

import java.util.Arrays;

/**
 * Implement the class SubrectangleQueries
 * which receives a rows x cols rectangle as a matrix of integers in the constructor
 *
 * @author naletov
 */
class SubrectangleQueries {

    private final int[][] rectangle;

    /**
     * Constructor
     * @param rectangle rows x cols rectangle (matrix of integers)
     */
    public SubrectangleQueries(int[][] rectangle) {
        this.rectangle =  rectangle;
    }

    /**
     * Updates all values with newValue in the subrectangle
     * whose upper left coordinate is (row1,col1) and bottom right coordinate is (row2,col2)
     * @param row1 1st row
     * @param col1 1st column
     * @param row2 2d row
     * @param col2 2d column
     * @param newValue new value
     */
    public void updateSubrectangle(int row1, int col1, int row2, int col2, int newValue) {
        for (int x = row1; x <= row2; x++)
        {
            Arrays.fill(rectangle[x], col1, col2 + 1, newValue);
        }
    }

    /**
     * Returns the current value of the coordinate (row,col) from the rectangle.
     * @param row coordinate
     * @param col coordinate
     * @return value
     */
    public int getValue(int row, int col)
    {
        return this.rectangle[row][col];
    }
}

/**
 * Your SubrectangleQueries object will be instantiated and called as such:
 * SubrectangleQueries obj = new SubrectangleQueries(rectangle);
 * obj.updateSubrectangle(row1,col1,row2,col2,newValue);
 * int param_2 = obj.getValue(row,col);
 */
