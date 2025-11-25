# Sliding Window (and Two Pointers)

### Core concepts

- Maintain range [L,R]; move pointers to satisfy constraint.
- Use counts or sums for conditions.

### Pitfalls

- Shrinking incorrectly; forgetting to update counts when left moves.

### Skeleton (max sum subarray of size k)

JS:

```js
function maxSumK(arr, k) {
  let sum = 0,
    best = -Infinity;
  for (let i = 0; i < arr.length; i++) {
    sum += arr[i];
    if (i >= k) sum -= arr[i - k];
    if (i >= k - 1) best = Math.max(best, sum);
  }
  return best;
}
```
