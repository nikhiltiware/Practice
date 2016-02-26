package com.company;

import java.util.Scanner;
import java.util.Stack;

/**
 * Created by Nikhil on 2/26/16.
 */
public class StackMax {

    public void getStackMax(){
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        Stack<Integer> s = new Stack<Integer>();
        Stack<Integer> s2 = new Stack<Integer>();
        int max=Integer.MIN_VALUE;
        for(int i = 0; i<T; i++){

            int ch = sc.nextInt();

            switch(ch){
                case 1: {
                    int data = sc.nextInt();
                    s.push(data);
                    if(s2.isEmpty() || data>s2.peek()){
                        s2.push(data);
                    }
                    break;
                }
                case 2: {

                    if(!s2.isEmpty() &&!s.isEmpty()&& s.peek() == s2.peek()){
                        s2.pop();
                    }else if(!s.isEmpty())
                        s.pop();
                    break;
                }
                case 3: {
                    System.out.println(s2.peek());
                    break;
                }

            }



        }
    }

}
