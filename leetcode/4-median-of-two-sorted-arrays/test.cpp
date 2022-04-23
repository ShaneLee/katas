class Solution {
public:
    double findMedianSortedArrays(vector<int>& nums1, vector<int>& nums2) {
      int s1 = nums1.size();
      int s2 = nums2.size();
      if (s1 == 0 && s2 == 0) return 0;
      int t = s1 + s2;
      int res[t];
      int h =  t / 2;

      for (int k = 0, i = 0, j = 0; k < t; k++) {
        if (i < s1 && j < s2) {
          res[k] = nums1[i] < nums2[j] ? nums1[i++] : nums2[j++];
        }
        else {
          res[k] = i < s1 ? nums1[i++] : nums2[j++];
        }

      }

      return t % 2 != 0 ? res[h] : (res[h] + res[h-1]) / 2.0;
    }
};
