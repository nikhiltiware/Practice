package com.company;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Nikhil on 4/4/17.
 */
public class integerTODays {

    public List<String> convertIntegerToDays(int[] nums)
    {
        String[] days = {"SUN", "MON","TUE", "WED", "THU", "FRI", "SAT"};
        List<String> result = new ArrayList<>();

        for (int i = 0; i < nums.length; i++)
        {
            int curr = i;
            while(i + 1 < nums.length && nums[i + 1] - nums[i] == 1)
            {
                i++;
            }
            if(curr != i)
            {
                result.add(days[nums[curr]]+"->"+days[nums[i]]);
            }else
            {
                result.add(days[nums[curr]]);
            }
        }



        return result;
    }
}
