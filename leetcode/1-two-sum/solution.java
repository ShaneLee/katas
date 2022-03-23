import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] twoSum(int[] nums, int target) {

        final Map<Integer, Integer> m = new HashMap<>();

        for (int i = 0; i< nums.length; i++) {
            final Integer r = target - nums[i];
            final Integer t = m.get(r);

            if (t != null) {
                return new int[]{t, i};
            }
            
            m.put(nums[i], i);
        }

        return null;
    }
}
