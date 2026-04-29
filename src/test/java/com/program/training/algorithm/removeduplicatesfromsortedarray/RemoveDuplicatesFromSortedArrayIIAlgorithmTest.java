package com.program.training.algorithm.removeduplicatesfromsortedarray;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * 80. Remove Duplicates from Sorted Array II
 * @author naletov
 */
class RemoveDuplicatesFromSortedArrayIIAlgorithmTest {
    private static final Logger LOGGER = LoggerFactory.getLogger(RemoveDuplicatesFromSortedArrayIIAlgorithmTest.class);
    private static int caseNum;
    private static final String RESULT = "Result: {}";

    private int result;
    private final RemoveDuplicatesFromSortedArrayIIAlgorithm removeDuplicatesFromSortedArrayIIAlgorithm = new  RemoveDuplicatesFromSortedArrayIIAlgorithm();

    @BeforeEach
    void setUp()
    {
        caseNum++;
        LOGGER.info("Remove Duplicates from Sorted Array II algorithm test case {}", caseNum);
    }

    @AfterEach
    void tearDown()
    {
        LOGGER.info("Finish Remove Duplicates from Sorted Array II algorithm test case {}", caseNum);
    }

    @Test
    void case1()
    {
        int[] nums = {1, 1, 1, 2, 2, 3};
        result = removeDuplicatesFromSortedArrayIIAlgorithm.removeDuplicates(nums);
        LOGGER.info(RESULT, result);
        assertEquals(5, result, "5, nums = [1,1,2,2,3,_]");
    }

    @Test
    void case2()
    {
        int[] nums = {0, 0, 1, 1, 1, 1, 2, 3, 3};
        result = removeDuplicatesFromSortedArrayIIAlgorithm.removeDuplicates(nums);
        LOGGER.info(RESULT, result);
        assertEquals(7, result, "7, nums = [0,0,1,1,2,3,3,_,_]");
    }

    @Test
    void case3()
    {
        int[] nums = {};
        result = removeDuplicatesFromSortedArrayIIAlgorithm.removeDuplicates(nums);
        LOGGER.info(RESULT, result);
        assertEquals(0, result, "0, nums = []");
    }
}