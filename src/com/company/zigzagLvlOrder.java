package com.company;

import java.util.*;

/**
 * Created by Nikhil on 3/2/16.
 */
public class zigzagLvlOrder {

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {

        List<List<Integer>> list = new ArrayList<List<Integer>>();

        if(root == null)return list;
        return zigzag(list, root);

    }


    public List<List<Integer>> zigzag(List<List<Integer>> list, TreeNode root)
    {
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        q.add(root);
        Boolean b = true;

        while(!q.isEmpty())
        {
            ArrayList<Integer> l = new ArrayList<Integer>();
            int size = q.size();

            for(int i=0; i<size; i++)
            {
                TreeNode temp = q.remove();
                if(temp.left != null)q.add(temp.left);
                if(temp.right != null)q.add(temp.right);
                l.add(temp.val);

            }
            if(b)
            {
                b =false;
                list.add(l);

            }else
            {
                b = true;
                Collections.reverse(l);
                list.add(l);
            }


        }

        return list;

    }
}
