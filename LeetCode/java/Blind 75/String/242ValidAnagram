class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> sMap = stringToMap(s);
        HashMap<Character, Integer> tMap = stringToMap(t);
        if (sMap.equals(tMap)) return true;
        return false;
    }

    public HashMap<Character, Integer> stringToMap(String str) {
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        for (int i = 0; i < str.length(); i++) {
            char x = str.charAt(i);
            if (map.containsKey(x)) {
                int count = map.get(x);
                map.put(x, ++count);
            }
            else map.put(x, 1);
        }
        return map;
    }
}