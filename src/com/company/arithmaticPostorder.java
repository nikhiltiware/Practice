package com.company;

import java.util.Stack;

/**
 * Created by Nikhil on 2/26/16.
 */
public class arithmaticPostorder {

    public int calculate(String s){
        Stack<Integer> numStack = new Stack<Integer>();
        int len = s.length();
        int i=0;
        while(i<s.length()){
            if(s.charAt(i)=='+'){
                numStack.push(numStack.pop() + numStack.pop());
                i++;
            }
            else if(s.charAt(i)=='-'){
                numStack.push(numStack.pop() - numStack.pop());
                i++;
            }
            else if(s.charAt(i)=='*'){
                numStack.push(numStack.pop() * numStack.pop());
                i++;
            }
            else if(s.charAt(i)=='/'){
                numStack.push(numStack.pop() / numStack.pop());
                i++;
            }
            else
                numStack.push(s.charAt(i++)-'0');
        }
        return numStack.pop();
    }


}
