package com.program.training.algorithm.bestimetobuysellwithfee;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * You are given an array prices where prices[i] is the price of a given stock on the ith day.
 * Find the maximum profit you can achieve. You may complete as many transactions as you like
 * Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.
 *
 * <a href="https://leetcode.com/problems/best-time-to-buy-and-sell-stock-with-transaction-fee/description/">...</a>
 *
 * @author naletov
 */
public class BestTimeToBuyAndSellStockWithFeeAlgorithm
{
    private static final Logger LOGGER = LoggerFactory.getLogger(BestTimeToBuyAndSellStockWithFeeAlgorithm.class);

    /**
     * Returns the maximum profit you can achieve.
     * You may complete as many transactions as you like,
     * but you need to pay the transaction fee for each transaction.
     *
     * @param prices array of prices
     * @param fee    transaction fee
     *
     * @return max profit
     */
    public int maxProfit(int[] prices, int fee)
    {
        // Check for edge cases
        if (prices == null || prices.length < 2) {
            return 0;
        }

        // held: Maximum profit if we hold the stock at the end of the current day.
        // Initialize with a purchase on the first day: -prices[0]
        int held = -prices[0];

        // not_held: Maximum profit if we are NOT holding the stock at the end of the current day.
        // Initialize to 0, since the profit before the first trade is 0.
        int not_held = 0;

        for (int i = 1; i < prices.length; i++) {
            int price = prices[i];

            // keep the previous values, as they will be updated in the loop
            int prev_held = held;
            int prev_not_held = not_held;

            // 1. Update held (We own the stock):
            // a) Continue holding: prev_held
            // b) Buy today: prev_not_held - price
            // (The transaction has not yet been completed, no commission is paid)
            held = Math.max(prev_held, prev_not_held - price);

            // 2. Update not_held (Don't hold shares):
            // a) Continue not holding: prev_not_held
            // b) Sell today: prev_held + price - fee (Transaction completed, pay fee)
            not_held = Math.max(prev_not_held, prev_held + price - fee);
        }

        // The maximum profit will be achieved in the state when we do not hold the stock.
        return not_held;
    }
}
