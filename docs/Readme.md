## Sh

### Study Plan & Progression (concrete numbers & pacing)

- Phase 1 (Month 1–2): Beginner — 150 problems (5/day) → focus on easy problems + 1–2 medium weekly.

- Phase 2 (Month 3–4): Intermediate — 300 problems (4/day) → start timed sessions & contests.

- Phase 3 (Month 5–8): Advanced — tackle 150–200 hard problems, 2 contests/month.

- Daily routine (recommended):
  - Warm-up: 20–30 mins (1 easy)
  - Core: 60–90 mins (1 medium or 1 hard split into design + implement)
  - Review: 30 mins (read editorial; refactor)

- Weekly:
  - 1 mock interview (2 problems in 45–60min cadence)
  - 1 contest attempt

### Productivity Tips & Notes

- Maintain notes.md per problem: approach, alternatives, pitfalls.
- Use archive/ for earlier attempts so you can compare improvements.
- Tag problems by required patterns in PROBLEM.md (e.g., tags: dp, graph) to filter practice sessions.
- Time-box hard problems: 60–90 min; if stuck, record where and review editorial later.

### Example Flowchart (ASCII) — pick-your-solver

```ASCII
[Problem]
|
+--> Is it graph/tree? ----> Yes -> Weighted? -> Yes -> Dijkstra/BF
| \-> No -> BFS/DFS
|
+--> Is it sequence/subarray? --> Sliding window / prefix sums
|
+--> Is it combinatorial/arrangements? --> Backtracking / DP
|
+--> Is it optimization with overlap? --> DP (memo/tab)
|
+--> Else brute force -> optimize
```
