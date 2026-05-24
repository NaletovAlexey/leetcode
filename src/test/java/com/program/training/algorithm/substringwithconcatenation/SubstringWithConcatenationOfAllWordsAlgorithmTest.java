package com.program.training.algorithm.substringwithconcatenation;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * 30. Substring with Concatenation of All Words
 *
 * @author naletov
 */
class SubstringWithConcatenationOfAllWordsAlgorithmTest
{
    private static final Logger LOGGER = LoggerFactory.getLogger(SubstringWithConcatenationOfAllWordsAlgorithmTest.class);
    private static int caseNum;
    private static final String RESULT = "Result: {}";

    private List<Integer> result;
    private final SubstringWithConcatenationOfAllWordsAlgorithm substringWithConcatenationOfAllWordsAlgorithm = new SubstringWithConcatenationOfAllWordsAlgorithm();

    @BeforeEach
    void setUp()
    {
        caseNum++;
        LOGGER.info("Start Substring with Concatenation of All Words algorithm test case {}", caseNum);
    }

    @AfterEach
    void tearDown()
    {
        LOGGER.info("End Substring with Concatenation of All Words algorithm test case {}", caseNum);
    }

    @Test
    void case1()
    {
        String s = "barfoothefoobarman";
        String[] words = {"foo", "bar"};
        result = substringWithConcatenationOfAllWordsAlgorithm.findSubstring(s, words);
        LOGGER.info(RESULT, result);
        assertEquals(2, result.size(), "Output: [0,9]: size 2");
        assertEquals("[0, 9]", result.toString(), "Output: [0,9]");
    }

    @Test
    void case2()
    {
        String s = "wordgoodgoodgoodbestword";
        String[] words = { "word", "good", "best", "word" };
        result = substringWithConcatenationOfAllWordsAlgorithm.findSubstring(s, words);
        LOGGER.info(RESULT, result);
        assertEquals(0, result.size(), "[]: size 0");
    }

    @Test
    void case3()
    {
        String s = "barfoofoobarthefoobarman";
        String[] words = { "bar", "foo", "the" };
        result = substringWithConcatenationOfAllWordsAlgorithm.findSubstring(s, words);
        LOGGER.info(RESULT, result);
        assertEquals(3, result.size(), "[6,9,12]: size 3");
        assertEquals("[6, 9, 12]", result.toString(), "[6,9,12]");
    }
}