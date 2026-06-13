package com.program.training.systemdesign.datastructure;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Set;
import java.util.function.Supplier;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Q3. All O`one Data Structure
 *
 * @author naletov
 */
class AllOneTest
{
    static Stream<Supplier<AllOneOperations>> implementations()
    {
        return Stream.of(
                AllOne::new,
                AllOneTreeMap::new,
                AllOneLinkedList::new
        );
    }

    @ParameterizedTest
    @MethodSource("implementations")
    void allOneTest(Supplier<AllOneOperations> factory)
    {
        AllOneOperations allOne = factory.get();
        allOne.inc("hello");
        allOne.inc("hello");
        assertEquals("hello", allOne.getMaxKey());
        assertEquals("hello", allOne.getMinKey());
        allOne.inc("leet");
        assertEquals("hello", allOne.getMaxKey());
        assertEquals("leet", allOne.getMinKey());

        allOne.dec("hello");
        assertTrue(allOne.getMaxKey().equals("hello") || allOne.getMaxKey().equals("leet"));
        assertTrue(allOne.getMinKey().equals("hello") || allOne.getMinKey().equals("leet"));

        allOne.dec("leet");
        assertEquals("hello", allOne.getMaxKey());
        assertEquals("hello", allOne.getMinKey());

        allOne.dec("hello");
        assertEquals("", allOne.getMaxKey());
        assertEquals("", allOne.getMinKey());

        allOne.inc("a");
        allOne.inc("b");
        allOne.inc("b");
        assertEquals("b", allOne.getMaxKey());
        assertEquals("a", allOne.getMinKey());

        allOne.dec("b");
        assertTrue(allOne.getMaxKey().equals("a") || allOne.getMaxKey().equals("b"));
        assertTrue(allOne.getMinKey().equals("a") || allOne.getMinKey().equals("b"));

        allOne.dec("b");
        assertEquals("a", allOne.getMaxKey());
        assertEquals("a", allOne.getMinKey());
    }

    @ParameterizedTest
    @MethodSource("implementations")
    void leetCodeStressTest(Supplier<AllOneOperations> factory)
    {
        AllOneOperations allOne = factory.get();

        for (String key : new String[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l"}) {
            allOne.inc(key);
        }
        for (String key : new String[]{"a", "b", "c", "d", "e", "f"}) {
            allOne.dec(key);
        }
        for (String key : new String[]{"g", "h", "i", "j"}) {
            allOne.inc(key);
        }

        assertOneOf(allOne.getMaxKey(), "g", "h", "i", "j");
        assertOneOf(allOne.getMinKey(), "k", "l");

        allOne.inc("k");
        allOne.inc("l");

        assertOneOf(allOne.getMaxKey(), "g", "h", "i", "j", "k", "l");
        assertOneOf(allOne.getMinKey(), "g", "h", "i", "j", "k", "l");

        allOne.inc("a");
        allOne.dec("j");

        assertOneOf(allOne.getMaxKey(), "g", "h", "i", "k", "l");
        assertOneOf(allOne.getMinKey(), "a", "j");
    }

    private static void assertOneOf(String actual, String... expected)
    {
        assertTrue(Set.of(expected).contains(actual),
                "expected one of " + Set.of(expected) + " but was " + actual);
    }
}
