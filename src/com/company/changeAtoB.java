package com.company;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by Nikhil on 3/24/17.
 */
public class changeAtoB {

    public int stepsFromAtoB(int a, int b)
    {
        int steps = 0;
        Queue<Integer> q = new LinkedList<>();

        q.add(a);

        while(!q.isEmpty())
        {
            int size = q.size();
            for (int i = 0; i <size ; i++) {
                int current = q.remove();

                if(current + 1 == b || current - 1 == b || current * 2 == b)
                    return steps+1;

                q.add(current + 1);
                q.add(current -1);
                q.add(current * 2);

            }
            steps++;
        }
        return -1;

    }


}
