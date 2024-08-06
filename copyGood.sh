#!/bin/bash

if [ $# -ne 3 ]; then
    echo "Usage: $0 <input-directory> <good-file-list> <output-directory>" >&2
    echo "Copies files in file-list from input-directory to output-directory" >&2
    exit 1
fi

directory=$1
input=$2
out=$3

# Ensure the out directory exists
mkdir -p "$out"

mapfile -t files < "$input"

for file in "${files[@]}"; do
	cp "$directory$file" "$out"
done