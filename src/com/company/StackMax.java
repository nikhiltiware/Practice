package com.company;

import java.util.Scanner;
import java.util.Stack;

/**
 * Created by Nikhil on 2/26/16.
 */
public class StackMax {

    public void getStackMax(){
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        Stack<Integer> stack = new Stack<Integer>();
        Stack<Integer> maxstack = new Stack<Integer>();

        for(int i = 0; i < n; i++){
            int c = sc.nextInt();
            if (c ==1) {
                int data = sc.nextInt();
                stack.push(data);

                if (maxstack.isEmpty() || data >= maxstack.peek()){
                    maxstack.push(data);
                }

            } else if (c == 2) {

                if (!stack.isEmpty()){
                    int temp = stack.pop();
                    if (temp == maxstack.peek()){
                        maxstack.pop();
                    }
                }
            } else {
                if (!maxstack.isEmpty()) {
                    System.out.println(maxstack.peek());
                }
            }
        }
    }

}
