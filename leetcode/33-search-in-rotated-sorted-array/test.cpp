class Solution {
public:
    int search(vector<int>& nums, int target) {
      int l = 0; 
      int s = 0; 
      int m; 
      int h = nums.size() -1;

      while (l!=h) {
        m=(l+h)/2;
        if (nums[m]>nums[h]) {
          l = m + 1;
        }
        else {
          h = m;
        }
      }

      int c = 0; 
      h = nums.size()-1;
      s = l;

      while (l<=h) {
        m=(l+h)/2;
        if (l == h && nums[l] != target && c != 1) {
          c = 1;
          l = 0;
          h = s - 1;
          continue;
        }

        if (nums[m] == target) {
          return m;
        }
        if (nums[m] < target) {
          l=m +1;
        }
        else {
          h = m -1;

        }

      }
      return -1;
        
    }
};
