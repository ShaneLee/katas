class Solution {

  int m[50];

public:
    int climbStairs(int n) {
      if (n == 1 || n == 2) {
        return n;
      }
        
      while (n>=0) {
        int res = m[n];

        if (res != NULL) {
          return res;
        }

        res = climbStairs(n -1) + climbStairs(n -2);

        m[n] = res;
      }

      return 0;
    }
};
