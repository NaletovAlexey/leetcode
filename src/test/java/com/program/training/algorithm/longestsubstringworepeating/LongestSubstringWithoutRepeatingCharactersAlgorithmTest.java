package com.program.training.algorithm.longestsubstringworepeating;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.jupiter.api.Assertions.*;

/**
 * 3. Longest Substring Without Repeating Characters
 *
 * @author naletov
 */
class LongestSubstringWithoutRepeatingCharactersAlgorithmTest
{
    private static final Logger LOGGER = LoggerFactory.getLogger(LongestSubstringWithoutRepeatingCharactersAlgorithmTest.class);
    private static int caseNum;
    private static final String RESULT = "Result: {}";

    private int result;
    private final LongestSubstringWithoutRepeatingCharactersAlgorithm longestSubstringWithoutRepeatingCharactersAlgorithm = new LongestSubstringWithoutRepeatingCharactersAlgorithm();

    @BeforeEach
    void setUp()
    {
        caseNum++;
        LOGGER.info("Start Longest Substring Without Repeating Characters algorithm test case {}", caseNum);
    }

    @AfterEach
    void tearDown()
    {
        LOGGER.info("End Longest Substring Without Repeating Characters algorithm test case {}", caseNum);
    }

    @Test
    void case1()
    {
        result = longestSubstringWithoutRepeatingCharactersAlgorithm.lengthOfLongestSubstring("abcabcbb");
        LOGGER.info(RESULT, result);
        assertEquals(3, result, "The answer is abc, with the length of 3. Note that bca and cab are also correct answers.");
    }

    @Test
    void case2()
    {
        result = longestSubstringWithoutRepeatingCharactersAlgorithm.lengthOfLongestSubstring("bbbbb");
        LOGGER.info(RESULT, result);
        assertEquals(1, result, "The answer is b, with the length of 1.");
    }

    @Test
    void case3()
    {
        result = longestSubstringWithoutRepeatingCharactersAlgorithm.lengthOfLongestSubstring("pwwkew");
        LOGGER.info(RESULT, result);
        assertEquals(3, result, "The answer is wke, with the length of 3. Notice that the answer must be a substring, pwke is a subsequence and not a substring.");
    }

    @Test
    void case4()
    {
        result = longestSubstringWithoutRepeatingCharactersAlgorithm.lengthOfLongestSubstring("");
        LOGGER.info(RESULT, result);
        assertEquals(0, result, "The answer is empty, with the length of 0.");
    }

    @Test
    void case5()
    {
        result = longestSubstringWithoutRepeatingCharactersAlgorithm.lengthOfLongestSubstring("dvdf");
        LOGGER.info(RESULT, result);
        assertEquals(3, result, "The answer is vdf, with the length of 3.");
    }

    @Test
    void case6()
    {
        result = longestSubstringWithoutRepeatingCharactersAlgorithm.lengthOfLongestSubstring("bbtablud");
        LOGGER.info(RESULT, result);
        assertEquals(6, result, "The answer is tablud, with the length of 6.");
    }
}