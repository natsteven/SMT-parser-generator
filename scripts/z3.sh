#!/bin/bash

if [ $# -ne 1 ]; then
    echo "Usage: $0 <directory_path>"
    exit 1
fi

timeout=1  # Set the timeout value (in seconds) here
directory_path=$1

last_directory=$(basename "$(realpath "$directory_path")")

results=()

for file in "$directory_path"/*.smt2; do

    query_name=$(basename "$file" ".smt2")

    # Execute the Python script with a timeout
    result=$(timeout "$timeout" python3 z3_solve.py "$file" 2>&1)

    # Check if the result is a timeout message
    if [ -z "$result" ]; then
        echo "$query_name: Timeout"
        results+=("\"$query_name\": null")
    else
        echo "$query_name: $result"
        results+=("\"$query_name\": $result")
    fi

done

# Writing all results to a single JSON file
output_file="z3_results_$last_directory.json"
echo "{" > "$output_file"
if [ ${#results[@]} -gt 0 ]; then
    echo "${results[0]}" >> "$output_file"
fi

for ((i = 1; i < ${#results[@]}; i++)); do
    echo ", ${results[$i]}" >> "$output_file"
done

echo "}" >> "$output_file"
