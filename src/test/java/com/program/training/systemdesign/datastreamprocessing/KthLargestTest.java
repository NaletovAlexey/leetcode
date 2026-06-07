package com.program.training.systemdesign.datastreamprocessing;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Q1. Kth Largest Element in a Stream
 *
 * @author naletov
 */
class KthLargestTest
{
    int[] nums;
    @Test
    void testKthLargestCaseOne()
    {
        nums = new int[] { 4, 5, 8, 2 };
        KthLargest kthLargest = new KthLargest(3, nums);

        assertEquals(4, kthLargest.add(3), "return 4");
        assertEquals(5, kthLargest.add(5), "return 5");
        assertEquals(5, kthLargest.add(10), "return 5");
        assertEquals(8, kthLargest.add(8), "return 8");
        assertEquals(8, kthLargest.add(8), "return 8");
    }

    @Test
    void testKthLargestCaseTwo()
    {
        nums = new int[] { 7, 7, 7, 7, 8, 3 };
        KthLargest kthLargest = new KthLargest(4, nums);

        assertEquals(7, kthLargest.add(2), "return 7");
        assertEquals(7, kthLargest.add(10), "return 7");
        assertEquals(7, kthLargest.add(9), "return 7");
        assertEquals(8, kthLargest.add(9), "return 8");
    }
}