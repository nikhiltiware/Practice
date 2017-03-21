package com.company;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Nikhil on 3/21/17.
 */
public class phoneCodes {

    public List<String> getPhoneCodes(String number)
    {
        String[] map = {"0", "1","abc","def","ghi", "jkl", "mno","pqrs","tuv","wxyz"};
        List<String> result = new ArrayList<>();
        getAllCodes(result, map, "", number,0);
        return result;
    }

    public  void getAllCodes(List<String> result, String[] map, String prefix, String number,int index)
    {
        if(prefix.length() == 6)
        {
            result.add(prefix);
        }else
        {
            for(int i = index; i < number.length(); i++)
            {
                String s = map[Character.getNumericValue(number.charAt(i))];
                for(char c : s.toCharArray())
                {
                    getAllCodes(result,map,prefix+c,number,i+1);
                }
            }
        }
    }
}
