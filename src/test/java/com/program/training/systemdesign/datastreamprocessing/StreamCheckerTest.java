package com.program.training.systemdesign.datastreamprocessing;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Q2. Stream of Characters
 *
 * @author naletov
 */
class StreamCheckerTest
{
    @Test
    void testCheckStream()
    {
        String[] words = {"cd", "f", "kl"};
        StreamChecker streamChecker = new StreamChecker(words);

        assertFalse(streamChecker.query('a'), "return False");
        assertFalse(streamChecker.query('b'), "return False");
        assertFalse(streamChecker.query('c'), "return False");
        assertTrue(streamChecker.query('d'), "return True, because 'cd' is in the wordlist");
        assertFalse(streamChecker.query('e'), "return False");
        assertTrue(streamChecker.query('f'), "return True, because 'f' is in the wordlist");
        assertFalse(streamChecker.query('g'), "return False");
        assertFalse(streamChecker.query('h'), "return False");
        assertFalse(streamChecker.query('i'), "return False");
        assertFalse(streamChecker.query('j'), "return False");
        assertFalse(streamChecker.query('k'), "return False");
        assertTrue(streamChecker.query('l'), "return True, because 'kl' is in the wordlist");
    }

    @Test
    void testCheckStreamCaseTwo()
    {
        String[] words = {"ab", "ba", "aaab", "abab", "baa"};
        StreamChecker streamChecker = new StreamChecker(words);

        assertFalse(streamChecker.query('a'));
        assertFalse(streamChecker.query('a'));
        assertFalse(streamChecker.query('a'));
        assertFalse(streamChecker.query('a'));
        assertFalse(streamChecker.query('a'));
        assertTrue(streamChecker.query('b'));
        assertTrue(streamChecker.query('a'));
        assertTrue(streamChecker.query('b'));
        assertTrue(streamChecker.query('a'));
        assertTrue(streamChecker.query('b'));
        assertFalse(streamChecker.query('b'));
        assertFalse(streamChecker.query('b'));
        assertTrue(streamChecker.query('a'));
        assertTrue(streamChecker.query('b'));
        assertTrue(streamChecker.query('a'));
        assertTrue(streamChecker.query('b'));
        assertFalse(streamChecker.query('b'));
        assertFalse(streamChecker.query('b'));
        assertFalse(streamChecker.query('b'));
        assertTrue(streamChecker.query('a'));
        assertTrue(streamChecker.query('b'));
        assertTrue(streamChecker.query('a'));
        assertTrue(streamChecker.query('b'));
        assertTrue(streamChecker.query('a'));
        assertTrue(streamChecker.query('a'));
        assertFalse(streamChecker.query('a'));
        assertTrue(streamChecker.query('b'));
        assertTrue(streamChecker.query('a'));
        assertTrue(streamChecker.query('a'));
        assertFalse(streamChecker.query('a'));
    }
}