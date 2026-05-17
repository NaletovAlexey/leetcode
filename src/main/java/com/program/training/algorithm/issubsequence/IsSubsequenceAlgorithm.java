package com.program.training.algorithm.issubsequence;

/**
 * Given two strings s and t, return true if s is a subsequence of t, or false otherwise.
 *
 * @author naletov
 */
public class IsSubsequenceAlgorithm
{
    public boolean isSubsequence(String s, String t)
    {
        if (s.length() > t.length())
            return false;

        if (s.isBlank())
            return true;

        char[] sArray = s.toCharArray();
        char[] tArray = t.toCharArray();

        int currentSIndex = 0;
        for (int i = 0; i <= t.length() - 1; i++)
        {
            if (sArray[currentSIndex] == tArray[i])
            {
                currentSIndex++;
                if (currentSIndex == s.length())
                    return true;
            }
        }
        return false;
    }
}
