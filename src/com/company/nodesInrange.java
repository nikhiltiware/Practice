package com.company;

/**
 * Created by Nikhil on 4/19/16.
 */
public class nodesInrange {

    public void printNodesInRange(TreeNode root, int n1, int n2){

        if(root ==null)
            return;

        if(n1<root.val)
            printNodesInRange(root.left, n1, n2);

        if(n1<=root.val && n2>= root.val)
            System.out.println(root.val);

        if(n2>root.val)
            printNodesInRange(root.right, n1, n2);

    }
}
