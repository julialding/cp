class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int closest = nums[0]+nums[1]+nums[2];
        int diff = Math.abs(closest-target);
        for (int l = 0; l < nums.length-2; l++) {
            int m = l+1; int r = nums.length-1;
            while (m < r) {
                int sum = nums[l]+nums[m]+nums[r];
                if (sum == target) { return target; }
                else if (sum < target) {
                    if ((target-sum) < diff) {
                        closest = sum;
                        diff = target-sum;
                    }
                    m++;
                }
                else {
                    if ((sum-target) < diff) {
                        closest = sum;
                        diff = sum-target;
                    }
                    r--;
                }
            }
        }
        return closest;
    }
}