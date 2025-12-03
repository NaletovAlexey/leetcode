package com.program.training.algorithm.besttimetobuysell;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * You are given an array prices where prices[i] is the price of a given stock on the ith day.
 * You want to maximize your profit by choosing a single day to buy one stock and choosing
 * a different day in the future to sell that stock.
 *
 * Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.
 *
 * <a href="https://leetcode.com/problems/best-time-to-buy-and-sell-stock/description/">...</a>
 *
 * @author naletov
 */
public class BestTimeToBuyAndSellStockAlgorithm
{
    private static final Logger LOGGER = LoggerFactory.getLogger(BestTimeToBuyAndSellStockAlgorithm.class);

    /**
     * Returns the maximum profit you can achieve from this transaction or 0 (not optimal)
     * @param prices array of prices
     * @return max profit
     */
    public int maxProfit(int[] prices)
    {
        int maxProfit = 0;
        int minPrice = prices[0];

        LOGGER.info("prices: {};", prices);
        for (int i = 1; i < prices.length; i++)
        {
            maxProfit = Math.max(maxProfit, prices[i] - minPrice);
            minPrice = Math.min(minPrice, prices[i]);
            LOGGER.info("maxProfit: {}; minPrice: {})", maxProfit, minPrice);
        }
        return maxProfit;
    }

    /**
     * Returns the maximum profit you can achieve from this transaction or 0 (not optimal)
     * @param prices array of prices
     * @return max profit
     */
    public int maxProfitRecursive(int[] prices)
    {
        if (prices == null || prices.length < 2)
        {
            return 0;
        }
        return checkProfit(prices, 0, prices.length - 1, 0);
    }

    private int checkProfit(int[] prices, int left, int right, int profit)
    {
        if (left >= right)
        {
            return profit;
        }

        if (prices[left] >= prices[left + 1])
        {
            profit = checkProfit(prices, left + 1, right, profit);
        }

        if (prices[right-1] >= prices[right])
        {
            profit = checkProfit(prices, left, right - 1, profit);
        }

        if (left + 2 < prices.length - 1)
            profit = checkProfit(prices, left + 2, right, Math.max(profit, prices[left + 1] - prices[left]));
        if (right - 2 > 0)
            profit = checkProfit(prices, left, right - 2, Math.max(profit, prices[right] - prices[left]));

        return Math.max(profit, prices[right] - prices[left]);
    }
}
