## Code Style Guidelines — highlights

- Keep functions <= ~50 lines.
- Name variables descriptively: `left`, `right`, `curSum`, `node`.
- Comments: top of function explain approach in 1–2 sentences.
- Tests: use the `test.json` format (input + expected).
- Language-specific:
  - Go: `gofmt`, package `main` for single-file solutions.
  - Python: use `black` formatting, type hints encouraged.
  - JS: use `prettier` defaults.
  - Rust: `rustfmt`
  - C++: use `clang-format`

## Example of well-documented problem (PROBLEM.md)

```md
# Two Sum

## Statement

Given array nums and target, return indices of two numbers adding to target.

## Constraints

2 <= len(nums) <= 10^5, -10^9 <= nums[i] <= 10^9

## Tags

arrays, hash_map, two_pointers

## Approach

Use hash map to find complement in one pass. O(n) time, O(n) space.

## Edge cases

- Duplicates
- Negative numbers
```

## Test cases format (test.json)

```json
{
  "cases": [
    { "input": [2, 7, 11, 15], "target": 9, "expected": [0, 1] },
    { "input": [3, 2, 4], "target": 6, "expected": [1, 2] }
  ]
}
```

## Automation suggestions

- **Makefile** with targets:
  - `make new TOPIC=arrays DIFF=easy NAME=TwoSum`
  - `make test LANG=py TOPIC=arrays DIFF=easy NAME=TwoSum`
  - `make fmt LANG=go|py|js|rs|cpp`
- `tools/generate_problem.py` to scaffold files from `templates/`
- `tools/run_tests.sh` runs language-specific test harnesses
  - Python: `pytest` / simple runner
  - JS: `node` script that runs `solution.js` with JSON inputs
  - Go: `go run`
  - Rust: `cargo run` or `rustc` for single files
  - C++: compile with `g++ -std=c++17`

### Makefile (core)

```makefile
.PHONY: new test fmt
new:
 python3 tools/generate_problem.py $(TOPIC) $(DIFF) $(NAME)

test:
 ./tools/run_tests.sh $(LANG) $(TOPIC) $(DIFF) $(NAME)

fmt:
 # Basic format actions
 black .
 gofmt -w .
 rustfmt --edition 2021 .
```
