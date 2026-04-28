package com.program.training.algorithm.removeduplicatesfromsortedarray;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.jupiter.api.Assertions.*;

/**
 * 26. Remove Duplicates from Sorted Array
 * @author naletov
 */
class RemoveDuplicatesFromSortedArrayAlgorithmTest {
    private static final Logger LOGGER = LoggerFactory.getLogger(RemoveDuplicatesFromSortedArrayAlgorithmTest.class);
    private static int caseNum;
    private static final String RESULT = "Result: {}";

    private int result;
    private final RemoveDuplicatesFromSortedArrayAlgorithm removeDuplicatesFromSortedArrayAlgorithm = new  RemoveDuplicatesFromSortedArrayAlgorithm();

    @BeforeEach
    void setUp()
    {
        caseNum++;
        LOGGER.info("Remove Duplicates from Sorted Array algorithm test case {}", caseNum);
    }

    @AfterEach
    void tearDown()
    {
        LOGGER.info("Finish Remove Duplicates from Sorted Array algorithm test case {}", caseNum);
    }

    @Test
    void case1()
    {
        int[] nums = {1, 2, 2};
        result = removeDuplicatesFromSortedArrayAlgorithm.removeDuplicates(nums);
        LOGGER.info(RESULT, result);
        assertEquals(2, result, "2, nums = [1,2,_]");
    }

    @Test
    void case2()
    {
        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        result = removeDuplicatesFromSortedArrayAlgorithm.removeDuplicates(nums);
        LOGGER.info(RESULT, result);
        assertEquals(5, result, "5, nums = [0,1,2,3,4,_,_,_,_,_]");
    }
}