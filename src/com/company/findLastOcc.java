package com.company;

/**
 * Created by Nikhil on 3/27/17.
 */
public class findLastOcc {

    public int getLastOcc(int[] nums, int target)
    {
        int start = 0, end = nums.length -1;

        while(start < end)
        {
            int mid = (start + end)/2+1;
            if(nums[mid] == target)
            {
                if(mid + 1 < nums.length && nums[mid + 1] != 6)
                {
                    return mid;
                }
                start = mid;
            }else if(nums[mid] < target)
            {
                start = mid + 1;
            }else
            {
                end = mid -1;
            }
        }
        return nums[end] == target ? end : -1;
    }
}
