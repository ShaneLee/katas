class Solution {
    public int combinationSum4(int[] nums, int target) {
        int[] dp = new int[1000];
        Arrays.fill(dp, -1);
        return calculate(dp, nums, target);
    }

    private static int calculate(int[] dp, int[] nums, int x) {
        if (x == 0) {
            return 1;
        }
        if (x<0) {
            return 0;
        }
        else if (dp[x] != -1) { 
            return dp[x];
        }

        int count = 0;

        for (int i = 0; i <nums.length;i++) {
            count+=calculate(dp, nums, x-nums[i]);
        }

        return dp[x] = count; 
    }
}
