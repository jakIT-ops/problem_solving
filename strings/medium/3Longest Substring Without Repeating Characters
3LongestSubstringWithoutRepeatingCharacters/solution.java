class Solution {
  public int lengthOfLongestSubstring(String s) {
    int start = 0, end = 0, ans = 0;
    Set<Character> set = new HashSet<>();
    while (end < s.length()) {
      if (!set.contains(s.charAt(end))) {
        set.add(s.charAt(end++));
        ans = Math.max(ans, set.size());
      } else {
        set.remove(s.charAt(start++));
      }
    }
    return ans;
  }
}
