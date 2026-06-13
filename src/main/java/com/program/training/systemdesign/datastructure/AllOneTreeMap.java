package com.program.training.systemdesign.datastructure;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 * All O'one implementation using TreeMap + HashMap.
 * inc/dec/getMin/getMax: O(log K), where K is the number of distinct counts.
 *
 * @author naletov
 */
class AllOneTreeMap implements AllOneOperations {

    private final Map<String, Integer> keyToCount = new HashMap<>();
    private final TreeMap<Integer, Set<String>> countToKeys = new TreeMap<>();

    @Override
    public void inc(String key) {
        int oldCount = keyToCount.getOrDefault(key, 0);
        if (oldCount > 0) {
            removeKeyFromCount(oldCount, key);
        }

        int newCount = oldCount + 1;
        keyToCount.put(key, newCount);
        countToKeys.computeIfAbsent(newCount, _ -> new HashSet<>()).add(key);
    }

    @Override
    public void dec(String key) {
        int oldCount = keyToCount.getOrDefault(key, 0);
        if (oldCount == 0) {
            return;
        }

        removeKeyFromCount(oldCount, key);

        int newCount = oldCount - 1;
        if (newCount == 0) {
            keyToCount.remove(key);
            return;
        }

        keyToCount.put(key, newCount);
        countToKeys.computeIfAbsent(newCount, _ -> new HashSet<>()).add(key);
    }

    @Override
    public String getMaxKey() {
        if (countToKeys.isEmpty()) {
            return "";
        }
        return countToKeys.lastEntry().getValue().iterator().next();
    }

    @Override
    public String getMinKey() {
        if (countToKeys.isEmpty()) {
            return "";
        }
        return countToKeys.firstEntry().getValue().iterator().next();
    }

    private void removeKeyFromCount(int count, String key) {
        Set<String> keys = countToKeys.get(count);
        keys.remove(key);
        if (keys.isEmpty()) {
            countToKeys.remove(count);
        }
    }
}
