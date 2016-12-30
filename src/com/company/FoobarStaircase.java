package com.company;

/**
 * Created by Nikhil on 12/30/16.
 */
public class FoobarStaircase {

    public static int answer(int n) {

        if(n <=4 )
            return 1;

        int[][] mem=new int[n+1][n+1];

        for(int i = 0; i < (n+1); i++){

            for(int j = 0; j < (n+1); j++){
                if(j >= i/2){
                    mem[i][j] = 0;
                    continue;
                }
                if(i == 2 || i == 3 || i == 4){
                    mem[i][j] = 1;
                    continue;
                }
                for(int k = j+1; k <= i/2; k++){
                    if(k < (i - k)){
                        mem[i][j] = mem [i][j] + mem[i-k][k] + 1;
                    }
                }


            }
        }
         return mem[n][0];


    }
}
