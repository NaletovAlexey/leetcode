package com.program.training.algorithm;

import java.util.HashMap;
import java.util.Map;

/**
 * You are climbing a staircase. It takes n steps to reach the top.
 * Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
 *
 * @author naletov
 */
public class ClimbingStairs
{
    private final Map<Integer, Integer> memo = new HashMap<>();
    public int climbStairs(int n) {
        return doStep(n);
    }

    private int doStep(int stepsToReach)
    {
        // Basic cases
        if (stepsToReach == 1) return 1;
        if (stepsToReach == 2) return 2;

        if (memo.containsKey(stepsToReach)) {
            return memo.get(stepsToReach);
        }

        int result = doStep(stepsToReach - 1) + doStep(stepsToReach - 2);
        // Save result to cashe
        memo.put(stepsToReach, result);
        return result;
    }
}
