package com.company;

import java.util.*;

public class Solution {

    public static List<Connection> MST(List<Connection> connections){
        List<Connection> result = new ArrayList<>();
        Set<String> treeNodes = new HashSet<>();
        while(true){
            Connection minCon = null;
            int minCost = Integer.MAX_VALUE;
            for(int i = 0; i< connections.size(); ++i ){
                Connection curCon = connections.get(i);
                if(curCon.cost< minCost){
                    if(treeNodes.isEmpty() ){
                        minCon = curCon;
                        minCost = curCon.cost;
                    }else{
                        boolean containsA = treeNodes.contains(curCon.city1);
                        boolean containsB = treeNodes.contains(curCon.city2);
                        if(containsA&&containsB){
                            connections.remove(curCon);
                        }else
                        if( (containsA&&!containsB) || (containsB&&(!containsA) ) ){
                            minCon = curCon;
                            minCost = curCon.cost;
                        }
                    }
                }
            }
            if(minCon == null) break;
            treeNodes.add(minCon.city1);
            treeNodes.add(minCon.city2);
            result.add(minCon);
            connections.remove(minCon);
        }
//override compare make it alphabet order
        Comparator<Connection> comparor = new Comparator<Connection>(){
            public int compare(Connection a, Connection b){
                if(a.city1 == b.city1){
                    return (int)a.city2.compareTo(b.city2);
                }
                return (int)a.city1.compareTo(b.city1);
            }
        };
        Collections.sort(result, comparor);
//check if size of treeNodes is the size of all nodes
        return result;
    }
    public static List<Connection> findPath (List<Connection> list) {
        ArrayList<Connection> result = new ArrayList<Connection> ();
        ArrayList<String> cityTree = new ArrayList<String> ();
        while (!list.isEmpty()) {
            Connection temp = findMin(list, cityTree);
            if (temp == null) {// we finished
                break;
            }
            list.remove(temp); //remove the current minimum cost from grand set
            cityTree.add(temp.city1);
            cityTree.add(temp.city2);
            result.add(temp);
        }
//override compare make it alphabet order
        Comparator<Connection> cmp = new Comparator<Connection>(){
            public int compare(Connection c1, Connection c2) {
                if (c1.city1.equals(c2.city1)) {
                    return c1.city2.compareTo(c2.city2);
                }
                return c1.city1.compareTo(c2.city1);
            }};
        result.sort(cmp);
        return result;
    }
    //find the minimum cost between the city we traversed and we did not traverse.
    public static Connection findMin(List<Connection> list, ArrayList<String> cityTree) {
        Connection result = null;
        int minCost = Integer.MAX_VALUE;
        for (Connection con : list) {
            if (con.cost <= minCost) {
                if ((cityTree.contains(con.city1) && !cityTree.contains(con.city2)) ||
                        cityTree.contains(con.city2) && !cityTree.contains(con.city1)) {
                    minCost = con.cost;
                    result = con;
                }
                if (cityTree.isEmpty()) {
                    minCost = con.cost;
                    result = con;
                }
            }
        }
        return result;
    }
}