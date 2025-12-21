package com.program.training.algorithm.besttimetobuysell;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * You are given an array prices where prices[i] is the price of a given stock on the i-th day.
 *
 * On each day, you may decide to buy and/or sell the stock.
 * You can only hold at most one share of the stock at any time. However,
 * you can sell and buy the stock multiple times on the same day, ensuring you never hold more than one share of the stock.
 *
 * Return the maximum profit you can achieve.
 *
 * <a href="https://leetcode.com/problems/best-time-to-buy-and-sell-stock/description/">...</a>
 *
 * @author naletov
 */
public class BestTimeToBuyAndSellStockIIAlgorithm
{
    private static final Logger LOGGER = LoggerFactory.getLogger(BestTimeToBuyAndSellStockIIAlgorithm.class);

    /**
     * Returns the maximum profit you can achieve from this transaction or 0 (not optimal)
     * @param prices array of prices
     * @return max profit
     */
    public int maxProfit(int[] prices)
    {
        LOGGER.info("prices: {}", prices);
        if (prices.length < 2) {
            return 0;
        }

        int maxProfit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i - 1]) {
                int profit = prices[i] - prices[i - 1];
                maxProfit += profit;
                LOGGER.info("Added profit: {}, total maxProfit: {}", profit, maxProfit);
            }
        }

        LOGGER.info("Total maxProfit: {}", maxProfit);
        return maxProfit;
    }
}