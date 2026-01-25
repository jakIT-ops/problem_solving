#!/usr/bin/env python3
import os
import sys
import shutil

def main():
    if len(sys.argv) < 4:
        print("Usage: python3 tools/generate_problem.py <topic> <difficulty> <name>")
        sys.exit(1)

    topic = sys.argv[1]
    difficulty = sys.argv[2]
    name = sys.argv[3]

    base_path = os.path.join(topic, difficulty, name)
    os.makedirs(base_path, exist_ok=True)

    templates = {
        "PROBLEM.md": "templates/PROBLEM.md.tpl",
        "solution.rs": "templates/SOLUTION.tpl.rs",
        "solution.py": "templates/SOLUTION.tpl.py",
        "solution.go": "templates/SOLUTION.tpl.go",
        "solution.cpp": "templates/SOLUTION.tpl.cpp",
        "solution.js": "templates/SOLUTION.tpl.js",
        "test.json": "templates/TEST.tpl",
        "notes.md": ""
    }

    for filename, template_path in templates.items():
        dest_path = os.path.join(base_path, filename)
        if os.path.exists(dest_path):
            print(f"File {dest_path} already exists, skipping.")
            continue
        
        if template_path and os.path.exists(template_path):
            shutil.copy(template_path, dest_path)
            print(f"Created {dest_path} from template.")
        else:
            with open(dest_path, 'w') as f:
                pass
            print(f"Created empty file {dest_path}.")

    print(f"Successfully generated problem structure in {base_path}")

if __name__ == "__main__":
    main()
