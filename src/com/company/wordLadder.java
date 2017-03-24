package com.company;

import java.util.*;

/**
 * Created by Nikhil on 3/18/17.
 */
public class wordLadder {

    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        if(beginWord.length() != endWord.length()) return 0;
        Queue<String> q = new LinkedList<>();
        q.add(beginWord);
        int modifications = 0;
        while(!q.isEmpty())
        {
            int size = q.size();

            for(int i = 0; i < size; i++)
            {
                String s = q.remove();
                String modifiedString = "";
                for(int j = 0; j < s.length(); j++)
                {
                    if(s.charAt(j) == endWord.charAt(j)) continue;
                    StringBuilder sb = new StringBuilder(s);
                    sb.setCharAt(j, endWord.charAt(j));
                    modifiedString = sb.toString();
                    System.out.println(modifiedString);
                    if(modifiedString.equals(endWord)) return modifications+1;
                    if(wordList.contains(modifiedString))
                    {
                        q.add(modifiedString);
                    }
                }


            }
            modifications++;
        }
        return 0;
    }
}
