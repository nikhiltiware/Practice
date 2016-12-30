package com.company;

/**
 * Created by Nikhil on 11/11/16.
 */
public class JumpGame {

    public int getMinStep(int[] nums) {
        int currentRange = 0;
        int steps = 0;
        int nextPlace = 0;
        if(nums.length <2) return 0;
        for(int i = 0; i<nums.length; )
        {
            currentRange = nums[i];
            int max = 0;
            for(int j = i+1; j<=i+currentRange; j++)
            {
                if(j == nums.length-1) return steps+1;
                if(nums[j]>=max)
                {
                    max = nums[j];
                    nextPlace = j;
                }

            }
            steps++;
            i = nextPlace;

        }
        return steps;
    }
}
