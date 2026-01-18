package com.program.training.test.data;

import com.program.training.test.data.api.TreeNode;

/**
 * Class with test data for the Path Sum II algorithm
 *
 * @author naletov
 */
public final class PathSumIIAlgorithmData
{
    private PathSumIIAlgorithmData()
    {
        // do nothing
    }

    public static TreeNode root_1 = new TreeNode(5,
            new TreeNode(4,
                    new TreeNode(11,
                            new TreeNode(7, null, null),
                            new TreeNode(2, null, null)),
                    null),
            new TreeNode(8,
                    new TreeNode(13, null, null),
                    new TreeNode(4,
                            new TreeNode(5, null, null),
                            new TreeNode(1, null, null))));

    public static int targetSum_1 = 22;


    public static TreeNode root_2 = new TreeNode(1,
            new TreeNode(2, null, null),
            new TreeNode(3,null, null));

    public static int targetSum_2 = 5;

    public static TreeNode root_3 = new TreeNode(1,
            new TreeNode(2, null, null),
            null);

    public static int targetSum_3 = 0;
}
