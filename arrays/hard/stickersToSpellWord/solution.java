class Solution {
  public int minStickers(String[] stickers, String target) {
    int n = target.length();
    int[] dp = new int[1 << n];
    for (int i = 1; i < (1 << n); i++) dp[i] = -1;

    for (int state = 0; state < (1 << n); state++) {
      if (dp[state] == -1) continue;
      for (String sticker : stickers) {
        int initialState = state;
        for (char ch : sticker.toCharArray()) {
          for (int i = 0; i < n; i++) {
            /** This bit is already set */
            if (((initialState >> i) & 1) == 1) continue;
            if (target.charAt(i) == ch) {
              initialState |= (1 << i);
              break;
              /** Break, as we have used current character from the sticker */
            }
          }
        }
        if (dp[initialState] == -1 || dp[initialState] > dp[state] + 1) {
          dp[initialState] = dp[state] + 1;
        }
      }
    }
    return dp[(1 << n) - 1];
  }
}
