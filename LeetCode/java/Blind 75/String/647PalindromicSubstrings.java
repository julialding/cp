class Solution {
    public int countSubstrings(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            count += expandPalindrome(s, i, i);
            count += expandPalindrome(s, i, i+1);
        }
        return count;
    }

    public int expandPalindrome(String str, int l, int r) {
        int count = 0;
        while (l >= 0 && l < str.length() && r >= 0 && r < str.length() && str.charAt(l) == str.charAt(r)) {
            count++;
            l--;
            r++;
        }
        return count;
    }
}