#!/usr/bin/env python3
"""
Problem: {{NAME}}
Approach: {{SHORT_APPROACH}}
Complexity: Time O(...), Space O(...)
"""

import sys
import json


def solve(*args):
    # implement
    pass


if __name__ == "__main__":
    # quick runner: expects test.json in same folder
    import os
    import sys

    with open("test.json") as f:
        tests = json.load(f)["cases"]
    for t in tests:
        print("Input:", t)
        print("Output:", solve(**t))
        print("Expected:", t.get("expected"))
