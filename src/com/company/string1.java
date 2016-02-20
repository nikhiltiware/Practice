package com.company;

import java.util.HashSet;

/**
 * Created by Nikhil on 2/20/16.
 */
public class string1 {

    public boolean isUnique(String s){
        HashSet<Character> hs = new HashSet<Character>();
        for(int i = 0; i<s.length(); i++){
            hs.add(s.charAt(i));
            if(hs.size()!=i+1)
                return false;

        }
        return true;


    }

}
