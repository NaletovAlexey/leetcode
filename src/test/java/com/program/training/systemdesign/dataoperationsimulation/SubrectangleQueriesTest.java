package com.program.training.systemdesign.dataoperationsimulation;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Q3. Subrectangle Queries
 *
 * @author naletov
 */
class SubrectangleQueriesTest
{
    private int[][] rectangle;

    @BeforeEach
    void setUp()
    {
        this.rectangle = new int[][] {
                { 1, 2, 1 },
                { 4, 3, 4 },
                { 3, 2, 1 },
                { 1, 1, 1 } };
    }

    @Test
    void testSubrectangleQueries()
    {
        SubrectangleQueries subrectangleQueries = new SubrectangleQueries(rectangle);
        // The initial rectangle (4x3) looks like:
        // 1 2 1
        // 4 3 4
        // 3 2 1
        // 1 1 1
        assertEquals(1, subrectangleQueries.getValue(0, 2));

        subrectangleQueries.updateSubrectangle(0, 0, 3, 2, 5);
        // After this update the rectangle looks like:
        // 5 5 5
        // 5 5 5
        // 5 5 5
        // 5 5 5
        assertEquals(5, subrectangleQueries.getValue(0, 2));
        assertEquals(5, subrectangleQueries.getValue(3, 1));

        subrectangleQueries.updateSubrectangle(3, 0, 3, 2, 10);
        // After this update the rectangle looks like:
        // 5   5   5
        // 5   5   5
        // 5   5   5
        // 10  10  10
        assertEquals(10, subrectangleQueries.getValue(3, 1));
        assertEquals(5, subrectangleQueries.getValue(0, 2));
    }
}