package com.program.training.algorithm.topkfrequentwords;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Given an array of strings words and an integer k, return the k most frequent strings.
 *
 * <a href="https://leetcode.com/problems/top-k-frequent-words/description/">...</a>
 *
 * @author naletov
 */
public class TopKFrequentWordsAlgorithm
{
    //private static final Logger LOGGER = LoggerFactory.getLogger(TopKFrequentWordsAlgorithm.class);

    /**
     * Returns the k most frequent string
     * @param words array of words
     * @param k amount of words
     * @return sorted by the frequency from highest to lowest k most frequent strings
     */
    public List<String> topKFrequent(String[] words, int k)
    {
        HashMap<String, Integer> wordsMap = new HashMap<>();
        Arrays.stream(words).forEach(word -> wordsMap.merge(word, 1, Integer::sum));

        return wordsMap.entrySet().stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed()
                .thenComparing(Map.Entry.comparingByKey()))
                .limit(k)
                .map(Map.Entry::getKey)
                .toList();
    }

    /**
     * Returns the k most frequent string (using PriorityQueue)
     * @param words array of words
     * @param k amount of words
     * @return sorted by the frequency from highest to lowest k most frequent strings
     */
    public List<String> topKFrequentPQ(String[] words, int k)
    {
        HashMap<String, Integer> wordsMap = new HashMap<>();
        Arrays.stream(words).forEach(word -> wordsMap.merge(word, 1, Integer::sum));

        Comparator<Map.Entry<String, Integer>> pqComparator =
                Map.Entry.<String, Integer>comparingByValue()
                        .reversed()
                        .thenComparing(Map.Entry.comparingByKey());

        PriorityQueue<Map.Entry<String, Integer>> sortedWords = new PriorityQueue<>(pqComparator);
        sortedWords.addAll(wordsMap.entrySet());

        List<String> topKKeys = new ArrayList<>();
        while (k > 0) {
            Map.Entry<String, Integer> entry = sortedWords.poll();
            topKKeys.add(entry.getKey());
            k--;
        }
        return topKKeys;
    }
}
