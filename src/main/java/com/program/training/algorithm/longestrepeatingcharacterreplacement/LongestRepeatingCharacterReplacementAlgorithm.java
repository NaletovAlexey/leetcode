package com.program.training.algorithm.longestrepeatingcharacterreplacement;

/**
 * You are given a string s and an integer k.
 * You can choose any character of the string and change it to any other uppercase English character.
 * You can perform this operation at most k times.
 *
 * Return the length of the longest substring containing the same letter you can get after performing the above operations.
 *
 * @author naletov
 */
public class LongestRepeatingCharacterReplacementAlgorithm
{

    /**
     * Sliding window algorithm
     * @param s The string being analyzed
     * @param k Number of times to change any letter
     * @return the length of the longest substring containing the same letter
     */
    public int characterReplacement(String s, int k) {
        int[] count = new int[26];  // uppercase English characters
        int left = 0;
        int maxCount = 0;
        int maxLength = 0;

        for (int right = 0; right < s.length(); right++) {
            // Increment the counter for the current character
            count[s.charAt(right) - 'A']++;

            //Update the maximum number of identical characters in the current window.
            maxCount = Math.max(maxCount, count[s.charAt(right) - 'A']);

            // If the window size exceeds the maximum number of identical characters + k,
            // then the left boundary needs to be shifted.
            while (right - left + 1 > maxCount + k) {
                count[s.charAt(left) - 'A']--;
                left++;
            }
            // Updating the maximum length
            maxLength = Math.max(maxLength, right - left + 1);
        }
        return maxLength;
    }
}
