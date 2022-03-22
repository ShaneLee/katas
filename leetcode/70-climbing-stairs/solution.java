import java.util.HashMap;
import java.util.Map;

class Solution {
    private static final Map<Integer, Integer> m = new HashMap<>();

    public int climbStairs(int n) {
        if (n == 1) return 1;
        if (n == 2) return 2;

        while (n >=0) {
            var res = m.get(n);

            if (res != null) return res;

            res = climbStairs(n-1) + climbStairs(n-2);
            
            m.put(n, res);
        }

        return 0;
    }
}
