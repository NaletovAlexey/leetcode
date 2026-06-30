package com.program.training.systemdesign.dataoperationsimulation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Design a data structure to find the frequency of a given value in a given subarray.
 *
 * Implementation: for every distinct value we store the sorted list of indices where it occurs.
 * Filling the lists left to right keeps them sorted for free, so a query reduces to "how many
 * indices of {@code value} fall inside [left, right]" — answered with two binary searches
 * ({@code upperBound(right) - lowerBound(left)}) in O(log k) instead of scanning the subarray.
 *
 * @author naletov
 */
class RangeFreqQuery {

    /** value -> ascending list of indices where it occurs in the input array. */
    private final Map<Integer, List<Integer>> indicesByValue;

    /**
     * Constructs an instance of the class with the given 0-indexed integer array arr.
     * @param arr integer array
     */
    public RangeFreqQuery(int[] arr) {
        this.indicesByValue = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            indicesByValue.computeIfAbsent(arr[i], k -> new ArrayList<>()).add(i);
        }
    }

    /**
     * Returns the frequency of value in the subarray arr[left...right]
     * @param left left bound
     * @param right right bound
     * @param value value to find
     * @return frequency of value in the subarray
     */
    public int query(int left, int right, int value) {
        List<Integer> indices = indicesByValue.get(value);
        if (indices == null) {
            return 0;
        }
        // Count of indices in [left, right] = (count <= right) - (count < left),
        // since findBound returns how many stored indices are strictly less than its target.
        return findBound(indices, right + 1) - findBound(indices, left);
    }

    /** First position in the sorted {@code list} whose element is >= {@code target} (lower bound). */
    private static int findBound(List<Integer> list, int target) {
        int lo = 0, hi = list.size();
        while (lo < hi) {
            int mid = (lo + hi) >>> 1;
            if (list.get(mid) < target) {
                lo = mid + 1;
            } else {
                hi = mid;
            }
        }
        return lo;
    }
}

/*
 * Your RangeFreqQuery object will be instantiated and called as such:
 * RangeFreqQuery obj = new RangeFreqQuery(arr);
 * int param_1 = obj.query(left,right,value);
 */
