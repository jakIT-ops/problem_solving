/*
Тайлбар:

Хязгааргүй үргэлжилэх "abcdefghijklmnopqrstubwxyz" string -г base string гэнэ. base нь доорх байдлаар харагдана.

...zabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcd....

s string өгөгдсөн үед base доторх байх хоосон биш s - н substring - н тоог олно уу.

Input: s = "a"
Output: 1
Explanation: Only the substring "a" of s is in base.

Input: s = "cac"
Output: 2
Explanation: There are two substrings ("a", "c") of s in base.

Input: s = "zab"
Output: 6
Explanation: There are six substrings ("z", "a", "b", "za", "ab", and "zab") of s in base.
*/

class Solution {
  public int findSubstringInWraproundString(String p) {
    // count[i] is the maximum unique substring end with ith letter.
    // 0 - 'a', 1 - 'b', ....., 25 - 'z'
    int[] count = new int[26];

    // store longest contiguous substring ends at current position.
    int maxLengthCur = 0;

    for (int i = 0; i < p.length(); i++) {
      if (i > 0 && (p.charAt(i) - p.charAt(i - 1) == 1 || (p.charAt(i - 1) - p.charAt(i) == 25))) {
        maxLengthCur++;
      } else {
        maxLengthCur = 1;
      }

      int index = p.charAt(i) - 'a';
      count[index] = Math.max(count[index], maxLengthCur);
    }

    // Sum to get result
    int sum = 0;
    for (int i = 0; i < 26; i++) {
      sum += count[i];
    }
    return sum;
  }
}
