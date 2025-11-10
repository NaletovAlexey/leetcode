package com.program.training.test.data;

import java.util.Arrays;
import java.util.List;

/**
 * Class with test data for TriangleAlgorithm
 * @author naletov
 */
public final class TriangleAlgorithmData
{
    private TriangleAlgorithmData()
    {
        // do nothing
    }
    public static final List<List<Integer>> triangle1 = List.of(
            Arrays.asList(2),
            Arrays.asList(3,4),
            Arrays.asList(6,5,7),
            Arrays.asList(4,1,8,3)
    );

    public static final List<List<Integer>> triangle2 = List.of(
            Arrays.asList(-10));

    public static final List<List<Integer>> triangle3 = List.of(
            Arrays.asList(2),       // 11
            Arrays.asList(3,4),     // 10 9
            Arrays.asList(6,5,2),   // 7 8 5
            Arrays.asList(1,4,3,8)  // 1 3 3
    );

    public static final List<List<Integer>> triangle4 = List.of(
            Arrays.asList(-1),
            Arrays.asList(2, 3),
            Arrays.asList(1, -1, -3)
    );
}
