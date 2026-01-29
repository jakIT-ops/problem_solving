/**
 * Fallout 4 видео тоглоомын "Эрх чөлөөнд хүрэх зам" хэмээх даалгавар нь тоглогчдоос "Freedom Trail
 * Ring" хэмээх металл залгахад хүрч, хаалга онгойлгохын тулд тодорхой түлхүүр үгийг зөв бичихийг
 * шаарддаг.
 *
 * <p>Гаднах цагираг дээр сийлсэн кодыг илэрхийлсэн утсан цагираг болон үсгээр бичих шаардлагатай
 * түлхүүр үгийг илэрхийлэх өөр нэг тэмдэгт тэмдэгт өгөгдсөн бол түлхүүр үгийн бүх тэмдэгтүүдийг
 * бичихийн тулд хамгийн бага тооны алхмуудыг буцаана уу.
 *
 * <p>Эхлээд цагирагийн эхний тэмдэгтийг "12:00" чиглэлд байрлуулна. Та товчлуурын бүх тэмдэгтүүдийг
 * нэг нэгээр нь цагийн зүүний дагуу эсвэл цагийн зүүний эсрэг эргүүлж, мөрний товчлуурын тэмдэгт
 * бүрийг "12:00" чиглэлд зэрэгцүүлж, дараа нь голын товчлуур дээр дарна уу.
 *
 * <p>Түлхүүр тэмдэгтийн товчлуурыг бичихийн тулд бөгжийг эргүүлэх үе шатанд[i]: Та цагирагыг цагийн
 * зүүний дагуу эсвэл цагийн зүүний эсрэг нэг газар эргүүлэх боломжтой бөгөөд энэ нь нэг алхам
 * болно. Эргэлтийн эцсийн зорилго нь бөгжний тэмдэгтүүдийн аль нэгийг "12:00" чиглэлд зэрэгцүүлэх
 * бөгөөд энэ тэмдэгт нь товчлуур[i]-тэй тэнцүү байх ёстой.
 *
 * <p>Хэрэв тэмдэгтийн товчлуур[i] нь "12:00" чиглэлд зэрэгцсэн бол голын товчлуур дээр дарж үсгээр
 * бичих ба энэ нь бас нэг алхам болно. Дарсны дараа та товчлуурын дараагийн тэмдэгтийг бичиж эхлэх
 * боломжтой (дараагийн шат). Үгүй бол та бүх зөв бичгийн дүрмийг дуусгасан байна.
 *
 * <p>Input: ring = "godding", key = "gd" Output: 4 Explanation: For the first key character 'g',
 * since it is already in place, we just need 1 step to spell this character. For the second key
 * character 'd', we need to rotate the ring "godding" anticlockwise by two steps to make it become
 * "ddinggo". Also, we need 1 more step for spelling. So the final output is 4.
 *
 * <p>Example 2:
 *
 * <p>Input: ring = "godding", key = "godding" Output: 13
 */
public class Solution {
  public int findRotateSteps(String ring, String key) {
    HashMap<Character, List<Integer>> map = new HashMap<Character, List<Integer>>();
    for (int i = 0; i < ring.length(); i++) {
      char c = ring.charAt(i);
      if (!map.containsKey(c)) {
        map.put(c, new LinkedList<Integer>());
      }
      map.get(c).add(i);
    }
    ArrayList<Integer> poss = new ArrayList<Integer>();
    ArrayList<Integer> ways = new ArrayList<Integer>();

    poss.add(0);
    ways.add(0);

    int res = 0;
    for (int i = 0; i < key.length(); i++) {
      char c = key.charAt(i);
      ArrayList<Integer> newposs = new ArrayList<Integer>();
      ArrayList<Integer> newways = new ArrayList<Integer>();
      res = Integer.MAX_VALUE;
      for (Integer newpos : map.get(c)) {
        int min = Integer.MAX_VALUE;
        for (int j = 0; j < poss.size(); j++) {
          min = Math.min(min, getMin(newpos, poss.get(j), ring.length()) + ways.get(j));
        }
        min++;
        newposs.add(newpos);
        newways.add(min);
        res = Math.min(res, min);
      }
      poss = newposs;
      ways = newways;
    }
    return res;
  }

  private int getMin(int i, int j, int n) {
    int a = Math.min(i, j);
    int b = Math.max(i, j);
    return Math.min(b - a, n - b + a);
  }
}
