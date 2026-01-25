#!/bin/bash

LANG=$1
TOPIC=$2
DIFF=$3
NAME=$4

if [[ -z "$LANG" || -z "$TOPIC" || -z "$DIFF" || -z "$NAME" ]]; then
    echo "Usage: ./tools/run_tests.sh <lang> <topic> <difficulty> <name>"
    exit 1
fi

BASE_PATH=$(pwd)/$TOPIC/$DIFF/$NAME
SOLUTION_FILE=""

case $LANG in
    rs|rust)
        SOLUTION_FILE="$BASE_PATH/solution.rs"
        if [[ ! -f "$SOLUTION_FILE" ]]; then
            echo "Solution file not found: $SOLUTION_FILE"
            exit 1
        fi
        
        echo "#[path = \"$SOLUTION_FILE\"]" > lc/src/lib.rs
        echo "pub mod solution;" >> lc/src/lib.rs
        
        cd lc && cargo test
        ;;
    py|python)
        echo "Python testing not implemented yet"
        ;;
    *)
        echo "Language $LANG not supported for testing yet"
        exit 1
    ;;
esac
