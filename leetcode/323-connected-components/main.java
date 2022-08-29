import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;


public class main {

    private static final String GREEN = "\033[0;32m";
    private static final String RED = "\033[1;91m";
    private static final String RESET = "\033[0m";

	public static void main(final String[] args) {
        final int[][] input1 = {{0, 1}, {1, 2}, {2, 3}, {3, 4}}; 
        final int expected1 = 1;
        final int result1 = countComponents(5, input1);
        test(1, expected1, result1);

        final int [][] input2 = {{0, 1}, {1, 2}, {3, 4}};
        final int expected2 = 2;
        final int result2 = countComponents(5, input2);
        test(2, expected2, result2);
    }

    private static void test(final int n, final int expected, final int result) {
        if (result == expected)
        {
            System.out.print(GREEN);
            System.out.println("Passed " + n);
        }
        else
        { 
            System.out.print(RED);
            System.out.println("Failed " + n + ": expected: " + expected + " got: " + result);
        }


        System.out.print(RESET);

    }

    public static int countComponents(int n, int[][] edges) {
        final Map<Integer, List<Integer>> adj = new HashMap<>();

        for (int i = 0; i < n; i++) {
            adj.put(i, new LinkedList<>());
        }

        for (int i = 0; i < edges.length; i++) {
            adj.get(edges[i][0]).add(edges[i][1]);
            adj.get(edges[i][1]).add(edges[i][0]);
        }

        final boolean[] v = new boolean[n];
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (v[i] == false) {
                count++;
                dfs(adj, i, v);
            }

        }

        return count;
	}

    private static void dfs(final Map<Integer, List<Integer>> m, final int i, final boolean[] v) {
        v[i] = true;

        m.get(i)
            .forEach(val -> { 
                if (v[val] == false) {
                    dfs(m, val, v);
                }
        });


    }

}
