import java.lang.Math;

class Solution {
    public int maxProduct(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int min = nums[0];
        int max = min;
        int ret = min;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < 0) {
                int v = max;
                max = min;
                min = v;
            }

            max = Math.max(nums[i], nums[i] * max);
            min = Math.min(nums[i], nums[i] * min);
            ret = Math.max(max, Math.max(min, ret));

        }
        return ret;
    }
}
