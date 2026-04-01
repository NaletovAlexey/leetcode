package com.program.training.algorithm.isomorphicstrings;

import java.util.*;
import java.util.stream.IntStream;

/**
 * Given two strings s and t, determine if they are isomorphic.
 * Two strings s and t are isomorphic if the characters in s can be replaced to get t.
 *
 * All occurrences of a character must be replaced with another character while preserving the order of characters.
 * No two characters may map to the same character, but a character may map to itself
 *
 * @author naletov
 */
public class IsomorphicStrings
{
    public boolean isIsomorphic(String s, String t) {

        if (s.length() != t.length())
            return false;

        Map<Character, Character> charsMapping = new HashMap<>();
        Set<Character> usedChars = new HashSet<>();

        for (int i = 0; i < s.length(); i++) {
            char charS = s.charAt(i);
            char charT = t.charAt(i);

            if (charsMapping.containsKey(charS)) {
                if (charsMapping.get(charS) != charT)
                    return false;
            }
            else
            {
                if (usedChars.contains(charT))
                    return false;
                usedChars.add(charT);
                charsMapping.put(charS, charT);
            }
        }
         return true;
    }
}
