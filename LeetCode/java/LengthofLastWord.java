class Solution {
    public int lengthOfLastWord(String s) {
    // start from ending, take index of first non-space char, then find index of next space char
        int nS = s.length()-1;
        int iS = 0;
        if (!s.contains(" ")) {
            return s.length();
        }
        for (int i = s.length()-1; i >= 0; i--) {
            if (s.charAt(i)!=' ') {
                nS = i;
                break;
            }
        }
        boolean isOneWord = true;
        for (int i = nS-1; i >= 0; i--) {
            if (s.charAt(i)==' ') {
                iS = i;
                isOneWord = false;
                break;
            }
        }
        if (iS == nS) { return 1; }
        else if (s.charAt(0) != ' ' && isOneWord) { return nS - iS + 1; }
        return nS - iS;
    }
}