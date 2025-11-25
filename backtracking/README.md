## 4.7 Backtracking

### Core concepts

- Explore, choose, unchoose, prune early.

### Pitfalls

- Not undoing changes, not pruning, incorrect uniqueness handling.

### Skeleton (permutations)

Python:

```python
def permute(nums):
    res=[]
    def backtrack(path, used):
        if len(path)==len(nums):
            res.append(path[:])
            return
        for i,n in enumerate(nums):
            if used[i]: continue
            used[i]=True
            path.append(n)
            backtrack(path, used)
            path.pop()
            used[i]=False
    backtrack([], [False]*len(nums))
    return res
```
