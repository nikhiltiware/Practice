package com.company;

/**
 * Created by Nikhil on 3/24/17.
 */
public class findMovie {

    public void printMoviePath(String str)
    {
        int prevRow = 0, prevCol = 0;
        for(char c : str.toCharArray())
        {
            int nextCol = (c - 'a')%5;
            int nextRow = (c - 'a')/5;
            int rowDiff = nextRow - prevRow;
            int colDiff = nextCol - prevCol;

            if(prevCol == 0 && prevRow == 5)
            {
                rowMoves(rowDiff);
                colMoves(colDiff);

            }else
            {
                colMoves(colDiff);
                rowMoves(rowDiff);
            }

            System.out.print("!");
            prevRow = nextRow;
            prevCol = nextCol;

        }


    }

    private void colMoves(int colDiff)
    {
        if(colDiff > 0)
        {
            while(colDiff>0)
            {
                System.out.print("r");
                colDiff--;
            }
        }else if(colDiff < 0)
        {
            while(colDiff < 0)
            {
                System.out.print("l");
                colDiff++;
            }
        }
    }

    private void rowMoves(int rowDiff)
    {
        if(rowDiff > 0)
        {
            while(rowDiff > 0)
            {
                System.out.print("d");
                rowDiff--;
            }
        }else if(rowDiff < 0)
        {
            while(rowDiff < 0)
            {
                System.out.print("u");
                rowDiff++;
            }
        }

    }
}
