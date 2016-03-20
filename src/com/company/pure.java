package com.company;

/**
 * Created by Nikhil on 3/8/16.
 */
public class pure {
    int sorted_search(int[] elements, int target){


        if(elements == null || elements.length<= 0) return -1;

        int left=0, right =  elements.length - 1;

        while(left < right){
            int middle = (left + right +1)/2;

            if(elements[middle] > target){

                right = middle -1;

            }else{

                left = middle +1;
            }


        }

        if(elements[right] == target) return right;
        return -1;

    }
}
