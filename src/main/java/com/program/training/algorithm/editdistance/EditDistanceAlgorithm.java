package com.program.training.algorithm.editdistance;

/**
 * Given two strings word1 and word2, return the minimum number of operations required to convert word1 to word2.
 * You have the following three operations permitted on a word:
 * - Insert a character
 * - Delete a character
 * - Replace a character
 *
 * @author naletov
 */
public class EditDistanceAlgorithm
{
    /**
     * O(m * n) time, O(n) space.
     *
     * @param word1 source string
     * @param word2 target string
     * @return minimum edit distance
     */
    public int minDistance(String word1, String word2)
    {
        int m = word1.length();
        int n = word2.length();

        int[] prev = new int[n + 1];
        int[] curr = new int[n + 1];

        for (int j = 0; j <= n; j++)
        {
            prev[j] = j;
        }

        for (int i = 1; i <= m; i++)
        {
            curr[0] = i;
            for (int j = 1; j <= n; j++)
            {
                if (word1.charAt(i - 1) == word2.charAt(j - 1))
                {
                    curr[j] = prev[j - 1];
                }
                else
                {
                    curr[j] = 1 + Math.min(prev[j - 1], Math.min(prev[j], curr[j - 1]));
                }
            }

            int[] temp = prev;
            prev = curr;
            curr = temp;
        }

        return prev[n];
    }
}
