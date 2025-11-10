package com.program.training.test.data;

/**
 * Linked list implementation
 *
 * @author naletov
 */
public class ListNode
{
    public int val;
    public ListNode next;

    public ListNode()
    {
        // do nothing
    }

    public ListNode(int val)
    {
        this.val = val;
    }

    ListNode(int val, ListNode next)
    {
        this.val = val;
        this.next = next;
    }

    @Override
    public String toString()
    {
        return val + ((next != null) ? next.toString() : "");
    }
}
