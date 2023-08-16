class Solution {
    public String intToRoman(int num) {
        String r = "";
        String[] desc = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        int[] vals = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        
        for (int i = 0; i < desc.length; i++) {
            while (num >= vals[i]) {
                num-= vals[i];
                r+= desc[i];
            }
        }
        return r;
    }
}