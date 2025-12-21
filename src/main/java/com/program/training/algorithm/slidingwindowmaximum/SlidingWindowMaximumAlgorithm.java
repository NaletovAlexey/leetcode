package com.program.training.algorithm.slidingwindowmaximum;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.*;

/**
 * You are given an array of integers nums, there is a sliding window of size k which is moving from the very left of the array to the very right.
 * You can only see the k numbers in the window. Each time the sliding window moves right by one position.
 *
 * <a href="https://leetcode.com/problems/sliding-window-maximum/description/">...</a>
 *
 * @author naletov
 */
public class SlidingWindowMaximumAlgorithm
{
    private static final Logger LOGGER = LoggerFactory.getLogger(SlidingWindowMaximumAlgorithm.class);

    /**
     * Returns the max sliding window (PriorityQueue - not optimal remove - O(n)).
     * @param nums int array
     * @param k sliding window size
     * @return the max sliding window
     */
    public int[] maxSlidingWindowPriorityQueue(int[] nums, int k)
    {
        LOGGER.info("nums: {}", nums);

        PriorityQueue<Integer> window = new PriorityQueue<>(Comparator.reverseOrder());

        for (int i = 0; i < k; i++)
        {
            window.add(nums[i]);
        }

        int[] result = new int[nums.length - k + 1];

        for (int i = k; i < nums.length; i++)
        {
            result[i - k] = window.peek();
            window.remove(nums[i - k]);
            window.offer(nums[i]);
        }
        result[result.length - 1] = window.peek();

        return result;
    }

    public int[] maxSlidingWindow(int[] nums, int k)
    {
        int n = nums.length;
        int[] result = new int[n - k + 1];
        Deque<Integer> deque = new ArrayDeque<>();  // items indexes

        for (int i = 0; i < n; i++)
        {
            // Removing element that extend beyond the window boundaries
            while (!deque.isEmpty() && deque.peekFirst() < i - k + 1)
            {
                deque.pollFirst();
            }

            // Remove elements smaller than the current one (from the right)
            while (!deque.isEmpty() && nums[deque.peekLast()] < nums[i])
            {
                deque.pollLast();
            }

            deque.offerLast(i);  // Add the current index

            // forming the result from position i = k - 1
            if (i >= k - 1)
            {
                result[i - k + 1] = nums[deque.peekFirst()];
            }
        }
        return result;
    }
}
