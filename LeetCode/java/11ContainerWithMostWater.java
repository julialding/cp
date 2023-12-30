class Solution {
    public int maxArea(int[] height) {
        // two pointers start from beginning and end
        // whichever height is greater move inward
        // take largest area
        int left = 0; 
        int right = height.length - 1;
        int maxArea = 0;
        while (right > left) {
            int area = (right - left) * Math.min(height[left], height[right]);
            if (area > maxArea) {
                maxArea = area;
            }
            if (height[right] < height[left]) {
                right--;
            }
            else {
                left++;
            }
        }
        return maxArea;
    }
}