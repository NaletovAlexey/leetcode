package com.program.training.algorithm.countcoveredbuildings.partitionlabels;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.*;

/**
 * You are given a positive integer n, representing an n x n city.
 * You are also given a 2D grid buildings, where buildings[i] = [x, y]
 * denotes a unique building located at coordinates [x, y].
 *
 * <a href="https://leetcode.com/problems/count-covered-buildings/description/">...</a>
 *
 * @author naletov
 */
public class CountCoveredBuildingsAlgorithm
{
    //private static final Logger LOGGER = LoggerFactory.getLogger(CountCoveredBuildingsAlgorithm.class);

    /**
     * Returns the number of covered buildings (TreeSet).
     * @param n n x n city
     * @param buildings 2D grid buildings
     * @return number of covered buildings
     */
    public int countCoveredBuildings(int n, int[][] buildings)
    {
        if (buildings.length <= 4)
        {
            return 0;
        }

        Map<Integer, NavigableSet<Integer>> rowIndexes = new HashMap<>();
        Map<Integer, NavigableSet<Integer>> columnIndexes = new HashMap<>();

        for (int[] building : buildings)
        {
            int x = building[0];
            int y = building[1];
            rowIndexes.computeIfAbsent(x, k -> new TreeSet<>()).add(y);
            columnIndexes.computeIfAbsent(y, k -> new TreeSet<>()).add(x);
        }

        int count = 0;
        for (int[] building : buildings)
        {
            int x = building[0];
            int y = building[1];
            // left && right
            NavigableSet<Integer> rows = rowIndexes.get(x);
            if (rows.lower(y) == null || rows.higher(y) == null)
            {
                continue;
            }
            // below && above
            NavigableSet<Integer> columns = columnIndexes.get(y);
            if (columns.lower(x) == null || columns.higher(x) == null)
            {
                continue;
            }

            count++;
        }

        return count;
    }

    /**
     * Returns the number of covered buildings (ArrayList + Sort).
     * @param n n x n city
     * @param buildings 2D grid buildings
     * @return number of covered buildings
     */
    public int countCoveredBuildingsArrayList(int n, int[][] buildings)
    {
        if (buildings.length <= 4)
        {
            return 0;
        }

        Map<Integer, List<Integer>> rowIndexes = new HashMap<>();
        Map<Integer, List<Integer>> columnIndexes = new HashMap<>();

        for (int[] building : buildings)
        {
            int x = building[0];
            int y = building[1];
            rowIndexes.computeIfAbsent(x, k -> new ArrayList<>()).add(y);
            columnIndexes.computeIfAbsent(y, k -> new ArrayList<>()).add(x);
        }

        // Sort the Lists (rows && columns)
        for (List<Integer> list : rowIndexes.values()) {
            Collections.sort(list);
        }
        for (List<Integer> list : columnIndexes.values()) {
            Collections.sort(list);
        }

        int count = 0;
        for (int[] building : buildings)
        {
            int x = building[0];
            int y = building[1];

            // left && right
            List<Integer> rows = rowIndexes.get(x);
            int colIndex = Collections.binarySearch(rows, y);
            boolean left = colIndex > 0;                // building on the left
            boolean right = colIndex < rows.size() - 1; // building on the right

            // below && above
            List<Integer> columns = columnIndexes.get(y);
            int rowIndex = Collections.binarySearch(columns, x);
            boolean below = rowIndex > 0;                  // building from below
            boolean above = rowIndex < columns.size() - 1; // building from above

            if (left && right && below && above) {
                count++;
            }
        }

        return count;
    }
}
