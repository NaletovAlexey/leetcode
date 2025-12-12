package com.program.training.test.data;

import com.program.training.test.data.api.TreeNode;

/**
 * Class with test data for the Two Sum IV algorithm
 *
 * @author naletov
 */
public final class TwoSumIVAlgorithmData
{
    private TwoSumIVAlgorithmData()
    {
        // do nothing
    }

    public static TreeNode root_1 = new TreeNode(5,
            new TreeNode(3,
                    new TreeNode(2, null, null),
                    new TreeNode(4, null, null)),
            new TreeNode(6,
                    null,
                    new TreeNode(7, null, null)));

    public static int k_1 = 9;


    public static TreeNode root_2 = new TreeNode(5,
            new TreeNode(3,
                    new TreeNode(2, null, null),
                    new TreeNode(4, null, null)),
            new TreeNode(6,
                    null,
                    new TreeNode(7, null, null)));

    public static int k_2 = 28;

    public static TreeNode root_3 = new TreeNode(5,
            new TreeNode(2,
                    new TreeNode(1, null, null),
                    null),
            new TreeNode(6,
                    null,
                    new TreeNode(8, null, null)));

    public static int k_3 = 9;
}
