package com.program.training.systemdesign.datastreamprocessing;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Q3. Data Stream as Disjoint Intervals
 *
 * @author naletov
 */
class SummaryRangesTest
{
    @Test
    void summaryRanges()
    {
        SummaryRanges summaryRanges = new SummaryRanges();
        summaryRanges.addNum(1);      // arr = [1]
        assertEquals(1, summaryRanges.getIntervals().length, "return [[1, 1]");
        summaryRanges.addNum(3);      // arr = [1, 3]
        assertEquals(2, summaryRanges.getIntervals().length, "return [[1, 1], [3, 3]]");
        summaryRanges.addNum(7);      // arr = [1, 3, 7]
        assertEquals(3, summaryRanges.getIntervals().length, "return [[1, 1], [3, 3], [7, 7]]");
        summaryRanges.addNum(2);      // arr = [1, 2, 3, 7]
        assertEquals(2, summaryRanges.getIntervals().length, "return [[1, 3], [7, 7]]");
        summaryRanges.addNum(6);      // arr = [1, 2, 3, 6, 7]
        assertEquals(2, summaryRanges.getIntervals().length, "return [[1, 3], [6, 7]]");
    }
}