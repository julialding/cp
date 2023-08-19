public static String stringCompression(String a) {
    StringBuilder compressed = new StringBuilder();
    int currentRepeats = 1;
    for (int i = 0; i < a.length()-1; i++) {
      
      if (a.charAt(i) == a.charAt(i+1)) currentRepeats++;
      else {
        compressed.append(a.charAt(i));
        compressed.append(currentRepeats);
        currentRepeats = 1;
      }
      if (i == a.length()-2) {
        compressed.append(a.charAt(i+1));
        compressed.append(currentRepeats);
      }
    }
    String compressedString = compressed.toString();
    return compressedString.length() >= a.length() ? a : compressedString;
}