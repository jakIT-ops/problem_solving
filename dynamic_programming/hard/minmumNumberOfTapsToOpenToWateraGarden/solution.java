/**
 * X тэнхлэг дээр нэг хэмжээст цэцэрлэг бий. Цэцэрлэг нь 0 цэгээс эхэлж n цэгээр төгсдөг. (өөрөөр
 * хэлбэл цэцэрлэгийн урт нь n).
 *
 * <p>Цэцэрлэгт [0, 1, ..., n] цэгүүдэд байрлах n + 1 цорго байдаг. n бүхэл тоо ба n + 1 урттай
 * бүхэл тооны массив өгөгдсөн бол муж[i] (0-индексжүүлсэн) нь i-р цорго нь [i - муж[i], i + муж[i]]
 * талбайг услах боломжтой гэсэн үг юм. нээлттэй байсан.
 *
 * <p>Цэцэрлэгийг бүхэлд нь услахын тулд нээлттэй байх ёстой цоргоны хамгийн бага тоог буцаана уу,
 * хэрэв цэцэрлэгийг усалж чадахгүй бол буцаана -1.
 */
class Solution {
  public int minTaps(int n, int[] ranges) {
    // 1. create ranges and sort by start position in non descending order
    int[][] rarr = new int[ranges.length][2];
    for (int i = 0; i < ranges.length; i++) {
      rarr[i][0] = (i - ranges[i]) >= 0 ? i - ranges[i] : 0;
      rarr[i][1] = (i + ranges[i]) <= n ? i + ranges[i] : n;
    }
    Arrays.sort(rarr, (a, b) -> (a[0] == b[0] ? a[1] - b[1] : a[0] - b[0]));
    /* for(int[] row:rarr)
    System.out.println(row[0]+" "+row[1]);*/
    int endAt = 0;
    int tapCount = 0;
    while (endAt != n) {
      // find intersection top right
      // intersection has start <= endAt
      int maxEndAt = -1;
      for (int i = 0; i < rarr.length && rarr[i][0] <= endAt; i++) {
        maxEndAt = Math.max(maxEndAt, rarr[i][1]);
      }
      if (maxEndAt == -1 || maxEndAt == endAt) return -1;
      tapCount++;
      endAt = maxEndAt;
    }
    return tapCount;
  }
}
