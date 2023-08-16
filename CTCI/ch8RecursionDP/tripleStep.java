public static int tripleStep(int n) {
    int[] memo = new int[n+1];
    Arrays.fill(memo, -1);
    return tripleStep(n, memo);
  }
  
public static int tripleStep(int n, int[] memo) {
    if (n < 0) { return 0; }
    else if (n == 0) { return 1; }
    else if (memo[n] > -1) { return memo[n]; }
    else {
      memo[n] = tripleStep(n-3, memo) + tripleStep(n-2, memo) + tripleStep(n-1, memo);
      return memo[n];
    }
}