/*
Тайлбар:
prices гэдэг бүхэл тоон жагсаалт өгөгдсөн гэж үзье. prices[i] нь тухайн өдрийн хөрөнгийн үнэ ханшийг харуулна.

Тухайн өдөртөө хамгийн ихдээ К гүйлгээ хийгээд олж болох боломжит хамгийн их ашгийн хэмжээг олно уу

Давхар гүйлгээ хийхгүй гэж үзнэ (жишээ нь худалдаж авж болох гүйлгээ хийхээс өмнө заавал зарах гүйлгээ хийнэ)

Input: k = 2, prices = [2, 4, 1]
Output: 2
Explanation: Buy on day 1 (price = 2) and sell on day 2 (price = 4), profit = 4-2 = 2.

*/
import java.util.Arrays;

class Solution {
  public int maxProfit(int k, int[] prices) {
    if (k == 0) {
      return 0;
    }

    int[] buy = new int[k]; // buy[i]: min cost at (i + 1)-th time stock purchased
    int[] sell = new int[k]; // sell[i]: max revenue at (i + 1)-th time stock sold
    Arrays.fill(buy, Integer.MIN_VALUE);
    Arrays.fill(sell, 0);

    for (int i : prices) {
      buy[0] = Math.max(buy[0], i * -1);
      sell[0] = Math.max(sell[0], buy[0] + i);
      for (int j = 1;
          j < k;
          j++) { // The i-th time buy & sell depens on the (i - 1)-th time buy & sell
        buy[j] = Math.max(buy[j], sell[j - 1] - i);
        sell[j] = Math.max(sell[j], buy[j] + i);
      }
    }
    return sell[k - 1];
  }
}
