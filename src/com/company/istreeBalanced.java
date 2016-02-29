package com.company;

/**
 * Created by Nikhil on 2/29/16.
 */
public class istreeBalanced {
    public boolean isBalanced(TreeNode root) {
        if(root!= null){
            if(Math.abs(getHeight(root.left)-getHeight(root.right))>1)
                return false;
            else
                return isBalanced(root.left) && isBalanced(root.right);
        }
        return true;

    }

    public int getHeight(TreeNode root){
        if(root==null)
            return 0;
        else
            return 1+Math.max(getHeight(root.left),getHeight(root.right));

    }
}
