package com.program.training.algorithm.insertionoftwoarrays;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.*;

/**
 * 349. Intersection of Two Arrays
 *
 * @author naletov
 */
class IntersectionOfTwoArraysTest
{
    private static final Logger LOGGER = LoggerFactory.getLogger(IntersectionOfTwoArraysTest.class);
    private static int caseNum;
    private static final String RESULT = "Result: {}";

    private int [] result;
    private final IntersectionOfTwoArrays intersectionOfTwoArrays = new  IntersectionOfTwoArrays();

    @BeforeEach
    void setUp()
    {
        caseNum++;
        LOGGER.info("Intersection of Two Arrays algorithm test case {}", caseNum);
    }

    @AfterEach
    void tearDown()
    {
        LOGGER.info("Intersection of Two Arrays algorithm test case {}", caseNum);
    }

    @Test
    void case1()
    {
        int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {2, 2};
        result = intersectionOfTwoArrays.intersection(nums1, nums2);
        Arrays.sort(result);
        LOGGER.info(RESULT, result);
        assertTrue(result[0] == 2,  "nums1 = [1,2,2,1], nums2 = [2,2]. Result: [2]");
    }

    @Test
    void case2()
    {
        int[] nums1 = {4, 9, 5};
        int[] nums2 = {9, 4, 9, 8, 4};
        result = intersectionOfTwoArrays.intersection(nums1, nums2);
        // can be in any order - sorting to have certain order
        result = Arrays.stream(result).boxed().sorted(Collections.reverseOrder()).mapToInt(Integer::intValue).toArray();

        LOGGER.info(RESULT, result);
        assertEquals(2, result.length, "nums1 = [4, 9, 5], nums2 = [9, 4, 9, 8, 4]. Result: [9, 4].length == 2");
        assertTrue(result[0] == 9 && result[1] == 4,  "nums1 = [4, 9, 5], nums2 = [9, 4, 9, 8, 4]. Result: [9, 4]");
    }
}