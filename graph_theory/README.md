## 4.4 Graph Theory

### Core concepts

- Representation: adjacency list/matrix.
- Traversal: BFS, DFS.
- Weighted: Dijkstra, Bellman-Ford, Floyd-Warshall.
- MST: Kruskal (union-find), Prim.
- Topological sort, SCC (Kosaraju/Tarjan).

### Patterns

- Shortest path, detect cycles, connected components, bipartite check.

### Pitfalls

- Using recursion depth for large graphs; forgetting visited set for directed graphs.
- Negative weight edges — don't use Dijkstra.

### Skeleton (BFS shortest unweighted)

Python:

```python
from collections import deque
def bfs_shortest(adj, start, target):
    q = deque([(start,0)])
    visited = {start}
    while q:
        node, d = q.popleft()
        if node == target: return d
        for nb in adj[node]:
            if nb not in visited:
                visited.add(nb)
                q.append((nb, d+1))
    return -1
```
