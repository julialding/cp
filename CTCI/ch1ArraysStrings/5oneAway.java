public static boolean oneAway(String a, String b) {
    boolean edit = false;
    if (a.equals(b)) return true;
    else if (Math.abs(a.length()-b.length()) > 1) return false;
    
    // check for insertion and deletion
    else if (Math.abs(a.length()-b.length()) == 1) {
      // ensure that a has the longest length
      if (b.length() > a.length()) {
        String swap = a;
        a = b;
        b = swap;
      }
      for (int i = 0; i < b.length(); i++) {
        if (a.charAt(i) != b.charAt(i)) {
          if (a.substring(0,i).equals(b.substring(0,i)) && a.substring(i+1).equals(b.substring(i))) return true;
          return false;
        }
      }
      return true;
    }
    
    // check for replacing a character
    else {
      for (int i = 0; i < a.length(); i++) {
        if (a.charAt(i) != b.charAt(i)) {
          if (edit) return false;
          edit = true;
        }
      }
      return true;
}