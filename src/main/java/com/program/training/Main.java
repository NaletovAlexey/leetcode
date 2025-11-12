package com.program.training;

import com.program.training.algorithm.binarysearch.BinarySearchAlgorithm;
import com.program.training.algorithm.foursum.FourSumAlgorithm;
import com.program.training.algorithm.guessnumber.GuessNumberHigherLowerAlgorithm;
import com.program.training.algorithm.mergeintervals.MergeIntervalsAlgorithm;
import com.program.training.algorithm.mergeksortedlists.MergeKSortedListsAlgorithm;
import com.program.training.algorithm.singlenumber.SingleNumberAlgorithm;
import com.program.training.algorithm.slidingwindowmedian.SlidingWindowMedianAlgorithm;
import com.program.training.algorithm.smallestsumspairs.FindKPairsSmallestSumsAlgorithm;
import com.program.training.algorithm.topkfrequentwords.TopKFrequentWordsAlgorithm;
import com.program.training.algorithm.triangle.TriangleAlgorithm;
import com.program.training.algorithm.twonumbers.TwoNumbersAlgorithm;
import com.program.training.test.data.*;
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
        //doTwoNumbersAlgorithm();
        //doTriangleAlgorithm();
        //doMergeKSortedListsAlgorithm();
        //doSingleNumberAlgorithm();
        //doFourSumAlgorithm();
        //doGuessNumberHigherOrLowerAlgorithm();
        //doBinarySearchAlgorithm();
        //doMergeIntervalsAlgorithm();
        //doFindKPairsSmallestSumsAlgorithm();
        //doSlidingWindowMedianAlgorithm();
        doTopKFrequentWordsAlgorithm();
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