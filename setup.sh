# 2. Create root level configuration files
touch README.md MAKEFILE .editorconfig .gitignore

# 3. Create and populate the templates directory
mkdir -p templates
touch templates/{README_TOPIC.md.tpl,PROBLEM.md.tpl,SOLUTION.tpl.go,SOLUTION.tpl.py,SOLUTION.tpl.js,SOLUTION.tpl.rs,SOLUTION.tpl.cpp,TEST.tpl}

# 4. Create and populate the tools directory
mkdir -p tools
touch tools/generate_problem.py tools/run_tests.sh
chmod +x tools/run_tests.sh # Make the script executable

# 5. Create and populate the docs directory
mkdir -p docs/Cheatsheets
touch docs/{Problem_Solving_Pattern.md,Code_Style_Guidelines.md}
touch docs/Cheatsheets/{BigO.md,DP_State_Diagrams.md}

# 6. Define the list of algorithm topics
topics=(
  "arrays" "dynamic_programming" "graph_theory" "trees"
  "two_pointers" "sliding_window" "binary_search" "heap_priority_queue"
  "math" "strings" "backtracking" "greedy" "bit_manipulation"
  "intervals" "trie" "union_find" "segment_tree_bit" "design"
  "contest" "archive"
)

# 7. Loop through topics to create the README and difficulty subfolders for each
for topic in "${topics[@]}"; do
  mkdir -p "$topic"/{easy,medium,hard}
  touch "$topic"/README.md
done

# 8. Create the specific example problem inside arrays/easy
mkdir -p arrays/easy/PROBLEM-1_Name
touch arrays/easy/PROBLEM-1_Name/{PROBLEM.md,solution.go,solution.py,solution.js,solution.rs,solution.cpp,test.json,notes.md}

# 9. Print success message
echo "LeetCode project structure created successfully!"
