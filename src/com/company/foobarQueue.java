package com.company;

/**
 * Created by Nikhil on 12/30/16.
 */
public class foobarQueue {
    public static int answer(int start, int length) {
        int ans = 0;
        for(int i = length; i > 0; i--)
        {
            int rowcount = i;
            while (rowcount > 0)
            {
                ans = ans ^ start++;
                rowcount--;
            }
            start = start + length - i;

        }
        return ans;

    }
}
