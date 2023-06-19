class Solution {
public:
    int maxProfit(vector<int>& prices) {
        int max = 0;
        int least = INT_MAX;
        int currentProfit = 0;
        for (int i = 0; i < prices.size(); i++) {
            if (prices[i] < least) { least = prices[i]; }
            currentProfit = prices[i] - least;
            if (currentProfit > max) { max = currentProfit; }
        }
        return max;
    }
};