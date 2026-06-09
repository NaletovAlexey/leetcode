package com.program.training.systemdesign.cache;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;

/**
 * Design and implement a data structure for a Least Frequently Used (LFU) cache.
 * <a href="https://leetcode.com/problems/lru-cache/?envType=problem-list-v2&envId=ssd-ssd1-cache-system-design">...</a>
 *
 * @author naletov
 */
public class LFUCache
{
    private final int capacity;
    private int minFrequency = 0;

    // Map: Key -> Value
    private final Map<Integer, Integer> vals = new HashMap<>();
    // Map: Key -> Frequency
    private final Map<Integer, Integer> counts = new HashMap<>();
    //  Map: Key -> Ordered Keys list (LRU inside Frequency)
    private final Map<Integer, LinkedHashSet<Integer>> lists = new HashMap<>();

    /**
     *  Initializes the object with the capacity of the data structure.
     * @param capacity capacity
     */
    public LFUCache(int capacity)
    {
        this.capacity = capacity;
        this.lists.put(1, new LinkedHashSet<>());
    }

    /**
     * Gets the value of the key if the key exists in the cache. Otherwise, returns -1.
     * @param key Cache key
     * @return Cache value
     */
    public int get(int key)
    {
        if (!vals.containsKey(key))
            return -1;

        // Update Frequency
         int count = counts.get(key);
         counts.put(key, count + 1);

        // Move item onto the list with the higher frequency
        lists.get(count).remove(key);

        // If current frequency is empty, increment minFrequency
        if (count == minFrequency && lists.get(count).isEmpty()) {
            minFrequency++;
        }

        lists.computeIfAbsent(count + 1, _ -> new LinkedHashSet<>()).addLast(key);

        return vals.get(key);
    }

    /**
     * Update the value of the key if present, or inserts the key if not already present.
     * When the cache reaches its capacity, it should invalidate and remove the least frequently used key before inserting a new item.
     * For this problem, when there is a tie (i.e., two or more keys with the same frequency), the least recently used key would be invalidated.
     *
     * @param key Cache key
     * @param value Cache value
     */
    public void put(int key, int value)
    {
        if (capacity <= 0) return;

        // If the Key is present -> update value and frequency via get()
        if (vals.containsKey(key)) {
            vals.put(key, value);
            get(key); // get() itself increments frequency
            return;
        }

        // If the capacity is exceeded, remove the least frequently used one
        if (vals.size() >= capacity) {
            // remove the first (oldest) element from the list with the minimum frequency
            int evict = lists.get(minFrequency).removeFirst();
            lists.get(minFrequency).remove(evict);
            vals.remove(evict);
            counts.remove(evict);
        }

        // Add new item
        vals.put(key, value);
        counts.put(key, 1);
        minFrequency = 1; // new item always has frequency 1
        lists.get(1).add(key);
    }
}

/**
 * Your LFUCache object will be instantiated and called as such:
 * LFUCache obj = new LFUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */
