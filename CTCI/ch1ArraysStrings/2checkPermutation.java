public static boolean checkPermutation(String a, String b) {
    if (a.length() != b.length()) return false;
    int[] charsA = new int[128];
    int[] charsB = new int[128];
    for (int i = 0; i < a.length(); i++) { charsA[(int) a.charAt(i)]++; }
    for (int i = 0; i < b.length(); i++) { charsB[(int) b.charAt(i)]++; }
    for (int i = 0; i < charsA.length; i++) {
      if (charsA[i] != charsB[i]) { return false; }
    }
    return true;
  }