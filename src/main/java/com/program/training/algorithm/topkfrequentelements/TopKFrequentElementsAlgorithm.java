package com.program.training.algorithm.topkfrequentelements;

import java.util.*;

/**
 * Given an integer array nums and an integer k, return the k most frequent elements.
 * You may return the answer in any order.
 *
 * <a href="https://leetcode.com/problems/top-k-frequent-elements/description/">...</a>
 *
 * @author naletov
 */
public class TopKFrequentElementsAlgorithm
{
    //private static final Logger LOGGER = LoggerFactory.getLogger(TopKFrequentElementsAlgorithm.class);

    /**
     * Returns the k most frequent elements
     * @param nums array of integer
     * @param k amount of elements
     * @return sorted by the frequency from highest to lowest k most frequent elements
     */
    public int[] topKFrequent(int[] nums, int k)
    {
        HashMap<Integer, Integer> elementsMap = new HashMap<>();
        Arrays.stream(nums).forEach(num -> elementsMap.merge(num, 1, Integer::sum));

        return elementsMap.entrySet().stream()
                .sorted(Map.Entry.<Integer, Integer>comparingByValue().reversed()
                .thenComparing(Map.Entry.comparingByKey()))
                .limit(k)
                .map(Map.Entry::getKey)
                .mapToInt(Integer::intValue)
                .toArray();
    }

    /**
     * Returns the k most frequent elements (using PriorityQueue)
     * @param nums array of integer
     * @param k amount of elements
     * @return sorted by the frequency from highest to lowest k most frequent elements
     */
    public int[] topKFrequentPQ(int[] nums, int k)
    {
        HashMap<Integer, Integer> elementsMap = new HashMap<>();
        Arrays.stream(nums).forEach(num -> elementsMap.merge(num, 1, Integer::sum));

        Comparator<Map.Entry<Integer, Integer>> pqComparator =
                Map.Entry.<Integer, Integer>comparingByValue()
                        .reversed()
                        .thenComparing(Map.Entry.comparingByKey());

        PriorityQueue<Map.Entry<Integer, Integer>> sortedElements = new PriorityQueue<>(pqComparator);
        sortedElements.addAll(elementsMap.entrySet());

        int[] topKKeys = new int[k];
        for (int i = 0; i < k; i++)
        {
            topKKeys[i] = sortedElements.poll().getKey();
        }

        return topKKeys;
    }
}
