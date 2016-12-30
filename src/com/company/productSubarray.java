package com.company;

/**
 * Created by Nikhil on 10/30/16.
 */
public class productSubarray {
    public long numSubarrays(int[] array, int k) {
        int n = array.length;
        int numSubarrays = 0;
        int product = 1;

        for (int left = 0, right = -1; left < n; ++left) {
            // I have rewritten
            // "product * array[right + 1] < maxProduct"
            // as
            // "array[right + 1] < Math.ceil((double)maxProduct / product)"
            // to avoid the overflow that can result from multiplication.
            while (right + 1 < n && array[right + 1] < Math.ceil((double)k / product)) {
                product *= array[++right];
            }

            int subarraySize = right - left + 1;
            numSubarrays += subarraySize;

            product /= array[left];
        }

        return numSubarrays;
    }
}
