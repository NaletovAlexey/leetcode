package com.program.training.algorithm.mergeksortedlists;

import com.program.training.test.data.ListNode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Objects;
import java.util.PriorityQueue;

/**
 * You are given an array of k linked-lists lists, each linked-list is sorted in ascending order.
 * <p>
 * Merge all the linked-lists into one sorted linked-list and return it.
 *
 * <a href="https://leetcode.com/problems/merge-k-sorted-lists/description/">...</a>
 *
 *
 * @author naletov
 */
public class MergeKSortedListsAlgorithm
{
 private static final Logger LOGGER = LoggerFactory.getLogger(MergeKSortedListsAlgorithm.class);

    /**
     * Not optimal algorithm
     * @param lists input array of lists
     * @return merged list
     */
    public ListNode mergeKListsV1(ListNode[] lists)
    {
        // check if it's empty
        if(lists == null || lists.length == 0
                || Arrays.stream(lists).noneMatch(Objects::nonNull))
        {
            return null;
        }
        ListNode result = new ListNode((int)Math.pow(10, 4));
        boolean isDone = false;
        ListNode currentItem = result;
        while(!isDone)
        {
            int counter = 0;
            isDone = true;
            for(int i = 0; i < lists.length; i++)
            {
                if(!isDone || lists[i] != null)
                {
                    isDone = false;
                }

                if(lists[i] != null && currentItem.val > lists[i].val)
                {
                    counter = i;
                    currentItem.val = lists[i].val;
                }

                if ( i == (lists.length - 1) && lists[counter] != null )
                {
                    LOGGER.info("Added val: {}", currentItem.val);
                    lists[counter] = lists[counter].next;
                    if(Arrays.stream(lists).noneMatch(Objects::nonNull))
                    {
                        return result;
                    }
                    currentItem.next  = new ListNode((int)Math.pow(10, 4));
                    currentItem = currentItem.next;
                }

            }
        }
        return result;
    }

    /**
     * Optimal algorithm using priority queue
     * @param lists input array of lists
     * @return merged list
     */
    public ListNode mergeKLists(ListNode[] lists)
    {
        // check if it's empty
        if(lists == null || lists.length == 0)
        {
            return null;
        }

        PriorityQueue<ListNode> pq = new PriorityQueue<>(Comparator.comparingInt(o -> o.val));

        Arrays.stream(lists).filter(Objects::nonNull).forEach(pq::offer);

        ListNode result = new ListNode();
        ListNode currentItem = result;

        while (!pq.isEmpty())
        {
            ListNode node = pq.poll();

            currentItem.next = node;
            currentItem = currentItem.next;

            if (node.next != null)
            {
                pq.add(node.next);
            }
        }
        return result.next;
    }
}