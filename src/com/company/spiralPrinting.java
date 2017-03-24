package com.company;

/**
 * Created by Nikhil on 3/17/17.
 */
public class spiralPrinting {

    public int[][] generateSpiral(int n)
    {
        int[][] result = new int[n][n];

        int rowStart = 0, rowEnd = n-1, colStart = 0, colEnd = n-1;
        int x = 1;
        while(rowStart <= rowEnd && colStart <= colEnd)
        {
            for(int i = colStart; i <= colEnd; i++)
            {
                result[rowStart][i] = x++;;

            }
            rowStart++;
            for(int i = rowStart; i <= rowEnd; i++)
            {
                result[i][colEnd] = x++;

            }
            colEnd--;


                for(int i = colEnd; i >= colStart; i--)
                {
                    result[rowEnd][i] = x++;

                }

            rowEnd--;

                for(int i = rowEnd; i >= rowStart; i--)
                {
                    result[i][colStart] = x++;

                }

            colStart++;
        }
        return result;


    }
}
