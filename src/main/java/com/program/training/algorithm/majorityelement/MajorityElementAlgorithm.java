package com.program.training.algorithm.majorityelement;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Given an array nums of size n, return the majority element.
 * The majority element is the element that appears more than ⌊n / 2⌋ times.
 * You may assume that the majority element always exists in the array.
 *
 * Follow-up: Could you solve the problem in linear time and in O(1) space?
 *
 * @author naletov
 */
public class MajorityElementAlgorithm{
    public int majorityElement(int[] nums) {    // Boyer–Moore majority vote algorithm
        int candidate = 0, count = 0;
        for (int n : nums) {
            if (count == 0) {
                candidate = n;
            }
            count += (n == candidate) ? 1 : -1;
        }
        return candidate;   // the task ensures that it prevails
    }

    // Not optimal: O(n log n)/O(1)
    public int majorityElementSort(int[] nums) {
        int[] sortedArray = Arrays.stream(nums).sorted().toArray();
        return sortedArray[nums.length/2];
    }

    // Not optimal: HashMap O(n)/O(n)
    public int majorityElementSortStreamApi(int[] nums) {
        return Arrays.stream(nums)
                .boxed()
                .collect(Collectors.groupingBy(e -> e, Collectors.counting()))
                .entrySet()
                .stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey)
                .get();
    }
}
