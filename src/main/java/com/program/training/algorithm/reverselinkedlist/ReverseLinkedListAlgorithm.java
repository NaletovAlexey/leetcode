package com.program.training.algorithm.reverselinkedlist;

import com.program.training.test.data.api.ListNode;

/**
 * Given the head of a singly linked list, reverse the list, and return the reversed list.
 *
 * <a href="https://leetcode.com/problems/reverse-linked-list/description/">...</a>
 * You may return the answer in any order
 *
 * @author naletov
 */
public class ReverseLinkedListAlgorithm
{

    public ListNode reverseList(ListNode head)
    {
        ListNode result = null;
        ListNode current = head;
        while (current != null)
        {
            ListNode previous = current.next;
            current.next = result;
            result = current;
            current = previous;
        }

        return result;
    }
}
