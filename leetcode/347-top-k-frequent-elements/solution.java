import java.util.Map;
import java.util.HashMap;
import java.util.stream.Collectors;

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        final Map<Integer, Integer> map = new HashMap<>();
            
        for (int i = 0; i < nums.length; i++) {
            map.computeIfPresent(nums[i], (key, val) -> val + 1);
            map.putIfAbsent(nums[i], 1);
        }

        return map.entrySet()
            .stream()
            .sorted((v1, v2) -> v2.getValue() - v1.getValue())
            .limit(k)
            .map(Map.Entry::getKey)
            .mapToInt(Integer::intValue)
            .toArray();
    }
}
