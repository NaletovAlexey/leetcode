package com.program.training.test.data;

import com.program.training.test.data.api.TreeNode;

/**
 * Class with test data for the Symmetric Tree algorithm
 *
 * @author naletov
 */
public final class SymmetricTreeAlgorithmData
{
    private SymmetricTreeAlgorithmData()
    {
        // do nothing
    }

    public static TreeNode root_1 = new TreeNode(1,
                    new TreeNode(2,
                            new TreeNode(3,
                                    null,
                                    null),
                            new TreeNode(4,
                                    null,
                                    null)),
                    new TreeNode(2,
                            new TreeNode(4,
                                    null,
                                    null),
                            new TreeNode(3,
                                    null,
                                    null)));


    public static TreeNode root_2 = new TreeNode(1,
            new TreeNode(2,
                    null,
                    new TreeNode(3,
                            null,
                            null)),
            new TreeNode(2,
                    null,
                    new TreeNode(3,
                            null,
                            null)));

    public static TreeNode root_3 = new TreeNode(5,
            new TreeNode(2,
                    new TreeNode(4,
                            null,
                            new TreeNode(1,
                                    new TreeNode(1,null, null),
                                    null)
                    ),
                    null),

            new TreeNode(2,
                    null,
                    new TreeNode(1,
                            null,
                            new TreeNode(4,
                                    new TreeNode(2,
                                            null,
                                            null),
                                    null)
                    )
            )
    );

    public static TreeNode root_4 = new TreeNode(2,
            new TreeNode(3,
                    new TreeNode(4, null, null),
                    new TreeNode(5, null, null)
            ),
            new TreeNode(3,
                    new TreeNode(5, null, null),
                    null
            )
    );
}
