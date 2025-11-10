package com.program.training.algorithm.mergeintervals;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

/**
 * Given an array of intervals where intervals[i] = [starti, endi],
 * merge all overlapping intervals, and return an array of the non-overlapping intervals
 * that cover all the intervals in the input.
 * <p>
 * Merge all the linked-lists into one sorted linked-list and return it.
 *
 * <a href="https://leetcode.com/problems/merge-intervals/description/">...</a>
 *
 *
 * @author naletov
 */
public class MergeIntervalsAlgorithm
{
 private static final Logger LOGGER = LoggerFactory.getLogger(MergeIntervalsAlgorithm.class);


    public int[][] merge(int[][] intervals)
    {
        if (intervals.length == 1)
        {
            return intervals;
        }

        Arrays.sort(intervals, Comparator.comparingInt(interval  -> interval [0]));

        int[] current = intervals[0];
        ArrayList<int[]> mergedIntervals = new ArrayList<>();
        for(int i = 1; i < intervals.length; i++)
        {
            if (current[1] >= intervals[i][0])
            {
                current[1] = Math.max(current[1], intervals[i][1]);
            }
            else
            {
                mergedIntervals.add(current.clone());
                LOGGER.info("Added pair: [{}, {}]", current[0], current[1]);
                current[0] = intervals[i][0];
                current[1] = intervals[i][1];
            }
        }
        mergedIntervals.add(current); // clone not needed (last element)
        LOGGER.info("Added pair: [{}, {}]", current[0], current[1]);

        return mergedIntervals.toArray(new int[mergedIntervals.size()][]);
    }
}