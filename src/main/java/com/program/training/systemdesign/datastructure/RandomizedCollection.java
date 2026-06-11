package com.program.training.systemdesign.datastructure;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * RandomizedCollection is a data structure that contains a collection of numbers, possibly duplicates (i.e., a multiset).
 * It should support inserting and removing specific elements and also reporting a random element.
 *
 * @author naletov
 */
class RandomizedCollection {

    private final List<Integer> items;
    private final Map<Integer, Set<Integer>> valToIndices;
    private final SecureRandom random = new SecureRandom();

    /**
     *  Initializes the empty RandomizedCollection object.
     */
    public RandomizedCollection() {
        items = new ArrayList<>();
        valToIndices = new HashMap<>();
    }

    /**
     * Inserts an item val into the multiset, even if the item is already present.
     * Returns true if the item is not present, false otherwise.
     *
     * @param val item val
     * @return true if the item is not present, false otherwise
     */
    public boolean insert(int val)
    {
        boolean isNew = !valToIndices.containsKey(val);
        valToIndices.computeIfAbsent(val, _ -> new HashSet<>()).add(items.size());
        items.add(val);
        return isNew;
    }

    /**
     * Removes an item val from the multiset if present.
     * Returns true if the item is present, false otherwise.
     * Note that if val has multiple occurrences in the multiset, we only remove one of them.
     *
     * @param val item val
     * @return true if the item is present, false otherwise
     */
    public boolean remove(int val)
    {
        Set<Integer> indices = valToIndices.get(val);
        if (indices == null || indices.isEmpty()) {
            return false;
        }

        int indexToRemove = indices.iterator().next();
        indices.remove(indexToRemove);

        int lastIndex = items.size() - 1;
        int lastVal = items.get(lastIndex);
        if (indexToRemove != lastIndex) {
            items.set(indexToRemove, lastVal);
            valToIndices.get(lastVal).remove(lastIndex);
            valToIndices.get(lastVal).add(indexToRemove);
        }
        items.remove(lastIndex);

        if (indices.isEmpty()) {
            valToIndices.remove(val);
        }
        return true;
    }

    /**
     * Returns a random element from the current multiset of elements.
     * The probability of each element being returned is linearly related to the number of the same values the multiset contains.
     *
     * @return a random element from the current multiset of elements
     */
    public int getRandom()
    {
        return items.get(random.nextInt(items.size()));
    }
}

/**
 * Your RandomizedCollection object will be instantiated and called as such:
 * RandomizedCollection obj = new RandomizedCollection();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */
