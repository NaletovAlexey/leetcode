package com.program.training.systemdesign.datastructure;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * All O'one implementation using doubly linked list of frequency buckets + HashMap.
 * All operations: O(1) average.
 *
 * @author naletov
 */
class AllOneLinkedList implements AllOneOperations {

    private static final class Node {
        int count;
        final Set<String> keys = new HashSet<>();
        Node prev;
        Node next;
    }

    private final Map<String, Node> keyToNode = new HashMap<>();
    private final Node head = new Node();
    private final Node tail = new Node();

    AllOneLinkedList() {
        head.next = tail;
        tail.prev = head;
    }

    @Override
    public void inc(String key) {
        if (!keyToNode.containsKey(key)) {
            insertNewKey(key);
            return;
        }

        Node node = keyToNode.get(key);
        int count = node.count;
        node.keys.remove(key);

        Node targetNode;
        if (node.keys.isEmpty()) {
            removeNode(node);
            targetNode = getOrCreateNodeAfter(node.prev, count + 1);
        } else {
            targetNode = getOrCreateNodeAfter(node, count + 1);
        }

        targetNode.keys.add(key);
        keyToNode.put(key, targetNode);
    }

    @Override
    public void dec(String key) {
        Node node = keyToNode.get(key);
        if (node == null) {
            return;
        }

        int count = node.count;
        node.keys.remove(key);

        if (count == 1) {
            keyToNode.remove(key);
            if (node.keys.isEmpty()) {
                removeNode(node);
            }
            return;
        }

        Node targetNode;
        if (node.keys.isEmpty()) {
            removeNode(node);
            targetNode = getOrCreateNodeAfter(node.prev, count - 1);
        } else {
            targetNode = getOrCreateNodeBefore(node, count - 1);
        }

        targetNode.keys.add(key);
        keyToNode.put(key, targetNode);
    }

    @Override
    public String getMaxKey() {
        return head.next == tail ? "" : tail.prev.keys.iterator().next();
    }

    @Override
    public String getMinKey() {
        return head.next == tail ? "" : head.next.keys.iterator().next();
    }

    private void insertNewKey(String key) {
        Node node;
        if (head.next == tail || head.next.count > 1) {
            node = new Node();
            node.count = 1;
            insertNodeAfter(head, node);
        } else {
            node = head.next;
        }
        node.keys.add(key);
        keyToNode.put(key, node);
    }

    private Node getOrCreateNodeAfter(Node prev, int count) {
        Node next = prev.next;
        if (next != tail && next.count == count) {
            return next;
        }

        Node node = new Node();
        node.count = count;
        insertNodeAfter(prev, node);
        return node;
    }

    private Node getOrCreateNodeBefore(Node next, int count) {
        Node prev = next.prev;
        if (prev != head && prev.count == count) {
            return prev;
        }

        Node node = new Node();
        node.count = count;
        insertNodeBefore(next, node);
        return node;
    }

    private void insertNodeAfter(Node prev, Node node) {
        node.prev = prev;
        node.next = prev.next;
        prev.next.prev = node;
        prev.next = node;
    }

    private void insertNodeBefore(Node next, Node node) {
        node.next = next;
        node.prev = next.prev;
        next.prev.next = node;
        next.prev = node;
    }

    private void removeNode(Node node) {
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }
}
