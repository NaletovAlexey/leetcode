package com.program.training.algorithm.searchinrotatedsortedarray;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * 33. Search in Rotated Sorted Array
 *
 * @author naletov
 */
class SearchInRotatedSortedArrayTest
{
    private static final Logger LOGGER = LoggerFactory.getLogger(SearchInRotatedSortedArrayTest.class);
    private static final String RESULT = "Result: {}";
    private SearchInRotatedSortedArrayAlgorithm  searchInRotatedSortedArrayAlgorithm;

    private int[] nums;
    private int target;
    private int result;

    @BeforeEach
    void setUp()
    {
        LOGGER.info("Search in Rotated Sorted Array Algorithm test case...");
        searchInRotatedSortedArrayAlgorithm =  new SearchInRotatedSortedArrayAlgorithm();
    }

    @Test
    void case1()
    {
        nums = new int[] {4,5,6,7,0,1,2};
        target = 0;
        result = searchInRotatedSortedArrayAlgorithm.search(nums, target);
        LOGGER.info(RESULT, result);
        assertEquals(4, result, "[4,5,6,7,0,1,2], target = 0");
    }

    @Test
    void case2()
    {
        nums = new int[] {4,5,6,7,0,1,2};
        target = 3;
        result = searchInRotatedSortedArrayAlgorithm.search(nums, target);
        LOGGER.info(RESULT, result);
        assertEquals(-1, result, "[4,5,6,7,0,1,2], target = 3");
    }

    @Test
    void case3()
    {
        nums = new int[] {1};
        target = 0;
        result = searchInRotatedSortedArrayAlgorithm.search(nums, target);
        LOGGER.info(RESULT, result);
        assertEquals(-1, result, "[1], target = 0");
    }

    @Test
    void case4()
    {
        nums = new int[] {3,4,5,6,7,8,0,1,2};
        target = 8;
        result = searchInRotatedSortedArrayAlgorithm.search(nums, target);
        LOGGER.info(RESULT, result);
        assertEquals(5, result, "[3,4,5,6,7,8,0,1,2], target = 8");
    }

    @Test
    void case5()
    {
        nums = new int[] {5,6,0,1,2,3,4};
        target = 0;
        result = searchInRotatedSortedArrayAlgorithm.search(nums, target);
        LOGGER.info(RESULT, result);
        assertEquals(2, result, "[5,6,0,1,2,3,4], target = 0");
    }

    @Test
    void case6()
    {
        nums = new int[] {1,3};
        target = 3;
        result = searchInRotatedSortedArrayAlgorithm.search(nums, target);
        LOGGER.info(RESULT, result);
        assertEquals(1, result, "[1,3], target = 3");
    }

    @Test
    void case7()
    {
        nums = new int[] {3,1};
        target = 3;
        result = searchInRotatedSortedArrayAlgorithm.search(nums, target);
        LOGGER.info(RESULT, result);
        assertEquals(0, result, "[3,1], target = 3");
    }

    @Test
    void case8()
    {
        nums = new int[] {3,1,2};
        target = 3;
        result = searchInRotatedSortedArrayAlgorithm.search(nums, target);
        LOGGER.info(RESULT, result);
        assertEquals(0, result, "[3,1,2], target = 3");
    }

    @Test
    void case9()
    {
        nums = new int[] {1,3,5};
        target = 5;
        result = searchInRotatedSortedArrayAlgorithm.search(nums, target);
        LOGGER.info(RESULT, result);
        assertEquals(2, result, "[1,3,5], target = 5");
    }
}