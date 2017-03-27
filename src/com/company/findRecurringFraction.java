package com.company;

import java.util.HashMap;

/**
 * Created by Nikhil on 3/27/17.
 */
public class findRecurringFraction {

    public String getRecurringFactor(int num, int denom)
    {
        String res = new String();
        HashMap<Integer, Integer> map = new HashMap<>();
        int rem = num%denom;

        while ( (rem!=0) && !(map.containsKey(rem)) )
        {
            // Store this remainder
            map.put(rem, res.length());
            // Multiply remainder with 10

            rem = rem*10;

            // Append rem / denr to result
            int res_part = rem / denom;
            res += res_part;

            // Update remainder
            rem = rem % denom;
        }

        return (rem == 0)? "" : res.substring(map.get(rem));
    }
}
