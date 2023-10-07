#!/bin/bash

if [ $# -ne 3 ]; then
    echo "Usage: $0 <directory> <length> <timeout>"
    exit 1
fi

input="$1"
length="$2"
timeout="$3"
output="/home/nathanael/Documents/SMT_to_JSON/GenJSONs/scripts/data/$(basename "$input")_testingResults.csv"

rm -f "$output"

for file in $(find "$input" -name '*.smt2')
do
    query="$(basename "$file")"
    echo -n "$query, " >> "$output"
    z3_out=$(timeout 1 python3 ~/Documents/SMT_to_JSON/GenJSONs/scripts/z3_solve.py "$file")
    exit_s=$?
    if [ $exit_s -eq 124 ]; then
        echo -n "TO, , , " >> $output
        # continue
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

    fi



    # echo $(basename $file)
    json_file=$(find ~/Documents/SMT_to_JSON/GenJSONs/output_QF_S -name "$(basename "$file").json")
    # echo $json_file
    log_file="/home/nathanael/Documents/SMT_to_JSON/GenJSONs/scripts/data/inverse_logs/$query.inverse.log"
    cd ~/Documents/string-constraint-counting
    start_time=$(($(date +%s%N)/1000000))
    timeout "$timeout" java -cp target/string-constraint-solvers-1.0-SNAPSHOT-jar-with-dependencies.jar edu.boisestate.cs.SolveMain "$json_file" -l "$length" -s Inverse -v 2 > "$log_file" 2>&1
    exit_s=$?
    end_time=$(($(date +%s%N)/1000000))
    runtime=$((end_time-start_time))
    if [ $exit_s -eq 124 ]; then
        echo "TO, , "$length", ," >> $output
    elif (grep -q -E 'UNSAT|FAILURE|Exception|Error|Invalid' "$log_file");then
        echo "unsat, $runtime, "$length", , " >> "$output"
    else
        echo -n " sat, "  >> "$output"
        # cat temp/solutions.txt >> "$output"
        echo -n "$runtime, "$length", " >> "$output"
        z3_sol="{$(echo "$data" | sed -E 's/(\w+) =/"\1" =/g')}"
        # echo "$z3_sol"
        python3 /home/nathanael/Documents/SMT_to_JSON/GenJSONs/scripts/data/solComp.py "$z3_sol" temp/solutions.txt $json_file >> $output
    fi

done
