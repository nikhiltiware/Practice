package com.company;

import java.util.Stack;

/**
 * Created by Nikhil on 2/27/16.
 */
public class BalancedPara {


    public boolean isEqual(char c1,char c2){
        if(c1 =='(' && c2 ==')')
            return true;
        else if(c1 =='{' && c2 =='}')
            return true;
        else if(c1 =='[' && c2 ==']')
            return true;
        else
            return false;


    }
    public boolean isBalanced(String s){

        Stack<Character> st = new Stack<Character>();
        if(s.length()%2==0){
            for(int i=0; i< s.length(); i++){
                if(s.charAt(i)=='{' || s.charAt(i) =='[' || s.charAt(i)=='(')
                {
                    st.push(s.charAt(i));
                }else if(!st.isEmpty() && isEqual(st.peek(),s.charAt(i)))
                {
                    st.pop();
                }else
                    return false;
                }
        }else
            return false;
        if(st.isEmpty())
            return true;
        else
            return false;

    }
}
