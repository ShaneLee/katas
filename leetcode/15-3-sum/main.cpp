class Solution {
public:
    vector<vector<int>> threeSum(vector<int>& nums) {
      vector<vector<int>> res;

      sort(nums.begin(), nums.end());

      for (int i = 0; i + 2 < nums.size(); i++) {
        if (i > 0 && nums[i] == nums[i - 1]) {
          continue;
        }

        int j = i+ 1; 
        int k = nums.size() - 1;

        while (j < k) {
          int sum = nums[i] + nums[k] + nums[j];
          
          if (sum == 0) {
            res.push_back({nums[i], nums[k], nums[j]});
            k--;

            while (j < k && nums[k] == nums[k+1]) {
              k--;
            }
          } else if (sum > 0) {
              k--;
          } else {
            j++;
          }

        }

      }

      return res;
        
    }
};
