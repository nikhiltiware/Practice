package com.company;

/**
 * Created by Nikhil on 3/2/16.
 */
public class sameTree {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p==null || q==null)
            return p==q;
        if(p.val == q.val)
            return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
        else return false;

    }
}
