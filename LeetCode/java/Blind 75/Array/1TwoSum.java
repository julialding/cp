class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] indices = new int[2];
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        for (int j = 0; j < nums.length; j++) {
            int numWanted = target - nums[j];
            if (map.containsKey(numWanted) && !map.get(numWanted).equals(j)) {
                indices[0] = j;
                indices[1] = map.get(numWanted);
            }
        }
        return indices;
    }
}