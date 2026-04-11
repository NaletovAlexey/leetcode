package com.program.training.algorithm.insertionoftwoarrays;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Given two integer arrays nums1 and nums2, return an array of their intersection.
 * Each element in the result must be unique and you may return the result in any order.
 *
 * <a href="https://leetcode.com/problems/intersection-of-two-arrays/description/?envType=problem-list-v2&envId=binary-search">...</a>
 *
 * @author naletov
 */
public class IntersectionOfTwoArrays
{
    //private static final Logger LOGGER = LoggerFactory.getLogger(IntersectionOfTwoArrays.class);

    public int[] intersection(int[] nums1, int[] nums2)
    {
        Set<Integer> num1Set = Arrays.stream(nums1).boxed().collect(Collectors.toSet());
        Set<Integer> result = new HashSet<>();
        for (int i : nums2)
        {
            if (num1Set.contains(i))
            {
                result.add(i);
            }
        }
        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}
