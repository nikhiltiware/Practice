package com.company;

/**
 * Created by Nikhil on 4/20/16.
 */
public class routingTreeCreate {
    public routingTreeNode createRoutingTree(routingTreeNode[] arr){
        return createBST(arr, 0, arr.length-1);

    }

    public routingTreeNode createBST(routingTreeNode[] nums, int start, int end){

        if(start>end)
            return null;

        int mid = (start+end)/2;

        nums[mid].left = createBST(nums,start,mid-1);
        nums[mid].right = createBST(nums,mid+1,end);

        return nums[mid];

    }

    public int getnextHopIP(int destIP, routingTreeNode root){

        while(root!=null){
            if(root.startIP<=destIP && root.endIP>=destIP)
                return root.nextIP;

            if(destIP<root.startIP)
                root=root.left;

            if(destIP>root.startIP)
                root=root.right;

        }

        return 0;

    }
}
