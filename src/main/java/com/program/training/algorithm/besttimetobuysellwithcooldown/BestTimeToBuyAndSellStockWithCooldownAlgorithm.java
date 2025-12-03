package com.program.training.algorithm.besttimetobuysellwithcooldown;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * You are given an array prices where prices[i] is the price of a given stock on the ith day.
 * Find the maximum profit you can achieve. You may complete as many transactions as you like
 * Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.
 *
 * <a href="https://leetcode.com/problems/best-time-to-buy-and-sell-stock-with-cooldown/description/">...</a>
 *
 * @author naletov
 */
public class BestTimeToBuyAndSellStockWithCooldownAlgorithm
{
    private static final Logger LOGGER = LoggerFactory.getLogger(BestTimeToBuyAndSellStockWithCooldownAlgorithm.class);

    /**
     * Returns the maximum profit you can achieve from this transaction or 0 (not optimal)
     * @param prices array of prices
     * @return max profit
     */
    public int maxProfit(int[] prices)
    {
        int hold = Integer.MIN_VALUE;                   // have a stock state
        int sell = 0;                                   // sell a stock state
        int cooldown = 0;                               // have no a stock & didn't sell today

        for (int price : prices) {
            int prevSell = sell;                        // previous sell state

            // states refresh
            sell = hold + price;                        // stock selling
            hold = Math.max(hold, cooldown - price);    // stock buying
            cooldown = Math.max(cooldown, prevSell);    // cooldown state
            LOGGER.info("hold: {}; sell: {}; cooldown: {})", hold, sell, cooldown);
        }
        return Math.max(sell, cooldown);                // profit
    }
}
