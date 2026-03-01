package com.program.training.algorithm.validparentheses;

import com.program.training.test.data.ValidParenthesesAlgorithmData;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * 20. Valid Parentheses
 * Test class
 * @author naletov
 */
class ValidParenthesesAlgorithmTest
{
    public static final Logger LOGGER = LoggerFactory.getLogger(ValidParenthesesAlgorithmTest.class);
    public static final String RESULT = "Result: {}";
    ValidParenthesesAlgorithm validParenthesesAlgorithm;

    @BeforeEach
    void setUp()
    {
        LOGGER.info("Starting Valid Parentheses Algorithm test case...");
        validParenthesesAlgorithm = new ValidParenthesesAlgorithm();
    }

    @AfterEach
    void destroy()
    {
        LOGGER.info("Finished Valid Parentheses Algorithm test case...");
    }

    @Test
    void isValidParenthesesTestCase1()
    {
        boolean case1 = validParenthesesAlgorithm.isValid(ValidParenthesesAlgorithmData.s_1);
        LOGGER.info(RESULT, case1);
        assertTrue(case1, "()");
    }

    @Test
    void isValidParenthesesTestCase2()
    {
        boolean case2 = validParenthesesAlgorithm.isValid(ValidParenthesesAlgorithmData.s_2);
        LOGGER.info(RESULT, case2);
        assertTrue(case2, "()[]{}");
    }

    @Test
    void isValidParenthesesTestCase3()
    {
        boolean case3 = validParenthesesAlgorithm.isValid(ValidParenthesesAlgorithmData.s_3);
        LOGGER.info(RESULT, case3);
        assertFalse(case3, "(]");
    }

    @Test
    void isValidParenthesesTestCase4()
    {
        boolean case4 = validParenthesesAlgorithm.isValid(ValidParenthesesAlgorithmData.s_4);
        LOGGER.info(RESULT, case4);
        assertTrue(case4, "([])");
    }

    @Test
    void isValidParenthesesTestCase5()
    {
        boolean case5 = validParenthesesAlgorithm.isValid(ValidParenthesesAlgorithmData.s_5);
        LOGGER.info(RESULT, case5);
        assertFalse(case5, "([)]");
    }

    @Test
    void isValidParenthesesTestCase6()
    {
        boolean case6 = validParenthesesAlgorithm.isValid(ValidParenthesesAlgorithmData.s_6);
        LOGGER.info(RESULT, case6);
        assertFalse(case6, "(");
    }

    @Test
    void isValidParenthesesTestCase7()
    {
        boolean case7 = validParenthesesAlgorithm.isValid(ValidParenthesesAlgorithmData.s_7);
        LOGGER.info(RESULT, case7);
        assertFalse(case7, "()[");
    }
}