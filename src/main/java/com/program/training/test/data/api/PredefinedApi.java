package com.program.training.test.data.api;

/**
 * Contains different predefined API's for testing
 *
 * @author naletov
 */
public class PredefinedApi
{
    private int pick;



    /**
     * Set pick number
     * @param pick number
     */
    public void setPick(int pick)
    {
        this.pick = pick;
    }

    /**
     * 374. Guess Number Higher of Lower
     *
     * -1: Your guess is higher than the number I picked
     *  1: Your guess is lower than the number I picked
     *  0: your guess is equal to the number I picked
     * @param num guss number
     * @return comparison result
     */
    public int guess(int num)
    {
        if (num > this.pick)
        {
            return -1;
        } else if (num < this.pick)
        {
            return 1;
        }
        return 0;
    }

}
