class Solution {
    public String longestCommonPrefix(String[] strs) {
        String prefix = strs[0];
        int length = strs[0].length();
        for (int i = 0; i < strs.length; i++) {
            if (prefix.length() > strs[i].length() || !strs[i].substring(0, prefix.length()).equals(prefix)) {
                prefix = prefix.substring(0, --length);
                if (prefix.equals("")) return "";
                i--;
            }
        }
        return prefix;
    }
}