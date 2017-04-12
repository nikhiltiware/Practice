package com.company;

import java.util.Random;

/**
 * Created by Nikhil on 4/10/17.
 */
public class generateString {

    public String getStringOfLength(int n)
    {
        StringBuilder sb = new StringBuilder();
        Random random = new Random();

        for (int i = 0; i < n; i++) {
            int num = random.nextInt(33);
            if(num <= 25)
            {
                num = num+'a';
            }
            sb.append((char)num);
        }


        return sb.toString();
    }



}
