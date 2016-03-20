package com.company;

import java.util.HashMap;

/**
 * Created by Nikhil on 3/20/16.
 */
public class twitterQue2 {

    public String firstRepeat(String str){

        HashMap<Character,Integer> hm = new HashMap<>();
        int minIndex = Integer.MAX_VALUE;

        for(int i=0; i<str.length();i++){
            if(hm.containsKey(str.charAt(i))){
                if(hm.get(str.charAt(i))<minIndex)
                minIndex=hm.get(str.charAt(i));
            }else
            {
                hm.put(str.charAt(i),i);

            }
        }

        return ""+str.charAt(minIndex);



    }
}
