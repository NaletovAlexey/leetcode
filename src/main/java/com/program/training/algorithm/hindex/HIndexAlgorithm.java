package com.program.training.algorithm.hindex;

import java.util.Arrays;

/**
 * Given an array of integers citations where citations[i] is the number of citations a researcher received for their ith paper, return the researcher's h-index.
 * @author naletov
 */
public class HIndexAlgorithm
{
    public int hIndexNotOptimal(int[] citations) {
        Arrays.sort(citations);
        int hIndex = citations.length;

        for (int citation : citations)
        {
            if (hIndex <= citation)
            {
                return hIndex;
            }
            hIndex--;
        }
        return 0;
    }

    public int hIndex(int[] citations) {
        int n = citations.length;
        int[] count = new int[n + 1];   // also 0

        // populate frequency array
        for (int citation : citations) {
            if (citation >= n) {
                count[n]++;
            } else {
                count[citation]++;
            }
        }

        int citation = 0;
        for (int i = n; i >= 0; i--) {
            citation += count[i];

            if (citation >= i) {
                return i;
            }
        }

        return 0;
    }
}
