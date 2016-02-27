package com.company;

import java.util.Stack;

/**
 * Created by Nikhil on 2/27/16.
 */
public class sortStack {

    public Stack<Integer> sortstack(Stack<Integer> st){
        Stack<Integer> extra = new Stack<Integer>();

        while (!st.isEmpty()){
            int tempint = st.pop();
            while (!extra.isEmpty() && extra.peek()>tempint)
            {
                st.push(extra.pop());
            }
            extra.push(tempint);
        }

        return extra;


    }

}
