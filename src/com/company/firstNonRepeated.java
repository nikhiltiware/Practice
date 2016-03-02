package com.company;

import java.util.TreeMap;

/**
 * Created by Nikhil on 3/2/16.
 */
public class firstNonRepeated {

    public char getFirstNonRepeated(String s){
        TreeMap<Character, Integer> tm = new TreeMap<Character, Integer>();
        for(int i = 0; i<s.length(); i++)
        {
            char temp = s.charAt(i);
            if(tm.containsKey(temp))
                tm.put(s.charAt(i),tm.get(temp)+1);
            else
                tm.put(s.charAt(i),1);
        }

        for (char key: tm.keySet()) {
            if(tm.get(key)==1)
                return key;
        }
        return ' ';
    }
}
