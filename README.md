# LeetCode — Local Mastery Repo

## Purpose

Practice LeetCode problems locally, in GO / Python / JS / Rust / C++.

## Structure

See folder tree. Each `topic/difficulty/ProblemName/` contains:

- PROBLEM.md : problem statement + tags
- solution.<lang> : implementation
- test.json : testcases
- notes.md : thought process and complexity

## Usage

- Add a problem: `python3 tools/generate_problem.py "arrays" "easy" "TwoSum"`
- Run tests:
  - `make test LANG=py TOPIC=arrays DIFF=easy NAME=TwoSum`
  - or `./tools/run_tests.sh py arrays easy TwoSum`

## Contributing

Follow `docs/Code_Style_Guidelines.md`
