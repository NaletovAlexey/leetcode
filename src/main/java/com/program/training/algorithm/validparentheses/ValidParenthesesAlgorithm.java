package com.program.training.algorithm.validparentheses;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
 *
 * 1. Open brackets must be closed by the same type of brackets.
 * 2. Open brackets must be closed in the correct order.
 * 3. Every close bracket has a corresponding open bracket of the same type.
 *
 *
 * <a href="https://leetcode.com/problems/valid-parentheses/description/">...</a>
 *
 * @author naletov
 */
public class ValidParenthesesAlgorithm
{
    /**
     * Checks Valid Parentheses
     * @param s input String
     * @return true/false - input String is valid
     */
    public boolean isValid(String s) {
        // immediately cuts off all invalid options
        if (s == null || s.isEmpty() || s.length() % 2 != 0)
            return false;

        Deque<Character> stack = new ArrayDeque<>();
        for (char c : s.toCharArray())
        {
            if ( c == '(' || c == '[' || c == '{')
            {
                stack.offerFirst(c);
            }
            else
            {
                Character top = stack.pollFirst();
                if (top == null)
                    return false;
                if ( (top == '(' && c != ')') ||
                     (top == '[' && c != ']') ||
                     (top == '{' && c != '}') )
                    return false;
            }
        }
        return stack.isEmpty();
    }
}
