package com.program.training.algorithm.singlenumber;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.
 * You must implement a solution with a linear runtime complexity and use only constant extra space.
 *
 * <a href="https://leetcode.com/problems/single-number/description/">...</a>
 *
 * @author naletov
 */
public class SingleNumberAlgorithm
{
    private static final Logger LOGGER = LoggerFactory.getLogger(SingleNumberAlgorithm.class);

    /**
     * Optimal algorithm implementation with using XOR
     * @param nums input array
     * @return single value
     */
    public int singleNumber(int[] nums)
    {
        int single = 0;
        for (int num : nums)
        {
            single ^= num;
        }
        return single;
    }

    /**
     * Algorithm implementation with using pair compare
     * @param nums input array
     * @return single value
     */
    public int singleNumberV1(int[] nums)
    {
        if (nums.length == 1)
        {
            return nums[0];
        }

        List<Integer> list = Arrays.stream(nums).sorted().boxed().toList();

        Optional<Integer> result = IntStream.range(0, list.size() / 2)
                .filter(i -> !list.get(2 * i).equals(list.get(2 * i + 1)))
                .mapToObj(i -> list.get(2 * i))
                .findFirst();

        return result.orElse(list.getLast());
    }

    /**
     * Algorithm implementation with using StreamBuilder (only 0..9)
     * @param nums input array
     * @return single value
     */
    public int singleNumberV2(int[] nums)
    {
        if (nums.length == 1)
        {
            return nums[0];
        }

        StringBuilder result = new StringBuilder();
        result.append(nums[0]);

        for (int i = 1; i < nums.length; i++)
        {
            LOGGER.info("Check {} from {}", nums[i - 1], nums);
            if (result.indexOf(String.valueOf(nums[i])) != -1)
            {
                result.deleteCharAt(result.indexOf(String.valueOf(nums[i])));
            } else
            {
                result.append(nums[i]);
            }
        }
        return Integer.parseInt(result.toString());
    }
}
