class Solution {
public:
    int maxProfit(vector<int>& prices) {
      int low = INT_MAX;
      int p = 0;
      int pt = 0;

      for (int i = 0; i< prices.size(); i++) 
      {
        if (prices[i] < low) {
          low = prices[i];
        }

        pt = prices[i] - low;
        if (p < pt) {
          p = pt;

        }

      }

      return p;
        
    }
};
