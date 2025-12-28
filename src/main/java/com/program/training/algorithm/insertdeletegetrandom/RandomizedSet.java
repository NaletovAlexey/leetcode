package com.program.training.algorithm.insertdeletegetrandom;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Implement the RandomizedSet class
 *
 * <a href="https://leetcode.com/problems/insert-delete-getrandom-o1/description/?envType=study-plan-v2&envId=top-interview-150">...</a>
 *
 * @author naletov
 */
public class RandomizedSet
    {

    private static final Logger LOGGER = LoggerFactory.getLogger(RandomizedSet.class);
    private final Map<Integer, Integer> indexMap;
    private final List <Integer> elements;

    /**
     * Your RandomizedSet object will be instantiated and called as such:
     * RandomizedSet obj = new RandomizedSet();
     * boolean param_1 = obj.insert(val);
     * boolean param_2 = obj.remove(val);
     * int param_3 = obj.getRandom();
     */
    public RandomizedSet()
    {
        LOGGER.info("Empty set is initialized");
        indexMap = new HashMap<>();
        elements = new ArrayList<>();
    }

    public boolean insert(int val)
    {
        LOGGER.info("Try to insert {} value into set", val);
        if(indexMap.containsKey(val))
        {
            return false;
        }
        elements.add(val);
        indexMap.put(val, elements.size() - 1);
        return true;
    }

    public boolean remove(int val)
    {
        LOGGER.info("Try to remove {} value from set", val);
        if (!indexMap.containsKey(val)) {
            return false;
        }
        // moving the last element instead of the element being removed
        int index = indexMap.get(val);
        int lastElement = elements.getLast();
        elements.set(index, lastElement);
        indexMap.put(lastElement, index);
        // dropping the element
        elements.removeLast();
        indexMap.remove(val);
        return true;
    }

    public int getRandom()
    {
        int randomIndex = ThreadLocalRandom.current().nextInt(elements.size());
        return elements.get(randomIndex);
    }
}
