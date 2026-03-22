package com.program.training.algorithm.sqrtx;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.jupiter.api.Assertions.*;

/**
 * 69. Sqrt(x)
 *
 * @author naletov
 */
class SqrtXAlgorithmTest
{
    private static final Logger LOGGER = LoggerFactory.getLogger(SqrtXAlgorithmTest.class);
    private static int caseNum;
    private static final String RESULT = "Result: {}";

    private int result;

    private final SqrtXAlgorithm  sqrtXAlgorithm = new SqrtXAlgorithm();

    @BeforeEach
    void setUp()
    {
        caseNum++;
        LOGGER.info("Start Sqrt(x) algorithm test case {}", caseNum);
    }

    @AfterEach
    void tearDown()
    {
        LOGGER.info("Finish Sqrt(x) algorithm case {}", caseNum);
    }

    @Test
    void case1()
    {
        result = sqrtXAlgorithm.mySqrt(4);
        LOGGER.info(RESULT, result);
        assertEquals(2, result, "The square root of 4 is 2, so we return 2.");
    }

    @Test
    void case2()
    {
        result = sqrtXAlgorithm.mySqrt(8);
        LOGGER.info(RESULT, result);
        assertEquals(2, result, "The square root of 8 is 2.82842..., and since we round it down to the nearest integer, 2 is returned.");
    }
}