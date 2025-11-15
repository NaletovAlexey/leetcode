package com.program.training.test.data;

import com.program.training.test.data.api.TreeNode;

/**
 * Class with test data for the Balanced Binary tree algorithm
 *
 * @author naletov
 */
public final class BalancedBinaryTreeAlgorithmData
{
    private BalancedBinaryTreeAlgorithmData()
    {
        // do nothing
    }

    public static TreeNode bbt_1 = new TreeNode(3,
            new TreeNode(9, null, null),
            new TreeNode(20,
                    new TreeNode(15, null, null),
                    new TreeNode(7, null, null)));

    public static TreeNode bbt_2 = new TreeNode(1,
            new TreeNode(2,
                    new TreeNode(3,
                            new TreeNode(4, null, null),
                            new TreeNode(4, null, null)),
                    new TreeNode(3, null, null)),
            new TreeNode(2, null, null));

    public static TreeNode bbt_3 = null;
}
