// 02/23/2023

class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target) {
        vector<int> vect;
        for (int i = 0; i < nums.size(); i++) {
            for (int j = i+1; j < nums.size(); j++) {
                if (nums[i]+nums[j]==target) {
                    vect.push_back(i);
                    vect.push_back(j);
                    return vect;
                }
            }
        }
        return vect;
    }
};