class Solution {
    public int findLengthOfLCIS(int[] nums) {
        int count = 1; int max = 1;
        int l = 0; int r = 1;
        while (r < nums.length) {
            if (nums[l] < nums[r]) {
                count++;
                l++;
                r++;
            }
            else {
                l = r;
                r++;
                count = 1;
            }
            if (count > max) { max = count; }
        }
        return max;
    }
}