package com.company;

/**
 * Created by Nikhil on 3/17/17.
 */
public class findRange {

    public int[] searchRange(int[] nums, int target) {
        if(nums.length == 0) return new int[]{-1,1};
        int rangeStart = getStart(nums, target);
        int rangeEnd = getEnd(nums, target);
        return (rangeStart != -1 && rangeEnd != -1) ? new int[]{rangeStart, rangeEnd} : new int[]{-1,1};

    }

    public int getStart(int nums[], int target)
    {
        int start = 0;
        int end = nums.length-1;

        while(start < end)
        {
            int mid = (start + end) / 2;
            if(nums[mid] == target)
            {
                end = mid;
            }else if(nums[mid] < target)
            {
                start = mid + 1;
            }else
            {
                end = mid - 1;
            }

        }
        return nums[start] == target ? start : -1;
    }

    public int getEnd(int nums[], int target)
    {
        int start = 0;
        int end = nums.length-1;

        while(start < end)
        {
            int mid = (start + end) / 2 + 1;
            if(nums[mid] == target)
            {
                start = mid;
            }else if(nums[mid] < target)
            {
                start = mid + 1;
            }else
            {
                end = mid - 1;
            }

        }
        return nums[end] == target ? start : -1;
    }
}
