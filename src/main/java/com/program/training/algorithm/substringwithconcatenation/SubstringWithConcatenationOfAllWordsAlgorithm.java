package com.program.training.algorithm.substringwithconcatenation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * You are given a string s and an array of strings words. All the strings of words are of the same length.
 * A concatenated string is a string that exactly contains all the strings of any permutation of words concatenated.
 *
 * <a href="https://leetcode.com/problems/substring-with-concatenation-of-all-words/description/">...</a>
 *
 * @author naletov
 */
public class SubstringWithConcatenationOfAllWordsAlgorithm
{
    /**
     * Returns all starting indices where a substring of {@code s} is a concatenation
     * of every word in {@code words} (in any order).
     * <p>
     * Uses a sliding window that moves word-by-word. Because all words share the same length,
     * valid windows can only start at indices {@code offset, offset + wordLen, ...} for some
     * {@code offset} in {@code [0, wordLen)}, so we run one pass per offset.
     *
     * @param s     input string
     * @param words array of equal-length words to match
     * @return list of starting indices (any order)
     */
    public List<Integer> findSubstring(String s, String[] words)
    {
        List<Integer> result = new ArrayList<>();
        if (s == null || words == null || words.length == 0)
        {
            return result;
        }

        int wordLen = words[0].length();
        int wordCount = words.length;
        int totalLen = wordLen * wordCount;

        if (s.length() < totalLen)
        {
            return result;
        }

        // Expected frequency of each word in a valid window
        Map<String, Integer> wordFreq = new HashMap<>();
        for (String word : words)
        {
            wordFreq.merge(word, 1, Integer::sum);
        }

        // Try each alignment: windows must start at offset, offset + wordLen, ...
        for (int offset = 0; offset < wordLen; offset++)
        {
            Map<String, Integer> window = new HashMap<>();
            int left = offset;
            int matchedWords = 0;

            for (int right = offset; right <= s.length() - wordLen; right += wordLen)
            {
                String word = s.substring(right, right + wordLen);

                if (wordFreq.containsKey(word))
                {
                    window.merge(word, 1, Integer::sum);
                    matchedWords++;

                    // Shrink from the left while the current word appears too often
                    while (window.get(word) > wordFreq.get(word))
                    {
                        String leftWord = s.substring(left, left + wordLen);
                        window.merge(leftWord, -1, Integer::sum);
                        matchedWords--;
                        left += wordLen;
                    }

                    if (matchedWords == wordCount)
                    {
                        result.add(left);
                    }
                }
                else
                {
                    // Unknown word breaks the window; restart after it
                    window.clear();
                    matchedWords = 0;
                    left = right + wordLen;
                }
            }
        }

        return result;
    }
}
