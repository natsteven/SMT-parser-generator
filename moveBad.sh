#!/bin/bash

if [ $# -ne 2 ]; then
    echo "Usage: $0 <directory> <input file>" >&2
    exit 1
fi

directory=$1
input=$2

# Ensure the bad directory exists
mkdir -p "$directory/bad"

mapfile -t files < "$input"

for file in "$directory"/*; do
	filename=$(basename "$file")
    move_file=true
    if [ "$filename" == "bad" ]; then
        continue
    fi
    for goodFile in "${files[@]}"; do
        if [[ "$goodFile" == "$filename"* ]]; then
            move_file=false
            break
        fi
    done
    if $move_file; then
        mv "$file" "$directory/bad"
    fi
done