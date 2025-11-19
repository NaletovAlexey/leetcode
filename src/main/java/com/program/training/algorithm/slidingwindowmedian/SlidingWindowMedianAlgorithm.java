package com.program.training.algorithm.slidingwindowmedian;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;
import java.util.stream.Collectors;

/**
 * The median is the middle value in an ordered integer list. If the size of the list is even,
 * there is no middle value. So the median is the mean of the two middle values.
 *
 * You are given an integer array nums and an integer k.
 * There is a sliding window of size k which is moving from the very left of the array to the very right.
 * You can only see the k numbers in the window. Each time the sliding window moves right by one position.
 *
 * <a href="https://leetcode.com/problems/sliding-window-median/description/">...</a>
 *
 * @author naletov
 */
public class SlidingWindowMedianAlgorithm
{
    private static final Logger LOGGER = LoggerFactory.getLogger(SlidingWindowMedianAlgorithm.class);

    /**
     * Returns the median array for each window in the original array (not optimal)
     * @param nums int array
     * @param k sliding window size
     * @return median array
     */
    public double[] medianSlidingWindowNotOptimal(int[] nums, int k) {

        double[] result = new double[nums.length - k + 1];
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int[] window;
        for (int i = 0; i < nums.length; i++)
        {
            pq.offer(nums[i]);

            if (i + 1 >= k)
            {
                window = pq.stream().mapToInt(Integer::intValue).sorted().toArray();
                double median = k % 2 == 0 ? (window[k/2] + (long)window[k/2 - 1]) / 2.0
                                                    : (double) window[k/2];
                result[i+1-k] = median;
                LOGGER.info("Median {}: {}", i + 2 - k, median);
                pq.remove(nums[i+1-k]);
            }
        }
        return result;
    }

    /**
     * Returns the median array for each window in the original array
     * @param nums int array
     * @param k sliding window size
     * @return median array
     */
    public double[] medianSlidingWindowPriorityQueue(int[] nums, int k)
    {
        double[] result = new double[nums.length - k + 1];

        PriorityQueue<Integer> minHeap = new PriorityQueue<>(Collections.reverseOrder());   // min value elements
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>();                             // max value elements

        for (int i = 0; i < nums.length; i++)
        {
            minHeap.offer(nums[i]);

            if (!maxHeap.isEmpty() && minHeap.peek() > maxHeap.peek())
            {
                maxHeap.offer(minHeap.poll());
            }

            // Heaps balancing size(minHeap) >= size(maxHeap)
            if (minHeap.size() > maxHeap.size() + 1)
            {
                maxHeap.offer(minHeap.poll());
            }
            if (maxHeap.size() > minHeap.size()) {
                minHeap.offer(maxHeap.poll());
            }

            // calculate median
            if (i >= k - 1)
            {
                if (minHeap.size() == maxHeap.size()) {
                    result[i - k + 1] = (minHeap.peek() + (long)maxHeap.peek()) / 2.0;
                } else {
                    result[i - k + 1] = minHeap.peek();
                }
                LOGGER.info("Median {}: {}", i + 2 - k, result[i - k + 1]);
                // drop item from the window
                int dropItem = nums[i - k + 1];
                if (dropItem <= minHeap.peek()) {
                    minHeap.remove(dropItem);
                } else {
                    maxHeap.remove(dropItem);
                }

                // Heaps balancing after dropping item
                if (minHeap.size() > maxHeap.size() + 1) {
                    maxHeap.offer(minHeap.poll());
                }
                if (maxHeap.size() > minHeap.size()) {
                    minHeap.offer(maxHeap.poll());
                }
            }
        }
        return result;
    }

    /**
     * Returns the median array for each window in the original array
     * binary search using
     *
     * @param nums int array
     * @param k sliding window size
     * @return median array
     */
    public double[] medianSlidingWindow(int[] nums, int k)
    {
        double[] result = new double[nums.length - k + 1];

        // Insert the first Window into the Arraylist and sort it
        List<Integer> list = Arrays.stream(nums, 0, k)
                .boxed()
                .sorted()
                .collect(Collectors.toList());

        for (int i = k; i <= nums.length; i++) {
            // Insert Median into the result list ( k % 2 == 0 - parity check)
            result[i - k] = k % 2 == 0 ?
                    list.get((k / 2) - 1) / 2.0 + list.get(k / 2) / 2.0
                    : list.get(k / 2);
            LOGGER.info("Median {}: {}", i - 1, result[i - k]);

            if (i == nums.length) // last Median added
                break;

            // find element index and drop it from the list (-> next Window)
            list.remove(Collections.binarySearch(list, nums[i - k]));

            // binarySearch returns: the index of the search key, if it is contained in the list; otherwise, (-(insertion point) - 1).
            int insertionPoint = Collections.binarySearch(list, nums[i]);

            // add new element into list
            if (insertionPoint > -1)
            {
                list.add(insertionPoint + 1, nums[i]);
            }
            else
            {
                list.add(-insertionPoint - 1, nums[i]);
            }
        }
        return result;
    }
}
