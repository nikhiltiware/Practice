package com.company;

import java.util.Stack;

/**
 * Created by Nikhil on 2/27/16.
 */
public class queueUsingStack {

    Stack<Integer> s1 = new Stack<Integer>();
    Stack<Integer> s2 = new Stack<Integer>();
    public void push(int x) {
        s2.push(x);
    }

    // Removes the element from in front of queue.
    public void pop() {
        if(s1.isEmpty() && !s2.isEmpty())
            shiftdata();
        if(!s1.isEmpty())
            s1.pop();
    }

    // Get the front element.
    public int peek() {
        if(s1.isEmpty() && !s2.isEmpty())
            shiftdata();
        if(!s1.isEmpty())
            return s1.peek();

        return 0;

    }

    // Return whether the queue is empty.
    public boolean empty() {
        return s1.size()+s2.size()==0;

    }

    public void shiftdata(){
        if(!s2.isEmpty())
        {
            while(!s2.isEmpty()){
                int temp = s2.pop();
                s1.push(temp);
            }


        }

    }
}
