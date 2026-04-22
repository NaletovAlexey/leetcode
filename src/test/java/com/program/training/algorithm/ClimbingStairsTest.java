package com.program.training.algorithm;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.jupiter.api.Assertions.*;

/**
 * 70. Climbing Stairs
 *
 * @author naletov
 */
class ClimbingStairsTest
{
    private static final Logger LOGGER = LoggerFactory.getLogger(ClimbingStairsTest.class);
    private static int caseNum;
    private static final String RESULT = "Result: {}";

    private int result;
    private final ClimbingStairs climbingStairs = new  ClimbingStairs();

    @BeforeEach
    void setUp()
    {
        caseNum++;
        LOGGER.info("Climbing Stairs algorithm test case {}", caseNum);
    }

    @AfterEach
    void tearDown()
    {
        LOGGER.info("Finish Climbing Stairs algorithm test case {}", caseNum);
    }

    @Test
    void case1()
    {
        result = climbingStairs.climbStairs(2);
        LOGGER.info(RESULT, result);
        assertEquals(2, result, "There are two ways to climb to the top");
    }

    @Test
    void case2()
    {
        result = climbingStairs.climbStairs(3);
        LOGGER.info(RESULT, result);
        assertEquals(3, result, "There are three ways to climb to the top");
    }

    @Test
    void case3()
    {
        // 1 1 1 1
        // 2 1 1
        // 1 2 1
        // 1 1 2
        // 2 2

        result = climbingStairs.climbStairs(4);
        LOGGER.info(RESULT, result);
        assertEquals(5, result, "There are five ways to climb to the top");
    }
}