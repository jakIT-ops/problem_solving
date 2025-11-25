# Tools: generate_problem.py (basic idea)

```python
#!/usr/bin/env python3
import os, sys
topic, diff, name = sys.argv[1:4]
base = f"leetcode/{topic}/{diff}/{name}"
os.makedirs(base, exist_ok=True)
# write PROBLEM.md from template, write solution.* files and test.json
```

(Full script in `tools/` with Jinja-like substitution.)
