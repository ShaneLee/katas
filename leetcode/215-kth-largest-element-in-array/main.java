import java.util.Arrays;


class Solution {
    public int findKthLargest(int[] nums, int k) {
        return Arrays.stream(nums)
            .boxed()
            .sorted((v1, v2) -> v2 - v1)
            .limit(k)
            .mapToInt(Integer::intValue)
            .toArray()
            [k -1];
    }
}
