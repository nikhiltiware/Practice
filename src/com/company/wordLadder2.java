package com.company;

import java.util.*;

/**
 * Created by Nikhil on 4/10/17.
 */
public class wordLadder2 {

    public List<List<String>> findLadders(String beginWord, String endWord, List<String> wordList) {
        List<List<String>> result = new ArrayList<>();
        HashMap<String, Set<String>> graph = new HashMap<>();
        HashMap<String, Integer> minDistance = new HashMap<>();
        Set<String> list = new HashSet<>();

        for(String temp:wordList){
            list.add(temp);
        }

        bfs(beginWord, endWord, list, graph, minDistance);
        List<String> newList = new ArrayList<>();
        newList.add(beginWord);
        dfs(beginWord, endWord, newList, result, graph);
        return result;
    }

    private void bfs(String beginWord, String endWord, Set<String> wordList, HashMap<String, Set<String>> graph, HashMap<String, Integer> minDistance)
    {
        Queue<String> q = new LinkedList<>();
        q.add(beginWord);
        minDistance.put(beginWord,0);
        int minSteps = 0;
        while (!q.isEmpty())
        {
            int size = q.size();
            for(int i = 0; i < size; i++)
            {
                String current = q.remove();
                char[] curr = current.toCharArray();
                for (int j = 0; j < curr.length; j++)
                {
                    char old = curr[j];
                    for (char k = 'a'; k <= 'z' ; k++)
                    {
                        if(k == old) continue;
                        curr[j] = k;
                        String target = new String(curr);
                        if(wordList.contains(target))
                        {
                            if(minDistance.containsKey(target))
                            {
                                if(minDistance.get(target) == minDistance.get(current) + 1)
                                {
                                    addToGraph(current, target, graph);
                                }

                            }else
                            {
                                minDistance.put(target, minDistance.get(current)+1);
                                addToGraph(current, target, graph);
                                if(!endWord.equals(target))
                                {
                                    q.add(target);
                                }
                            }

                        }

                    }
                    curr[j] = old;
                }
            }

        }

    }

    private void addToGraph(String current, String child, HashMap<String, Set<String>> graph)
    {
        Set<String> set = graph.get(current);
        if(set == null)
            set = new HashSet<>();

        set.add(child);
        graph.put(current,set);
    }
    private void dfs(String beginWord, String endWord, List<String> list, List<List<String>> result, HashMap<String, Set<String>> graph)
    {
        if(beginWord.equals(endWord))
        {
            result.add(new ArrayList<String>(list));
        }else
        {
            Set<String> set = graph.get(beginWord);
            if(set != null)
            {
                for(String str: set)
                {
                    list.add(str);
                    dfs(str, endWord, list, result, graph);
                    list.remove(list.size() - 1);
                }
            }


        }
    }



}
