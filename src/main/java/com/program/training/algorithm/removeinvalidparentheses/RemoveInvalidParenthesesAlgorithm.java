package com.program.training.algorithm.removeinvalidparentheses;

import java.util.*;

/**
 * Given a string s that contains parentheses and letters,
 * remove the minimum number of invalid parentheses to make the input string valid.
 *
 * @author naletov
 */

public class RemoveInvalidParenthesesAlgorithm
{
    /**
     * BFS algorithm
     * Return a list of unique strings that are valid with the minimum number of removals.
     * You may return the answer in any order.
     * @param s string that contains parentheses and letters
     * @return list of unique strings
     */
    public List<String> removeInvalidParentheses(String s)
    {
        List<String> result = new ArrayList<>();

        Set<String> visited = new HashSet<>();  // to avoid duplicates
        Queue<String> queue = new LinkedList<>();

        queue.add(s);
        visited.add(s);
        boolean found = false;

        while (!queue.isEmpty())
        {
            String current = queue.poll();

            if (isValid(current))
            {
                result.add(current);
                found = true;
            }

            if (found) continue;

            // try a case be deleting a bracket
            for (int i = 0; i < current.length(); i++)
            {
                // skip if this is not a bracket
                if (current.charAt(i) != '(' && current.charAt(i) != ')') continue;

                String next = current.substring(0, i) + current.substring(i + 1);

                if (!visited.contains(next)) {
                    visited.add(next);
                    queue.add(next);
                }
            }
        }

        return result;
    }

    /**
     * Checks if the string/substring is valid (brackets counting)
     * @param s current string
     * @return true/false
     */
    private boolean isValid(String s) {
        int count = 0;
        for (char c : s.toCharArray()) {
            if (c == '(')
            {
                count++;
            }
            if (c == ')' && --count < 0)
            {
                return false;
            }
        }
        return count == 0;
    }
}
