package com.program.training.systemdesign.dataoperationsimulation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Q2. Range Frequency Queries
 *
 * @author naletov
 */
class RangeFreqQueryTest
{
    @Test
    void testRangeFreqQuery()
    {
        int[] inputArray = {12, 33, 4, 56, 22, 2, 34, 33, 22, 12, 34, 56};
        RangeFreqQuery rangeFreqQuery = new RangeFreqQuery(inputArray);
        assertEquals(1,  rangeFreqQuery.query(1, 2, 4),
                "return 1. The value 4 occurs 1 time in the subarray [33, 4]");
        assertEquals(2,   rangeFreqQuery.query(0, 11, 33),
                "return 2. The value 33 occurs 2 times in the whole array");
    }
}