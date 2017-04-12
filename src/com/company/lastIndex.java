package com.company;

/**
 * Created by Nikhil on 4/10/17.
 */
public class lastIndex {

    public int getLastIndexOfTarget(int[] nums, int target)
    {
        int start = 0;
        int end = nums.length - 1;

        while(start < end)
        {
            int mid = (int)Math.ceil((start + end) / 2.0);
            if(nums[mid] == target)
            {
                start = mid;
                if(mid + 1 < nums.length && nums[mid] != nums[mid + 1])
                {
                    return mid;
                }
            }else if(nums[mid] > target)
            {
                end = mid - 1;
            }else {
                start = mid + 1;
            }
        }
        return nums[end] == target ? end : -1;
    }
}
