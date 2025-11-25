# Dynamic Programming (DP)

### Core concepts

- Memoization vs tabulation, state design, base cases, transition.
- Time reduction via pruning and state compression.

### Common patterns

- 1D/2D DP: knapsack, LIS, edit distance, DP on trees, digit DP.
- State = (index, last_choice, remaining_capacity, ...)

### Typical pitfalls

- Not defining base cases correctly.
- Wrong state order for tabulation.
- Off-by-one indices.

### Big-O Cheatsheet

- Typical DP: O(n \* m) where m is state breadth.
- State compression often reduces space from O(n\*m) to O(m).

### DP State Diagram (example: 0/1 knapsack)

```
DP[i][w] = max(DP[i-1][w], DP[i-1][w-weight[i]] + value[i])
```

### Skeleton (memo top-down)

Python:

```python
from functools import lru_cache
def knapsack(weights, values, W):
    n = len(weights)
    @lru_cache(None)
    def dp(i, cap):
        if i == n: return 0
        res = dp(i+1, cap)
        if cap >= weights[i]:
            res = max(res, dp(i+1, cap-weights[i]) + values[i])
        return res
    return dp(0, W)
```
