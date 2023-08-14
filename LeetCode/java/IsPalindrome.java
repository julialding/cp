class Solution {
    public boolean isPalindrome(int x) {
        /* String s = String.valueOf(x);
        String rev = "";
        for (int i = s.length()-1; i >= 0; i--) {
            rev += s.charAt(i);
        }
        if (s.equals(rev)) { return true; }
        return false; */
        int rev = 0;
        int n = x;
        while (n > 0) {
            rev = rev*10 + n%10;
            n /= 10;
            
        }
        if (x == rev) { return true; }
        return false;
    }
}