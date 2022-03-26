#include <map>

class Solution {
public:
    vector<int> topKFrequent(vector<int>& nums, int k) {
        map<int, int> m;
        
        for (int i = 0; i < nums.size(); i++) {
          m[nums[i]]++;
        }

        priority_queue<pair<int, int>> q; 

        for (pair<int, int> v : m) {
          q.push(make_pair(v.second,v.first));
        }

        vector<int> res;

        while(k--) {
          int t = q.top().second;
          q.pop();
          res.push_back(t);
        }

        return res;
    }
};
