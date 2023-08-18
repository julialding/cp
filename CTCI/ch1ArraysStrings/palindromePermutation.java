public static boolean palindromePermutation(String a) {
    String al = a.toLowerCase();
    int[] alpha = new int[26];
    int letterCount = 0;
    for (int i = 0; i < al.length(); i++) {
      int asciiVal = (int) al.charAt(i);
      if (asciiVal >= 97 && asciiVal <= 122) {
        letterCount++;
        alpha[asciiVal-97]++;
      }
    }
    System.out.println(letterCount);
    if (letterCount%2==0) {
      for (int i = 0; i < alpha.length; i++) {
        if (alpha[i]%2!=0) return false;
      }
    }
    else {
      int oddCount = 0;
      for (int i = 0; i < alpha.length; i++) {
        if (alpha[i]%2!=0) {
          if (oddCount > 1) return false;
          oddCount++;
        }
      }
    }
    return true;
}