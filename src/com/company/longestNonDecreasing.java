package com.company;

/**
 * Created by Nikhil on 2/22/17.
 */
public class longestNonDecreasing {
    static int maxLength=0;

    public int longestPath(int[][] m)
    {
        if(m.length == 0 || m[0].length == 0)
        {
            return 0;
        }
        int maxLength = 1;
        boolean[][] visited;

        for (int i = 0; i < m.length; i++)
        {
            for(int j = 0; j < m[0].length; j++)
            {
                visited = new boolean[m.length][m[0].length];
                int currentLength = findByDFS(m, i, j, visited);
                maxLength = Math.max(currentLength, maxLength);
            }
        }
        return maxLength;
    }

    public int findByDFS(int[][] m, int row, int col, boolean[][] visited)
    {
        //if(mem[row][col] != 0) return  mem[row][col];
        int[][] allNeighbors = {{-1,-1}, {-1,0}, {0, -1}, {1, 0}, {0, 1}, {1,1}, {1, -1}, {-1, 1}};
        int rowLength = m.length;
        int colLength = m[0].length;
        visited[row][col] = true;

        int maxLength = 1;
        for(int i = 0; i < allNeighbors.length; i++)
        {
            int neighborRow = row + allNeighbors[i][0];
            int neighborCol = col + allNeighbors[i][1];
            if(neighborRow >= 0 && neighborRow < rowLength && neighborCol >= 0 && neighborCol < colLength
                    && Math.abs(m[neighborRow][neighborCol] - m[row][col]) >3 && !visited[neighborRow][neighborCol])
            {
                int currentLength = 1 + findByDFS(m, neighborRow, neighborCol, visited);
                maxLength = Math.max(currentLength,maxLength);
            }
        }
        visited[row][col] = false;
        return maxLength;
    }
}
