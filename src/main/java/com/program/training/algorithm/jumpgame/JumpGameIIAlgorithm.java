package com.program.training.algorithm.jumpgame;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * You are given a 0-indexed array of integers nums of length n. You are initially positioned at index 0.
 *
 * Each element nums[i] represents the maximum length of a forward jump from index i.
 * In other words, if you are at index i, you can jump to any index (i + j)
 *
 * Return the minimum number of jumps to reach index n - 1.
 * The test cases are generated such that you can reach index n - 1.
 *
 * <a href="https://leetcode.com/problems/jump-game/description/">...</a>
 *
 *
 * @author naletov
 */
public class JumpGameIIAlgorithm
{
 private static final Logger LOGGER = LoggerFactory.getLogger(JumpGameIIAlgorithm.class);

    /**
     * Returns min steps to reach n-1 (It's guaranteed that you can reach nums[n - 1])
     * @param nums array of steps
     * @return min steps to reach n-1
     */
    public int jump(int[] nums)
    {
        LOGGER.info("nums: {}", nums);
        int steps = 0;
        int currentJump = 0;
        int maxReachable = 0;

        if (nums.length == 1)
        {
            LOGGER.info("No any jumps: 0");
            return 0;
        }

        for (int i = 0; i < nums.length; i++)
        {
            maxReachable = Math.max(maxReachable, i + nums[i]);

            if (currentJump == i) {
                // new jump
                steps++;
                currentJump = maxReachable;  // max position
                LOGGER.info("Current Step and Jump: [{}, {}]", i, nums[i]);
                if (maxReachable >= nums.length - 1)
                {
                    return steps;
                }
            }
        }
        return steps;
    }
}