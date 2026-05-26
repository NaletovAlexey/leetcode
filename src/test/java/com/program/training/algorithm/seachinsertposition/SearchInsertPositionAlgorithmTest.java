package com.program.training.algorithm.seachinsertposition;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * 35. Search Insert Position
 *
 * @author naletov
 */
class SearchInsertPositionAlgorithmTest
{
    private static final Logger LOGGER = LoggerFactory.getLogger(SearchInsertPositionAlgorithmTest.class);
    private static int caseNum;
    private static final String RESULT = "Result: {}";

    private int result;
    private final SearchInsertPositionAlgorithm searchInsertPositionAlgorithm = new SearchInsertPositionAlgorithm();

    @BeforeEach
    void setUp()
    {
        caseNum++;
        LOGGER.info("Start Search Insert Position algorithm test case {}", caseNum);
    }

    @AfterEach
    void tearDown()
    {
        LOGGER.info("Finish Search Insert Position algorithm test case {}", caseNum);
    }

    @Test
    void case1()
    {
        int[] nums = { 1, 3, 5, 6 };
        result = searchInsertPositionAlgorithm.searchInsert(nums, 5);
        LOGGER.info(RESULT, result);
        assertEquals(2, result, "nums = [1,3,5,6], target = 5: Output 2");
    }

    @Test
    void case2()
    {
        int[] nums = { 1, 3, 5, 6 };
        result = searchInsertPositionAlgorithm.searchInsert(nums, 2);
        LOGGER.info(RESULT, result);
        assertEquals(1, result, "nums = [1,3,5,6], target = 2: Output 1");
    }

    @Test
    void case3()
    {
        int[] nums = { 1, 3, 5, 6 };
        result = searchInsertPositionAlgorithm.searchInsert(nums, 7);
        LOGGER.info(RESULT, result);
        assertEquals(4, result, "nums = [1,3,5,6], target = 7: Output 4");
    }

    @Test
    void case4()
    {
        int[] nums = { 3, 5, 6, 7 };
        result = searchInsertPositionAlgorithm.searchInsert(nums, 2);
        LOGGER.info(RESULT, result);
        assertEquals(0, result, "nums = [3,5,6,7], target = 2: Output 0");
    }
}