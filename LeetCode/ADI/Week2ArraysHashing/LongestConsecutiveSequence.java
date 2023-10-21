class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) return 0;
        HashSet<Integer> seq = new HashSet<Integer>();
        for (int num : nums) {
            seq.add(num);
        }
        int longest = 1;
        for (int i = 0; i < nums.length; i++) {
            int count = 1;
            if (!seq.contains(nums[i]-1)) {
                int x = nums[i];
                
                while (seq.contains(x+1)) {
                    count++;
                    x++;
                }
            }
            longest = Math.max(longest, count);
        }
        return longest;
    }
}