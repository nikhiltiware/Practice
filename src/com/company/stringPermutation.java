package com.company;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Nikhil on 4/3/17.
 */
public class stringPermutation {

    public List<String> getStringPermutations(String input)
    {
        List<String> result = new ArrayList<>();
        capitalize(input, 0, "", result);
        return result;
    }

    public void capitalize(String input, int index, String prefix, List<String> result)
    {
        if(prefix.length() == input.length())
        {
            result.add(prefix);
        }else
        {
            char c = input.charAt(index);
            if(Character.isDigit(c))
            {
                capitalize(input,index + 1, prefix + c, result);
            }else
            {
                capitalize(input,index + 1, prefix + Character.toLowerCase(c), result);
                capitalize(input,index + 1, prefix + Character.toUpperCase(c), result);
            }

        }
    }
}
