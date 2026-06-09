package com.program.training.systemdesign.datastreamprocessing;

import java.util.*;

/**
 * Given a data stream input of non-negative integers a1, a2, ..., an,
 * summarize the numbers seen so far as a list of disjoint intervals.
 *
 * <a href="https://leetcode.com/problems/data-stream-as-disjoint-intervals/?envType=problem-list-v2&envId=ssd-ssd2-data-stream-processing">...</a>
 *
 * @author naletov
 */
public class SummaryRanges
{
    // store the intervals [start, end], sorting them by the starting value
    private final TreeSet<int[]> intervals;

    /**
     * Initializes the object with an empty stream.
     */
    public SummaryRanges() {
        this.intervals = new TreeSet<>(Comparator.comparingInt(interval -> interval[0]));
    }

    /**
     * Adds the integer value to the stream.
     * @param value int to the stream
     */
    public void addNum(int value) {
        // Time interval key for searching in TreeSet
        int[] findKey = {value, value};

        // Find an interval where start <= value
        int[] floor = intervals.floor(findKey);
        // Find an interval where start >= value
        int[] ceiling = intervals.ceiling(findKey);

        // 1. The number is already included in an existing left interval
        if (floor != null && floor[1] >= value) {
            return;
        }

        // Check for contact with the left (value == floor.end + 1)
        boolean connectLeft = (floor != null && floor[1] + 1 == value);
        // Check for contact with the right (value == ceiling.start - 1)
        boolean connectRight = (ceiling != null && ceiling[0] - 1 == value);

        if (connectLeft && connectRight) {
            // 2. The number combines the left and right intervals: [floor.start, ceiling.end]
            floor[1] = ceiling[1];
            intervals.remove(ceiling);
        } else if (connectLeft) {
            // 3. The number extends the left interval to the right
            floor[1] = value;
        } else if (connectRight) {
            // 4. The number extends the right interval to the left
            ceiling[0] = value;
        } else {
            // 5. The number forms a new isolated interval [value, value]
            intervals.add(new int[]{value, value});
        }
    }

    /**
     * Returns a summary of the integers in the stream currently as a list of disjoint intervals
     * [starti, endi]. The answer should be sorted by start-i.
     *
     * @return intervals Array
     */
    public int[][] getIntervals()
    {
        // // Return an array directly from TreeSet in O(N), where N is the number of INTERVALS, not numbers
        return intervals.toArray(new int[intervals.size()][]);
    }
}

/**
 * Your SummaryRanges object will be instantiated and called as such:
 * SummaryRanges obj = new SummaryRanges();
 * obj.addNum(value);
 * int[][] param_2 = obj.getIntervals();
 */

