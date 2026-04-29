package com.program.training.algorithm.majorityelement;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.jupiter.api.Assertions.*;

/**
 * 169. Majority Element
 *
 * @author naletov
 */
class MajorityElementAlgorithmTest {
    private static final Logger LOGGER = LoggerFactory.getLogger(MajorityElementAlgorithmTest.class);
    private static int caseNum;
    private static final String RESULT = "Result: {}";

    private int result;
    private final MajorityElementAlgorithm majorityElementAlgorithm = new  MajorityElementAlgorithm();

    @BeforeEach
    void setUp()
    {
        caseNum++;
        LOGGER.info("Majority Element algorithm test case {}", caseNum);
    }

    @AfterEach
    void tearDown()
    {
        LOGGER.info("Finish Majority Element algorithm test case {}", caseNum);
    }

    @Test
    void case1()
    {
        int[] nums = {3, 2, 3};
        result = majorityElementAlgorithm.majorityElement(nums);
        LOGGER.info(RESULT, result);
        assertEquals(3, result, "3, nums = [3,2,3]");
    }

    @Test
    void case2()
    {
        int[] nums = {2, 2, 1, 1, 1, 2, 2};
        result = majorityElementAlgorithm.majorityElement(nums);
        LOGGER.info(RESULT, result);
        assertEquals(2, result, "2, nums = [2,2,1,1,1,2,2]");
    }
}