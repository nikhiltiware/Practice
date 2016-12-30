package com.company;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/**
 * Created by Nikhil on 10/11/16.
 */
public class longestSubarray {

    int getMaxLength(int[] a, int k) {


        int sum, i, j=0;
        int length = a.length;
        int maxLength = 0;
        ArrayList<Integer> maxList = new ArrayList<Integer>();

        for (i = 0; i < length; i++) {
            sum = a[i];
            maxLength = 0;
            for (j = i + 1; j < length; j++) {
                if (sum > k || j == length-1) {
                    maxList.add(maxLength);
                    break;
                }

                sum = sum + a[j];
                maxLength = j-i+1;
            }
        }

        return Collections.max(maxList);

    }
}
