class Solution {
    public int maxProfit(int[] prices) {
        int low = Integer.MAX_VALUE;
        int p = 0;
        int pt = 0;

        for (int i = 0; i < prices.length; i++)
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
}
