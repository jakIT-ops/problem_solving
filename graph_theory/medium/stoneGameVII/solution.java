/*
Алис, Боб хоёр ээлжлэн тоглож, Алис эхлээд эхэлж байна.

Дараалан байрлуулсан n чулуу байна. Тоглогч бүрийн ээлжинд тэд эгнээнээс
хамгийн зүүн эсвэл баруун талын чулууг авч, эгнээнд үлдсэн чулуунуудын
нийлбэртэй тэнцэх оноо авах боломжтой. Хийх чулуу үлдээгүй үед өндөр оноо
авсан хүн ялагч болно.

Боб энэ тоглолтонд үргэлж хожигдох болно гэдгийг олж мэдсэн (хөөрхий Боб, тэр
үргэлж хожигддог) тул онооны зөрүүг багасгахаар шийдсэн. Алисын зорилго бол
онооны зөрүүг нэмэгдүүлэх явдал юм.

Чулуунууд[i] нь зүүнээс i-р чулууны утгыг илэрхийлдэг бүхэл тооны чулуунуудын
массив өгөгдсөн бол Алис, Боб хоёрын онооны зөрүүг аль аль нь оновчтой тогловол
буцаана.

Example 1:

    Input: stones = [5,3,1,4,2]
    Output: 6
    Explanation:
    - Alice removes 2 and gets 5 + 3 + 1 + 4 = 13 points. Alice = 13, Bob = 0, stones = [5,3,1,4].
    - Bob removes 5 and gets 3 + 1 + 4 = 8 points. Alice = 13, Bob = 8, stones = [3,1,4].
    - Alice removes 3 and gets 1 + 4 = 5 points. Alice = 18, Bob = 8, stones = [1,4].
    - Bob removes 1 and gets 4 points. Alice = 18, Bob = 12, stones = [4].
    - Alice removes 4 and gets 0 points. Alice = 18, Bob = 12, stones = [].
    The score difference is 18 - 12 = 6.

Example 2:

    Input: stones = [7,90,5,1,100,10,10,2]
    Output: 122
 */

class Solution {
  public int stoneGameVII(int[] stones) {
    final int n = stones.length;
    // dp[i][j] := max score you can get more than your opponent in stones[i..j]
    dp = new int[n][n];
    prefix = new int[n + 1];

    for (int i = 0; i < n; ++i) prefix[i + 1] = stones[i] + prefix[i];
    return stoneGameVII(stones, 0, n - 1);
  }

  private int[][] dp;
  private int[] prefix;

  int stoneGameVII(int[] stones, int i, int j) {
    if (i == j) return 0;
    if (dp[i][j] > 0) return dp[i][j];

    dp[i][j] =
        Math.max(
            dp[i][j],
            Math.max(
                // Remove stones[i], so get sum of stones[i + 1..j]
                prefix[j + 1] - prefix[i + 1] - stoneGameVII(stones, i + 1, j),
                // Remove stones[j], so get sum of stones[i..j - 1]
                prefix[j] - prefix[i] - stoneGameVII(stones, i, j - 1)));
    return dp[i][j];
  }
}
