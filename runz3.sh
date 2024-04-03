#!/bin/bash

if [ $# -ne 2 ]; then
    echo "Usage: $0 <directory> <timeout>"
    exit 1
fi

input="$1"

timeout="$2"
output="/home/nathanael/Documents/SMT_to_JSON/GenJSONs/z3_results/$(basename "$input").csv"

rm -f "$output"

for file in $(find "$input" -name '*.smt')
do
    z3TO=false
    query="$(basename "$file")"
    echo -n "$query, " >> "$output"
    z3_out=$(timeout "$timeout" python3 ~/Documents/SMT_to_JSON/GenJSONs/scripts/z3_solve.py "$file")
    exit_s=$?
    if [ $exit_s -eq 124 ]; then
        echo "TO" >> $output
        # continue
        z3TO=true
    else
        echo $z3_out >> "$output"
    fi
    # if [[ $z3_out == "(unsat,"* ]]; then
    #     continue



    # get longest symbolic from z3 to use as input length in EJSA
    # if [[ $z3_out == "(sat,"* ]]; then
    #     z3_forcsv=$(echo "$z3_out"  | tr -d '()' | tr -d '\n' | sed 's/\[[^]]*\]//g' | sed 's/, //')
    #     echo -n "$z3_forcsv, " >> "$output"
    #     # Extract the string inside the square brackets and remove spaces
    #     data="${z3_out#*\[}"
    #     data="${data%\]*}"
    #     # Use awk to find the longest string length
    #     z3_l=$(echo "$data" | grep -o '"[^"]*"' | tr -d '"' | awk '{ length_ = length($0); if (length_ > max_length) max_length = length_ } END { if (max_length == "") print 0; else print max_length }')
    #     echo "$z3_l, " >> "$output"
        
    # elif [[ $z3_out == "(unsat,"* ]]; then
    #     echo "unsat, $(echo "$z3_out"  | grep -o '[0-9]*'), ," >> "$output"
    # fi

done
