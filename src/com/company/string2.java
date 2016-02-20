package com.company;

import java.util.Arrays;

/**
 * Created by Nikhil on 2/20/16.
 */
public class string2 {

    public boolean checkPermutation(String s1, String s2){
        if(s1.length() == s2.length()){
            char c1[] = s1.toCharArray();
            char c2[] = s2.toCharArray();

            Arrays.sort(c1);
            Arrays.sort(c2);

            s1 = new String(c1);
            s2 = new String(c2);

            return s1.equals(s2);

        }else{
            return false;
        }
    }
}
