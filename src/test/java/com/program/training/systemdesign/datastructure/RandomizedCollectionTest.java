package com.program.training.systemdesign.datastructure;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Q2. Insert Delete GetRandom O(1) - Duplicates allowed
 *
 * @author naletov
 */
class RandomizedCollectionTest
{
    private static final int SAMPLE_SIZE = 10_000;
    private static final double TOLERANCE = 0.08;

    @Test
    void getRandom()
    {
        RandomizedCollection randomizedCollection = new RandomizedCollection();
        assertTrue(randomizedCollection.insert(1), "return true since the collection does not contain 1");
        // Inserts 1 into the collection.
        assertFalse(randomizedCollection.insert(1), "return false since the collection contains 1");
        // Inserts another 1 into the collection. Collection now contains [1,1].
        assertTrue(randomizedCollection.insert(2), "return true since the collection does not contain 2");
        // Inserts 2 into the collection. Collection now contains [1,1,2].
        int item = randomizedCollection.getRandom();
        assertTrue(item == 1 || item == 2, "return true since the collection does not contain 2");
        // getRandom should:
        // - return 1 with probability 2/3, or
        // - return 2 with probability 1/3.
        assertTrue(randomizedCollection.remove(1), "return true since the collection contains 1");
        // Removes 1 from the collection. Collection now contains [1,2].
        item = randomizedCollection.getRandom();
        assertTrue(item == 1 || item == 2, "getRandom should return 1 or 2, both equally likely");
        assertTrue(randomizedCollection.remove(1), "return true since the collection contains 1");
        // Removes 1 from the collection. Collection now contains [2].
        assertEquals(2, randomizedCollection.getRandom(), "getRandom should return 2");
    }

    @Test
    void getRandomDistributionForOneAndTwo()
    {
        RandomizedCollection collection = new RandomizedCollection();
        collection.insert(1);
        collection.insert(1);
        collection.insert(2);
        // Collection now contains [1,1,2].

        int count1 = 0;
        int count2 = 0;
        for (int i = 0; i < SAMPLE_SIZE; i++)
        {
            int item = collection.getRandom();
            if (item == 1) {
                count1++;
            } else {
                assertEquals(2, item);
                count2++;
            }
        }

        assertEquals(SAMPLE_SIZE, count1 + count2);
        assertProbability(count1, 2.0 / 3.0, "P(1) should be about 2/3");
        assertProbability(count2, 1.0 / 3.0, "P(2) should be about 1/3");
    }

    @Test
    void getRandomAfterFourInsertsAndRemove()
    {
        RandomizedCollection collection = new RandomizedCollection();

        assertTrue(collection.insert(4), "return true since the collection does not contain 4");
        assertTrue(collection.insert(3), "return true since the collection does not contain 3");
        assertFalse(collection.insert(4), "return false since the collection contains 4");
        assertFalse(collection.insert(3), "return false since the collection contains 3");
        // Collection now contains [4,3,4,3].

        int count3 = 0;
        int count4 = 0;
        for (int i = 0; i < SAMPLE_SIZE; i++)
        {
            int item = collection.getRandom();
            if (item == 3) {
                count3++;
            } else {
                assertEquals(4, item);
                count4++;
            }
        }

        assertEquals(SAMPLE_SIZE, count3 + count4);
        assertProbability(count3, 0.5, "before remove P(3) should be about 1/2");
        assertProbability(count4, 0.5, "before remove P(4) should be about 1/2");

        assertTrue(collection.remove(3), "return true since the collection contains 3");
        // Removes one 3 from the collection. Collection now contains [4,3,4].

        count3 = 0;
        count4 = 0;
        for (int i = 0; i < SAMPLE_SIZE; i++)
        {
            int item = collection.getRandom();
            if (item == 3) {
                count3++;
            } else {
                assertEquals(4, item);
                count4++;
            }
        }

        assertEquals(SAMPLE_SIZE, count3 + count4);
        assertProbability(count3, 1.0 / 3.0, "after remove P(3) should be about 1/3");
        assertProbability(count4, 2.0 / 3.0, "after remove P(4) should be about 2/3");
    }

    private static void assertProbability(int observed, double expected, String message)
    {
        double actual = (double) observed / RandomizedCollectionTest.SAMPLE_SIZE;
        assertTrue(Math.abs(actual - expected) < TOLERANCE,
                message + ", expected " + expected + " but was " + actual);
    }
}
