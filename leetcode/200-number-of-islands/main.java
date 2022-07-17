class Solution
{
    public int numIslands(char[][] grid)
    {
        int res = 0;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == '1') {
                    res++;
                    dfs(i, j, grid); 
                }
            }
        }

        return res;
    }

    private static void dfs(int x, int y, char[][] grid)
    {
        grid[x][y] = '0';

        if (x + 1 < grid.length  && grid[x+1][y] == '1')
        {
            dfs(x+1, y, grid);
        }
        if (x - 1 >= 0 && grid[x-1][y] == '1')
        {
            dfs(x-1, y, grid);
        }
        if (y + 1 < grid[x].length  && grid[x][y+1] == '1')
        {
            dfs(x, y+1, grid);
        }
        if (y - 1 >= 0 && grid[x][y-1] == '1')
        {
            dfs(x, y-1, grid);
        }

    }
}
