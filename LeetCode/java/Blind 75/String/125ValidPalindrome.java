class Solution {
    public boolean isPalindrome(String s) {
        String lower = s.toLowerCase();
        StringBuilder parsed = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = lower.charAt(i);
            int charValue = (int) c;
            if ((charValue >= 97 && charValue <= 122) || (charValue >= 48 && charValue <= 57)) {
                parsed.append(c);
            }
        }
        String str = parsed.toString();
        System.out.println(str);
        int l = 0; int r = str.length() - 1;
        while (r > l) {
            if (str.charAt(r) != str.charAt(l)) {
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
}