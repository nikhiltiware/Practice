package com.company;

/**
 * Created by Nikhil on 3/3/16.
 */
public class Checksubtree {

    boolean areIdentical(TreeNode node1, TreeNode node2) {


		/* base cases */
        if(node1 ==null && node2 == null)
            return true;

        if(node1 ==null || node2 == null)
            return false;

        if(node1.val == node2.val)
            return areIdentical(node1.left, node2.left) && areIdentical(node1.right, node2.right);
        else
            return false;
    }

    /* This function returns true if S is a subtree of T, otherwise false */
    boolean isSubtree(TreeNode T, TreeNode S) {

		/* base cases */
        if (S == null) {
            return true;
        }

        if (T == null) {
            return false;
        }

        if(areIdentical(T,S))
            return true;

        return isSubtree(T.left,S) || isSubtree(T.right,S);

    }
}
