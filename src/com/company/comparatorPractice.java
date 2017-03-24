package com.company;

/**
 * Created by Nikhil on 3/3/17.
 */
public class comparatorPractice implements Comparable<comparatorPractice> {
    int infront, height;

    public  comparatorPractice (int infront, int height)
    {
        this.infront = infront;
        this.height = height;
    }

    @Override
    public int compareTo(comparatorPractice c)
    {
        return height - c.height;
    }

}
