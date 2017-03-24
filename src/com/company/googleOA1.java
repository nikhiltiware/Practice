package com.company;

import java.util.PriorityQueue;

/**
 * Created by Nikhil on 2/13/17.
 */
public class googleOA1 {
    public int getMax(int X){

        String str = String.valueOf(X);
        int maxValue = Integer.MIN_VALUE;
        for(int i = 0; i < str.length()-1; i++)
        {
            String newString = i == 0 ? "" : str.substring(0,i);
            int one = Character.getNumericValue(str.charAt(i));
            int two = Character.getNumericValue(str.charAt(i+1));
            int rounded = (int)Math.ceil((one+two)/2.0);
            newString += rounded + str.substring(i+2, str.length());
            maxValue = Math.max(Integer.valueOf(newString), maxValue);

        }

        return maxValue;

    }
    
}
