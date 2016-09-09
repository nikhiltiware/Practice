package com.company;

/**
 * Created by Nikhil on 9/8/16.
 */
public class zappos4 {

    public static String reverseString(String reverseMe) {
        StringBuilder finalString = new StringBuilder();
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<reverseMe.length();) {

            char temp = reverseMe.charAt(i);
            if(temp!=' ') {
                sb.append(temp);
                i++;
            } else {
                sb.reverse();
                finalString.append(sb.toString());
                sb = new StringBuilder();
                while (i<reverseMe.length() && reverseMe.charAt(i)==' ') {
                    finalString.append(' ');
                    i++;
                }
            }

        }
        finalString.append(sb.reverse());
        return finalString.toString();
    }
}
