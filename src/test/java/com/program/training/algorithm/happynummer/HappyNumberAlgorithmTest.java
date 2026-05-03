package com.program.training.algorithm.happynummer;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.jupiter.api.Assertions.*;

/**
 * 202. Happy Number
 *
 * @author naletov
 */
class HappyNumberAlgorithmTest {
    private static final Logger LOGGER = LoggerFactory.getLogger(HappyNumberAlgorithmTest.class);
    private static int caseNum;
    private static final String RESULT = "Result: {}";

    private boolean result;
    private final HappyNumberAlgorithm happyNumberAlgorithm = new  HappyNumberAlgorithm();

    @BeforeEach
    void setUp()
    {
        caseNum++;
        LOGGER.info("Happy Number algorithm test case {}", caseNum);
    }

    @AfterEach
    void tearDown()
    {
        LOGGER.info("Finish Happy Number algorithm test case {}", caseNum);
    }

    @Test
    void case1()
    {
        int n = 19;
        result = happyNumberAlgorithm.isHappy(n);
        LOGGER.info(RESULT, result);
        assertTrue(result, "true, n = 19");
        assertEquals(result, happyNumberAlgorithm.isHappyOptimal(n), "isHappyOptimal agrees with isHappy");
    }

    @Test
    void case2()
    {
        int n = 2;
        result = happyNumberAlgorithm.isHappy(n);
        LOGGER.info(RESULT, result);
        assertFalse(result, "false, n = 2");
        assertEquals(result, happyNumberAlgorithm.isHappyOptimal(n), "isHappyOptimal agrees with isHappy");
    }
}