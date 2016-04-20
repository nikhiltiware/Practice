package com.company;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Created by Nikhil on 2/29/16.
 */
public class allDepthsoftree_levelorder {


    public void level(TreeNode root){
        List<LinkedList<TreeNode>> list = new ArrayList<LinkedList<TreeNode>>();
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        q.add(root);

        while(!q.isEmpty())
        {
            LinkedList<TreeNode> l = new LinkedList<TreeNode>();
            int size = q.size();
            for(int i=0; i<size; i++)
            {
                TreeNode temp = q.remove();
                l.add(temp);
                if(temp.left!=null)q.add(temp.left);
                if(temp.right!=null)q.add(temp.right);

            }
            list.add(l);

        }


    }
}
