// assuming ASCII, not extended ASCII or unicode
public static boolean isUnique(String n) {
    if (n.length() > 128) { return false; }
    boolean[] chars = new boolean[128];
    for (int i = 0; i < n.length(); i++) {
      if (chars[(int) n.charAt(i)]) {
        return false;
      }
      chars[(int) n.charAt(i)] = true;
    }
    return true;
}