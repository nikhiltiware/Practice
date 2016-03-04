package com.company;

/**
 * Created by Nikhil on 3/3/16.
 */
public class parseInt {

    public int parseInt(String str) {
        str = str.trim();
        if(str.length()>0)
        {
            double result =0;
            int neg = 1;
            int i=0;
            if(str.charAt(0)=='-')
            {
                neg = -1;
                i = 1;

            }else if(str.charAt(0)=='+')
                i = 1;

            for(; i<str.length();i++){

                if(str.charAt(i)-'0'<0 || str.charAt(i)-'0'>9)
                    break;
                else if(result/10>=Integer.MAX_VALUE){
                    return neg==1?Integer.MAX_VALUE:Integer.MIN_VALUE;
                }
                else result = result*10 + str.charAt(i)-'0';


            }

            return (int)result*neg;

        }else
            return 0;


    }
}
