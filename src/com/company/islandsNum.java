package com.company;

/**
 * Created by Nikhil on 3/4/16.
 */
public class islandsNum {

    public int numIslands(char[][] grid) {
        int res = 0;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == '1') {
                    res++;
                    clearIsland(grid, i, j);
                }
            }
        }

        return res;
    }

    private void clearIsland(char[][] grid, int i, int j) {
        while (grid[i][j] == '1') {
            grid[i][j] = '0';
            if (i != 0 && grid[i-1][j] != '0') clearIsland(grid, i-1, j);
            if (i != grid.length-1 && grid[i+1][j] != '0') clearIsland(grid, i+1, j);
            if (j != 0 && grid[i][j-1] != '0') clearIsland(grid, i, j-1);
            if (j != grid[0].length-1 && grid[i][j+1] != '0') clearIsland(grid, i, j+1);
        }
    }
}
