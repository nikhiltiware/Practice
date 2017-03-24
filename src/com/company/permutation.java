package com.company;

import java.util.*;

/**
 * Created by Nikhil on 3/18/17.
 */
public class permutation {

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        // Arrays.sort(nums); // not necessary
        backtrack(list, new ArrayList<Integer>(), nums);
        return list;
    }

    private void backtrack(List<List<Integer>> list, ArrayList<Integer> tempList, int [] nums){
            list.add(new ArrayList(tempList));

            for(int i = 0; i < nums.length; i++){
                if(tempList.contains(nums[i])) continue; // element already exists, skip
                tempList.add(nums[i]);
                backtrack(list, tempList, nums);
                tempList.remove(tempList.size() - 1);
            }

    }
}
