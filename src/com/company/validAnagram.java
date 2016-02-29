package com.company;

import java.util.HashMap;

/**
 * Created by Nikhil on 2/28/16.
 */
public class validAnagram {

    public boolean isAnagram(String s, String t) {

        if(s.length() == t.length())
        {
            HashMap<Character,Integer> hm = new HashMap<Character,Integer>();

            for(int i =0; i<s.length(); i++){
                char temp = s.charAt(i);
                if(hm.containsKey(temp))
                {
                    hm.put(temp,hm.get(temp)+1);
                }
                else
                {
                    hm.put(temp, 1);
                }
            }

            for(int i =0; i<t.length(); i++)
            {
                char temp = t.charAt(i);
                if(hm.containsKey(temp) && hm.get(temp)!=0)
                {
                    hm.put(temp,hm.get(temp)-1);
                }else
                    return false;

            }
            return true;
        }
        else
        {
            return false;
        }



    }
}
