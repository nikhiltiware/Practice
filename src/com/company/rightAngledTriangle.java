package com.company;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by Nikhil on 3/4/16.
 */
public class rightAngledTriangle {

    public boolean isRightAngled(int a, int b, int c){

        if(a==0 || b==0 || c== 0)
            return false;

        return a*a == b*b+c*c || b*b == a*a+c*c || c*c == a*a + b*b;

    }



    public void rightAngleTriangles(int[] sides){
        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();

        for(int i=0; i<sides.length; i++)
        {
            hm.put(sides[i]*sides[i], i);
        }


        for(int i = 0; i<sides.length; i++)
        {
            int target = sides[i]*sides[i];
            ArrayList<Integer> arr = new ArrayList<Integer>();

            for(int j = 0 ; j<hm.size(); j++)
            {

                if(hm.containsKey(target - sides[j]*sides[j])&& hm.get(target - sides[j]*sides[j])!=j)
                {
                    arr.add(sides[i]);
                    arr.add(sides[j]);
                    arr.add(sides[hm.get(target - sides[j]*sides[j])]);
                    break;
                }


            }
            if(arr.size()!=0){
                for(int n:arr)
                {
                    System.out.print(n+",");
                }
                System.out.println();
            }

        }




    }


}
