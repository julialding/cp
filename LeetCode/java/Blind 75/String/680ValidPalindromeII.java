class Solution {
    public boolean validPalindrome(String s) {
        int l = 0; int r = s.length()-1;
        while (r > l) {
            if (s.charAt(l) != s.charAt(r)) return isPalindrome(s, l, r-1) || isPalindrome(s, l+1, r);
            l++;
            r--;
        }
        return true;
    }

    public boolean isPalindrome(String str, int l, int r) {
        while (r > l) {
            if (str.charAt(l) != str.charAt(r)) return false;
            r--;
            l++;
        }
        return true;
    }
}