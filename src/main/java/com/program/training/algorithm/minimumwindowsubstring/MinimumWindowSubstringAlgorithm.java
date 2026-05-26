package com.program.training.algorithm.minimumwindowsubstring;

import java.util.HashMap;
import java.util.Map;

/**
 * Given two strings s and t of lengths m and n respectively,
 * return the minimum window substring of s such that every character in t (including duplicates) is included in the window.
 * If there is no such substring, return the empty string "".
 *
 * @author naletov
 */
public class MinimumWindowSubstringAlgorithm
{
    public String minWindow(String s, String t)
    {
        String res = "";
        if (s.length() < t.length())
            return res;

        HashMap<Character, Integer> charFreq = new HashMap<>();
        int charsCount = t.length();

        for (int i = 0; i < t.length(); i++)
        {
            charFreq.merge(t.charAt(i), 1, Integer::sum);
        }
        int left = 0;
        while (left < s.length() - t.length() + 1)
        {
            if (!charFreq.containsKey(s.charAt(left)))
            {
                left++;
                continue;
            }
            int right = left;
            int matchedChars = 0;
            Map<Character, Integer> window = new HashMap<>();

            while (right < s.length())
            {
                if (charFreq.containsKey(s.charAt(right)))
                {
                    window.merge(s.charAt(right), 1, Integer::sum);
                }
                if (!charFreq.containsKey(s.charAt(right)) || charFreq.get(s.charAt(right)) < window.get(s.charAt(right)))
                {
                    right++;
                    continue;
                }
                matchedChars++;
                if (matchedChars == charsCount && (res.isEmpty() || res.length() > right - left + 1))
                {
                    res = s.substring(left, right + 1);
                    break;
                }
                right++;
            }
            left++;
         }
        return res;
    }

    /**
     * Sliding-window solution: O(m + n) time, O(k) space where k is the number of distinct chars in t.
     */
    public String minWindowOpt(String s, String t)
    {
        if (s.length() < t.length())
        {
            return "";
        }

        Map<Character, Integer> charFreq = new HashMap<>();
        for (int i = 0; i < t.length(); i++)
        {
            charFreq.merge(t.charAt(i), 1, Integer::sum);
        }

        int required = charFreq.size();
        int formed = 0;
        Map<Character, Integer> window = new HashMap<>();

        int left = 0;
        int minLen = Integer.MAX_VALUE;
        int minLeft = 0;

        for (int right = 0; right < s.length(); right++)
        {
            char rightChar = s.charAt(right);
            // Handle only symbols from t
            if (charFreq.containsKey(rightChar)) {
                window.merge(rightChar, 1, Integer::sum);
                if (window.get(rightChar).equals(charFreq.get(rightChar))) {
                    formed++;
                }
            }

            while (formed == required)
            {
                if (right - left + 1 < minLen)
                {
                    minLen = right - left + 1;
                    minLeft = left;
                }

                char leftChar = s.charAt(left);
                if (charFreq.containsKey(leftChar)) {
                    window.merge(leftChar, -1, Integer::sum);
                    if (window.get(leftChar) < charFreq.get(leftChar)) {
                        formed--;
                    }
                    // drop o values
                    if (window.get(leftChar) == 0) {
                        window.remove(leftChar);
                    }
                }
                left++;
            }
        }
        return minLen == Integer.MAX_VALUE ? "" : s.substring(minLeft, minLeft + minLen);
    }
}
