package com.program.training.algorithm.uniquepaths;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.jupiter.api.Assertions.*;

/**
 * 62. Unique Paths
 *
 * @author naletov
 */
class UniquePathsAlgorithmTest
{
    private static final Logger LOGGER = LoggerFactory.getLogger(UniquePathsAlgorithmTest.class);
    private static final String RESULT = "Result: {}";
    private final UniquePathsAlgorithm  uniquePathsAlgorithm = new UniquePathsAlgorithm();

    private int m;
    private int n;
    private int result;
    private static int caseNum;

    @BeforeEach
    void setUp()
    {
        caseNum++;
        LOGGER.info("Unique Paths test case {}", caseNum);
    }

    @AfterEach
    void tearDown()
    {
        LOGGER.info("Unique Paths test case {}", caseNum);
    }

    @Test
    void case1()
    {
        m = 3;
        n = 7;
        result = uniquePathsAlgorithm.uniquePaths(m, n);
        LOGGER.info(RESULT, result);
        assertEquals(28, result, "m = 3, n = 7. Output: 28");
    }

    @Test
    void case2()
    {
        m = 3;
        n = 2;
        result = uniquePathsAlgorithm.uniquePaths(m, n);
        LOGGER.info(RESULT, result);
        assertEquals(3, result, "m = 3, n = 2. Output: 3");
    }

    @Test
    void case3()
    {
        m = 1;
        n = 1;
        result = uniquePathsAlgorithm.uniquePaths(m, n);
        LOGGER.info(RESULT, result);
        assertEquals(1, result, "m = 1, n = 1. Output: 1");
    }
}