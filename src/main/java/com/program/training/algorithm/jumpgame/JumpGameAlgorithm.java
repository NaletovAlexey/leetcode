package com.program.training.algorithm.jumpgame;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * You are given an integer array nums.
 * You are initially positioned at the array's first index,
 * and each element in the array represents your maximum jump length at that position.
 * <p>
 * Return true if you can reach the last index, or false otherwise.
 *
 * <a href="https://leetcode.com/problems/jump-game/description/">...</a>
 *
 *
 * @author naletov
 */
public class JumpGameAlgorithm
{
 private static final Logger LOGGER = LoggerFactory.getLogger(JumpGameAlgorithm.class);


    public boolean canJump(int[] nums) {

        if (nums.length == 1)
        {
            return true;
        }

        int jump = 1;
        for (int i = 0; i < nums.length; i++)
        {
            if (jump == 0)
            {
                return false;
            }
            jump--;
            LOGGER.info("Current Step and Jump: [{}, {}]", i, nums[i]);
            if (i + jump >= nums.length - 1)
            {
                return true;
            }
            if (jump < nums[i])
            {
                jump = nums[i];
            }
        }

        return false;
    }
}