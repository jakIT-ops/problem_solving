## 4.5 Trees

### Core concepts

- Recursion, tree traversal, tree DP, BST properties.
- Serialization/deserialization.

### Patterns

- DFS recursion, iterative traversal with stack, level-order BFS.

### Pitfalls

- Managing null pointers; recomputing subtree values repeatedly (use memo or return tuple).

### Skeleton (tree traversal)

Python (preorder):

```python
def preorder(root):
    res = []
    def dfs(node):
        if not node: return
        res.append(node.val)
        dfs(node.left)
        dfs(node.right)
    dfs(root)
    return res
```
