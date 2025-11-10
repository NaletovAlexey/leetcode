package com.program.training.algorithm.smallestsumspairs;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

/**
 * You are given two integer arrays nums1 and nums2 sorted in non-decreasing order and an integer k.
 * Define a pair (u, v) which consists of one element from the first array and one element from the second array.
 * Return the k pairs (u1, v1), (u2, v2), ..., (uk, vk) with the smallest sums.
 *
 * <a href="https://leetcode.com/problems/find-k-pairs-with-smallest-sums/description/">...</a>
 *
 * @author naletov
 */
public class FindKPairsSmallestSumsAlgorithm
{
    private static final Logger LOGGER = LoggerFactory.getLogger(FindKPairsSmallestSumsAlgorithm.class);

    /**
     * Returns K Pairs with Smallest Sums
     * @param nums1 1st array
     * @param nums2 2d array
     * @param k pairs count
     * @return k pairs with the smallest sums
     */
    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k)
    {
        List<List<Integer>> result = new ArrayList<>();
        PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparingInt(item -> item[0]));
        // PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> (a[0] - b[0]));    // (a, b) -> Integer.compare(a[0], b[0])
        for (int i = 0; i < Math.min(nums1.length, k); i++)
        {
            pq.offer(new int[]{nums1[i] + nums2[0], i, 0});
        }

        while (result.size() < k && !pq.isEmpty())
        {
            int[] current = pq.poll();
            int index1 = current[1];
            int index2 = current[2];
            result.add(List.of(nums1[index1], nums2[index2]));
            LOGGER.info("Added pair: [{}, {}]", nums1[index1], nums2[index2]);

            if (index2 + 1 < nums2.length)
            {
                pq.offer(new int[]{nums1[index1] + nums2[index2 + 1], index1, index2 + 1});
            }
        }
        return result;
    }
}
