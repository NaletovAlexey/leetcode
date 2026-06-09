package com.program.training.systemdesign.datastreamprocessing;

/**
 * Design an algorithm that accepts a stream of characters and checks if a suffix of these characters is a string of a given array of strings words.
 *
 * <a href="https://leetcode.com/problems/stream-of-characters/description/?envType=problem-list-v2&envId=ssd-ssd2-data-stream-processing">...</a>
 *
 * @author naletov
 */
public class StreamChecker
{
    private final String[] words;
    private final TrieNode root = new TrieNode();
    private final StringBuilder letters = new StringBuilder();
    private final StringBuilder simpleLetters = new StringBuilder();
    private final int maxWordLength;

    /**
     * Initializes the object with the strings array words.
     * @param words the strings array words
     */
    public StreamChecker(String[] words)
    {
        this.words = words;
        int maxLen = 0;
        for (String word : words)
        {
            maxLen = Math.max(maxLen, word.length());
            insertReversed(word);
        }
        this.maxWordLength = maxLen;
    }

    private void insertReversed(String word)
    {
        TrieNode node = root;
        for (int i = word.length() - 1; i >= 0; i--)
        {
            int index = word.charAt(i) - 'a';
            if (node.children[index] == null)
            {
                node.children[index] = new TrieNode();
            }
            node = node.children[index];
        }
        node.isWord = true;
    }

    /**
     * Accepts a new character from the stream and returns true if any non-empty suffix from the stream forms a word that is in words.
     * @param letter a new character
     * @return true if any non-empty suffix from the stream forms a word that is in words.
     */
    public boolean queryOpt(char letter)
    {
        letters.append(letter);
        if (letters.length() > maxWordLength)
        {
            letters.delete(0, letters.length() - maxWordLength);
        }

        TrieNode node = root;
        for (int i = letters.length() - 1; i >= 0; i--)
        {
            int index = letters.charAt(i) - 'a';
            if (node.children[index] == null)
            {
                return false;
            }
            node = node.children[index];
            if (node.isWord)
            {
                return true;
            }
        }
        return false;
    }

    /**
     * Simple alternative: checks whether the stream ends with any word from the dictionary.
     * Less efficient than {@link #query(char)}, but easier to read and understand.
     */
    public boolean query(char letter)
    {
        simpleLetters.append(letter);
        if (simpleLetters.length() > maxWordLength)
        {
            simpleLetters.delete(0, simpleLetters.length() - maxWordLength);
        }

        String stream = simpleLetters.toString();
        for (String word : words)
        {
            if (stream.endsWith(word))
            {
                return true;
            }
        }
        return false;
    }

    private static class TrieNode
    {
        TrieNode[] children = new TrieNode[26];
        boolean isWord;
    }
}

/**
 * Your StreamChecker object will be instantiated and called as such:
 * StreamChecker obj = new StreamChecker(words);
 * boolean param_1 = obj.query(letter);
 */
