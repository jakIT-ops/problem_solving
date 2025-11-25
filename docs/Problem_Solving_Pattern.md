# 3. Universal Problem-Solving Pattern (Reusable Template)

## 3.1 Problem Workflow (step-by-step)

1. **Read carefully (1–2 minutes)** — identify input types, constraints, examples.
2. **Restate** the problem in your own words (one sentence).
3. **Ask breakdown questions**:
   - What are input size limits?
   - Are there sorted inputs / unique elements?
   - Can I mutate input? Memory constraints? Time limit?

4. **Find pattern(s)**: map to known tags (sliding window, DP, graph, etc.)
5. **Choose approach(s)**:
   - Brute force / naive → reason about complexity
   - Improve with memoization, data structure, or algorithmic trick

6. **Estimate complexity** (time & space) for chosen approach
7. **Pseudocode / sketch** the approach
8. **Edge cases** — enumerate
9. **Implement** in chosen language with clear variable names and comments
10. **Test locally** with given examples + edge cases
11. **Optimize** if necessary; consider space-time tradeoffs
12. **Document** complexity and approach in `notes.md`

## 3.2 Problem-Breakdown Questions (Checklist)

- Are there duplicate elements?
- Is order important?
- Are we asked to return count/index/structure?
- Are we allowed to sort/transform input?
- Do outputs require stable ordering?
- Does the problem hint at graph/tree/sequence/DP?

## 3.3 Pattern Identification Checklist

- Contains substring/continuous region → **sliding window**
- Ask for pair sums/counts → **two pointers** or **hash map**
- Involves shortest path → **graph** + BFS/Dijkstra
- Optimization across choices with overlapping subproblems → **DP**
- Permutations/combinations with constraint → **backtracking**
- Merge/intersect intervals → **sort + sweep line**
- Frequent order-statistics → **heap**
- Dynamic set union queries → **union-find**
- Frequent prefix queries / range sums → **fenwick/segment tree**

## 3.4 Decision Tree (short)

```
Is graph-like? -> Yes -> Use BFS/DFS -> Weighted? -> Dijkstra/Bellman-Ford/A*
No -> Is problem about sequences/subarrays? -> sliding window / two pointers / prefix sums
No -> Is objective optimization with overlapping subproblems? -> DP (topo)
No -> Is it searching in sorted structure? -> Binary search
No -> Need order statistics / kth? -> Heap
Else -> Brute force then optimize
```

## 3.5 Time / Space Estimation Template

- **Brute force:** T = O(f(n)), S = O(1)/O(n)
- **Optimized:** State formula, explain loop nesting, recursion depth, and worst-case memory (call stack + data structures).
- Example: Sliding window typical: **O(n)** time, **O(1)** extra space; Hash-based sliding window: **O(n)** time, **O(k)** space.

## 3.6 Edge-case Discovery Framework

- Empty inputs
- Single-element
- All-equal elements / all-distinct
- Very large values (overflow)
- Sorted vs reverse-sorted
- Maximum/minimum constraints
- Repeated calls (cached results needed?)

---
