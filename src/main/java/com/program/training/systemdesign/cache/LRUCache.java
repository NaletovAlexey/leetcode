package com.program.training.systemdesign.cache;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Design a data structure that follows the constraints of a Least Recently Used (LRU) cache.
 *
 * <a href="https://leetcode.com/problems/lfu-cache/description/?envType=problem-list-v2&envId=ssd-ssd1-cache-system-design">...</a>
 *
 * @author naletov
 */
public class LRUCache
{
    private final Map<Integer,Integer> cache;
    /**
     * LRUCache(int capacity) Initialize the LRU cache with positive size capacity
     */
    public LRUCache(int capacity)
    {
        this.cache = new LinkedHashMap<>(capacity, 0.75f, true)
        {
            @Override
            protected boolean removeEldestEntry(Map.Entry eldest)
            {
                return size() > capacity;
            }
        };
    }

    /**
     * Return the value of the key if the key exists, otherwise return -1.
     * @param key Cache key
     * @return Cache value
     */
    public int get(int key)
    {
        if (cache.containsKey(key))
        {
            return cache.get(key);
        }
        return -1;
    }

    /**
     * Update the value of the key if the key exists. Otherwise, add the key-value pair to the cache.
     * If the number of keys exceeds the capacity from this operation, evict the least recently used key.
     * @param key Cache key
     * @param value Cache value
     */
    public void put(int key, int value)
    {
        cache.put(key, value);
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */