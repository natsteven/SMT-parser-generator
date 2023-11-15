#!/bin/bash

if [ $# -ne 1 ]; then
    echo "Usage: $0 <json directory>"
    exit 1
fi

input="$1"

timeout=5
output="/home/nathanael/Documents/SMT_to_JSON/GenJSONs/scripts/data/$(basename "$input")_validation.csv"

rm -f "$output"

for file in $(find "$input" -name '*.json')
do
    query="$(basename "$file")"
    length=6
    echo -n "$query, " >> "$output"
    log_file="/home/nathanael/Documents/SMT_to_JSON/GenJSONs/scripts/data/inverse_logs/$query.inverse.log"
    cd ~/Documents/string-constraint-counting
    start_time=$(($(date +%s%N)/1000000))
    timeout "$timeout" java -cp target/string-constraint-solvers-1.0-SNAPSHOT-jar-with-dependencies.jar edu.boisestate.cs.SolveMain "$file" -l "$length" -s Inverse -v2 > "$log_file" 2>&1
    exit_s=$?
    end_time=$(($(date +%s%N)/1000000))
    runtime=$((end_time-start_time))
    # if [[ $z3TO && $exit_s -eq 124 ]]; then
    while [[ $exit_s -eq 124 && $length -ne 0 ]]; do
        length=$(($length-1))
        start_time=$(($(date +%s%N)/1000000))
        timeout "$timeout" java -cp target/string-constraint-solvers-1.0-SNAPSHOT-jar-with-dependencies.jar edu.boisestate.cs.SolveMain "$file" -l "$length" -s Inverse -v2 > "$log_file" 2>&1
        exit_s=$?
        end_time=$(($(date +%s%N)/1000000))
        runtime=$((end_time-start_time))
    done
    if [[ $exit_s -eq 124 ]]; then
        echo "TO, , $length" >> "$output"
        continue
    fi
    if (grep -q -E 'UNSAT|FAILURE' "$log_file");then
        echo "unsat, $runtime, "$length", , " >> "$output"
    elif (grep -q -E 'Exception' "$log_file"); then
        echo "unknown, $runtime, "$length"" >> "$output"
    else
        echo -n " sat, "  >> "$output"
        # cat temp/solutions.txt >> "$output"
        echo "$runtime, "$length", " >> "$output"
    fi

done
