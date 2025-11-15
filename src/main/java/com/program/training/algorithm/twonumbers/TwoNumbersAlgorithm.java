package com.program.training.algorithm.twonumbers;

import com.program.training.test.data.api.ListNode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

/**
 * You are given two non-empty linked lists representing two non-negative integers.
 * The digits are stored in reverse order, and each of their nodes contains a single digit.
 * Add the two numbers and return the sum as a linked list.
 *
 * You may assume the two numbers do not contain any leading zero, except the number 0 itself.
 *
 * <a href="https://leetcode.com/problems/add-two-numbers/description/">...</a>
 * @author naletov
 */
public class TwoNumbersAlgorithm
{
    private static final Logger LOGGER = LoggerFactory.getLogger(TwoNumbersAlgorithm.class);

    /**
     * Not optimal algorithm (manipulations with digits + double size limit)
     * @param l1 1st list
     * @param l2 2d list
     * @return result list
     */
    public ListNode addTwoNumbersV1(ListNode l1, ListNode l2)
    {
        long digit = 1;
        long sum = 0;
        while (!(l1 == null && l2 == null))
        {
            int d1 = l1 == null ? 0 : l1.val;
            int d2 = l2 == null ? 0 : l2.val;

            sum = sum + (d1 + d2) * digit;
            digit*= 10;
            if (l1 != null)
                l1 = l1.next;
            if (l2 != null)
                l2 = l2.next;
        }

        digit = 1;
        List<Long> resultList = new ArrayList<>();
        for (int i = 1; i <= Math.log10(sum) + 1; i++)
        {
            resultList.add((sum/digit) % 10);
            digit*= 10;
        }
        LOGGER.info("Sum: {}", sum);
        ListNode head = new ListNode(resultList.isEmpty() ? 0 : resultList.getFirst().intValue());
        ListNode current = head;
        for (int i = 1; i < resultList.size(); i++)
        {
            ListNode newNode = new ListNode(resultList.get(i).intValue());
            current.next = newNode;
            current = newNode;
        }
        return head;
    }

    /**
     * Optimal algorithm
     * @param l1 1st list
     * @param l2 2d list
     * @return result list
     */
    public ListNode addTwoNumbers(ListNode l1, ListNode l2)
    {
        // We use ListNode as a dummy node to simplify the creation of a new list.
        ListNode dummyHead = new ListNode(0);
        ListNode current = dummyHead; // A pointer to the last node in the resulting list.

        int carry = 0; // Carry for addition

        // We continue as long as there are nodes in one of the lists OR there is a carry
        while (l1 != null || l2 != null || carry != 0) {
            // Get the values of the current nodes, or 0 if the node is missing
            int val1 = (l1 != null) ? l1.val : 0;
            int val2 = (l2 != null) ? l2.val : 0;

            // Calculate the sum of the current digits and the carry
            int sum = val1 + val2 + carry;

            // Update the transfer for the next iteration
            carry = sum / 10;

            // Get the number for the current node of the resulting list
            int digit = sum % 10;

            // Create a new node with the received number and add it to the resulting list
            current.next = new ListNode(digit);
            current = current.next; // Move the pointer to the new last node

            // Move to the next node in the original lists if they exist
            if (l1 != null) {
                l1 = l1.next;
            }
            if (l2 != null) {
                l2 = l2.next;
            }
        }

        // Return the head of the resulting list (skipping dummyHead)
        return dummyHead.next;
    }
}
