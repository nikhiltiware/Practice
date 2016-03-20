package com.company;

import java.util.HashSet;
import java.util.Stack;

/**
 * Created by Nikhil on 3/8/16.
 */
public class Pure_Storage {

    public int bad_sector(String[] str) {
        HashSet<String> hs = new HashSet<String>();
        Stack<String> st = new Stack<>();
        for(int i = 0; i<str.length; i++)
        {
            String[] s = str[i].split(" ");
            if(s[0].equals("ACQUIRE"))
            {
                if(!hs.contains(s[1]))
                {
                    st.push(s[1]);
                    hs.add(s[1]);
                }else{
                    return i;
                }


            }

            if(s[0].equals("RELEASE"))
            {
                if(!st.isEmpty() && st.peek().equals(s[1]))
                {
                    st.pop();
                    hs.remove(s[1]);

                }else
                {
                    return i;
                }

            }


        }

        if(st.isEmpty()){
            return 0;
        }else
        {
            return str.length+1;
        }


    }
}
