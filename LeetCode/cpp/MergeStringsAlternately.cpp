class Solution {
public:
    string mergeAlternately(string word1, string word2) {
        int minimum = min(word1.length(), word2.length());
        string s = "";

        for (int i = 0; i < minimum; i++) {
            s += word1.substr(i, 1) + word2.substr(i, 1);
        }

        if (word2.length() > word1.length()) {
            s += word2.substr(minimum, word2.length() - minimum);
        }
        else if (word1.length() > word2.length()) {
            s += word1.substr(minimum, word1.length() - minimum);
        }

        return s;
    }
};