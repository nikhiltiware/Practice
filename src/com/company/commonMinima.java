package com.company;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by Nikhil on 2/26/16.
 */
public class commonMinima {

    public int getCommonMinima(int[] a, int[] b){
        Arrays.sort(a);
        Arrays.sort(b);

        int i = 0, j=0;
       while(i<a.length && j<b.length)
       {
           if(a[i]==b[j]){
               return a[i];
           }else if(a[i]<b[j]){
               i++;
           }else if(b[j]<a[i]){
               j++;
           }

       }

return 0;
    }

}
