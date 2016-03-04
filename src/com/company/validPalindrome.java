package com.company;

/**
 * Created by Nikhil on 3/4/16.
 */
public class validPalindrome {

    public boolean isPalindrome(String s) {
        if(s.isEmpty()) return true;

        int start = 0;
        int end = s.length() - 1;
        while(start < end) {
            char startC = s.charAt(start);
            char endC = s.charAt(end);

            // Two characters are equal. It doesn't matter if they are alphanumeric or not. Move on
            if(startC == endC) {
                start++;
                end--;
            } else {
                while(! isAlphanumeric(startC) && start < end) {
                    start++;
                    startC = s.charAt(start);
                }

                while(! isAlphanumeric(endC) && start < end) {
                    end--;
                    endC = s.charAt(end);
                }

                startC = Character.toLowerCase(startC);
                endC = Character.toLowerCase(endC);

                if(startC != endC) {
                    return false;
                }

                start++;
                end--;
            }
        }

        return true;
    }

    private static boolean isAlphanumeric(char c) {
        return (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') || (c >= '0' && c <= '9');
    }
}
