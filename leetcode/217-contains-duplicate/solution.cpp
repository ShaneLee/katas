class Solution {
public:
    bool containsDuplicate(vector<int>& nums) {
			unordered_set<int> set;

			for (int i = 0; i < nums.size(); i++) {
				int s = set.size();
				set.insert(nums[i]);
				if (s == set.size()) {
					return true;
				}

			}
			return false;
        
    }
};
