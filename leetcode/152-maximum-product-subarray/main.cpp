class Solution {
public:
    int maxProduct(vector<int>& nums) {
      if (nums.size() == 0) {
        return 0;
      }

      int mn = nums[0];
      int mx = mn;
      int ret = mn;

      for (int i = 1; i < nums.size(); i++) {
        if (nums[i] < 0) {
          int v = mx;
          mx = mn;    
          mn = v;
        }

        mx = max(nums[i], nums[i] * mx);
        mn = min(nums[i], nums[i] * mn);
        ret = max(mx, max(ret, mn));
      }

      return ret;
        
    }
};
