# Танд үнийн массив өгөгдсөн бөгөөд үнэ[i] нь тухайн хувьцааны 1 дэх өдрийн үнэ юм.

# Та нэг хувьцааг худалдаж авах нэг өдрийг сонгож, ирээдүйд хувьцаагаа зарах өөр
# өдөр сонгох замаар ашгаа нэмэгдүүлэхийг хүсч байна.

# Энэ гүйлгээнээс олж болох хамгийн их ашгаа буцаана уу. Хэрэв та ямар ч ашиг олж чадахгүй бол 0-г буцаана уу.


class Solution(object):
    def maxProfit(self, prices):
        """
        :type prices: List[int]
        :rtype: int
        """
        minVal = 10000
        maxDiff = 0
        for i in range(len(prices)):
            minVal = min(prices[i], minVal)
            maxDiff = max(prices[i] - minVal, maxDiff)
        return maxDiff
