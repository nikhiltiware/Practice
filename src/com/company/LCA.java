package com.company;

/**
 * Created by Nikhil on 4/1/16.
 */
public class LCA {

    public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode a, TreeNode b) {
        if (root == null) {
            return null;
        }

        if (root.equals(a) || root.equals(b)) {
            // if at least one matched, no need to continue
            // this is the LCA for this root
            return root;
        }

        TreeNode l = lowestCommonAncestor(root.left, a, b);
        TreeNode r = lowestCommonAncestor(root.right, a, b);

        if (l != null && r != null) {
            return root;  // nodes are each on a seaparate branch
        }

        // either one node is on one branch,
        // or none was found in any of the branches
        return l != null ? l : r;
    }
}
