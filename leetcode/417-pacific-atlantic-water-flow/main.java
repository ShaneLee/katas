import java.util.List;
import java.util.ArrayList;

class Solution
{
    private final int[] dx = {0, 0, 1, -1};
    private final int[] dy = {1, -1, 0, 0};

    public List<List<Integer>> pacificAtlantic(int[][] heights)
    {
        int n = heights.length;
        int m = heights[0].length;

        List<List<Integer>> res = new ArrayList<>();

        if (n == 0) 
        {
            return res;
        }

        int[][] p = new int[n][m];
        int[][] a = new int[n][m];
        
        for (int i = 0; i < n; i++) 
        {
            for (int j = 0; j < m; j++) 
            {
                if (i == 0 || j == 0) 
                {
                    dfs(heights, 0, j, Integer.MIN_VALUE, p);
                    dfs(heights, i, 0, Integer.MIN_VALUE, p);
                }

                if (i == n -1 || j == m - 1) 
                {
                    dfs(heights, n -1, j, Integer.MIN_VALUE, a);
                    dfs(heights, i, m -1, Integer.MIN_VALUE, a);
                }
            }
        }

        for (int i = 0; i < n; i++) 
        {
            for (int j = 0; j < m; j++) 
            {
                if (p[i][j] == 1 && a[i][j] == 1)
                {
                    res.add(List.of(i, j));
                }
            }
        }

        return res;
    }

    private void dfs(int[][] grid, int x, int y, int p, int[][] ocean)
    {
        if (x < 0 || x >= grid.length || y < 0 || y >= grid[0].length || ocean[x][y] == 1 || grid[x][y] < p)
        {
            return;
        } 

        ocean[x][y] = 1;

        for (int i = 0; i < 4; i++) 
        {
            int nx = x + dx[i];
            int ny = y + dy[i];
            dfs(grid, nx, ny, grid[x][y], ocean);
        }
    }
}
