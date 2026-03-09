package com.program.training.algorithm.removeinvalidparentheses;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * 301. Remove Invalid Parentheses
 *
 * @author naletov
 */
class RemoveInvalidParenthesesAlgorithmTest
{
    public static final Logger LOGGER = LoggerFactory.getLogger(RemoveInvalidParenthesesAlgorithmTest.class);
    public static final String RESULT = "Result: {}";
    RemoveInvalidParenthesesAlgorithm removeInvalidParenthesesAlgorithm;

    @BeforeEach
    void setUp()
    {
        LOGGER.info("Remove Invalid Parentheses Algorithm test case...");
        removeInvalidParenthesesAlgorithm = new RemoveInvalidParenthesesAlgorithm();
    }

    @Test
    void removeInvalidParenthesesCase1()
    {
        String s = "()())()";
        String expected = "[(())(), ()()()]";
        String case1 = removeInvalidParenthesesAlgorithm.removeInvalidParentheses(s).toString();
        LOGGER.info(RESULT, case1);
        assertEquals(expected, case1);
    }

    @Test
    void removeInvalidParenthesesCase2()
    {
        String s = "(a)())()";
        String expected = "[(a())(), (a)()()]";
        String case2 = removeInvalidParenthesesAlgorithm.removeInvalidParentheses(s).toString();
        LOGGER.info(RESULT, case2);
        assertEquals(expected, case2);
    }

    @Test
    void removeInvalidParenthesesCase3()
    {
        String s = ")(";
        String expected = "[]";
        String case3 = removeInvalidParenthesesAlgorithm.removeInvalidParentheses(s).toString();
        LOGGER.info(RESULT, case3);
        assertEquals(expected, case3);
    }
}