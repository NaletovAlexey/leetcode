/*
MainBestTimeToBuyAndSellStockWithFee.java

Copyright © 1982-2026$ Naletov Alexey. All rights reserved.
THIS IS UNPUBLISHED PROPRIETARY SOURCE CODE OF Naletov Alexey.
The copyright notice above does not evidence any actual
or intended publication of such source code.
*/
package com.program.training;

import com.program.training.algorithm.bestimetobuysellwithfee.BestTimeToBuyAndSellStockWithFeeAlgorithm;
import com.program.training.test.data.BestTimeToBuyAndSellStockWithFeeAlgorithmData;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * 714. Best Time to Buy and Sell Stock with Transaction Fee
 *
 * @author Naletov Alexey
 */
public class MainBestTimeToBuyAndSellStockWithFee
{
    public static final Logger LOGGER = LoggerFactory.getLogger(MainBestTimeToBuyAndSellStockWithFee.class);
    public static final String RESULT = "Result: {}";

    public static void main(String[] args)
    {
        LOGGER.info("Hello and welcome to Best Time to Buy and Sell Stock with Transaction Fee practice!");
        LOGGER.info("Starting Best Time to Buy and Sell Stock with Transaction Fee Algorithm...");
        LOGGER.info("Best Time to Buy and Sell Stock with Transaction Fee Algorithm:");

        BestTimeToBuyAndSellStockWithFeeAlgorithm bestTimeToBuyAndSellStockWithFeeAlgorithm = new BestTimeToBuyAndSellStockWithFeeAlgorithm();

        int case1 = bestTimeToBuyAndSellStockWithFeeAlgorithm.maxProfit(BestTimeToBuyAndSellStockWithFeeAlgorithmData.prices_1,
                BestTimeToBuyAndSellStockWithFeeAlgorithmData.fee_1);
        LOGGER.info(RESULT, case1);
        assertEquals(8, case1, "prices: [1, 3, 2, 8, 4, 9] - profit 8");

        int case2 = bestTimeToBuyAndSellStockWithFeeAlgorithm.maxProfit(BestTimeToBuyAndSellStockWithFeeAlgorithmData.prices_2,
                BestTimeToBuyAndSellStockWithFeeAlgorithmData.fee_2);
        LOGGER.info(RESULT, case2);
        assertEquals(6, case2, "prices: [1, 3, 7, 5, 10, 3] - profit 6");

        LOGGER.info("Ending Best Time to Buy and Sell Stock with Transaction Fee Algorithm...");
    }
}