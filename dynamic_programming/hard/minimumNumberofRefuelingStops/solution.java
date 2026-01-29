class Solution {
  public int minRefuelStops(int target, int startFuel, int[][] stations) {
    int n = stations.length;
    long[] dp = new long[n + 1];
    dp[0] = startFuel;

    for (int i = 0; i < n; i++) {
      for (int f = i; f >= 0 && dp[f] >= stations[i][0]; f--) {
        dp[f + 1] = Math.max(dp[f + 1], stations[i][1] + dp[f]);
      }
    }

    for (int i = 0; i < dp.length; i++) {
      if (dp[i] >= target) return i;
    }

    return -1;
  }
}
