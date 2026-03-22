package com.program.training.algorithm.sqrtx;

/**
 * Given a non-negative integer x, return the square root of x rounded down to the nearest integer.
 * The returned integer should be non-negative as well.
 * You must not use any built-in exponent function or operator.
 *
 * @author naletov
 */
public class SqrtXAlgorithm
{
    public int mySqrt(int x) {
        if (x < 2)  // 0 & 1 cases
        {
            return x;
        }
        int left = 2;       // start from 2
        int right = x/2;    // max value for the sqrt

        while (left <= right)
        {
            int  mid = left + (right - left) / 2;   // to avoid overflow
            if (mid > x / mid)
            {
                right = mid - 1;  // looking for on the left side
            }
            else
            {
                left = mid + 1; // looking for on the right side
            }
        }
        return right;   // in this case will be the maximum integer root
    }
}
