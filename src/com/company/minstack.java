package com.company;

import java.util.Stack;

/**
 * Created by Nikhil on 3/4/16.
 */
public class minstack {

    Stack<Integer> st = new Stack<Integer>();
    Stack<Integer> min = new Stack<Integer>();
    public void push(int x) {
        st.push(x);
        if(min.isEmpty() || min.peek()>=x)
            min.push(x);
    }

    public void pop() {

        if(!st.isEmpty()){
            int temp = st.pop();
            if(temp==min.peek())
                min.pop();
        }
    }

    public int top() {

        return st.peek();
        //return 0;
    }

    public int getMin() {

        return min.peek();
        //return 0;
    }
}
