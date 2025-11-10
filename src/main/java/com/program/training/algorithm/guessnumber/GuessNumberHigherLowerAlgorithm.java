package com.program.training.algorithm.guessnumber;

import com.program.training.test.data.PredefinedApi;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * We are playing the Guess Game. The game is as follows:
 * I pick a number from 1 to n. You have to guess which number I picked.
 *
 * Every time you guess wrong, I will tell you whether the number I picked is higher or lower than your guess.
 *
 * <a href="https://leetcode.com/problems/guess-number-higher-or-lower/description/">...</a>
 *
 * @author naletov
 */
public class GuessNumberHigherLowerAlgorithm
{
    private static final Logger LOGGER = LoggerFactory.getLogger(GuessNumberHigherLowerAlgorithm.class);
    private final PredefinedApi api = new PredefinedApi();

    /**
     * Find the hidden number
     * @param n number
     * @return guess number
     */
    public int guessNumber(int n)
    {
        int low = 1;
        int high = n;

        while (guess(n) != 0)
        {
            LOGGER.info("Guess number: {}", n);
            n = low + (high - low)/2;
            if (guess(n) == 1)
            {
                low = n + 1;
            }
            else if (guess(n) == -1)
            {
                high = n - 1;
            }
        }
        LOGGER.info("Result number: {}", n);
        return n;
    }

    public int guessNumberStandardV2(int n) {
        int low = 1;
        int high = n;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            int result = guess(mid);

            if (result == 0) {
                LOGGER.info("Result number: {}", mid);
                return mid;
            } else if (result == 1) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
            LOGGER.info("Guess number: {}", mid);
        }
        return -1;
    }

    public int guessNumberV3(int n) {
        return guessNumberRecursive(1, n);
    }

    private int guessNumberRecursive(int low, int high) {
        if (low > high)
        {
            return low;
        }

        int currentGuess = low + (high - low) / 2;
        int guessResult = guess(currentGuess);

        LOGGER.info("Guess number: {} (low: {}, high: {})", currentGuess, low, high);

        if (guessResult == 0)
        {
            LOGGER.info("Result number: {}", currentGuess);
            return currentGuess;
        } else if (guessResult == 1)
        {
            return guessNumberRecursive(currentGuess + 1, high);
        } else
        {
            return guessNumberRecursive(low, currentGuess - 1);
        }
    }

    public void setPick(int pick)
    {
        LOGGER.info("Pick number: {}", pick);
        api.setPick(pick);
    }

    private int guess(int num)
    {
        return api.guess(num);
    }
}
