package com.program.training.algorithm.editdistance;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.jupiter.api.Assertions.*;

/**
 * 72. Edit Distance
 * @author naletov
 */
class EditDistanceAlgorithmTest
{
    private static final Logger LOGGER = LoggerFactory.getLogger(EditDistanceAlgorithmTest.class);
    private static int caseNum;
    private static final String RESULT = "Result: {}";

    private int result;
    private final EditDistanceAlgorithm editDistanceAlgorithm = new EditDistanceAlgorithm();

    @BeforeEach
    void setUp()
    {
        caseNum++;
        LOGGER.info("Start Edit Distance algorithm test case {}", caseNum);
    }

    @AfterEach
    void tearDown()
    {
        LOGGER.info("End Edit Distance algorithm test case {}", caseNum);
    }

    @Test
    void case1()
    {
        result = editDistanceAlgorithm.minDistance("horse", "ros");
        LOGGER.info(RESULT, result);
        assertEquals(3, result, "word1 = horse, word2 = ros. Result: 3 - horse -> rorse; rorse -> rose; rose -> ros");
    }

    @Test
    void case2()
    {
        result = editDistanceAlgorithm.minDistance("intention", "execution");
        LOGGER.info(RESULT, result);
        assertEquals(5, result, "word1 = intention, word2 = execution. Result: 3");
    }
}