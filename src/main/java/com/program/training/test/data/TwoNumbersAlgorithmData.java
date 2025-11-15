package com.program.training.test.data;

import com.program.training.test.data.api.ListNode;

/**
 * Class with test data for Two Numbers algorithm
 *
 * @author naletov
 */
public final class TwoNumbersAlgorithmData
{
    private TwoNumbersAlgorithmData()
    {
        // do nothing
    }

    // TwoNumbersAlgorithm data
    public static ListNode l1_1 = new ListNode(2, new ListNode(4, new ListNode(3)));
    public static ListNode l2_1 = new ListNode(5, new ListNode(6, new ListNode(4)));

    public static ListNode l1_2 = new ListNode(0);
    public static ListNode l2_2 = new ListNode(1);

    public static ListNode l1_3 = new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9 )))))));
    public static ListNode l2_3 = new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9))));

    public static ListNode l1_4 = new ListNode(9);
    public static ListNode l2_4 = new ListNode(1, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9))))))))));
}
