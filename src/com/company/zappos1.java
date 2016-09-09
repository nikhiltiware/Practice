package com.company;

import java.util.HashMap;

/**
 * Created by Nikhil on 9/8/16.
 */
public class zappos1 {

    static boolean GigaWattPower(int[] batteryOne, int[] batteryTwo, int gigawattTarget) {

        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
        int[] big = batteryTwo;
        int[] small = batteryOne;
        if(batteryOne.length>batteryTwo.length) {
            big = batteryOne;
            small = batteryTwo;
        }
        for (int i = 0; i < batteryTwo.length; i++) {
            hm.put(big[i], i);
        }

        for (int num: small) {
            int target = gigawattTarget-num;
            if(hm.containsKey(target)) {
                return true;
            }
        }
        return false;
    }
}
