class Solution {
    public int search(int[] nums, int target) {
        int l = 0; 
        int h = nums.length-1;
        int m;
        int s = 0;

        while (l != h) {
            m = (l+h) / 2;
            if (nums[m]>nums[h]) {
                l = m + 1;
            }
            else {
                h = m;
            }
        }

        s = l;
        h = nums.length-1;
        int c = 0;

        while (l<=h) {
            m = (l+h) / 2;
            if (l == h && nums[l] != target && c != 1) {
                l=0;
                h=s-1;
                c=1;
                continue;
            }

            if (nums[m] == target) {
                return m;
            }
            if (nums[m] < target) {
                l = m + 1;
            }
            else {
                h=m-1;
            }

        }

        return -1;
       
    }
}
