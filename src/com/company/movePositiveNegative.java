package com.company;

/**
 * Created by Nikhil on 3/27/17.
 */
public class movePositiveNegative {

    public int[] move(int[] nums)
    {
        int start = 0;
        int end = nums.length - 1;

        while(start < end)
        {
            while(start < end && nums[start] > 0)
            {
                start++;
            }
            while(start < end && nums[end] < 0)
            {
                end--;
            }

            if(start < end)
            {
                swap(nums, start, end);
            }
        }

        return nums;
    }

    public void swap(int[] nums, int i, int j)
    {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
