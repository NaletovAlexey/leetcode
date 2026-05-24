package com.program.training.algorithm.longestsubstringworepeating;

import java.util.HashMap;
import java.util.Map;

/**
 * Given a string s, find the length of the longest substring without duplicate characters.
 *
 * @author naletov
 */
public class LongestSubstringWithoutRepeatingCharactersAlgorithm
{
    public int lengthOfLongestSubstringNotOpt(String s) {

        if (s.isEmpty())
            return 0;

        int result = 1;
        int left = 0;

        for (int right = 1; right < s.length(); right++)
        {
            if (!s.substring(left, right).contains(s.charAt(right) + ""))
            {
                result =  Math.max(right - left + 1, result);
            }
            else
            {
                left = s.substring(left, right).indexOf(s.charAt(right) + "") + left + 1;
            }
        }
        return result;
    }

    /**
     * Sliding window with HashMap — O(n) time, O(min(n, alphabet)) space.
     *
     * @param s input string
     * @return length of the longest substring without repeating characters
     */
    public int lengthOfLongestSubstring(String s)
    {
        Map<Character, Integer> lastIndex = new HashMap<>();
        int maxLength = 0;

        for (int right = 0, left = 0; right < s.length(); right++)
        {
            char c = s.charAt(right);
            if (lastIndex.containsKey(c))
            {
                left = Math.max(left, lastIndex.get(c) + 1);
            }
            lastIndex.put(c, right);
            maxLength = Math.max(maxLength, right - left + 1);
        }
        return maxLength;
    }
}
