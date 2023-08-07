class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> sums = new ArrayList<>();
        Arrays.sort(nums);
        for (int l = 0; l < nums.length-2; l++) {
            if (l > 0 && nums[l-1] == nums[l]) { continue; }
            int m = l+1;
            int r = nums.length-1;

            while (m < r) {
                int sum = nums[l] + nums[m] + nums[r];
                if (sum == 0) {
                    sums.add(Arrays.asList(nums[l], nums[m], nums[r]));

                    while (m < r && nums[m] == nums[m+1]) { m++; }
                    while (m < r && nums[r] == nums[r-1]) { r--; }

                    m++;
                    r--;
                }
                else if (sum < 0) { m++; }
                else { r--; }
            }
        }
        return sums;
    }
}