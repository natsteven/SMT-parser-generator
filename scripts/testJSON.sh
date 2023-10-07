#!/bin/bash

SUCCESS_LOG="success_log.txt"
FAIL_LOG="fail_log.txt"

# Remove the existing log files if they exist
rm -f $SUCCESS_LOG $FAIL_LOG

# Count total files to process
total_files=$(find ../output_QF_S/output_2020-sygus-qgen/output_queries -name '*.json' | wc -l)
processed_files=0

# Start the timer
start_time=$(date +%s)

# Recursively navigate through directories and subdirectories
for file in $(find ../output_QF_S/output_2020-sygus-qgen/output_queries -name '*.json')
do
 echo -e "\n$file"
  # Run your Java program and redirect to a variable
  output=$(java -cp ~/Documents/string-constraint-counting/target/string-constraint-solvers-1.0-SNAPSHOT-jar-with-dependencies.jar edu.boisestate.cs.SolveMain $file -l 2 -r SAT -s Inverse -v 2 2>&1)

  # Check if there was any error
  if [[ "$output" == *"Error"* || "$output" == *"Exception"* ]]; then
    # If there was an error, append filename and error to fail_log
    echo -e "$file\n$output" >> $FAIL_LOG
    echo -e "FAIL"
  elif [[ $(echo "$output" | wc -l) -gt 7 ]]; then
    # If there was no error and output contains more than the header, append output to success_log
    echo -e "\n============================================================================================\n$file\n$output" >> $SUCCESS_LOG
    echo -e "SUCCESS"
  else
    # If there was no error but output only contains the header, append filename to fail_log
    echo "$file" >> $FAIL_LOG
    echo -e "NADA"
  fi

  # Increment processed files count
  ((processed_files++))

  # Calculate progress
  progress="$processed_files / $total_files"

  # Calculate the elapsed time
  current_time=$(date +%s)
  elapsed_time=$((current_time - start_time))

 # Display progress and elapsed time
  printf "\r %-20s | Elapsed Time: %02d:%02d:%02d" \
    "$progress" \
    $((elapsed_time / 3600)) $((elapsed_time % 3600 / 60)) $((elapsed_time % 60))


done

# Calculate the elapsed time
end_time=$(date +%s)
elapsed_time=$((end_time - start_time))

# Print the elapsed time
echo -e "\nProcessing complete. Elapsed time: $elapsed_time seconds."

