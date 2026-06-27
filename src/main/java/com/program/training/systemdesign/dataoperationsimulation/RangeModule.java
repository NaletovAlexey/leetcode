package com.program.training.systemdesign.dataoperationsimulation;

import java.util.TreeMap;

/**
 * A Range Module is a module that tracks ranges of numbers.
 * Design a data structure to track the ranges represented as half-open intervals and query about them.
 *
 * A half-open interval [left, right) denotes all the real numbers x where left <= x < right.
 *
 * Implementation: a {@link TreeMap} keeps the currently tracked, pairwise-disjoint
 * intervals as {@code start -> end} entries (end exclusive). Because the map is sorted by start,
 * {@code floorKey} locates the interval that may overlap a given bound in O(log n), and
 * {@code subMap(...).clear()} drops every interval swallowed by a merge in one shot.
 *
 * @author naletov
 */
public class RangeModule
{
    /** Tracked disjoint intervals, mapping {@code start} to its exclusive {@code end}. */
    private final TreeMap<Integer, Integer> intervals;

    /**
     * Initializes the object of the data structure.
     */
    public RangeModule() {
        this.intervals = new TreeMap<>();
    }

    /**
     * Adds the half-open interval [left, right), tracking every real number in that interval.
     * Adding an interval that partially overlaps with currently tracked numbers should add any numbers in the interval [left, right)
     * that are not already tracked.
     *
     * @param left left bound
     * @param right right bound
     */
    public void addRange(int left, int right) {
        // Extend the new interval to the left if the preceding interval reaches it.
        Integer start = intervals.floorKey(left);
        if (start != null && intervals.get(start) >= left) {
            left = start;
        }
        // Extend the new interval to the right if the interval starting at/below right reaches past it.
        Integer end = intervals.floorKey(right);
        if (end != null && intervals.get(end) > right) {
            right = intervals.get(end);
        }
        intervals.put(left, right);
        // Drop every interval fully swallowed by the merged [left, right).
        intervals.subMap(left, false, right, true).clear();
    }

    /**
     *  Returns true if every real number in the interval [left, right) is currently being tracked, and false otherwise.
     * @param left left bound
     * @param right right bound
     * @return true if every real number in the interval
     */
    public boolean queryRange(int left, int right) {
        Integer start = intervals.floorKey(left);
        return start != null && intervals.get(start) >= right;
    }

    /**
     *  Stops tracking every real number currently being tracked in the half-open interval [left, right).
     *
     * @param left left bound
     * @param right right bound
     */
    public void removeRange(int left, int right) {
        // Re-add the tail of the interval that extends past right.
        Integer end = intervals.floorKey(right);
        if (end != null && intervals.get(end) > right) {
            intervals.put(right, intervals.get(end));
        }
        // Trim the head of the interval that starts before left.
        Integer start = intervals.floorKey(left);
        if (start != null && intervals.get(start) > left) {
            intervals.put(start, left);
        }
        // Remove everything that starts within [left, right).
        intervals.subMap(left, true, right, false).clear();
    }
}

/*
 * Your RangeModule object will be instantiated and called as such:
 * RangeModule obj = new RangeModule();
 * obj.addRange(left,right);
 * boolean param_2 = obj.queryRange(left,right);
 * obj.removeRange(left,right);
 */
