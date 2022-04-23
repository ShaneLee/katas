class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int s1 = nums1.length;
        int s2 = nums2.length;
        if (s1 == 0 && s2 == 0) return 0;
        int t = s1 + s2;
        int res[] = new int[t];

        for (int i = 0, j = 0, k = 0; k < t; k++) {
            if (i < s1 && j < s2) {
                res[k] = nums1[i] < nums2[j] ? nums1[i++] : nums2[j++];
            }
            else {
                res[k] = i < s1 ? nums1[i++] : nums2[j++];
            }
        }
        
        return t % 2 != 0 ? res[t/2] : (res[t/2] + res[(t/2) - 1]) / 2.0;
    }
}
