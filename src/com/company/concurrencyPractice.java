package com.company;
import java.util.*;
/**
 * Created by Nikhil on 10/7/16.
 */
public class concurrencyPractice {

    int getMoves(int[] avg){
        int startOnes = 0;
        int endOnes = 0;
        for(int i=0; i< avg.length/2; i++) {
            if(avg[i]==1) startOnes++;
        }
        for(int i=avg.length/2; i< avg.length; i++) {
            if(avg[i]==1) startOnes++;
        }
        int[] reverse = new int[avg.length];
        int j =0 ;
        for(int i=avg.length-1;i>=0;i--){
            reverse[j++] = avg[i];
        }
        return Math.min(getMove(avg),getMove(reverse));
    }

    static int getMove(int[] avg) {
        int zeroPointer = 0;
        int onePointer = 0;
        int moves = 0;
        for(; zeroPointer<avg.length;) {

            if(avg[zeroPointer]==1){
                zeroPointer++;
            } else if(avg[zeroPointer]==0) {
                onePointer = zeroPointer;
                while(onePointer<avg.length && avg[onePointer]!=1) {
                    onePointer++;
                }
                if(onePointer<avg.length){
                    moves = moves + onePointer - zeroPointer;
                    avg[onePointer] = 0;
                    avg[zeroPointer] = 1;
                    zeroPointer++;
                } else {
                    break;
                }
            }
        }
        return moves;
    }

}
