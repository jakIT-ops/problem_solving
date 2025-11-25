# 7. Visual Aids for Hard Problems

## 7.1 Flowchart example (graph shortest path selection)

```
[Start] -> Read Graph -> Is weighted? -> Yes -> Dijkstra or Bellman-Ford
                                 No -> BFS
```

## 7.2 DP State Transition Diagram (example: 2D DP - unique paths)

```
DP[i][j] = DP[i-1][j] + DP[i][j-1]
Grid:
(0,0) -> (0,1) -> ...
```

## 7.3 Decision tree for selecting data structure

```
Do I need order? -> Yes -> Trees/BST/Heap
No -> HashMap/Array
Need range queries? -> Segment tree / BIT
```

## 7.4 Graph sketch conventions

- Use arrows for directed edges, label weights.
- Mark visited nodes with color or `X` during traversal sketches.

## 7.5 Execution tracing table (example: recursion memo)

| Call      | Params | Return | Memo after   |
| --------- | ------ | ------ | ------------ |
| dp(0,cap) | ...    | 12     | {(0,cap):12} |

Include ASCII diagrams in `docs/` and generate PNGs later if desired.
