public static String URLify(String a, int n) {
    char[] arr = a.toCharArray();
    int spaces = countSpaces(arr, n);
    System.out.println(spaces);
    int ni = (n-1) + (2*spaces); // new index of end of string
    System.out.println(ni);
    for (int oi = n-1; oi >= 0; oi--) {
        if (arr[oi] == ' ') {
            arr[ni] = '0';
            arr[ni-1] = '2';
            arr[ni-2] = '%';
            ni -= 3;
        }
        else {
            arr[ni] = arr[oi];
            ni--;
        }
    }
    return charArrayToString(arr);
}

public static int countSpaces(char[] arr, int n) {
    int count = 0;
    for (int i = 0; i < n; i++) {
      if (arr[i] == ' ') { count++; }
    }
    return count;
}

public static String charArrayToString(char[] arr) {
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < arr.length; i++) {
      sb.append(arr[i]);
    }
    return sb.toString();
}