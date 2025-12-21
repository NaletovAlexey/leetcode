package com.program.training;

import com.program.training.algorithm.balancedbinarytree.BalancedBinaryTreeAlgorithm;
import com.program.training.algorithm.besttimetobuysell.BestTimeToBuyAndSellStockAlgorithm;
import com.program.training.algorithm.besttimetobuysell.BestTimeToBuyAndSellStockIIAlgorithm;
import com.program.training.algorithm.besttimetobuysellwithcooldown.BestTimeToBuyAndSellStockWithCooldownAlgorithm;
import com.program.training.algorithm.binarysearch.BinarySearchAlgorithm;
import com.program.training.algorithm.containerwithmostwater.ContainerWithMostWaterAlgorithm;
import com.program.training.algorithm.foursum.FourSumAlgorithm;
import com.program.training.algorithm.guessnumber.GuessNumberHigherLowerAlgorithm;
import com.program.training.algorithm.jumpgame.JumpGameAlgorithm;
import com.program.training.algorithm.jumpgame.JumpGameIIAlgorithm;
import com.program.training.algorithm.mergeintervals.MergeIntervalsAlgorithm;
import com.program.training.algorithm.mergeksortedlists.MergeKSortedListsAlgorithm;
import com.program.training.algorithm.mergesortedarray.MergeSortedArrayAlgorithm;
import com.program.training.algorithm.numberofisland.NumberOfIslandAlgorithm;
import com.program.training.algorithm.partitionlabels.PartitionLabelsAlgorithm;
import com.program.training.algorithm.printinorder.PrintInOrderAlgorithm;
import com.program.training.algorithm.search2dmatris.Search2DMatrixAlgorithm;
import com.program.training.algorithm.singlenumber.SingleNumberAlgorithm;
import com.program.training.algorithm.slidingwindowmedian.SlidingWindowMedianAlgorithm;
import com.program.training.algorithm.smallestsumspairs.FindKPairsSmallestSumsAlgorithm;
import com.program.training.algorithm.symmetrictree.SymmetricTreeAlgorithm;
import com.program.training.algorithm.topkfrequentelements.TopKFrequentElementsAlgorithm;
import com.program.training.algorithm.topkfrequentwords.TopKFrequentWordsAlgorithm;
import com.program.training.algorithm.triangle.TriangleAlgorithm;
import com.program.training.algorithm.twonumbers.TwoNumbersAlgorithm;
import com.program.training.algorithm.twosumiv.TwoSumIVAlgorithm;
import com.program.training.algorithm.validanagram.ValidAnagramAlgorithm;
import com.program.training.test.data.*;
import com.program.training.test.data.api.ListNode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static com.program.training.test.data.MergeKSortedListsAlgorithmData.*;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author naletov
 */
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main
{
    public static final Logger LOGGER = LoggerFactory.getLogger(Main.class);
    public static final String RESULT = "Result: {}";

    public static void main(String[] args)
    {
//        doTwoNumbersAlgorithm();
//        doTriangleAlgorithm();
//        doMergeKSortedListsAlgorithm();
//        doSingleNumberAlgorithm();
//        doFourSumAlgorithm();
//        doGuessNumberHigherOrLowerAlgorithm();
//        doBinarySearchAlgorithm();
//        doMergeIntervalsAlgorithm();
//        doFindKPairsSmallestSumsAlgorithm();
//        doSlidingWindowMedianAlgorithm();
//        doTopKFrequentWordsAlgorithm();
//        doBalancedBinaryTreeAlgorithm();
//        doBestTimeToBuyAndSellStockAlgorithm();
//        doContainerWithMostWaterAlgorithm();
//        doPartitionLabelsAlgorithm();
//        doTopKFrequentElementsAlgorithm();
//        doBestTimeToBuyAndSellStockWithCooldownAlgorithm();
//        doNumberOfIslandAlgorithm();
//        doMergeSortedArrayAlgorithm();
//        doTwoSumIVAlgorithm();
//        doSymmetricTreeAlgorithm();
//        doValidAnagramAlgorithm();
//        doPrintInOrderAlgorithm();
//        doJumpGameAlgorithm();
//        doJumpGameIIAlgorithm();
//        doSearch2DMatrixAlgorithm();
          doBestTimeToBuyAndSellStockIIAlgorithm();
    }

    /**
     * 122. Best Time to Buy and Sell Stock II
     */
    private static void doBestTimeToBuyAndSellStockIIAlgorithm()
    {
        LOGGER.info("Hello and welcome to Best Time to Buy and Sell Stock II practice!");
        LOGGER.info("Starting Best Time to Buy and Sell Stock II Algorithm...");
        LOGGER.info("Best Time to Buy and Sell Stock II Algorithm:");

        BestTimeToBuyAndSellStockIIAlgorithm bestTimeToBuyAndSellStockIIAlgorithm = new BestTimeToBuyAndSellStockIIAlgorithm();

        int case1 = bestTimeToBuyAndSellStockIIAlgorithm.maxProfit(BestTimeToBuyAndSellStockAlgorithmData.prices_1);
        LOGGER.info(RESULT, case1);
        assertEquals(7, case1, "prices: [7, 1, 5, 3, 6, 4] - Total profit 7");

        int case6 = bestTimeToBuyAndSellStockIIAlgorithm.maxProfit(BestTimeToBuyAndSellStockAlgorithmData.prices_6);
        LOGGER.info(RESULT, case6);
        assertEquals(4, case6, "prices: [1, 2, 3, 4, 5] - profit 4");

        int case2 = bestTimeToBuyAndSellStockIIAlgorithm.maxProfit(BestTimeToBuyAndSellStockAlgorithmData.prices_2);
        LOGGER.info(RESULT, case2);
        assertEquals(0, case2, "prices: [7, 6, 4, 3, 1] - Total profit 0");

        int case3 = bestTimeToBuyAndSellStockIIAlgorithm.maxProfit(BestTimeToBuyAndSellStockAlgorithmData.prices_3);
        LOGGER.info(RESULT, case3);
        assertEquals(1, case3, "prices: [1, 2] - profit 1");

        LOGGER.info("Ending Best Time to Buy and Sell Stock II Algorithm...");
    }

    /**
     * 74. Search a 2D Matrix
     */
    private static void doSearch2DMatrixAlgorithm()
    {
        LOGGER.info("Hello and welcome to Search a 2D Matrix practice!");
        LOGGER.info("Starting Search a 2D Matrix Algorithm...");
        LOGGER.info("Search a 2D Matrix Algorithm:");

        Search2DMatrixAlgorithm search2DMatrixAlgorithm = new Search2DMatrixAlgorithm();

        assertTrue(search2DMatrixAlgorithm.searchMatrix(Search2DMatrixAlgorithmData.matrix_1, Search2DMatrixAlgorithmData.target_1),
                "matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 3 -> true");

        assertFalse(search2DMatrixAlgorithm.searchMatrix(Search2DMatrixAlgorithmData.matrix_1, Search2DMatrixAlgorithmData.target_2),
                "matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 13 -> true");

        assertFalse(search2DMatrixAlgorithm.searchMatrix(Search2DMatrixAlgorithmData.matrix_3, Search2DMatrixAlgorithmData.target_3),
                "matrix = [[1]], target = 0 -> false");

        assertTrue(search2DMatrixAlgorithm.searchMatrix(Search2DMatrixAlgorithmData.matrix_4, Search2DMatrixAlgorithmData.target_4),
                "matrix = [[1]], target = 1 -> true");

        assertFalse(search2DMatrixAlgorithm.searchMatrix(Search2DMatrixAlgorithmData.matrix_5, Search2DMatrixAlgorithmData.target_5),
                "matrix = [[1]], target = 1 -> false");

        assertTrue(search2DMatrixAlgorithm.searchMatrix(Search2DMatrixAlgorithmData.matrix_6, Search2DMatrixAlgorithmData.target_6),
                "matrix = [[1, 3]], target = 3 -> true");

        LOGGER.info("Search a 2D Matrix Algorithm...");
    }

    /**
     * 45. Jump Game II
     */
    private static void doJumpGameIIAlgorithm()
    {
        LOGGER.info("Hello and welcome to Jump Game II practice!");
        LOGGER.info("Starting Jump Game II Algorithm...");
        LOGGER.info("Jump Game II Algorithm:");

        JumpGameIIAlgorithm jumpGameIIAlgorithm = new JumpGameIIAlgorithm();

        assertEquals(2, jumpGameIIAlgorithm.jump(JumpGameAlgorithmData.nums_1), "[2, 3, 1, 1, 4]: 2");
        LOGGER.info(RESULT, 2);

        assertEquals(0, jumpGameIIAlgorithm.jump(JumpGameAlgorithmData.nums_3), "[0]: 0");
        LOGGER.info(RESULT, 0);

        assertEquals(2, jumpGameIIAlgorithm.jump(JumpGameAlgorithmData.nums_5), "[3, 0, 8, 2, 0, 0, 1]: 2");
        LOGGER.info(RESULT, 2);

        assertEquals(2, jumpGameIIAlgorithm.jump(JumpGameAlgorithmData.nums_6), "[2, 3, 0, 1, 4]: 2");
        LOGGER.info(RESULT, 2);

        assertEquals(2, jumpGameIIAlgorithm.jump(JumpGameAlgorithmData.nums_7), "[2, 4, 2, 1, 1, 1]: 2");
        LOGGER.info(RESULT, 2);

        assertEquals(2, jumpGameIIAlgorithm.jump(JumpGameAlgorithmData.nums_8), "[2, 3, 3, 1, 1, 1]: 2");
        LOGGER.info(RESULT, 2);

        assertEquals(1, jumpGameIIAlgorithm.jump(JumpGameAlgorithmData.nums_9), "[1, 2]: 1");
        LOGGER.info(RESULT, 1);

        assertEquals(1, jumpGameIIAlgorithm.jump(JumpGameAlgorithmData.nums_10), "[2, 3, 1]: 1");
        LOGGER.info(RESULT, 1);

        assertEquals(2, jumpGameIIAlgorithm.jump(JumpGameAlgorithmData.nums_11), "[1, 2, 3, 4]: 2");
        LOGGER.info(RESULT, 2);     LOGGER.info("Jump Game II Algorithm:");

        assertEquals(3, jumpGameIIAlgorithm.jump(JumpGameAlgorithmData.nums_12), "[3, 4, 3, 2, 5, 4, 3]: 3");
        LOGGER.info(RESULT, 3);

        assertEquals(3, jumpGameIIAlgorithm.jump(JumpGameAlgorithmData.nums_13), "[3, 4, 3, 1, 0, 7, 0, 3, 0, 2, 0, 3]: 3");
        LOGGER.info(RESULT, 3);

        assertEquals(2, jumpGameIIAlgorithm.jump(JumpGameAlgorithmData.nums_14), "[1, 2, 3]: 2");
        LOGGER.info(RESULT, 2);

        assertEquals(3, jumpGameIIAlgorithm.jump(JumpGameAlgorithmData.nums_15), "[1, 2, 1, 1, 1]: 3");
        LOGGER.info(RESULT, 3);

        LOGGER.info("Ending Jump Game II Algorithm...");
    }

    /**
     * 55. Jump Game
     */
    private static void doJumpGameAlgorithm()
    {
        LOGGER.info("Hello and welcome to Jump Game practice!");
        LOGGER.info("Starting Jump Game Algorithm...");
        LOGGER.info("Jump Game Algorithm:");

        JumpGameAlgorithm jumpGameAlgorithm = new JumpGameAlgorithm();

        assertTrue(jumpGameAlgorithm.canJump(JumpGameAlgorithmData.nums_1), "[2, 3, 1, 1, 4]: true");

        assertFalse(jumpGameAlgorithm.canJump(JumpGameAlgorithmData.nums_2), "[3, 2, 1, 0, 4]: false");

        assertTrue(jumpGameAlgorithm.canJump(JumpGameAlgorithmData.nums_3), "[0]: true");

        assertFalse(jumpGameAlgorithm.canJump(JumpGameAlgorithmData.nums_4), "[0, 2, 3]: false");

        assertTrue(jumpGameAlgorithm.canJump(JumpGameAlgorithmData.nums_5), "[3, 0, 8, 2, 0, 0, 1]: true");

        assertTrue(jumpGameAlgorithm.canJump(JumpGameAlgorithmData.nums_6), "[2, 3, 0, 1, 4]: true");

        LOGGER.info("Ending Jump Game Algorithm...");
    }

    /**
     * 1114. Print in Order
     */
    private static void doPrintInOrderAlgorithm()
    {
        LOGGER.info("Hello and welcome to Print in Order practice!");
        LOGGER.info("Starting Print in Order Algorithm...");
        LOGGER.info("Print in Order Algorithm:");

        // 1 -> 2 -> 3
        PrintInOrderAlgorithmData.setOutput("");
        PrintInOrderAlgorithm printInOrderAlgorithm = new PrintInOrderAlgorithm();

        Thread t1_1 = new Thread(() -> {
            try
            {
                printInOrderAlgorithm.first(PrintInOrderAlgorithmData.printFirst());
            } catch (InterruptedException e)
            {
                LOGGER.warn("Interrupted!");
                Thread.currentThread().interrupt();
            }
        });

        Thread t2_1 = new Thread(() -> {
            try
            {
                printInOrderAlgorithm.second(PrintInOrderAlgorithmData.printSecond());
            } catch (InterruptedException e)
            {
                LOGGER.warn("Interrupted!");
                Thread.currentThread().interrupt();
            }
        });

        Thread t3_1 = new Thread(() -> {
            try
            {
                printInOrderAlgorithm.third(PrintInOrderAlgorithmData.printThird());
            } catch (InterruptedException e)
            {
                LOGGER.warn("Interrupted!");
                Thread.currentThread().interrupt();
            }
        });

        t1_1.start();
        t2_1.start();
        t3_1.start();
        // wait main Thread
        try
        {
            t1_1.join();
            t2_1.join();
            t3_1.join();
        }
        catch (InterruptedException e)
        {
            LOGGER.warn("Interrupted!");
            Thread.currentThread().interrupt();
        }

        LOGGER.info(RESULT, PrintInOrderAlgorithmData.getOutput());
        assertEquals(PrintInOrderAlgorithmData.RESULT, PrintInOrderAlgorithmData.getOutput(),
                "Result must be: firstsecondthird");

        // 1 -> 3 -> 2
        PrintInOrderAlgorithmData.setOutput("");
        printInOrderAlgorithm.setFirstDone(false);
        printInOrderAlgorithm.setSecondDone(false);

        Thread t1_2 = new Thread(() -> {
            try
            {
                printInOrderAlgorithm.first(PrintInOrderAlgorithmData.printFirst());
            } catch (InterruptedException e)
            {
                LOGGER.warn("Interrupted!");
                Thread.currentThread().interrupt();
            }
        });

        Thread t2_2 = new Thread(() -> {
            try
            {
                printInOrderAlgorithm.third(PrintInOrderAlgorithmData.printThird());
            } catch (InterruptedException e)
            {
                LOGGER.warn("Interrupted!");
                Thread.currentThread().interrupt();
            }
        });

        Thread t3_2 = new Thread(() -> {
            try
            {
                printInOrderAlgorithm.second(PrintInOrderAlgorithmData.printSecond());
            } catch (InterruptedException e)
            {
                LOGGER.warn("Interrupted!");
                Thread.currentThread().interrupt();
            }
        });

        t1_2.start();
        t2_2.start();
        t3_2.start();
        // wait main Thread
        try
        {
            t1_2.join();
            t2_2.join();
            t3_2.join();
        }
        catch (InterruptedException e)
        {
            LOGGER.warn("Interrupted!");
            Thread.currentThread().interrupt();
        }

        LOGGER.info(RESULT, PrintInOrderAlgorithmData.getOutput());
        assertEquals(PrintInOrderAlgorithmData.RESULT, PrintInOrderAlgorithmData.getOutput(),
                "Result must be: firstsecondthird");

        LOGGER.info("Ending Print in Order Algorithm...");
    }

    /**
     * 242. Valid Anagram
     */
    private static void doValidAnagramAlgorithm()
    {
        LOGGER.info("Hello and welcome to Valid Anagram practice!");
        LOGGER.info("Starting Valid Anagram Algorithm...");
        LOGGER.info("Valid Anagram Algorithm:");

        ValidAnagramAlgorithm validAnagramAlgorithm = new ValidAnagramAlgorithm();

        boolean case1 = validAnagramAlgorithm.isAnagram(ValidAnagramAlgorithmData.s_1, ValidAnagramAlgorithmData.t_1);
        LOGGER.info(RESULT, case1);
        assertTrue(case1, "anagram and nagaram");

        boolean case2 = validAnagramAlgorithm.isAnagram(ValidAnagramAlgorithmData.s_2, ValidAnagramAlgorithmData.t_2);
        LOGGER.info(RESULT, case2);
        assertFalse(case2, "rat and car");

        boolean case3 = validAnagramAlgorithm.isAnagram(ValidAnagramAlgorithmData.s_3, ValidAnagramAlgorithmData.t_3);
        LOGGER.info(RESULT, case3);
        assertFalse(case3, "aabb and abcc");

        LOGGER.info("Ending Valid Anagram Algorithm...");
    }

    /**
     * 101. Symmetric Tree
     */
    private static void doSymmetricTreeAlgorithm()
    {
        LOGGER.info("Hello and welcome to Symmetric Tree practice!");
        LOGGER.info("Starting Symmetric Tree Algorithm...");
        LOGGER.info("Symmetric Tree Algorithm:");

        SymmetricTreeAlgorithm symmetricTreeAlgorithm = new SymmetricTreeAlgorithm();

        boolean case1 = symmetricTreeAlgorithm.isSymmetric(SymmetricTreeAlgorithmData.root_1);
        LOGGER.info(RESULT, case1);
        assertTrue(case1, "root = [1, 2, 2, 3, 4, 4, 3]");

        boolean case2 = symmetricTreeAlgorithm.isSymmetric(SymmetricTreeAlgorithmData.root_2);
        LOGGER.info(RESULT, case2);
        assertFalse(case2, "root = [1, 2, 2, null, 3, null, 3]");

        boolean case3 = symmetricTreeAlgorithm.isSymmetric(SymmetricTreeAlgorithmData.root_3);
        LOGGER.info(RESULT, case3);
        assertFalse(case3, "root = [5, 2, 2, 4, null, null, 1, null, 1, null, 4, 2, null, 2, null]");

        boolean case4 = symmetricTreeAlgorithm.isSymmetric(SymmetricTreeAlgorithmData.root_4);
        LOGGER.info(RESULT, case4);
        assertFalse(case4, "root = [[2, 3, 3, 4, 5, 5]");

        LOGGER.info("Ending Symmetric Tree Algorithm...");
    }

    /**
     * 653. Two Sum IV - Input is a BST
     */
    private static void doTwoSumIVAlgorithm()
    {
        LOGGER.info("Hello and welcome to Two Sum IV practice!");
        LOGGER.info("Starting Two Sum IV Algorithm...");
        LOGGER.info("Two Sum IV Algorithm:");

        TwoSumIVAlgorithm twoSumIVAlgorithm = new TwoSumIVAlgorithm();

        boolean case1 = twoSumIVAlgorithm.findTarget(TwoSumIVAlgorithmData.root_1, TwoSumIVAlgorithmData.k_1);
        LOGGER.info(RESULT, case1);
        assertTrue(case1, "root = [5, 3, 6, 2, 4, null, 7], k = 9");

        boolean case2 = twoSumIVAlgorithm.findTarget(TwoSumIVAlgorithmData.root_2, TwoSumIVAlgorithmData.k_2);
        LOGGER.info(RESULT, case2);
        assertFalse(case2, "root = [5, 3, 6, 2, 4, null, 7], k = 28");

        boolean case3 = twoSumIVAlgorithm.findTarget(TwoSumIVAlgorithmData.root_3, TwoSumIVAlgorithmData.k_3);
        LOGGER.info(RESULT, case3);
        assertTrue(case3, "root = [5, 2, 6, 1, null, null, 8], k = 9");

        LOGGER.info("Ending Two Sum IV Algorithm...");
    }

    /**
     * 88. Merge Sorted Array
     */
    private static void doMergeSortedArrayAlgorithm()
    {
        LOGGER.info("Hello and welcome to Merge Sorted Array practice!");
        LOGGER.info("Starting Merge Sorted Array Algorithm...");
        LOGGER.info("Merge Sorted Arraynds Algorithm:");

        MergeSortedArrayAlgorithm mergeSortedArrayAlgorithm = new MergeSortedArrayAlgorithm();

        mergeSortedArrayAlgorithm.merge(MergeSortedArrayAlgorithmData.nums_1_1, MergeSortedArrayAlgorithmData.m_1,
                MergeSortedArrayAlgorithmData.nums_1_2, MergeSortedArrayAlgorithmData.n_1);

        assertEquals("[1, 2, 2, 3, 5, 6]", Arrays.toString(MergeSortedArrayAlgorithmData.nums_1_1), "Output: [1, 2, 2, 3, 5, 6]");

        mergeSortedArrayAlgorithm.merge(MergeSortedArrayAlgorithmData.nums_2_1, MergeSortedArrayAlgorithmData.m_2,
                MergeSortedArrayAlgorithmData.nums_2_2, MergeSortedArrayAlgorithmData.n_2);

        assertEquals("[1]", Arrays.toString(MergeSortedArrayAlgorithmData.nums_2_1), "Output: [1]");

        mergeSortedArrayAlgorithm.merge(MergeSortedArrayAlgorithmData.nums_3_1, MergeSortedArrayAlgorithmData.m_3,
                MergeSortedArrayAlgorithmData.nums_3_2, MergeSortedArrayAlgorithmData.n_3);

        assertEquals("[1]", Arrays.toString(MergeSortedArrayAlgorithmData.nums_3_1), "Output: [1]");

        mergeSortedArrayAlgorithm.merge(MergeSortedArrayAlgorithmData.nums_4_1, MergeSortedArrayAlgorithmData.m_4,
                MergeSortedArrayAlgorithmData.nums_4_2, MergeSortedArrayAlgorithmData.n_4);

        assertEquals("[1, 2, 2, 3, 5, 6]", Arrays.toString(MergeSortedArrayAlgorithmData.nums_4_1), "Output: [1, 2, 2, 3, 5, 6]");

        LOGGER.info("Ending Merge Sorted Array Algorithm...");
    }

    /**
     * 200. Number of Islands
     */
    private static void doNumberOfIslandAlgorithm()
    {
        LOGGER.info("Hello and welcome to Number of Islands practice!");
        LOGGER.info("Starting Number of Islands Algorithm...");
        LOGGER.info("Number of Islands Algorithm:");

        NumberOfIslandAlgorithm numberOfIslandAlgorithm = new NumberOfIslandAlgorithm();

        assertEquals(1, numberOfIslandAlgorithm.numIslands(NumberOfIslandAlgorithmData.grid_1), "case 1 - 1 Island");
        assertEquals(3, numberOfIslandAlgorithm.numIslands(NumberOfIslandAlgorithmData.grid_2), "case 2 - 3 Islands");


        LOGGER.info("Ending Number of Islands Algorithm...");
    }

    /**
     * 309. Best Time to Buy and Sell Stock with Cooldown
     */
    private static void doBestTimeToBuyAndSellStockWithCooldownAlgorithm()
    {
        LOGGER.info("Hello and welcome to Best Time to Buy and Sell Stock with Cooldown practice!");
        LOGGER.info("Starting Best Time to Buy and Sell Stock with Cooldown Algorithm...");
        LOGGER.info("Best Time to Buy and Sell Stock with Cooldown Algorithm:");

        BestTimeToBuyAndSellStockWithCooldownAlgorithm bestTimeToBuyAndSellStockWithCooldownAlgorithm = new BestTimeToBuyAndSellStockWithCooldownAlgorithm();

        int case1 = bestTimeToBuyAndSellStockWithCooldownAlgorithm.maxProfit(BestTimeToBuyAndSellStockWithCooldownAlgorithmData.prices_1);
        LOGGER.info(RESULT, case1);
        assertEquals(3, case1, "prices: [1, 2, 3, 0, 2] - profit 3");

        int case2 = bestTimeToBuyAndSellStockWithCooldownAlgorithm.maxProfit(BestTimeToBuyAndSellStockWithCooldownAlgorithmData.prices_2);
        LOGGER.info(RESULT, case2);
        assertEquals(0, case2, "prices: [1] - profit 0");

        int case3 = bestTimeToBuyAndSellStockWithCooldownAlgorithm.maxProfit(BestTimeToBuyAndSellStockWithCooldownAlgorithmData.prices_3);
        LOGGER.info(RESULT, case3);
        assertEquals(19, case3, "prices: [4, 3, 2, 10, 11, 0, 11] - profit 19");

        int case4 = bestTimeToBuyAndSellStockWithCooldownAlgorithm.maxProfit(BestTimeToBuyAndSellStockWithCooldownAlgorithmData.prices_4);
        LOGGER.info(RESULT, case4);
        assertEquals(6, case4, "prices: [6, 1, 3, 2, 4, 7] - profit 6");

        LOGGER.info("Ending Best Time to Buy and Sell Stock with Cooldown Algorithm...");
    }

    /**
     * 347. Top K Frequent Elements
     */
    private static void doTopKFrequentElementsAlgorithm()
    {
        LOGGER.info("Hello and welcome to Top K Frequent Elements Algorithm practice!");
        LOGGER.info("Starting Top K Frequent Elements Algorithm...");
        LOGGER.info("Top K Frequent Elements Algorithm:");

        TopKFrequentElementsAlgorithm topKFrequentElementsAlgorithm = new TopKFrequentElementsAlgorithm();

        int[] case1 = topKFrequentElementsAlgorithm.topKFrequent(TopKFrequentElementsAlgorithmData.elements_1,
                TopKFrequentElementsAlgorithmData.k_1);

        LOGGER.info(RESULT, case1);
        assertEquals("[1, 2]", Arrays.stream(case1).mapToObj(String::valueOf).collect(Collectors.joining(", ", "[", "]")),
                "The sequence: [1, 1, 1, 2, 2, 3], Output [1, 2]]");

        int[] case2 = topKFrequentElementsAlgorithm.topKFrequent(TopKFrequentElementsAlgorithmData.elements_2,
                TopKFrequentElementsAlgorithmData.k_2);

        LOGGER.info(RESULT, case2);
        assertEquals("[1]", Arrays.stream(case2).mapToObj(String::valueOf).collect(Collectors.joining(", ", "[", "]")),
                "The sequence: [1], Output [1]]");

        int[] case3 = topKFrequentElementsAlgorithm.topKFrequent(TopKFrequentElementsAlgorithmData.elements_3,
                TopKFrequentElementsAlgorithmData.k_3);

        LOGGER.info(RESULT, case3);
        assertEquals("[1, 2]", Arrays.stream(case3).mapToObj(String::valueOf).collect(Collectors.joining(", ", "[", "]")),
                "The sequence: [1, 2, 1, 2, 1, 2, 3, 1, 3, 2], Output [1, 2]");

        LOGGER.info("Ending Top K Frequent Elements Algorithm...");
    }

    /**
     * 763. Partition Labels
     */
    private static void doPartitionLabelsAlgorithm()
    {
        LOGGER.info("Hello and welcome to Partition Labels practice!");
        LOGGER.info("Starting Container With Partition Labels...");
        LOGGER.info("Container With Partition Labels Algorithm:");

        PartitionLabelsAlgorithm partitionLabelsAlgorithm = new PartitionLabelsAlgorithm();

        List<Integer> case1 = partitionLabelsAlgorithm.partitionLabels(PartitionLabelsAlgorithmData.s_1);
        assertEquals(3, case1.size(), "ababcbacadefegdehijhklij - size 3");
        assertEquals("[9, 7, 8]", case1.toString(), "ababcbacadefegdehijhklij - [9, 7, 8]");

        List<Integer> case2 = partitionLabelsAlgorithm.partitionLabels(PartitionLabelsAlgorithmData.s_2);
        assertEquals(1, case2.size(), "eccbbbbdec - size 1");
        assertEquals("[10]", case2.toString(), "eccbbbbdec - [10]");

        List<Integer> case3 = partitionLabelsAlgorithm.partitionLabels(PartitionLabelsAlgorithmData.s_3);
        assertEquals(1, case3.size(), "eeeeeeeeee - size 1");
        assertEquals("[10]", case3.toString(), "eeeeeeeeee - [10]");

        List<Integer> case4 = partitionLabelsAlgorithm.partitionLabels(PartitionLabelsAlgorithmData.s_4);
        assertEquals(8, case4.size(), "abcdefgh - size 8");
        assertEquals("[1, 1, 1, 1, 1, 1, 1, 1]", case4.toString(), "abcdefgh - [1, 1, 1, 1, 1, 1, 1, 1]");

        List<Integer> case5 = partitionLabelsAlgorithm.partitionLabels(PartitionLabelsAlgorithmData.s_5);
        assertEquals(1, case5.size(), "a - size 1");
        assertEquals("[1]", case5.toString(), "a - [1]");

        List<Integer> case6 = partitionLabelsAlgorithm.partitionLabels(PartitionLabelsAlgorithmData.s_6);
        assertEquals(2, case6.size(), "eaaaabaaec - size 2");
        assertEquals("[9, 1]", case6.toString(), "eaaaabaaec - [9, 1]");

        LOGGER.info("Ending Container With Partition Labels Algorithm...");
    }

    /**
     * 11. Container With Most Water
     */
    private static void doContainerWithMostWaterAlgorithm()
    {
        LOGGER.info("Hello and welcome to Container With Most Water practice!");
        LOGGER.info("Starting Container With Most Water Algorithm...");
        LOGGER.info("Container With Most Water Algorithm:");

        ContainerWithMostWaterAlgorithm containerWithMostWaterAlgorithm = new ContainerWithMostWaterAlgorithm();

        int case1 = containerWithMostWaterAlgorithm.maxArea(ContainerWithMostWaterAlgorithmData.height_1);
        assertEquals(49, case1, "prices: [1, 8, 6, 2, 5, 4, 8, 3, 7] - result 49");
        LOGGER.info(RESULT, case1);

        int case2 = containerWithMostWaterAlgorithm.maxArea(ContainerWithMostWaterAlgorithmData.height_2);
        assertEquals(1, case2, "prices: [1, 1] - result 1");
        LOGGER.info(RESULT, case2);

        LOGGER.info("Ending Container With Most Water Algorithm...");
    }

    /**
     * 121. Best Time to Buy and Sell Stock
     */
    private static void doBestTimeToBuyAndSellStockAlgorithm()
    {
        LOGGER.info("Hello and welcome to Best Time to Buy and Sell Stock practice!");
        LOGGER.info("Starting Best Time to Buy and Sell Stock Algorithm...");
        LOGGER.info("Best Time to Buy and Sell Stock Algorithm:");

        BestTimeToBuyAndSellStockAlgorithm bestTimeToBuyAndSellStockAlgorithm = new BestTimeToBuyAndSellStockAlgorithm();

        int case1 = bestTimeToBuyAndSellStockAlgorithm.maxProfit(BestTimeToBuyAndSellStockAlgorithmData.prices_1);
        LOGGER.info(RESULT, case1);
        assertEquals(5, case1, "prices: [7, 1, 5, 3, 6, 4] - profit 5");

        int case2 = bestTimeToBuyAndSellStockAlgorithm.maxProfit(BestTimeToBuyAndSellStockAlgorithmData.prices_2);
        LOGGER.info(RESULT, case2);
        assertEquals(0, case2, "prices: [7, 6, 4, 3, 1] - profit 0");

        int case3 = bestTimeToBuyAndSellStockAlgorithm.maxProfit(BestTimeToBuyAndSellStockAlgorithmData.prices_3);
        LOGGER.info(RESULT, case3);
        assertEquals(1, case3, "prices: [1, 2] - profit 1");

        int case4 = bestTimeToBuyAndSellStockAlgorithm.maxProfit(BestTimeToBuyAndSellStockAlgorithmData.prices_4);
        LOGGER.info(RESULT, case4);
        assertEquals(7, case4, "prices: [2, 9, 1, 7, 4] - profit 7");

        int case5 = bestTimeToBuyAndSellStockAlgorithm.maxProfit(BestTimeToBuyAndSellStockAlgorithmData.prices_5);
        LOGGER.info(RESULT, case5);
        assertEquals(0, case5, "prices: [1] - profit 0");

        LOGGER.info("Ending Best Time to Buy and Sell Stock Algorithm...");
    }

    /**
     * 110. Balanced Binary Tree
     */
    private static void doBalancedBinaryTreeAlgorithm()
    {
        LOGGER.info("Hello and welcome to Balanced Binary tree practice!");
        LOGGER.info("Starting Balanced Binary tree Algorithm...");
        LOGGER.info("Balanced Binary tree Algorithm:");

        BalancedBinaryTreeAlgorithm balancedBinaryTreeAlgorithm = new BalancedBinaryTreeAlgorithm();

        boolean case1 = balancedBinaryTreeAlgorithm.isBalanced(BalancedBinaryTreeAlgorithmData.bbt_1);
        LOGGER.info(RESULT, case1);
        assertTrue(case1, "root = [3, 9, 20, null, null, 15, 7] is balanced");


        boolean case2 = balancedBinaryTreeAlgorithm.isBalanced(BalancedBinaryTreeAlgorithmData.bbt_2);
        LOGGER.info(RESULT, case2);
        assertFalse(case2, "root = [1, 2, 2, 3, 3, null, null, 4, 4] isn't balanced");

        boolean case3 = balancedBinaryTreeAlgorithm.isBalanced(BalancedBinaryTreeAlgorithmData.bbt_3);
        LOGGER.info(RESULT, case3);
        assertTrue(case3, "root = [] isn't balanced");

        LOGGER.info("Ending Balanced Binary tree Algorithm...");
    }

    /**
     * 692. Top K Frequent Words
     */
    private static void doTopKFrequentWordsAlgorithm()
    {
        LOGGER.info("Hello and welcome to Top K Frequent Words Algorithm practice!");
        LOGGER.info("Starting Top K Frequent Words Algorithm...");
        LOGGER.info("Top K Frequent Words Algorithm:");

        TopKFrequentWordsAlgorithm topKFrequentWordsAlgorithm = new TopKFrequentWordsAlgorithm();

        List<String> case1 = topKFrequentWordsAlgorithm.topKFrequent(TopKFrequentWordsAlgorithmData.words_1,
                TopKFrequentWordsAlgorithmData.k_1);

        LOGGER.info(RESULT, case1);
        assertEquals("[i, love]", case1.stream().map(String::valueOf)
                        .collect(Collectors.joining(", ", "[", "]")),
                "The sequence: [\"i\",\"love\"], number of occurrence being 2 and 1 respectively");

        List<String> case2 = topKFrequentWordsAlgorithm.topKFrequent(TopKFrequentWordsAlgorithmData.words_2,
                TopKFrequentWordsAlgorithmData.k_2);

        LOGGER.info(RESULT, case2);
        assertEquals("[the, is, sunny, day]", case2.stream().map(String::valueOf)
                        .collect(Collectors.joining(", ", "[", "]")),
                "The sequence: [\"the\",\"is\",\"sunny\",\"day\"], number of occurrence being 4, 3, 2 and 1 respectively");

        LOGGER.info("Ending Top K Frequent Words Algorithm...");
    }

    /**
     * 480. Sliding Window Median
     */
    private static void doSlidingWindowMedianAlgorithm()
    {
        LOGGER.info("Hello and welcome to Sliding Window Median Algorithm practice!");
        LOGGER.info("Starting Sliding Window Median Algorithm...");
        LOGGER.info("Sliding Window Median Algorithm:");

        SlidingWindowMedianAlgorithm slidingWindowMedianAlgorithm = new SlidingWindowMedianAlgorithm();

        double[] case1 = slidingWindowMedianAlgorithm.medianSlidingWindow(SlidingWindowMedianAlgorithmData.nums_1,
                                                                            SlidingWindowMedianAlgorithmData.k_1);
        LOGGER.info(RESULT, case1);

        assertEquals("[1.0, -1.0, -1.0, 3.0, 5.0, 6.0]", Arrays.stream(case1).mapToObj(String::valueOf)
                        .collect(Collectors.joining(", ", "[", "]")),
                "The sequence: [1.0, -1.0, -1.0, 3.0, 5.0, 6.0]");

        double[] case2 = slidingWindowMedianAlgorithm.medianSlidingWindow(SlidingWindowMedianAlgorithmData.nums_2,
                SlidingWindowMedianAlgorithmData.k_2);
        LOGGER.info(RESULT, case2);

        assertEquals("[2.0, 3.0, 3.0, 3.0, 2.0, 3.0, 2.0]", Arrays.stream(case2).mapToObj(String::valueOf)
                        .collect(Collectors.joining(", ", "[", "]")),
                "The sequence: [2.0, 3.0, 3.0, 3.0, 2.0, 3.0, 2.0]");

        double[] case3 = slidingWindowMedianAlgorithm.medianSlidingWindow(SlidingWindowMedianAlgorithmData.nums_3,
                SlidingWindowMedianAlgorithmData.k_3);
        LOGGER.info(RESULT, case3);

        assertEquals("[2.147483647E9]", Arrays.stream(case3).mapToObj(String::valueOf)
                        .collect(Collectors.joining(", ", "[", "]")),
                "The sequence: [2.147483647E9]");

        double[] case4 = slidingWindowMedianAlgorithm.medianSlidingWindow(SlidingWindowMedianAlgorithmData.nums_4,
                SlidingWindowMedianAlgorithmData.k_4);
        LOGGER.info(RESULT, case4);

        assertEquals("[2.5]", Arrays.stream(case4).mapToObj(String::valueOf)
                        .collect(Collectors.joining(", ", "[", "]")),
                "The sequence: [2.57E9]");

        double[] case5 = slidingWindowMedianAlgorithm.medianSlidingWindow(SlidingWindowMedianAlgorithmData.nums_5,
                SlidingWindowMedianAlgorithmData.k_5);
        LOGGER.info(RESULT, case5);

        assertEquals("[-2.147483648E9, -0.5, -0.5, -2.147483648E9, -2.147483648E9, -0.5, 2.147483647E9, 2.147483647E9, 2.147483647E9, -0.5, -0.5, -0.5]",
                Arrays.stream(case5).mapToObj(String::valueOf).collect(Collectors.joining(", ", "[", "]")),
                "The sequence: [-2.147483648E9, -0.5, -0.5, -2.147483648E9, -2.147483648E9, -0.5, 2.147483648E9, 2.147483648E9, 2.147483648E9, -0.5, -0.5, -0.5]");

        LOGGER.info("Ending Sliding Window Median Algorithm...");
    }

    /**
     * 373. Find K Pairs with Smallest Sums
     */
    private static void doFindKPairsSmallestSumsAlgorithm()
    {
        LOGGER.info("Hello and welcome to Find K Pairs with Smallest Sums Algorithm practice!");
        LOGGER.info("Starting Find K Pairs with Smallest Sums Algorithm...");
        LOGGER.info("Find K Pairs with Smallest Sums Algorithm:");

        FindKPairsSmallestSumsAlgorithm findKPairsSmallestSumsAlgorithm = new FindKPairsSmallestSumsAlgorithm();

        List<List<Integer>> case1 = findKPairsSmallestSumsAlgorithm.kSmallestPairs(FindKPairsSmallestSumsAlgorithmData.num_1_1,
                FindKPairsSmallestSumsAlgorithmData.num_1_2, FindKPairsSmallestSumsAlgorithmData.k_1);
        LOGGER.info(RESULT, case1);
        assertEquals("[[1, 2], [1, 4], [1, 6]]", case1.toString(),
                "The first 3 pairs are returned from the sequence: [1,2],[1,4],[1,6],[7,2],[7,4],[11,2],[7,6],[11,4],[11,6]");

        List<List<Integer>> case2 = findKPairsSmallestSumsAlgorithm.kSmallestPairs(FindKPairsSmallestSumsAlgorithmData.num_2_1,
                FindKPairsSmallestSumsAlgorithmData.num_2_2, FindKPairsSmallestSumsAlgorithmData.k_2);
        LOGGER.info(RESULT, case2);
        assertEquals("[[1, 1], [1, 1]]", case2.toString(),
                "The first 2 pairs are returned from the sequence: [1,1],[1,1],[1,2],[2,1],[1,2],[2,2],[1,3],[1,3],[2,3]");

        List<List<Integer>> case3 = findKPairsSmallestSumsAlgorithm.kSmallestPairs(FindKPairsSmallestSumsAlgorithmData.num_3_1,
                FindKPairsSmallestSumsAlgorithmData.num_3_2, FindKPairsSmallestSumsAlgorithmData.k_3);
        LOGGER.info(RESULT, case3);
        assertEquals("[[1, 1], [1, 1], [1, 2], [1, 2], [2, 1], [1, 3], [2, 2], [1, 3], [2, 3]]", case3.toString(),
                "The first 9 pairs are returned from the sequence: [1,1],[1,1],[1,2],[2,1],[1,2],[2,2],[1,3],[1,3],[2,3]");

        List<List<Integer>> case4 = findKPairsSmallestSumsAlgorithm.kSmallestPairs(FindKPairsSmallestSumsAlgorithmData.num_4_1,
                FindKPairsSmallestSumsAlgorithmData.num_4_2, FindKPairsSmallestSumsAlgorithmData.k_4);
        LOGGER.info(RESULT, case4);
        assertEquals("[[1, 3], [2, 3], [1, 5]]", case4.toString(),
                "Expected result: [[1,3],[2,3],[1,5]]");

        LOGGER.info("Ending Find K Pairs with Smallest Sums Algorithm...");
    }

    /**
     * 56. Merge Intervals algorithm
     */
    private static void doMergeIntervalsAlgorithm()
    {
        LOGGER.info("Hello and welcome to Merge Intervals Algorithm practice!");
        LOGGER.info("Starting Merge Intervals Algorithm...");
        LOGGER.info("Merge IntervalsAlgorithm:");

        MergeIntervalsAlgorithm mergeIntervalsAlgorithm = new MergeIntervalsAlgorithm();

        int[][] case1 = mergeIntervalsAlgorithm.merge(MergeIntervalsAlgorithmData.intervals_1);
        LOGGER.info(RESULT + ", {}, {}", case1[0], case1[1], case1[2]);
        assertEquals(3, case1.length, "Length of case1 should be 3: [[1,6],[8,10],[15,18]]");

        int[][] case2 = mergeIntervalsAlgorithm.merge(MergeIntervalsAlgorithmData.intervals_2);
        LOGGER.info(RESULT, case2[0]);
        assertEquals(1, case2.length, "Length of case1 should be 1: [[1,5]]");

        int[][] case3 = mergeIntervalsAlgorithm.merge(MergeIntervalsAlgorithmData.intervals_3);
        LOGGER.info(RESULT , case3[0]);
        assertEquals(1, case3.length, "Length of case1 should be 1: [[1,7]]");

        LOGGER.info("Ending Merge Intervals Algorithm...");
    }

    /**
     * 704. Binary Search algorithm
     */
    private static void doBinarySearchAlgorithm()
    {
        LOGGER.info("Hello and welcome to Binary search algorithm practice!");
        LOGGER.info("Starting Binary search algorithm...");
        LOGGER.info("Binary search algorithm:");

        BinarySearchAlgorithm binarySearchAlgorithm = new BinarySearchAlgorithm();

        assertEquals(4, binarySearchAlgorithm.search(BinarySearchAlgorithmData.nums_1,
                BinarySearchAlgorithmData.target_1), "9 exists in nums and its index is 4");

        assertEquals(-1, binarySearchAlgorithm.search(BinarySearchAlgorithmData.nums_2,
                BinarySearchAlgorithmData.target_2), " 2 does not exist in nums so return -1");

        assertEquals(4, binarySearchAlgorithm.searchCommon(BinarySearchAlgorithmData.nums_1,
                BinarySearchAlgorithmData.target_1), "9 exists in nums and its index is 4");

        assertEquals(-1, binarySearchAlgorithm.searchCommon(BinarySearchAlgorithmData.nums_2,
                BinarySearchAlgorithmData.target_2), " 2 does not exist in nums so return -1");

        LOGGER.info("Ending Binary search algorithm...");
    }

    /**
     * Guess number higher or lower algorithm
     */
    private static void doGuessNumberHigherOrLowerAlgorithm()
    {
        LOGGER.info("Hello and welcome to Guess number higher or lower algorithm practice!");
        LOGGER.info("Starting Guess number higher or lower algorithm...");
        LOGGER.info("Guess number higher or lower algorithm:");

        GuessNumberHigherLowerAlgorithm guessNumberHigherLowerAlgorithm = new GuessNumberHigherLowerAlgorithm();

        guessNumberHigherLowerAlgorithm.setPick(6);
        assertEquals(6, guessNumberHigherLowerAlgorithm.guessNumberV3(10), "Result should be 6");

        guessNumberHigherLowerAlgorithm.setPick(1);
        assertEquals(1, guessNumberHigherLowerAlgorithm.guessNumberV3(1), "Result should be 1");

        guessNumberHigherLowerAlgorithm.setPick(1);
        assertEquals(1, guessNumberHigherLowerAlgorithm.guessNumberV3(2), "Result should be 1");

        LOGGER.info("Ending Guess number higher or lower algorithm...");
    }

    /**
     * Four sum algorithm
     */
    private static void doFourSumAlgorithm()
    {
        LOGGER.info("Hello and welcome to Four sum Algorithm practice!");
        LOGGER.info("Starting Four sum fourSumAlgorithm Algorithm...");
        LOGGER.info("Four sum Algorithm:");

        FourSumAlgorithm fourSumAlgorithm = new FourSumAlgorithm();
        List<List<Integer>> case1 = fourSumAlgorithm.fourSum(
                FourSumAlgorithmData.fourSum_1,
                FourSumAlgorithmData.target_1);
        LOGGER.info(RESULT + " and target = {}", case1, FourSumAlgorithmData.target_1);
        assertEquals(3, case1.size(),
                "Length of FourSumAlgorithm should be 3: [[-2,-1,1,2],[-2,0,0,2],[-1,0,0,1]]");

        List<List<Integer>> case2 = fourSumAlgorithm.fourSum(
                FourSumAlgorithmData.fourSum_2,
                FourSumAlgorithmData.target_2);
        LOGGER.info(RESULT + " and target = {}", case2, FourSumAlgorithmData.target_2);
        assertEquals(1, case2.size(),
                "Length of FourSumAlgorithm should be 1: [[2,2,2,2]]");

        List<List<Integer>> case3 = fourSumAlgorithm.fourSum(
                FourSumAlgorithmData.fourSum_3,
                FourSumAlgorithmData.target_3);
        LOGGER.info(RESULT + " and target = {}", case3, FourSumAlgorithmData.target_3);
        assertEquals(8, case3.size(),
                "Length of FourSumAlgorithm should be 8: " +
                        "[[-3, -2, 2, 3], [-3, -1, 1, 3]," +
                        " [-3, 0, 0, 3], [-3, 0, 1, 2], [-2, -1, 0, 3]," +
                        " [-2, -1, 1, 2], [-2, 0, 0, 2], [-1, 0, 0, 1]]");

        List<List<Integer>> case4 = fourSumAlgorithm.fourSum(
                FourSumAlgorithmData.fourSum_4,
                FourSumAlgorithmData.target_4);
        LOGGER.info(RESULT + " and target = {}", case4, FourSumAlgorithmData.target_4);
        assertEquals(0, case4.size(),
                "Length of FourSumAlgorithm should be 0: []");

        LOGGER.info("Ending Four sum Algorithm...");
    }

    /**
     * SingleNumber algorithm
     */
    private static void doSingleNumberAlgorithm()
    {
        LOGGER.info("Hello and welcome to SingleNumberAlgorithm practice!");
        LOGGER.info("Starting SingleNumberAlgorithm..");
        LOGGER.info("SingleNumberAlgorithm:");

        SingleNumberAlgorithm singleNumberAlgorithm = new SingleNumberAlgorithm();
        int case1 = singleNumberAlgorithm.singleNumber(SingleNumberAlgorithmData.singleNum_1);
        LOGGER.info(RESULT, case1);
        assertEquals(1, case1, "Value should be 1");

        int case2 = singleNumberAlgorithm.singleNumber(SingleNumberAlgorithmData.singleNum_2);
        LOGGER.info(RESULT, case2);
        assertEquals(4, case2, "Value should be 4");

        int case3 = singleNumberAlgorithm.singleNumber(SingleNumberAlgorithmData.singleNum_3);
        LOGGER.info(RESULT, case3);
        assertEquals(1, case3, "Value should be 1");

        LOGGER.info("Ending SingleNumberAlgorithm...");
    }

    /**
     * Merge k Sorted Lists algorithm
     */
    private static void doMergeKSortedListsAlgorithm()
    {
        LOGGER.info("Hello and welcome to MergeKSortedListsAlgorithm practice!");
        LOGGER.info("Starting MergeKSortedLists algorithm...");
        LOGGER.info("MergeKSortedLists Algorithm:");

        ListNode[] lists1 = new ListNode[] {l1_1, l1_2, l1_3};
        ListNode[] lists2 = new ListNode[]{};
        ListNode[] lists3 = new ListNode[]{null};
        ListNode[] lists4 = new ListNode[]{null, new ListNode(1)};

        MergeKSortedListsAlgorithm mergeKSortedListsAlgorithm = new MergeKSortedListsAlgorithm();
        String case1 = mergeKSortedListsAlgorithm.mergeKLists(lists1).toString();
        LOGGER.info(RESULT, case1);
        assertEquals("11234456", case1, "Value should be 11234456");

        ListNode case2 = mergeKSortedListsAlgorithm.mergeKLists(lists2);
        LOGGER.info(RESULT, case2);
        assertNull(case2, "Value should be empty");

        ListNode case3 = mergeKSortedListsAlgorithm.mergeKLists(lists3);
        LOGGER.info(RESULT, case3);
        assertNull(case3, "Value should be empty");

        String case4 = mergeKSortedListsAlgorithm.mergeKLists(lists4).toString();
        LOGGER.info(RESULT, case4);
        assertEquals("1", case4, "Value should be 1");

        LOGGER.info("Ending MergeKSortedLists algorithm...");
    }

    /**
     * TwoNumbers algorithm
     */
    private static void doTwoNumbersAlgorithm()
    {
        LOGGER.info("Hello and welcome to TwoNumbersAlgorithm practice!");
        LOGGER.info("Starting TwoNumbers algorithm...");
        LOGGER.info("TwoNumbers Algorithm:");

        TwoNumbersAlgorithm twoNumbersAlgorithm = new TwoNumbersAlgorithm();
        String case1 = twoNumbersAlgorithm.addTwoNumbers(TwoNumbersAlgorithmData.l1_1, TwoNumbersAlgorithmData.l2_1).toString();
        LOGGER.info(RESULT, case1);
        assertEquals("708", case1, "Value should be 708");
        String case2 = twoNumbersAlgorithm.addTwoNumbers(TwoNumbersAlgorithmData.l1_2, TwoNumbersAlgorithmData.l2_2).toString();
        LOGGER.info(RESULT, case2);
        assertEquals("1", case2, "Value should be 1");
        String case3 = twoNumbersAlgorithm.addTwoNumbers(TwoNumbersAlgorithmData.l1_3, TwoNumbersAlgorithmData.l2_3).toString();
        LOGGER.info(RESULT, case3);
        assertEquals("89990001", case3, "Value should be 89990001");

        String case4 = twoNumbersAlgorithm.addTwoNumbersV1(TwoNumbersAlgorithmData.l1_4, TwoNumbersAlgorithmData.l2_4).toString();
        LOGGER.info(RESULT, case4);
        assertEquals("00000000001", case4, "Value should be 00000000001");

        LOGGER.info("Ending TwoNumbers algorithm...");
    }

    /**
     * triangle algorithm
     */
    private static void doTriangleAlgorithm()
    {
        LOGGER.info("Hello and welcome to triangleAlgorithm practice!");
        LOGGER.info("Starting triangle algorithm...");
        LOGGER.info("Triangle Algorithm:");
        TriangleAlgorithm triangleAlgorithm = new TriangleAlgorithm();
        int minPath = 0;
        // 1:
        minPath = triangleAlgorithm.minimumTotal(TriangleAlgorithmData.triangle1);
        LOGGER.info(RESULT, minPath);
        assertEquals(11, minPath, "Minimum path should be 11");
        // 2:
        minPath = triangleAlgorithm.minimumTotal(TriangleAlgorithmData.triangle2);
        LOGGER.info(RESULT, minPath);
        assertEquals(-10, minPath, "Minimum path should be -10");
        // 3:
        minPath = triangleAlgorithm.minimumTotal(TriangleAlgorithmData.triangle3);
        LOGGER.info(RESULT, minPath);
        assertEquals(11, minPath, "Minimum path should be 11");
        // 4:
        minPath = triangleAlgorithm.minimumTotal(TriangleAlgorithmData.triangle4);
        LOGGER.info(RESULT, minPath);
        assertEquals(-1, minPath, "Minimum path should be -1");
        LOGGER.info("Ending triangle algorithm...");
    }
}