class Solution {
public:
    vector<int> productExceptSelf(vector<int>& nums) {
        int l = nums.size();
        vector<int> ans(l);
        vector<int> lp(l);
        vector<int> rp(l);

        lp[0] = 1;
        // left product
        for (int i = 1; i < l; i++) {
            lp[i] = lp[i-1]*nums[i-1];
        }

        rp[l-1] = 1;
        // right product
        for (int j = l-2; j >= 0; j--) {
            rp[j] = rp[j+1]*nums[j+1];
        }

        for (int k = 0; k < l; k++) {
            ans[k] = lp[k]*rp[k];
        }
        return ans;
    }
};