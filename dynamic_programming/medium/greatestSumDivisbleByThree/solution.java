class Solution {
  public int maxSumDivThree(int[] nums) {
    int n = nums.length;
    int[][] dp = new int[n][3];

    for (int[] row : dp) {
      Arrays.fill(row, 0);
    }

    dp[0][nums[0] % 3] = nums[0];

    for (int i = 1; i < n; i++) {
      int num = nums[i];
      // Хэрэв үлдэгдэл нь 0 байвал
      if (num % 3 == 0) {
        dp[i][0] = dp[i - 1][0] + num;
        dp[i][1] = dp[i - 1][1] > 0 ? dp[i - 1][1] + num : 0;
        dp[i][2] = dp[i - 1][2] > 0 ? dp[i - 1][2] + num : 0;
      }
      // Хэрэв үлдэгдэл нь 1 байвал
      else if (num % 3 == 1) {
        dp[i][0] = Math.max(dp[i - 1][0], dp[i - 1][2] > 0 ? dp[i - 1][2] + num : 0);
        dp[i][1] = Math.max(dp[i - 1][1], dp[i - 1][0] + num);
        dp[i][2] = dp[i - 1][1] > 0 ? dp[i - 1][1] + num : 0;
      }
      // Хэрэв үлдэгдэл нь 2 байвал
      else {
        dp[i][0] = Math.max(dp[i - 1][0], dp[i - 1][1] > 0 ? dp[i - 1][1] + num : 0);
        dp[i][1] = Math.max(dp[i - 1][1], dp[i - 1][2] > 0 ? dp[i - 1][2] + num : 0);
        dp[i][2] = Math.max(dp[i - 1][2], dp[i - 1][0] + num);
      }
    }
    return dp[n - 1][0];
  }
}
