import java.util.ArrayList;
import java.util.List;

class Solution
{
    public boolean canFinish(int numCourses, int[][] prerequisites)
    {
        int[] x = new int[numCourses];
        int[] y = new int[numCourses];
        final List<List<Integer>> adj = new ArrayList<>();

        for (int i = 0; i < numCourses; i++) 
        {
            adj.add(new ArrayList<>());
        }
        for (int i = 0; i < prerequisites.length; i++) 
        {
            adj.get(prerequisites[i][0]).add(prerequisites[i][1]);
        }
        
        for (int i = 0; i < numCourses; i++) 
        {
            if (x[i] == 0) {
                if (hasCycle(x, y, i, adj))
                {
                    return false;
                }
            }
        }

        return true;
        
    }

    private static boolean hasCycle(int[] x, int[] y, int n, List<List<Integer>> adj)
    {
        x[n] = 1; 
        y[n] = 1;
        for (int i: adj.get(n)) 
        {
            if (x[i] == 0) 
            {
                if (hasCycle(x, y, i, adj))
                {
                    return true;
                }
            }
            if (y[i] != 0)
            {
                return true;
            }
        }
        y[n] = 0;
            
        return false;
    }
}
