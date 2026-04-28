package com.program.training.algorithm.removeelement;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.jupiter.api.Assertions.*;

/**
 * 27. Remove Element
 * @author naletov
 */
class RemoveElementAlgorithmTest {
    private static final Logger LOGGER = LoggerFactory.getLogger(RemoveElementAlgorithmTest.class);
    private static int caseNum;
    private static final String RESULT = "Result: {}";

    private int result;
    private final RemoveElementAlgorithm removeElementAlgorithm = new  RemoveElementAlgorithm();

    @BeforeEach
    void setUp()
    {
        caseNum++;
        LOGGER.info("Remove Element algorithm test case {}", caseNum);
    }

    @AfterEach
    void tearDown()
    {
        LOGGER.info("Finish Remove Element algorithm test case {}", caseNum);
    }

    @Test
    void case1()
    {
        int[] nums = {3, 2, 2, 3};
        result = removeElementAlgorithm.removeElement(nums, 3);
        LOGGER.info(RESULT, result);
        assertEquals(2, result, "2, nums = [2,2,_,_]");
    }

    @Test
    void case2()
    {
        int[] nums = {0, 1, 2, 2, 3, 0, 4, 2};
        result = removeElementAlgorithm.removeElement(nums, 2);
        LOGGER.info(RESULT, result);
        assertEquals(5, result, "5, nums = [0, 0, 1, 3, 4,_,_,_]");
    }
}