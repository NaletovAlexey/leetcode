package com.program.training.algorithm.partitionlabels;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.*;

/**
 * We want to partition the string into as many parts as possible so that each letter appears in at most one part
 *
 * <a href="https://leetcode.com/problems/partition-labels/description/">...</a>
 *
 * @author naletov
 */
public class PartitionLabelsAlgorithm
{
    private static final Logger LOGGER = LoggerFactory.getLogger(PartitionLabelsAlgorithm.class);


    /**
     * Returns a list of integers representing the size of these parts.
     * @param s string need to be partitioned
     * @return list of integers
     */
    public List<Integer> partitionLabels(String s)
    {
        LinkedHashMap<String, int[]> intervals = new LinkedHashMap<>();
        int left = 0;
        int right = s.length() - 1;

        // find intervals
        while(true)
        {
            if(intervals.containsKey(s.charAt(left) + ""))
            {
                left++;
                continue;
            }

            if (s.charAt(left) == s.charAt(right))
            {   // If there is only one letter, then left == right
                intervals.put(s.charAt(left) + "", new int[]{left, right});
                LOGGER.info("{}: [{}, {}]", s.charAt(left), left, right);
                if (right == (s.length() - 1))
                {
                    break;
                }
                right = s.length() - 1;
                left++;
            }
            else
            {
                right--;
            }
        }

        // merge intervals (intervals are already sorted)
        List<Integer> result = new ArrayList<>();
        left = 0;
        right = 0;
        for (int[] interval : intervals.values())
        {
            if (interval[0] == 0)
            {
                right = interval[1];
                continue;
            }

            if (right >= interval[0])
            {
                right = Math.max(right, interval[1]);
            }
            else
            {
                result.add(right - left + 1);
                LOGGER.info("Label size: [{}]", right - left + 1);
                left = interval[0];
                right = interval[1];
            }
        }
        result.add(right - left + 1);
        LOGGER.info("Label size: [{}]", right - left + 1);
        return result;
    }

    /**
     * Returns a list of integers representing the size of these parts (Optimal)
     * @param s string need to be partitioned
     * @return list of integers
     */
    public List<Integer> partitionLabelsOpt(String s)
    {
        Map<Character, Integer> lastOccurrence = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            lastOccurrence.put(s.charAt(i), i);
        }

        List<Integer> result = new ArrayList<>();
        int start = 0;
        int end = 0;

        for (int i = 0; i < s.length(); i++)
        {
            end = Math.max(end, lastOccurrence.get(s.charAt(i)));
            if (i == end)
            {
                int partitionSize = end - start + 1;
                result.add(partitionSize);
                LOGGER.info("Label size: [{}]", partitionSize);
                start = i + 1;
            }
        }

        return result;
    }
}
