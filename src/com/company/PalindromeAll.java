package com.company;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Nikhil on 3/4/16.
 */
public class PalindromeAll {
    static int palindrome(String str)
    {
        HashSet<String> set = new HashSet<>();

        int pivot;

        for(int i=0; i<str.length(); i++)
        {
            checkPalindrome(str, i, i+1, set);
            checkPalindrome(str, i, i, set);
        }

        return set.size();
    }

    static void checkPalindrome(String s, int pivot1, int pivot2, Set<String> set)
    {
        while(pivot1 >=0 && pivot2 < s.length() && s.charAt(pivot1) == s.charAt(pivot2))
        {
            set.add(s.substring(pivot1--, ++pivot2));
        }
    }
}
