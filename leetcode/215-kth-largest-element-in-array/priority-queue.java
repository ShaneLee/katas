import java.util.PriorityQueue;
import java.util.Queue;

class Solution {
    public int findKthLargest(int[] nums, int k) {
        final Queue<Integer> q = new PriorityQueue<>();
        for (int i = 0; i < k; i++) {
            q.offer(nums[i]);
        }

        for (int i = k; i < nums.length; i++) {
            if (nums[i] > q.peek()) {
                q.poll();
                q.offer(nums[i]);
            }
        }

        return q.poll();

    }
}
