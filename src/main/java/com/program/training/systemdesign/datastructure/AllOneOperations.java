package com.program.training.systemdesign.datastructure;

/**
 * Common API for All O'one data structure implementations.
 */
interface AllOneOperations {

    void inc(String key);

    void dec(String key);

    String getMaxKey();

    String getMinKey();
}
