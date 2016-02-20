package com.company;

import java.util.HashMap;

/**
 * Created by Nikhil on 2/20/16.
 */
public class twoSum {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> hm = new HashMap<Integer, Integer>();
        for(int i = 0; i<nums.length; i++){
            hm.put(nums[i],i);
        }
        int[] temp = new int[2];
        for(int i= 0; i<nums.length; i++){
            if(hm.get(target-nums[i])!=null && hm.get(target-nums[i])!=i){
                temp[0] = i;
                temp[1] = hm.get(target-nums[i]);
                return temp;
            }


        }
        return temp;
    }
}
