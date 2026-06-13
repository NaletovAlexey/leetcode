package com.program.training.systemdesign.datastructure;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Design a data structure to store the strings' count with the ability to return the strings with minimum and maximum counts.
 *
 * @author naletov
 */
class AllOne implements AllOneOperations {

    Map<String,Integer> strings;
    MinMax minMax;

    /**
     * Initializes the object of the data structure.
     */
    public AllOne() {
        strings = new HashMap<>();
        minMax = new AllOne.MinMax();
    }

    /**
     * Increments the count of the string key by 1.
     * If key does not exist in the data structure, insert it with count 1.
     *
     * @param key string
     */
    @Override
    public void inc(String key) {
        int oldCount = strings.getOrDefault(key, 0);

        if (oldCount == minMax.max) {
            minMax.getMaxSet().remove(key);
        }
        if (oldCount == minMax.min) {
            minMax.getMinSet().remove(key);
        }

        int newCount = oldCount + 1;
        strings.put(key, newCount);

        if (minMax.getMaxSet().isEmpty() && !strings.isEmpty()) {
            recomputeMax();
        }
        if (minMax.getMinSet().isEmpty() && !strings.isEmpty()) {
            recomputeMin();
        }

        if (newCount == minMax.max) {
            minMax.getMaxSet().add(key);
        }
        if (newCount > minMax.max) {
            minMax.getMaxSet().clear();
            minMax.getMaxSet().add(key);
            minMax.max = newCount;
        }

        if (newCount == minMax.min) {
            minMax.getMinSet().add(key);
        }
        if (newCount < minMax.min || minMax.getMinSet().isEmpty()) {
            minMax.getMinSet().clear();
            minMax.getMinSet().add(key);
            minMax.min = newCount;
        }
    }

    /**
     * Decrements the count of the string key by 1.
     * If the count of key is 0 after the decrement, remove it from the data structure.
     * It is guaranteed that key exists in the data structure before the decrement.
     *
     * @param key string
     */
    @Override
    public void dec(String key) {
        if (!strings.containsKey(key)) {
            return;
        }

        int currentCount = strings.get(key);

        if (currentCount == minMax.max) {
            minMax.getMaxSet().remove(key);
        }
        if (currentCount == minMax.min) {
            minMax.getMinSet().remove(key);
        }

        int newCount = currentCount - 1;
        if (newCount == 0) {
            strings.remove(key);
        } else {
            strings.put(key, newCount);
        }

        if (minMax.getMaxSet().isEmpty()) {
            if (strings.isEmpty()) {
                minMax.max = 0;
            } else {
                recomputeMax();
            }
        }
        if (minMax.getMinSet().isEmpty()) {
            if (strings.isEmpty()) {
                minMax.min = 0;
            } else {
                recomputeMin();
            }
        }

        if (newCount > 0) {
            if (newCount == minMax.max) {
                minMax.getMaxSet().add(key);
            }
            if (newCount > minMax.max) {
                minMax.getMaxSet().clear();
                minMax.getMaxSet().add(key);
                minMax.max = newCount;
            }
            if (newCount == minMax.min) {
                minMax.getMinSet().add(key);
            }
            if (newCount < minMax.min || minMax.getMinSet().isEmpty()
                    || minMax.getMinSet().size() == 1 && minMax.getMinSet().contains(key)) {
                minMax.getMinSet().clear();
                minMax.getMinSet().add(key);
                minMax.min = newCount;
            }
        }
    }

    private void recomputeMax() {
        int max = 0;
        for (int count : strings.values()) {
            max = Math.max(max, count);
        }
        minMax.max = max;
        minMax.getMaxSet().clear();
        for (Map.Entry<String, Integer> entry : strings.entrySet()) {
            if (entry.getValue() == max) {
                minMax.getMaxSet().add(entry.getKey());
            }
        }
    }

    private void recomputeMin() {
        int min = Integer.MAX_VALUE;
        for (int count : strings.values()) {
            min = Math.min(min, count);
        }
        minMax.min = min;
        minMax.getMinSet().clear();
        for (Map.Entry<String, Integer> entry : strings.entrySet()) {
            if (entry.getValue() == min) {
                minMax.getMinSet().add(entry.getKey());
            }
        }
    }

    /**
     * Returns one of the keys with the maximal count. If no element exists, return an empty string "".
     * @return max string
     */
    @Override
    public String getMaxKey() {

        return minMax.getMaxSet().isEmpty() ?  "" : minMax.getMaxSet().iterator().next();
    }

    /**
     * Returns one of the keys with the minimum count.
     * If no element exists, return an empty string "".
     * @return min string
     */
    @Override
    public String getMinKey() {

        return minMax.getMinSet().isEmpty() ?  "" : minMax.getMinSet().iterator().next();
    }

    public static class MinMax
    {
        int min;
        int max;
        Set<String> maxSet = new HashSet<>();
        Set<String> minSet =  new HashSet<>();

        public int getMax()
        {
            return max;
        }

        public void setMax(int max)
        {
            this.max = max;
        }

        public int getMin()
        {
            return min;
        }

        public Set<String> getMaxSet()
        {
            return maxSet;
        }

        public Set<String> getMinSet()
        {
            return minSet;
        }
    }
}
/**
 * Your AllOne object will be instantiated and called as such:
 * AllOne obj = new AllOne();
 * obj.inc(key);
 * obj.dec(key);
 * String param_3 = obj.getMaxKey();
 * String param_4 = obj.getMinKey();
 */
