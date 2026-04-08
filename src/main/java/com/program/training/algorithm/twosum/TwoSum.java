package com.program.training.algorithm.twosum;

import java.util.*;

/**
 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
 *
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 * You can return the answer in any order
 *
 * @author naletov
 */
public class TwoSum
{
    public int[] twoSum(int[] nums, int target)
    {
        Map<Integer, Integer> values = new HashMap<>();
        for (int i = 0; i < nums.length; i++)
        {
            int item = target - nums[i];
            if (values.containsKey(item))
            {
                return new int[]{values.get(item), i};
            }
            values.put(nums[i], i);
        }
        return new int[]{};  // unreachable code (There is exactly one solution)
    }
}
