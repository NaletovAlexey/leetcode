package com.program.training.algorithm.happynummer;

import java.util.HashSet;
import java.util.Set;

/**
 * Write an algorithm to determine if a number n is happy.
 * A happy number is a number defined by the following process:
 * - Starting with any positive integer, replace the number by the sum of the squares of its digits.
 * - Repeat the process until the number equals 1 (where it will stay), or it loops endlessly in a cycle which does not include 1.
 * - Those numbers for which this process ends in 1 are happy.
 * Return true if n is a happy number, and false if not.
 *
 * <p>{@link #isHappyOptimal(int)} uses Floyd's cycle detection: O(1) extra space versus a visited set.
 *
 * @author naletov
 */
public class HappyNumberAlgorithm {

    public boolean isHappy(int n) {
        Set<Integer> intermediate = new HashSet<>();
        return checkHappyNumber(n, intermediate);
    }

    /**
     * Same semantics as {@link #isHappy(int)} with O(1) memory: two pointers on the sum-of-squares chain
     * (slow one step, fast two steps) meet at 1 if happy, or elsewhere if a non-trivial cycle exists.
     */
    public boolean isHappyOptimal(int n) {
        int slow = n;
        int fast = n;
        do {
            slow = sumOfSquaredDigits(slow);
            fast = sumOfSquaredDigits(sumOfSquaredDigits(fast));
        } while (slow != fast);
        return slow == 1;
    }

    private boolean checkHappyNumber(int n, Set<Integer> intermediate) {
        if (n == 1) {
            return true;
        }
        if (intermediate.contains(n)) {
            return false;
        }
        intermediate.add(n);
        return checkHappyNumber(sumOfSquaredDigits(n), intermediate);
    }

    private static int sumOfSquaredDigits(int n) {
        int sum = 0;
        while (n != 0) {
            int digit = n % 10;
            sum += digit * digit;
            n /= 10;
        }
        return sum;
    }
}
