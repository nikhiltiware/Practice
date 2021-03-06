package com.company;

import java.awt.*;
import java.util.*;

/**
 * Created by Nikhil on 3/24/17.
 */
public class numberOfSquares {

    public double findMaxAreaSquare(ArrayList<Point> points)
    {
        Set<Point> visited = new HashSet<>();
        HashSet<Point> set = new HashSet<>(points);
        double maxSide = 0;
        for (int i = 0; i < points.size(); i++)
        {
            for (int j = i+1; j < points.size(); j++)
            {
                Point one = points.get(i);
                Point two = points.get(j);
                int dx = two.y - one.y;
                int dy = two.x - one.x;
                double area = one.distance(two);
                Point predicted1 = new Point(one.x+dx, one.y+dy);
                Point predicted2 = new Point(two.x+dx, two.y+dy);
                if(set.contains(predicted1) && set.contains(predicted2))
                {
                    java.util.List<Point> currentSquare = Arrays.asList(one,two,predicted1,predicted2);
                    if(!visited.containsAll(currentSquare))
                    {
                        visited.addAll(currentSquare);
                        maxSide = Math.max(area, maxSide);
                    }

                }
                Point predicted3 = new Point(one.x+dx, one.y+dy);
                Point predicted4 = new Point(two.x+dx, two.y+dy);
                if(set.contains(predicted3) && set.contains(predicted4))
                {
                    java.util.List<Point> currentSquare = Arrays.asList(one,two,predicted3,predicted4);
                    if(!visited.containsAll(currentSquare))
                    {
                        visited.addAll(currentSquare);
                        maxSide = Math.max(area, maxSide);
                    }
                }
            }
        }

        return maxSide*maxSide;

    }
}
