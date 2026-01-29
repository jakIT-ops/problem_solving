class Solution:
    def largestNumber(self, cost: List[int], target: int) -> str:
        dp = [-1] * (target + 1)
        dp[0] = 0
        for x in range(target + 1):
            for y in range(9):
                if x - cost[y] >= 0 and dp[x - cost[y]] >= 0:
                    dp[x] = max(dp[x - cost[y]] * 10 + (y + 1), dp[x])
        return str(max(dp[target], 0))
