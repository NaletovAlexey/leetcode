package com.program.training.algorithm.foursum;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.*;

/**
 * Given an array nums of n integers, return an array of all the unique quadruplets
 *
 * <a href="https://leetcode.com/problems/4sum/">...</a>
 * You may return the answer in any order
 *
 * @author naletov
 */
public class FourSumAlgorithm
{
    private static final Logger LOGGER = LoggerFactory.getLogger(FourSumAlgorithm.class);

    /**
     * Optimal algorithm implementation with 2 pointers
     * @param nums input array
     * @return single value
     */
    public List<List<Integer>> fourSum(int[] nums, int target)
    {
        List<List<Integer>> result = new ArrayList<>();

        if (nums == null || nums.length < 4)
        {
            return result;
        }

        Arrays.sort(nums);
        int length = nums.length;
        Set<List<Integer>> check = new HashSet<>();

        for (int i = 0; i < length - 3; i++)
        {

            for (int j = i + 1; j < length - 2; j++)
            {
                int left = j + 1;
                int right = length - 1;
                while (left < right)
                {
                    if (left != j + 1 && nums[left] == nums[left - 1])
                    {
                        left++;
                        continue;
                    }
                    if (right != length - 1 && nums[right] == nums[right + 1])
                    {
                        right--;
                        continue;
                    }
                    long sum = (long)nums[i] + nums[j] + nums[left] + nums[right];
                    if (sum > target)
                    {
                        right--;
                    }
                    else if (sum < target)
                    {
                        left++;
                    }
                    else
                    {
                        if ( check.add(Arrays.asList(nums[i], nums[j], nums[left], nums[right])))
                        {
                            LOGGER.info("Added sequence: {}", Arrays.asList(nums[i], nums[j], nums[left], nums[right]));
                            result.add(Arrays.asList(nums[i], nums[j], nums[left], nums[right]));
                        }
                        left++;
                        right--;
                    }
                }
            }
        }
        return result;
    }
}
