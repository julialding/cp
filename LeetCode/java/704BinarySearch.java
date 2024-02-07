class Solution {
    public int search(int[] nums, int target) {
        int left = 0; int right = nums.length-1;
        int mid = left + (right - left)/2;
        while (right >= left) {
            if (nums[mid] == target) return mid;
            else if (nums[mid] > target) {
                right = mid - 1;
                mid = left + (right - left)/2;
            }
            else {
                left = mid + 1;
                mid = left + (right - left)/2;
            }
        }
        return -1;
    }
}