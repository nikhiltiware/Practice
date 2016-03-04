package com.company;

/**
 * Created by Nikhil on 3/3/16.
 */
public class circularSorted {

    public boolean find(int[] num , int x)
    {
        if(num.length==0)
            return false;
        else
        {
            return findnum(num, 0, num.length-1, x);

        }


    }

    public boolean findnum(int[] num , int start, int end, int x)
    {

        if(start>end)
            return false;

        int mid = start + end / 2;
        if(x == num[mid])
            return true;



        if(num[mid]<=num[end])
        {
            if(num[mid]<x && num[end]>=x)
                return findnum(num, mid+1, end, x);
            else
                return findnum(num, start, mid-1, x);
        }else {
            if(num[mid]<x && num[start] <=x)
                return findnum(num, start, mid-1, x);
            else
                return findnum(num, mid+1, end, x);

        }
       // return false;


    }


}

