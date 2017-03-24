package com.company;

/**
 * Created by Nikhil on 3/19/17.
 */
public class firstMissingPositive {
    public int firstMissingPositive(int[] nums) {
        if(nums.length == 0) return 1;
        for(int i = 1; i < nums.length; i++)
        {
            int index = nums[i];
            if(nums[index] != index)
            {
                swap(nums, index, i);
            }

        }
        int k = 1;
        for(; k < nums.length; k++)
        {
            if(nums[k] != k) return k;
        }

        if(nums[0] == k) return k++;

        return k;
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
