#!/bin/bash

if [ $# -ne 3 ]; then
    echo "Usage: $0 <directory> <length> <timeout>"
    exit 1
fi

input="$1"

timeout="$3"
output="/home/nathanael/Documents/SMT_to_JSON/GenJSONs/scripts/data/$(basename "$input")_testingResults.csv"

rm -f "$output"

for file in $(find "$input" -name '*.smt2')
do
    length="$2"
    z3TO=false
    query="$(basename "$file")"
    echo -n "$query, " >> "$output"
    z3_out=$(timeout "$timeout" python3 ~/Documents/SMT_to_JSON/GenJSONs/scripts/z3_solve.py "$file")
    exit_s=$?
    if [ $exit_s -eq 124 ]; then
        echo -n "TO, , , " >> $output
        # continue
        z3TO=true
    fi
    # if [[ $z3_out == "(unsat,"* ]]; then
    #     continue

    # get longest symbolic from z3 to use as input length in EJSA
    if [[ $z3_out == "(sat,"* ]]; then
        z3_forcsv=$(echo "$z3_out"  | tr -d '()' | tr -d '\n' | sed 's/\[[^]]*\]//g' | sed 's/, //')
        echo -n "$z3_forcsv, " >> "$output"
        # Extract the string inside the square brackets and remove spaces
        data="${z3_out#*\[}"
        data="${data%\]*}"
        # Use awk to find the longest string length
        z3_l=$(echo "$data" | grep -o '"[^"]*"' | tr -d '"' | awk '{ length_ = length($0); if (length_ > max_length) max_length = length_ } END { if (max_length == "") print 0; else print max_length }')
        echo -n "$z3_l, " >> "$output"
        
        if [[ $z3_l -gt 6 ]]; then
            length="6"
        else
            length="$z3_l"      
        fi
    elif [[ $z3_out == "(unsat,"* ]]; then
        echo -n "unsat, $(echo "$z3_out"  | grep -o '[0-9]*'), ," >> "$output"
    fi



    # echo $(basename $file)
    json_file=$(find ~/Documents/SMT_to_JSON/GenJSONs/output_QF_S -name "$(basename "$file").json")
    # echo $json_file
    log_file="/home/nathanael/Documents/SMT_to_JSON/GenJSONs/scripts/data/inverse_logs/$query.inverse.log"
    cd ~/Documents/string-constraint-counting
    start_time=$(($(date +%s%N)/1000000))
    timeout "$timeout" java -cp target/string-constraint-solvers-1.0-SNAPSHOT-jar-with-dependencies.jar edu.boisestate.cs.SolveMain "$json_file" -l "$length" -s Inverse -v2 > "$log_file" 2>&1
    exit_s=$?
    end_time=$(($(date +%s%N)/1000000))
    runtime=$((end_time-start_time))
    # if [[ $z3TO && $exit_s -eq 124 ]]; then
    while [[ $exit_s -eq 124 && $length -ne 0 ]]; do
        length=$(($length-1))
        start_time=$(($(date +%s%N)/1000000))
        timeout "$timeout" java -cp target/string-constraint-solvers-1.0-SNAPSHOT-jar-with-dependencies.jar edu.boisestate.cs.SolveMain "$json_file" -l "$length" -s Inverse -v2 > "$log_file" 2>&1
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
        echo -n "$runtime, "$length", " >> "$output"
        z3_sol="{$(echo "$data" | sed -E 's/(\w+) =/"\1" =/g')}"
        # echo "$z3_sol"
        python3 /home/nathanael/Documents/SMT_to_JSON/GenJSONs/scripts/data/solComp.py "$z3_sol" temp/solutions.txt $json_file >> $output
    fi

done
