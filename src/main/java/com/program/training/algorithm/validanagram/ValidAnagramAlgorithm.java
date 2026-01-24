package com.program.training.algorithm.validanagram;

import java.util.*;

/**
 * Given two strings s and t, return true if t is an anagram of s, and false otherwise.
 *
 * <a href="https://leetcode.com/problems/valid-anagram/">...</a>
 * @author naletov
 */
public class ValidAnagramAlgorithm
{
    //private static final Logger LOGGER = LoggerFactory.getLogger(ValidAnagramAlgorithm.class);

    /**
     * Checks if it is an anagram of s
     * @param s base String
     * @param t String to check
     * @return true if anagram
     */
    public boolean isAnagram(String s, String t)
    {
        if (s.length() != t.length())
            return false;

        char[] sArray = s.toCharArray();
        char[] tArray = t.toCharArray();
        Arrays.sort(sArray);
        Arrays.sort(tArray);

        return Arrays.equals(sArray, tArray);
    }

    /**
     * Checks if t is an anagram of s
     * @param s base String
     * @param t String to check
     * @return true if anagram
     */
    public boolean isAnagramSB(String s, String t)
    {
        if (s.length() != t.length())
            return false;

        StringBuilder sbT = new StringBuilder(t);

        for (int i = 0; i < s.length(); i++)
        {
            int symbolIndex = sbT.indexOf(String.valueOf(s.charAt(i)));
            if ( symbolIndex == -1)
            {
                return false;
            }
            else
            {
                sbT.deleteCharAt(symbolIndex);
            }
        }

        return true;
    }
}