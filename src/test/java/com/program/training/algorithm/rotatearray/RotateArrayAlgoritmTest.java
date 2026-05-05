package com.program.training.algorithm.rotatearray;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.jupiter.api.Assertions.*;

/**
 * 189. Rotate Array
 *
 * @author naletov
 */
class RotateArrayAlgoritmTest
{
    private static final Logger LOGGER = LoggerFactory.getLogger(RotateArrayAlgoritmTest.class);
    private static int caseNum;
    //private static final String RESULT = "Result: {}";

    //private int[] result;
    private final RotateArrayAlgoritm rotateArrayAlgoritm = new  RotateArrayAlgoritm();

    @BeforeEach
    void setUp()
    {
        caseNum++;
        LOGGER.info("Rotate Array algorithm test case {}", caseNum);
    }

    @AfterEach
    void tearDown()
    {
        LOGGER.info("Finish Rotate Array algorithm test case {}", caseNum);
    }

    @Test
    void case1()
    {
        int[] nums = { 1, 2, 3, 4, 5, 6, 7 };
        rotateArrayAlgoritm.rotate(nums, 3);
        //LOGGER.info(RESULT, result);
        assertArrayEquals( new int[]{5, 6, 7, 1, 2, 3, 4}, nums, "[1,2,3,4,5,6,7], k = 3 -> result [5,6,7,1,2,3,4]");
    }

    @Test
    void case2()
    {
        int[] nums = { -1, -100, 3, 99 };
        rotateArrayAlgoritm.rotate(nums, 2);
        //LOGGER.info(RESULT, result);
        assertArrayEquals( new int[] { 3, 99, -1, -100 }, nums, "[-1,-100,3,99], k = 2 -> result [3,99,-1,-100]");
    }
}