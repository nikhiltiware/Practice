package com.company;

/**
 * Created by Nikhil on 9/8/16.
 */
public class zappos2 {

    public void removeDigits(String coordinates, int remove, StringBuilder answer) {
        if (remove == 0)
        {
            answer.append(coordinates);
            return;
        }
        int length = coordinates.length();
        if (length <= remove)
            return;
        int min = 0;
        for (int i = 1; i<=remove ; i++) {
            if (coordinates.charAt(i) < coordinates.charAt(min))
                min = i;
        }

        answer.append(coordinates.charAt(min));
        String new_str = coordinates.substring(min+1, length);
        removeDigits(new_str, remove-min, answer);
    }
}
