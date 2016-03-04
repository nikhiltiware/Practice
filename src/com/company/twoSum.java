package com.company;

import java.util.HashMap;
import java.util.HashSet;

/**
 * Created by Nikhil on 2/20/16.
 */
public class twoSum {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            hm.put(nums[i], i);
        }
        int[] temp = new int[2];
        for (int i = 0; i < nums.length; i++) {
            if (hm.get(target - nums[i]) != null && hm.get(target - nums[i]) != i) {
                temp[0] = i;
                temp[1] = hm.get(target - nums[i]);
                return temp;
            }


        }
        return temp;
    }

    public int[] twoSumBetter(int[] nums, int target) {

        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            if (hm.containsKey(nums[i])) {
                result[0] = hm.get(nums[i]);
                result[1] = i;

            } else {
                hm.put(target - nums[i], i);
            }


        }
        return result;
    }


    public void twoSumPrint(int[] nums, int target) {
        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            hm.put(nums[i], i);
        }

        HashSet<Integer> hs = new HashSet<Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (hm.get(target - nums[i]) != null && hm.get(target - nums[i]) != i) {
                if(hs.size()==0 || !hs.contains(nums[i]))
                {
                    hs.add(nums[i]);
                    hs.add(nums[hm.get(target - nums[i])]);
                    System.out.println(nums[i]+","+nums[hm.get(target - nums[i])]);
                }

            }


        }
       // return temp;
    }
}
