package com.program.training.algorithm.searchinrotatedsortedarrayii;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.jupiter.api.Assertions.*;

/**
 * 81. Search in Rotated Sorted Array II (with duplicates)
 *
 * @author naletov
 */
class SearchInRotatedSortedArrayIIAlgorithmTest
{
    private static final Logger LOGGER = LoggerFactory.getLogger(SearchInRotatedSortedArrayIIAlgorithmTest.class);
    private static final String RESULT = "Result: {}";
    private final SearchInRotatedSortedArrayIIAlgorithm searchInRotatedSortedArrayIIAlgorithm =  new SearchInRotatedSortedArrayIIAlgorithm();

    private int[] nums;
    private int target;
    private boolean result;
    private static int caseNum;

    @BeforeEach
    void setUp()
    {
        caseNum++;
        LOGGER.info("Search in Rotated Sorted Array II test case {}", caseNum);
    }

    @AfterEach
    void tearDown()
    {
        LOGGER.info("Finish Search in Rotated Sorted Array II test case {}", caseNum);
    }

    @Test
    void case1()
    {
        nums = new int[] {2,5,6,0,0,1,2};
        target = 0;
        result = searchInRotatedSortedArrayIIAlgorithm.search(nums, target);
        LOGGER.info(RESULT, result);
        assertTrue(result, "[2,5,6,0,0,1,2], target = 0");
    }

    @Test
    void case2()
    {
        nums = new int[] {2,5,6,0,0,1,2};
        target = 3;
        result = searchInRotatedSortedArrayIIAlgorithm.search(nums, target);
        LOGGER.info(RESULT, result);
        assertFalse(result, "[2,5,6,0,0,1,2], target = 0");
    }

    @Test
    void case3()
    {
        nums = new int[] {4,4,4,4,4,0,1,2};
        target = 0;
        result = searchInRotatedSortedArrayIIAlgorithm.search(nums, target);
        LOGGER.info(RESULT, result);
        assertTrue(result, "[4,4,4,4,4,0,1,2], target = 0");
    }

    @Test
    void case4()
    {
        nums = new int[] {4,4,4,4,0,1,2};
        target = 0;
        result = searchInRotatedSortedArrayIIAlgorithm.search(nums, target);
        LOGGER.info(RESULT, result);
        assertTrue(result, "[4,4,4,4,0,1,2], target = 0");
    }

    @Test
    void case5()
    {
        nums = new int[] {1,0,1,1,1};
        target = 0;
        result = searchInRotatedSortedArrayIIAlgorithm.search(nums, target);
        LOGGER.info(RESULT, result);
        assertTrue(result, "[1,0,1,1,1], target = 0");
    }
}