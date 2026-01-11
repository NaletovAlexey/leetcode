package com.program.training.test.data;

import com.program.training.test.data.api.ListNode;

/**
 * Class with test Reverse Linked List algorithm
 *
 * @author naletov
 */
public final class ReverseLinledListAlgorithmData
{
    private ReverseLinledListAlgorithmData()
    {
        // do nothing
    }

    // TwoNumbersAlgorithm data
    public static ListNode head_1 = new ListNode(1,
            new ListNode(2,
                    new ListNode(3,
                            new ListNode(4,
                                    new ListNode(5)))));
    public static ListNode Output_1 = new ListNode(5,
            new ListNode(4,
                    new ListNode(3,
                            new ListNode(2,
                                    new ListNode(1)))));

    public static ListNode head_2 = new ListNode(1,
            new ListNode(2));
    public static ListNode Output_2 = new ListNode(2,
            new ListNode(1));
}
