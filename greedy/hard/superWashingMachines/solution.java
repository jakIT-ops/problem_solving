/*
Танд нэг шугам дээр n super угаалгын машин байна. Эхлээд угаалгын машин бүр зарим даашинзтай эсвэл хоосон байдаг.
Хөдөлгөөн болгонодоо та m(1 <= m <= n) угаалгын машин сонгож, угаалгын маши бүрийн нэг даашинзын зэргэлдээх угаалгын машинд нэгэн зэрэг шилжүүлж болно.

Угаалгын машин бүрийн хувцаснуудын тоог зүүнээс баруун тийш шугаман дээр харуулсан бүхэл тооны машиныг ижил тооны даашинзтэй болгохын тулд хамгийн бага хөдөлгөөнийг буцаана уу.
Хэрэв хийх боломжгүй бол -1 гэж буцаана.
 */

class Solution {
  public int findMinMoves(int[] machines) {
    int dresses = Arrays.stream(machines).sum();
    if (dresses % machines.length != 0) return -1;

    int ans = 0;
    int inout = 0;
    final int average = dresses / machines.length;

    for (final int dress : machines) {
      inout += dress - average;
      ans = Math.max(ans, Math.max(Math.abs(inout), dress - average));
    }

    return ans;
  }
}
