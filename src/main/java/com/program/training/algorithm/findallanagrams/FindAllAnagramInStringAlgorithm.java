package com.program.training.algorithm.findallanagrams;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Given two strings s and p, return an array of all the start indices of p's anagrams in s.
 * You may return the answer in any order.
 *
 * <a href="https://leetcode.com/problems/find-all-anagrams-in-a-string/description/">...</a>
 * @author naletov
 */
public class FindAllAnagramInStringAlgorithm
{
    private static final Logger LOGGER = LoggerFactory.getLogger(FindAllAnagramInStringAlgorithm.class);

    /**
     * Finds all anagrams of p in s (slow because of substring and sorting)
     * @param s base String
     * @param p String to find
     * @return list of all the start anagrams indices
     */
    public List<Integer> findAnagramsFirst(String s, String p)
    {
        List<Integer> result = new ArrayList<>();
        int size_p  = p.length();
        int size_s   = s.length();

        for(int i = 0 ; i <= size_s - size_p ; i++)
        {
            if (isAnagram(s.substring(i, i + size_p), p))
            {
                LOGGER.info("Anagramm position: {}", i );
                result.add(i);
            }
        }
        return result;
    }

    /**
     * Checks if it is an anagram of s
     * @param s base String
     * @param t String to check
     * @return true if anagram
     */
    private boolean isAnagram(String s, String t)
    {
        char[] sArray = s.toCharArray();
        char[] tArray = t.toCharArray();
        Arrays.sort(sArray);
        Arrays.sort(tArray);

        return Arrays.equals(sArray, tArray);
    }

    /**
     * Finds all anagrams of p in s (sliding window) - Time/Space: O(N)/O(1)
     * @param s base String
     * @param p String to find
     * @return list of all the start anagrams indices
     */
    public List<Integer> findAnagrams(String s, String p)
    {
        List<Integer> result = new ArrayList<>();
        int size_p  = p.length();
        int size_s   = s.length();

        if (size_s < size_p) return result;

        // count symbols for p
        int[] pCount = new int[26];
        for (char c : p.toCharArray()) {
            pCount[c - 'a']++;
        }

        // 1st window init
        int[] window = new int[26];
        for (int i = 0; i < size_p; i++) {
            window[s.charAt(i) - 'a']++;
        }

        // check 1st window
        if (Arrays.equals(pCount, window)) {
            result.add(0);
            LOGGER.info("Anagramm position: {}", 0);
        }

        // sliding of a window along a window frame
        for (int i = size_p; i < size_s; i++) {
            // Delete the outgoing character on the left
            window[s.charAt(i - size_p) - 'a']--;
            // Add a new symbol to the right
            window[s.charAt(i) - 'a']++;

            // Checking the anagram
            if (Arrays.equals(pCount, window))
            {
                result.add(i - size_p + 1);
                LOGGER.info("Anagramm position: {}", i - size_p + 1);
            }
        }
        return result;
    }
}