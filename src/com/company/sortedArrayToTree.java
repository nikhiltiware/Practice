package com.company;

/**
 * Created by Nikhil on 2/29/16.
 */
public class sortedArrayToTree {

    public TreeNode sortedArrayToBST(int[] nums) {
        return createBST(nums, 0, nums.length-1);
    }

    public TreeNode createBST(int[] nums, int start, int end){

        if(start>end)
            return null;

        int mid = (start+end)/2;
        TreeNode n = new TreeNode(nums[mid]);
        n.left = createBST(nums,start,mid-1);
        n.right = createBST(nums,mid+1,end);

        return n;

    }
}
