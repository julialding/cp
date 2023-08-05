#include <string.h>

class Solution {
public:
    bool isValid(string s) {
        stack<char> open;
        for (int i = 0; i < s.length(); i++) {
            if (s[i] == '(' || s[i] == '[' || s[i] == '{') {
                open.push(s[i]);
            }
            else {
                if (open.empty() || (s[i] == ')' && open.top() != '(') || 
                    (s[i] == '}' && open.top() != '{') ||
                    (s[i] == ']' && open.top() != '[')) { return 0; }
                    open.pop();
            }
        }
        return open.empty();
    }
};